package capaLogica;

import capaDatos.ArchivoAuto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public abstract class Auto implements Serializable {
    
    private String codigoAuto;
    private String  modelo;
    private String  tipo;
    private double precio;
    private String incluye;
    private ArrayList<Parte>arrayPartes;
    
    /**
     *
     * @param codigoAuto
     * @param modelo
     * @param precio
     */
    public Auto(String codigoAuto,String modelo,String tipo,double precio,String incluye){
        
        this.codigoAuto=codigoAuto;
        this.modelo=modelo;
        this.tipo=tipo;
        this.precio=precio; 
        this.incluye=incluye;
        arrayPartes=new ArrayList();
    }

    /**
     *
     * @param parte
     */
    public void agregarParte(Parte parte){
        arrayPartes.add(parte); 
    }
    
    /**
     *
     * @return
     */
    public abstract double descuento();
    
    @Override
    public String toString(){
        String hilera="";
        hilera+=String.format("Código: %s \nModelo: %s \nPrecio: $ %.1f  \nIncluye: %s" ,
                                codigoAuto,modelo,precio, incluye);
        
        return hilera;
    }

    /**
     *
     * @return
     */
    public String getCodigoAuto() {
        return codigoAuto;
    }

    /**
     *
     * @param codigoAuto
     */
    public void setCodigoAuto(String codigoAuto) {
        this.codigoAuto = codigoAuto;
    }

    /**
     *
     * @return
     */
    public ArrayList<Parte> getArrayPartes() {
        return arrayPartes;
    }

    /**
     *
     * @param arrayPartes
     */
    public void setArrayPartes(ArrayList<Parte> arrayPartes) {
        this.arrayPartes = arrayPartes;
    }
    
    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIncluye() {
        return incluye;
    }

    /**
     *
     * @param modelo
     */
    public void setIncluye(String incluye) {
        this.incluye = this.incluye;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public static Auto consultarAuto(String codigo) throws Exception {
        Auto auto1=ArchivoAuto.getInstance().consultarAuto(codigo);
        return auto1;
    }

    
    public static void agregarAuto(Auto auto) throws Exception {
        ArchivoAuto.getInstance().agregarAuto(auto);
    }

    
    public static void eliminarAuto(String codigo)throws Exception{
       ArchivoAuto.getInstance().eliminarAuto(codigo);
    }

  
    public static void modificarAuto(Auto auto)throws Exception{
         ArchivoAuto.getInstance().modificarAuto(auto);
    }

    
    public static ArrayList<Auto> listadoAutos() throws Exception{
        ArrayList<Auto> arrayAutos=ArchivoAuto.getInstance().listaAutos();
       return arrayAutos;
    }
}
