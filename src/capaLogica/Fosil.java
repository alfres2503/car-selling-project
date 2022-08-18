
package capaLogica;

/**
 *
 * @author HP
 */
public class Fosil extends Auto{

    /**
     *
     * @param tipo
     * @param modelo
     * @param precio
     */
    public Fosil(String codigo,String modelo,String tipo,double precio,String partesDeFabrica){
        super(codigo,modelo,tipo,precio,partesDeFabrica);
    }

    /**
     *
     * @return
     */
    @Override
    public double descuento() {
        return 0;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
