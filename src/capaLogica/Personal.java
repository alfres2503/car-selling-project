
package capaLogica;

/**
 *
 * @author HP
 */
public class Personal extends Cliente{
    private final double DESCUENTO=0.15;
    private String cedulaFisica;

    /**
     *
     * @param usuario
     * @param cedulaFisica
     */
    public Personal(String nombre,String correo,String pais,String direccion,String telefono,String tipo,
                    boolean activo,String cedulaFisica){
        super(nombre,correo,pais,direccion,telefono,tipo,activo);
        this.cedulaFisica=cedulaFisica;
    }
    public Personal(Usuario usuario,String CedulaFisica){
        super(usuario);
        this.cedulaFisica=CedulaFisica;
    }
    /**
     *
     * @return
     */
    @Override
    public double descuento() {
        double descuento=0,total=0;
        if(super.getArrayPartes().size()>10){
            for (int i = 0; i < super.getArrayPartes().size(); i++) {
                total+=super.getArrayPartes().get(i).getPrecio();
            }
            descuento=total*DESCUENTO;
        }
        return descuento;
    }

    public String getCedulaFisica() {
        return cedulaFisica;
    }

    public void setCedulaFisica(String cedulaFisica) {
        this.cedulaFisica = cedulaFisica;
    }
    
}
    
    

