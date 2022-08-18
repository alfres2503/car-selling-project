package capaLogica;

import capaDatos.ArchivoCliente;
import java.io.Serializable;
import java.util.ArrayList;


public abstract class Cliente implements Serializable{
    
    

     private String nombre, correo, pais, direccion, telefono,tipo,id;
     private boolean activo;
     private ArrayList<Parte> arrayPartes;
    

    
    public Cliente(String nombre,String correo,String pais,String direccion,String telefono
                   ,String tipo,boolean activo) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.direccion = direccion;
        this.telefono = telefono;
        setId(id);
        this.tipo=tipo;
        this.activo=activo;
        
    }
    public Cliente(Usuario usuario) {
        this.nombre = usuario.getNom();
        this.correo = usuario.getEmail();
        this.pais = usuario.getPais();
        this.direccion = usuario.getDireccion();
        this.telefono = usuario.getTelefono();
        this.id=String.valueOf(usuario.getID());
        this.tipo=String.valueOf(usuario.getTipoC());
        this.activo=usuario.getActivo();
        arrayPartes= new ArrayList();
        
    }
    public void agregarParte(Parte parte){
        arrayPartes.add(parte);
    }
    public abstract double descuento();
    
   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    public String getPais() {
        return pais;
    }

   
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public String getTelefono() {
        return telefono;
    }

   
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public ArrayList<Parte> getArrayPartes() {
        return arrayPartes;
    }
    
    
    
    public static Cliente consultarCliente(String id) throws Exception {
        Cliente cliente1=ArchivoCliente.getInstance().consultarCliente(id);
        return cliente1;
    }

    
    public static void agregarCliente(Cliente cliente) throws Exception {
        ArchivoCliente.getInstance().agregarCliente(cliente);
    }

    
    public static void eliminarCliente(String id)throws Exception{
       ArchivoCliente.getInstance().eliminarCliente(id);
    }

  
    public static void modificarCliente(Cliente cliente)throws Exception{
         ArchivoCliente.getInstance().modificarCliente(cliente);
    }

    
    public static ArrayList<Cliente> listadoClientes() throws Exception{
        ArrayList<Cliente> arrayClientes=ArchivoCliente.getInstance().listaClientes();
       return arrayClientes;
    }
}   
