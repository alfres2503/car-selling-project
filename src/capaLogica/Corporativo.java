
package capaLogica;

/**
 *
 * @author HP
 */
public class Corporativo extends Cliente{
    private final double DESC1=0.1;
    private final double DESC2=0.2;
    private final double DESC3=0.25;
    private String cedulaJuridica;

    /**
     *
     * @param usuario
     * @param cedulaJuridica
     */
    public Corporativo(String nombre,String correo,String pais,String direccion,String telefono,String tipo,
                       boolean activo ,String cedulaJuridica){
        super(nombre,correo,pais,direccion,telefono,tipo,activo);
        this.cedulaJuridica=cedulaJuridica;
    }
    public Corporativo(Usuario usuario,String CedulaJuridica){
        super(usuario);
        this.cedulaJuridica=cedulaJuridica;
    }

   

    /**
     *
     * @return
     */
    @Override
    public double descuento() {
        double descuento=0,total=0;
        if(super.getArrayPartes().size()>3&&super.getArrayPartes().size()<5){
            for (int i = 0; i < super.getArrayPartes().size(); i++) {
                total+=super.getArrayPartes().get(i).getPrecio();
            }
            descuento=total*DESC1;
        }else{
            if(super.getArrayPartes().size()>5&&super.getArrayPartes().size()<10){
                for (int i = 0; i < super.getArrayPartes().size(); i++) {
                    total+=super.getArrayPartes().get(i).getPrecio();
                }
                descuento=total*DESC2;
            }else{
                if(super.getArrayPartes().size()>10){
                    for (int i = 0; i < super.getArrayPartes().size(); i++) {
                     total+=super.getArrayPartes().get(i).getPrecio();
                    }
                    descuento=total*DESC3;
                }
            }
            
        }
        return descuento;
    }
     public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }
}
