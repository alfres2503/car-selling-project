
package capaDatos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class MiObjectOutputStream extends 
        ObjectOutputStream{

    public MiObjectOutputStream(OutputStream out)
            throws IOException {
            super(out);
    }
    
    //redefinir el metodo que escribe los encabezados
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
    
    
}
