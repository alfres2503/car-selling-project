
package capaLogica;

/**
 *
 * @author HP
 */
public class Electrico extends Auto{
     private final double DESCUENTO=0.05;
    
    
    public Electrico (String codigo,String modelo,String tipo,double precio,String partesDeFabrica){
        super(codigo,modelo,tipo,precio,partesDeFabrica);
    }

   
    @Override
    public double descuento() {
        return super.getPrecio()*DESCUENTO;
    }
     @Override
   public String toString(){
        return super.toString();
    }
    
}
