package capaDatos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import capaLogica.Auto;

public class ArchivoAuto {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Auto.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Auto> arrayAutosTemp;

    
    private static  ArchivoAuto instance = null;

    
    private  ArchivoAuto() {

    }

    
    public static  ArchivoAuto getInstance() {
        if (instance == null) {
            instance = new  ArchivoAuto();
        }
        return instance;
    }
    
    public void abrirArchivoOutput() throws Exception {
        
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

    
     public ArrayList<Auto> listaAutos() throws Exception{
        ArrayList listaPartes= new ArrayList();
        
      try {         
            abrirArchivoInput();
             
            while(true){
                Auto auto1 = 
                           (Auto)oLector.readObject();                  
                listaPartes.add(auto1);
            }
         } 
        catch (Exception ex) {
              
        } 
       
        finally{
           
           cerrarArchivoInput();              
        } 
        return listaPartes;
       
        
    }

   
    public Auto consultarAuto(String codigo)throws Exception {
        Auto auto,autoBuscado= null ;
        try {
            abrirArchivoInput();
            
             while(true){
                auto = (Auto)oLector.readObject();               
                if(auto.getCodigoAuto().equalsIgnoreCase(codigo)) {
                    autoBuscado = auto;                    
                }
             }            
        }
        catch (Exception ex) {
             
        } 
       
        finally{
         
           cerrarArchivoInput();              
        }    
        return autoBuscado;
        }       
    


   
    public  void agregarAuto(Auto auto)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
             
               oEscritor.writeObject(auto);
               oEscritor.flush();  
               oEscritor.reset();
            }
        
        } catch (Exception e) {
            throw e;
        }
        finally{
            
            this.cerrarArchivoOutput(); 
        }
    }

   
      public void modificarAuto(Auto auto) throws Exception{
        arrayAutosTemp = new ArrayList();
        try {            
            abrirArchivoInput();            
           
             Auto auto1=null;
            
             while(true){
                 auto1 = (Auto)oLector.readObject(); 
                 if(auto1.getCodigoAuto().equalsIgnoreCase(auto.getCodigoAuto())) {
                   auto1=auto;
                 }
                 arrayAutosTemp.add(auto1);
             }               
        }
        catch (Exception e) {
           
        } 
                 
        finally{
            cerrarArchivoInput();  
            pasarArrayTemporal_Archivo();   
        }  
        
    }
      
    public void eliminarAuto(String codigo) throws Exception {
        arrayAutosTemp = new ArrayList();
        try {            
            abrirArchivoInput();
            Auto auto1=null;
            
            while(true){
                 auto1 = (Auto)oLector.readObject();               
                 if(!auto1.getCodigoAuto().equalsIgnoreCase(codigo)) {
                     arrayAutosTemp.add(auto1);
                 }
             }                       
        }
         catch (EOFException ex) {
             
        } 
        catch (Exception ex1) { 
          
       
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
          if(!arrayAutosTemp.isEmpty()){
             abrirArchivoOutput();
          
            for (Auto auto : arrayAutosTemp) {
             oEscritor.writeObject(auto);   
             oEscritor.flush();
             oEscritor.reset();
            }     
          }
          cerrarArchivoOutput();
    }    
}
