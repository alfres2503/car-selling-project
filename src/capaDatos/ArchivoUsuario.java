package capaDatos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import capaLogica.Usuario;

public class ArchivoUsuario {

    private final String RUTA_ARCHIVO = System.getProperty("user.dir") + "\\src\\Archivo\\Usuario.txt";
    private FileOutputStream archivoSalida;
    private ObjectOutputStream oEscritor;
    private FileInputStream archivoEntrada;
    private ObjectInputStream oLector;
    private ArrayList<Usuario> arrayUsuariosTemp;

    //Instancia privada de la misma clase
    //implementa el patrón Singleton
    private static ArchivoUsuario instance = null;

    //Constructor privado, se implementa el patrón Singleton
    private ArchivoUsuario() {

    }

    //Método público que retorna una única instancia de la 
    //clase, únicamnete se construye la primera vez.
    public static ArchivoUsuario getInstance() {
        if (instance == null) {
            instance = new ArchivoUsuario();
        }
        return instance;
    }

    public void abrirArchivoOutput() throws Exception {
        //Abrir el archivo
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

    /**
     * Permite cerrar el archivo de datos que se abrió de salida
     */
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

    /**
     * Permite cerrar el archivo de datos que se abrió para lectura
     */
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

    public ArrayList<Usuario> listaUsuarios() throws Exception {
        ArrayList listaClientes = new ArrayList();

        try {
            abrirArchivoInput();

            while (true) {
                Usuario usuario1
                        = (Usuario) oLector.readObject();
                listaClientes.add(usuario1);
            }
        } catch (Exception ex) {

        } finally {
            //Ocurra o no ocurra la excepción se cierra el archivo
            cerrarArchivoInput();
        }
        return listaClientes;

    }

    public Usuario consultarUsuario(String mail) throws Exception {
        Usuario usuario, usuarioBuscado = null;
        try {
            abrirArchivoInput();

            while (true) {
                usuario = (Usuario) oLector.readObject();
                if (usuario.getEmail().equalsIgnoreCase(mail)) {
                    usuarioBuscado = usuario;
                }
            }
        } catch (Exception ex) {

        } finally {
            //Ocurra o no ocurra la excepción se cierra el archivo
            cerrarArchivoInput();
        }
        return usuarioBuscado;
    }

    public void agregarUsuario(Usuario usuario) throws Exception {
        try {
            this.abrirArchivoOutput();
            if (oEscritor != null) {

                oEscritor.writeObject(usuario);
                oEscritor.flush();
                oEscritor.reset();
            }

        } catch (Exception e) {
            throw e;
        } finally {
            //Ocurra o no la excepción se debe cerrar el archivo
            this.cerrarArchivoOutput(); //Cierra el archivo
        }
    }

    public void modificarUsuario(Usuario usuario) throws Exception {
        arrayUsuariosTemp = new ArrayList();
        try {
            abrirArchivoInput();

            Usuario usuario1 = null;

            while (true) {
                usuario1 = (Usuario) oLector.readObject();
                if (usuario1.getEmail().equalsIgnoreCase(usuario.getEmail())) {
                    usuario1 = usuario;
                }
                arrayUsuariosTemp.add(usuario1);
            }
        } catch (Exception e) {
            //Se lanza para que en el frame se pueda indicar al usuario cualquier otra excepción

        } finally {
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();
        }

    }


    public void eliminarUsuario(String mail) throws Exception {
        arrayUsuariosTemp = new ArrayList();
        try {
            abrirArchivoInput();
            Usuario usuario1 = null;

            while (true) {
                usuario1 = (Usuario) oLector.readObject();
                if (!usuario1.getEmail().equalsIgnoreCase(mail)) {
                    arrayUsuariosTemp.add(usuario1);
                }
            }
        } catch (EOFException ex) {
            //Error de fin de archivo, no se lanza, solamente se captura para que no se caiga
        } catch (Exception ex1) {
            //Se lanza para que en el frame se pueda indicar al usuario cualquier otra excepción

            throw ex1;
        } finally {
            cerrarArchivoInput();
            pasarArrayTemporal_Archivo();
        }
    }

    private void pasarArrayTemporal_Archivo() throws Exception {
        File archivoOriginal = new File(RUTA_ARCHIVO);

        if (archivoOriginal.exists()) {
            archivoOriginal.delete();
        }
        if (!arrayUsuariosTemp.isEmpty()) {
            abrirArchivoOutput();

            for (Usuario usuario : arrayUsuariosTemp) {
                oEscritor.writeObject(usuario);
                oEscritor.flush();
                oEscritor.reset();
            }
        }
        cerrarArchivoOutput();
    }

}
