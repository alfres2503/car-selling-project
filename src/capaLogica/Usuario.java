package capaLogica;
import capaDatos.ArchivoUsuario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Usuario implements Serializable{
    private static int contUsuario=0; private String id; //Viene a ser lo mismo 
    private String nombre, correo, pais, direccion, telefono,tipoC;
    private TipoUsuario tipo;
    private char[] clave;
    private boolean activo;
    
    /**
     *
     * @param nombre
     * @param correo
     * @param pais
     * @param direccion
     * @param telefono
     * @param tipo
     */
    public Usuario(String nombre, String correo, String pais, String direccion, String telefono, TipoUsuario tipo){
        contUsuario++; 
        
        //La clave se asigna hasta después porque hay que validar que sean iguales en la ventana de registro
        
        this.nombre=nombre;
        this.correo=correo;
        this.pais=pais;
        this.direccion=direccion;
        this.telefono=telefono;
        this.tipo=tipo;
        this.activo=true;
        this.id="";
        this.tipoC="";
    }
    
    /**
     *
     * @param clave
     */
    public void setClave(char[] clave){
        this.clave=clave;
    }
    
    public void setNom(String nombre){
        this.nombre=nombre;
    }
    
    
    /**
     *
     * @param activo
     */
    public void setActivo(boolean activo){
        this.activo=activo;
    }
    
    /**
     *
     * @return
     */
    public boolean getActivo(){
        return this.activo;
    }
    
    /**
     *
     * @return
     */
    public String getNom(){
        return this.nombre;
    }
    
    /**
     *
     * @return
     */
    public String getID(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }
    

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    /**
     *
     * @return
     */
    
    public void setEmail(String mail){
        this.correo=mail;
    }
    
    public String getEmail(){
        return this.correo;
    }
    
    /**
     *
     * @return
     */
    public char[] getClave(){
        return this.clave;
    }
    
    /**
     *
     * @return
     */
    public TipoUsuario getTipo(){
        return this.tipo;
    }
    
    /**
     *
     * @return
     */
    public String getTelefono(){
        return this.telefono;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public static Usuario consultarUsuario(String mail) throws Exception {
        Usuario usuario1=ArchivoUsuario.getInstance().consultarUsuario(mail);
        return usuario1;
    }

    
    public static void agregarUsuario(Usuario usuario) throws Exception {
        ArchivoUsuario.getInstance().agregarUsuario(usuario);
    }

    
    public static void eliminarUsuario(String mail)throws Exception{
       ArchivoUsuario.getInstance().eliminarUsuario(mail);
    }

  
    public static void modificarUusario(Usuario usuario)throws Exception{
         ArchivoUsuario.getInstance().modificarUsuario(usuario);
    }

    
    public static ArrayList<Usuario> listadoUsuarios() throws Exception{
        ArrayList<Usuario> arrayUsuarios=ArchivoUsuario.getInstance().listaUsuarios();
       return arrayUsuarios;
    }
}
