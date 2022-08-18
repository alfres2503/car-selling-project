
package capaLogica;

/**
 *
 * @author HP
 */
public class Hibrido extends Auto{
    private final double DESCUENTO=0.03;

    /**
     *
     * @param tipo
     * @param modelo
     * @param precio
     */
    public Hibrido (String codigo,String modelo,String tipo,double precio,String partesDeFabrica){
        super(codigo,modelo,tipo,precio,partesDeFabrica);
    }

    /**
     *
     * @return
     */
    @Override
    public double descuento() {
        return super.getPrecio()*DESCUENTO;
    }
    public String toString(){
        return super.toString();
    }
}
