
package capaLogica;

import capaDatos.ArchivoFactura;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Factura implements Serializable{
    private static int contFacturas=1;
    private int numeroFactura;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<Auto> arrayAutos;
    private TipoFactura tipoFactura;
    
    /**
     *
     * @param cliente
     * @param tipoFactura
     */
    public Factura(Cliente cliente,TipoFactura tipoFactura){
        this.numeroFactura=contFacturas++;
        this.cliente=cliente;
        this.fecha=new Date();
        this.arrayAutos=new ArrayList();
        this.tipoFactura=tipoFactura;
        
    }

    /**
     *
     * @return
     * @throws Exception
     */
    public void agregarAuto(Auto auto){
        arrayAutos.add(auto);
    }
    public double precioTotalExtras(){
        double monto=0;
        for(int i=0;i<cliente.getArrayPartes().size();i++){
            monto+=cliente.getArrayPartes().get(i).getPrecio();
        }
        
        return monto;
    }

    /**
     *
     * @return
     */
    public double calculaDescuento(){
        double totalDescuento=0;
        for (int i = 0; i < arrayAutos.size(); i++) {
            totalDescuento+=arrayAutos.get(i).descuento();  
        }
        totalDescuento+=cliente.descuento();
        
        return totalDescuento;
    } 
    public double descuentoTipoF(){
        double total=0,descuento=0;
        for (int i = 0; i < arrayAutos.size(); i++) {
            total+=arrayAutos.get(i).getPrecio();  
        }
        total+=precioTotalExtras();
        total=total-calculaDescuento();
        if(tipoFactura==TipoFactura.Contado){
            descuento=total*0.05;
        }
        return descuento;
    } 

    
    public double calculaImpuesto(){
        double total=0,impuesto=0;
        for (int i = 0; i < arrayAutos.size(); i++) {
            total+=arrayAutos.get(i).getPrecio();  
        }
        total+=precioTotalExtras();
        total=total-calculaDescuento()-descuentoTipoF();
        
        impuesto=total*0.13;
        
        return impuesto;
        
    }

    /**
     *
     * @return
     */
    public double calculaTotalAuto(){
        double total=0;
        for (int i = 0; i < arrayAutos.size(); i++) {
            total+=arrayAutos.get(i).getPrecio();  
        }
        total+=precioTotalExtras();
        total=total-calculaDescuento()-descuentoTipoF()+calculaImpuesto();
        
        return total;
    }
    public double calculaTotalAutoColones(){
        
        double monto;
        
        monto=calculaTotalAuto()*630;
        
        return monto;
    }
    @Override
    public String toString(){
        return"\nInfomación del vehículo: \n" + arrayAutos.get(0).toString();
    }
     public String toString2(){
         DecimalFormat formato = new DecimalFormat("#.##");
        return"\nTotal partes: " + "$ "+ precioTotalExtras()+
                "\nDescuento por tipo de vehículo y tipo de cliente: "+ "$ "+calculaDescuento()+
                "\nDescuento por tipo de factura: "+ "$ "+ descuentoTipoF()+
                "\nImpuesto: "+ "$ "+ formato.format(calculaImpuesto())+
                "\nPrecio total final: "+ "$ "+ calculaTotalAuto()+"  ₡ "+calculaTotalAutoColones();
                
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    

    public ArrayList<Auto> getArrayAutos() {
        return arrayAutos;
    }
    public static Factura consultarFactura(int numeroFatura) throws Exception {
        Factura factura1=ArchivoFactura.getInstance().consultarFactura(numeroFatura);
        return factura1;
    }

    
    public static void agregarFactura(Factura factura) throws Exception {
        ArchivoFactura.getInstance().agregarFactura(factura);
    }

    
    public static void eliminarFactura(int numeroFactura) throws Exception{
        ArchivoFactura.getInstance().eliminarFactura(numeroFactura);
    }

    
    public static void modificarFactura(Factura factura) throws Exception{
        ArchivoFactura.getInstance().modificarFactura(factura);
    }

    public static ArrayList<Factura> listadoFacturas() throws Exception {
        ArrayList<Factura> arrayFacturas=ArchivoFactura.getInstance().listaFacturas();
       return arrayFacturas;
    }
}
