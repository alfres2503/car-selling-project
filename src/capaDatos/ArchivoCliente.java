package capaDatos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import capaLogica.Cliente;

public class ArchivoCliente {
   
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Cliente.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Cliente> arrayClientesTemp;

    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static  ArchivoCliente instance = null;

    //Constructor privado, se implementa el patrón Singleton
    private  ArchivoCliente() {

    }

    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static  ArchivoCliente getInstance() {
        if (instance == null) {
            instance = new  ArchivoCliente();
        }
        return instance;
    }

    public void abrirArchivoOutput() throws Exception {
        //Abrir el archivo
        try {
            File oArchivo = new File(RUTA_ARCHIVO);
            if (!oArchivo.exists()) {
                       
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new ObjectOutputStream(archivoSalida);
            } else {
                
                archivoSalida = new FileOutputStream(RUTA_ARCHIVO, true);
                oEscritor = new MiObjectOutputStream(archivoSalida);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    
    public void abrirArchivoInput() throws Exception {
        
        try {
            archivoEntrada = new FileInputStream(RUTA_ARCHIVO);
            oLector = new ObjectInputStream(archivoEntrada);
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Permite cerrar el archivo de datos que se abrió de salida
    */
    public void cerrarArchivoOutput() throws Exception {
        try {
            if (oEscritor != null) {
                oEscritor.close();
                oEscritor = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
     /**
     * Permite cerrar el archivo de datos que se abrió para lectura
     */
    private void cerrarArchivoInput() throws Exception {
        try {
            if (oLector != null) {
                oLector.close();
                oLector = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    
     public ArrayList<Cliente> listaClientes() throws Exception{
        ArrayList listaClientes= new ArrayList();
       
      try {         
            abrirArchivoInput();
             
            while(true){
                Cliente cliente1 = 
                           (Cliente)oLector.readObject();                  
                listaClientes.add(cliente1);
            }
         } 
     
        catch (Exception ex) { 
       
        }
       
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();              
        } 
        return listaClientes;
       
        
    }

    public Cliente consultarCliente(String id)throws Exception {
        Cliente cliente,clienteBuscado= null ;
        try {
            abrirArchivoInput();
            
             while(true){
                cliente = (Cliente)oLector.readObject();               
                if(cliente.getId().equalsIgnoreCase(id)) {
                    clienteBuscado = cliente;                    
                }
             }            
        }
        
        catch (Exception ex) { 
       
        }
       
        finally{
           //Ocurra o no ocurra la excepción se cierra el archivo
           cerrarArchivoInput();              
        }    
        return clienteBuscado;
        }       
    


    
    public  void agregarCliente(Cliente cliente)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
              
               oEscritor.writeObject(cliente);
               oEscritor.flush();  
               oEscritor.reset();
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }
    }

    
      public void modificarCliente(Cliente cliente) throws Exception{
        arrayClientesTemp = new ArrayList();
        try {            
            abrirArchivoInput();            
             
             Cliente cliente1=null;
            
             while(true){
                 cliente1 = (Cliente)oLector.readObject(); 
                 if(cliente1.getId().equalsIgnoreCase(cliente.getId())){
                   cliente1=cliente;
                 }
                 arrayClientesTemp.add(cliente1);
             }               
        }
        
        catch (Exception e) { 
          //Se lanza para que en el frame se pueda indicar al usuario cualquier otra excepción
        
        }       
        finally{
            cerrarArchivoInput();  
            pasarArrayTemporal_Archivo();   
        }  
        
    }
      
    public void eliminarCliente(String id) throws Exception {
        arrayClientesTemp = new ArrayList();
        try {            
            abrirArchivoInput();
            Cliente cliente1 = null;
           
            while(true){
                 cliente1 = (Cliente)oLector.readObject();               
                 if(!cliente1.getId().equalsIgnoreCase(id)){
                     arrayClientesTemp.add(cliente1);
                 }
             }                       
        }
         catch (EOFException ex) {
              //Error de fin de archivo, no se lanza, solamente se captura para que no se caiga
        } 
        catch (Exception ex1) { 
          //Se lanza para que en el frame se pueda indicar al usuario cualquier otra excepción
       
          throw ex1; 
        }
        finally{
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo(); 
        }               
    }
    

    private void pasarArrayTemporal_Archivo() throws Exception {       
       File archivoOriginal = new File(RUTA_ARCHIVO);
       
          if(archivoOriginal.exists()){
            archivoOriginal.delete();
          }  
          if(!arrayClientesTemp.isEmpty()){
             abrirArchivoOutput();
          
            for (Cliente cliente : arrayClientesTemp) {
             oEscritor.writeObject(cliente);   
             oEscritor.flush();
             oEscritor.reset();
            }     
          }
          cerrarArchivoOutput();
    }    
    
}
