
package capaDatos;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import capaLogica.Parte;

public class ArchivoParte {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Parte.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Parte> arrayPartesTemp;

    
    private static  ArchivoParte instance = null;

    
    private  ArchivoParte() {

    }

    
    public static  ArchivoParte getInstance() {
        if (instance == null) {
            instance = new  ArchivoParte();
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

    
     public ArrayList<Parte> listaPartes() throws Exception{
        ArrayList listaPartes= new ArrayList();
        
      try {         
            abrirArchivoInput();
             
            while(true){
                Parte parte1 = 
                           (Parte)oLector.readObject();                  
                listaPartes.add(parte1);
            }
         } 
        catch (Exception ex) {
              
        } 
       
        finally{
           
           cerrarArchivoInput();              
        } 
        return listaPartes;
       
        
    }

   
    public Parte consultarParte(int numeroParte)throws Exception {
        Parte parte,parteBuscada= null ;
        try {
            abrirArchivoInput();
            
             while(true){
                parte = (Parte)oLector.readObject();               
                if(parte.getNumeroParte()==numeroParte) {
                    parteBuscada = parte;                    
                }
             }            
        }
        catch (Exception e) {
             
        } 
        
        finally{
         
           cerrarArchivoInput();              
        }    
        return parteBuscada;
        }       
    


   
    public  void agregarParte(Parte parte)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
             
               oEscritor.writeObject(parte);
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

   
      public void modificarParte(Parte parte) throws Exception{
        arrayPartesTemp = new ArrayList();
        try {            
            abrirArchivoInput();            
           
             Parte parte1=null;
            
             while(true){
                 parte1 = (Parte)oLector.readObject(); 
                 if(parte1.getNumeroParte()==parte.getNumeroParte()) {
                   parte1=parte;
                 }
                 arrayPartesTemp.add(parte1);
             }               
        }
        catch (Exception ex) {
             
        } 
        
        finally{
            cerrarArchivoInput();  
            pasarArrayTemporal_Archivo();   
        }  
        
    }
      
    public void eliminarParte(int numeroParte) throws Exception {
        arrayPartesTemp = new ArrayList();
        try {            
            abrirArchivoInput();
            Parte parte1=null;
            
            while(true){
                 parte1 = (Parte)oLector.readObject();               
                 if(parte1.getNumeroParte()!= numeroParte) {
                     arrayPartesTemp.add(parte1);
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
          if(!arrayPartesTemp.isEmpty()){
             abrirArchivoOutput();
          
            for (Parte parte : arrayPartesTemp) {
             oEscritor.writeObject(parte);   
             oEscritor.flush();
             oEscritor.reset();
            }     
          }
          cerrarArchivoOutput();
    }    
}
