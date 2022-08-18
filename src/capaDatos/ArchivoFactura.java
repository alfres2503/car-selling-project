
package capaDatos;

import capaLogica.Factura;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArchivoFactura {
    private final String RUTA_ARCHIVO = System.getProperty("user.dir")+ "\\src\\Archivo\\Factura.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Factura> arrayFacturasTemp;

    
    private static  ArchivoFactura instance = null;

    
    private  ArchivoFactura() {

    }

    
    public static  ArchivoFactura getInstance() {
        if (instance == null) {
            instance = new  ArchivoFactura();
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

    
     public ArrayList<Factura> listaFacturas() throws Exception{
        ArrayList listaFacturas= new ArrayList();
        
      try {         
            abrirArchivoInput();
             
            while(true){
                Factura factura1 = 
                           (Factura)oLector.readObject();                  
                listaFacturas.add(factura1);
            }
         } 
        catch (Exception ex) {
              
        } 
       
        finally{
           
           cerrarArchivoInput();              
        } 
        return listaFacturas;
       
        
    }

   
    public Factura consultarFactura(int numeroFactura)throws Exception {
        Factura factura,facturaBuscada= null ;
        try {
            abrirArchivoInput();
            
             while(true){
                factura = (Factura)oLector.readObject();               
                if(factura.getNumeroFactura()==numeroFactura) {
                    facturaBuscada = factura;                    
                }
             }            
        }
        catch (Exception e) {
             
        } 
        
        finally{
         
           cerrarArchivoInput();              
        }    
        return facturaBuscada;
        }       
    


   
    public  void agregarFactura(Factura factura)throws Exception {        
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {
             
               oEscritor.writeObject(factura);
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

   
      public void modificarFactura(Factura factura) throws Exception{
        arrayFacturasTemp = new ArrayList();
        try {            
            abrirArchivoInput();            
           
             Factura factura1=null;
            
             while(true){
                 factura1 = (Factura)oLector.readObject(); 
                 if(factura1.getNumeroFactura()==factura.getNumeroFactura()) {
                   factura1=factura;
                 }
                 arrayFacturasTemp.add(factura1);
             }               
        }
        catch (Exception ex) {
             
        } 
        
        finally{
            cerrarArchivoInput();  
            pasarArrayTemporal_Archivo();   
        }  
        
    }
      
    public void eliminarFactura(int numeroFactura) throws Exception {
        arrayFacturasTemp = new ArrayList();
        try {            
            abrirArchivoInput();
            Factura factura1=null;
            
            while(true){
                 factura1 = (Factura)oLector.readObject();               
                 if(factura1.getNumeroFactura()!= numeroFactura) {
                     arrayFacturasTemp.add(factura1);
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
          if(!arrayFacturasTemp.isEmpty()){
             abrirArchivoOutput();
          
            for (Factura factura : arrayFacturasTemp) {
             oEscritor.writeObject(factura);   
             oEscritor.flush();
             oEscritor.reset();
            }     
          }
          cerrarArchivoOutput();
    }    
}
