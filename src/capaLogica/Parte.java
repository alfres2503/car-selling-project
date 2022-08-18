package capaLogica;

import capaDatos.ArchivoParte;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Parte implements Serializable{
    private String nombre;
    private int  numeroParte;
    private String tipo;
    private String  modelo;
    private double precio;
    private Estado estado;
    
    
    public Parte(String nombre,int numeroParte,String tipo,String modelo,double precio){
        this.nombre=nombre;
        this.numeroParte= numeroParte;
        this.tipo=tipo;
        this.modelo=modelo;
        this.precio=precio; 
        setEstado(estado);
    }

    
    public int getNumeroParte() {
        return numeroParte;
    }

    public void setNumeroParte(int numeroParte) {
        this.numeroParte = numeroParte;
    }

    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    public String getModelo() {
        return modelo;
    }

   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   
    public double getPrecio() {
        return precio;
    }

    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public Estado getEstado() {
        return estado;
    }

    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public String toString(){
        String hilera="";
        hilera+=String.format("Número de parte: %s    Tipo: %s    Nombre: %s "
                            + "   Modelo: %s    Precio: $ %.1f    Estado: %s",
                                numeroParte,tipo,nombre,modelo,precio,estado);
        return hilera;
    }

    
    public static Parte consultarParte(int numeroParte) throws Exception {
        Parte parte1=ArchivoParte.getInstance().consultarParte(numeroParte);
        return parte1;
    }

    
    public static void agregarParte(Parte parte) throws Exception {
        ArchivoParte.getInstance().agregarParte(parte);
    }

    
    public static void eliminarParte(int numeroParte) throws Exception{
        ArchivoParte.getInstance().eliminarParte(numeroParte);
    }

    
    public static void modificarParte(Parte parte) throws Exception{
        ArchivoParte.getInstance().modificarParte(parte);
    }

    public static ArrayList<Parte> listadoPartes() throws Exception {
        ArrayList<Parte> arrayPartes=ArchivoParte.getInstance().listaPartes();
       return arrayPartes;
    }
    
}
