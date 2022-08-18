package capaVista;

import capaLogica.TipoUsuario;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoUsuarios extends javax.swing.JFrame {
    TipoUsuario tipo;
    Usuario user, usuario1;
    DefaultTableModel modeloTabla;
    char[] claveUsuario;

    public MantenimientoUsuarios() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla = (DefaultTableModel) jTable1.getModel();
        this.setTitle("BMW - Mantenimiento de Usuarios");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JLabel();
        jPanelBarra = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtCorreo = new javax.swing.JTextField();
        jTxtPais = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jCboTipo = new javax.swing.JComboBox<>();
        Bar = new javax.swing.JLabel();
        jCboActivo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backMouse.png"))); // NOI18N
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, 100));

        jPanelBarra.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanelBarra.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 12, 149, -1));

        jLabelTipo.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo");
        jPanelBarra.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 40, 149, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanelBarra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("País:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Teléfono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Activo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));
        getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));
        getContentPane().add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 170, -1));
        getContentPane().add(jTxtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 90, -1));
        getContentPane().add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 150, 20));
        getContentPane().add(jTxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 70, -1));

        getContentPane().add(jCboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 110, -1));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 240, -1));

        getContentPane().add(jCboActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 70, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "País", "Dirección", "Teléfono", "Tipo", "Activo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 810, 170));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Mantenimiento de Usuarios:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 95));

        jButtonModificar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonModificar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 95));

        jButtonConsultar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonConsultar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, 95));

        jButtonBorrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBorrar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 150, 95));

        jButtonCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 150, 95));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 810, 120));

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoExtra.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUser(Usuario user) {
        this.user = user;
    }

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backMouse.png")));
    }//GEN-LAST:event_botonSalirMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelUsuario.setText(user.getNom());
        jLabelTipo.setText(user.getTipo().toString());
        for (TipoUsuario tipo : TipoUsuario.values()) {
            jCboTipo.addItem(tipo);
        }
        jCboActivo.addItem("Sí");
        jCboActivo.addItem("No");
        jCboActivo.setSelectedIndex(-1);
        jCboTipo.setSelectedIndex(-1);
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            String nombre = jTxtNombre.getText();
            String correo = jTxtCorreo.getText();
            TipoUsuario tipo = (TipoUsuario) jCboTipo.getSelectedItem();
            String pais = jTxtPais.getText();
            String direccion = jTxtDireccion.getText();
            String telefono = jTxtTelefono.getText();
            boolean activo = false;

            if ("Sí".equalsIgnoreCase((String) jCboActivo.getSelectedItem())) {
                activo = true;
            }
            //Validar datos 
            if (nombre.matches("")) {

                JOptionPane.showMessageDialog(this, "Digite un nombre");
                jTxtNombre.requestFocus();
                return;
            }

            if (!correo.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {

                JOptionPane.showMessageDialog(this, "Correo inválido");
                jTxtCorreo.requestFocus();
                return;
            }
            if (pais.matches("")) {

                JOptionPane.showMessageDialog(this, "Digite el país");
                jTxtPais.requestFocus();
                return;
            }
            if (tipo == null) {

                JOptionPane.showMessageDialog(this, "Seleccione un tipo de cliente");
                jCboTipo.requestFocus();
                return;
            }
            if (direccion.matches("")) {

                JOptionPane.showMessageDialog(this, "Digite una dirección");
                jTxtDireccion.requestFocus();
                return;
            }
//        if (!telefono.matches("[0-9]{8,12}")) {
//            
//            JOptionPane.showMessageDialog(this,"Digite un telefono válido");
//            jTxtTelefono.requestFocus();
//            return;
//        }
            if (jCboActivo.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(this, "Seleccione una opción del campo activo");
                jCboActivo.requestFocus();
                return;
            }

            switch (tipo) {
            case Administrador:
                usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Administrador);
                break;
            case Vendedor:
                usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Vendedor);
                break;
            default:
                usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Regular);
                break;
        }

            usuario1.setActivo(activo);
            usuario1.setTipo(tipo);
            usuario1.setEmail(correo);
            usuario1.setDireccion(direccion);
            usuario1.setNom(nombre);
            usuario1.setTelefono(telefono);
            usuario1.setPais(pais);
            usuario1.setClave(claveUsuario);
            //usuario1.setClave(el .getClave del usuario seleccionado);
            

            try {
                Usuario.modificarUusario(usuario1);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar el usuario\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                e.printStackTrace();
                System.exit(0);
            }

            llenarTabla();

            jTable1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario a modificar");
            return;
        }
        desactivarBotones();
        limpiar();
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {

            JOptionPane.showConfirmDialog(this, "Nombre: " + jTxtNombre.getText()
                    + "\nCorreo: " + jTxtCorreo.getText()
                    + "\nPais: " + jTxtPais.getText()
                    + "\nDirección: " + jTxtDireccion.getText()
                    + "\nTeléfono: " + jTxtTelefono.getText()
                    + "\nTipo: " + jCboTipo.getSelectedItem()
                    + "\nActivo: " + jCboActivo.getSelectedItem(),
                    "Información del Usuario", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el usuario a consultar");
            return;
        }
        jTable1.clearSelection();
        desactivarBotones();
        limpiar();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el cliente a eliminar");
            return;
        }

        String correo = jTxtCorreo.getText();

        try {
            Usuario.eliminarUsuario(correo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el usuario\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
            System.exit(0);
        }
        llenarTabla(); //actualiza la tabla con el nuevo departamento  
        desactivarBotones();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        desactivarBotones();
        limpiar();
        jTable1.clearSelection();

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.isRowSelected(i)) {//llena los campos de texto con los datos de la tabla
                jTxtNombre.setText(String.valueOf(modeloTabla.getValueAt(i, 0)));
                jTxtCorreo.setText(String.valueOf(modeloTabla.getValueAt(i, 1)));
                jTxtPais.setText(String.valueOf(modeloTabla.getValueAt(i, 2)));
                jTxtDireccion.setText(String.valueOf(modeloTabla.getValueAt(i, 3)));
                jTxtTelefono.setText(String.valueOf(modeloTabla.getValueAt(i, 4)));
                
                if (String.valueOf(modeloTabla.getValueAt(i, 5)).equalsIgnoreCase(TipoUsuario.Administrador.toString())) {
                    jCboTipo.setSelectedIndex(0);
                } else if(String.valueOf(modeloTabla.getValueAt(i, 5)).equalsIgnoreCase(TipoUsuario.Vendedor.toString())){
                    jCboTipo.setSelectedIndex(1);
                } else {
                    jCboTipo.setSelectedIndex(2);
                }
                
                if (String.valueOf(modeloTabla.getValueAt(i, 6)).equalsIgnoreCase("Sí")) {
                    jCboActivo.setSelectedIndex(0);
                } else {
                    if (String.valueOf(modeloTabla.getValueAt(i, 6)).equalsIgnoreCase("No")) {
                        jCboActivo.setSelectedIndex(1);
                    }
                }
            }
        }
        Usuario usuarioSeleccionado;
        try {
            usuarioSeleccionado = Usuario.consultarUsuario((String) modeloTabla.getValueAt(jTable1.getSelectedRow(), 1));
            claveUsuario=usuarioSeleccionado.getClave(); //.getClave de get Objeto en la row seleccionada
        } catch (Exception ex) {
            Logger.getLogger(MantenimientoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        activarBotones();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nombre = jTxtNombre.getText();
        String correo = jTxtCorreo.getText();
        TipoUsuario tipo = (TipoUsuario) jCboTipo.getSelectedItem();
        String pais = jTxtPais.getText();
        String direccion = jTxtDireccion.getText();
        String telefono = jTxtTelefono.getText();
        boolean activo = false;
        if ("Sí".equalsIgnoreCase((String) jCboActivo.getSelectedItem())) {
            activo = true;
        }
        //         Validar datos
        if (nombre.matches("")) {

            JOptionPane.showMessageDialog(this, "Digite un nombre");
            jTxtNombre.requestFocus();
            return;
        }
        if (!correo.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            JOptionPane.showMessageDialog(this, "Correo inválido");
            jTxtCorreo.requestFocus();
            return;
        }
        if (pais.matches("")) {
            JOptionPane.showMessageDialog(this, "Digite el país");
            jTxtPais.requestFocus();
            return;
        }
        if (tipo == null) {

            JOptionPane.showMessageDialog(this, "Seleccione un tipo de Usuario");
            jCboTipo.requestFocus();
            return;
        }
        if (direccion.matches("")) {

            JOptionPane.showMessageDialog(this, "Digite una dirección");
            jTxtDireccion.requestFocus();
            return;
        }
        if (!telefono.matches("[0-9]{8,12}")) {

            JOptionPane.showMessageDialog(this, "Digite un telefono válido");
            jTxtTelefono.requestFocus();
            return;
        }
        if (jCboActivo.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(this, "Seleccione una opción del campo activo");
            jCboActivo.requestFocus();
            return;
        }

        switch (tipo) {
            case Administrador:
            usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Administrador);
            break;
            case Vendedor:
            usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Vendedor);
            break;
            default:
            usuario1=new Usuario(nombre, correo, pais, direccion, telefono, TipoUsuario.Regular);
            break;
        }
        boolean encontrado = false;
        try {
            for (int i = 0; i < Usuario.listadoUsuarios().size(); i++) {
                if (usuario1.getEmail().equalsIgnoreCase(Usuario.listadoUsuarios().get(i).getEmail())) {
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                Usuario.agregarUsuario(usuario1);
            } else {
                JOptionPane.showMessageDialog(this, "El usuario ya se encuentra registrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar el usuario\n"
                + "el programa se cerrará consulte con el administrador\n"
                + e.toString());
            System.exit(0);
        }

        llenarTabla();
        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void llenarTabla() {
        try {

            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[7];

            ArrayList<Usuario> lista = Usuario.listadoUsuarios();
            for (int i = 0; i < lista.size(); i++) {
                datos[0] = lista.get(i).getNom();
                datos[1] = lista.get(i).getEmail();
                datos[2] = lista.get(i).getPais();
                datos[3] = lista.get(i).getDireccion();
                datos[4] = lista.get(i).getTelefono();
                datos[5] = lista.get(i).getTipo();
                datos[6] = (lista.get(i).getActivo()? "Sí" : "No");

                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de usuarios\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
            e.printStackTrace();
        }
    }

    private void limpiar() {
        jTxtNombre.setText("");
        jTxtCorreo.setText("");
        jTxtPais.setText("");
        jTxtDireccion.setText("");
        jTxtTelefono.setText("");
        jCboActivo.setSelectedIndex(-1);
        jCboTipo.setSelectedIndex(-1);
    }

    private void activarBotones() {
        jButtonGuardar.setEnabled(false);
        jButtonBorrar.setEnabled(true);
        jButtonModificar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonConsultar.setEnabled(true);
    }

    private void desactivarBotones() {
        jButtonGuardar.setEnabled(false);
        jButtonBorrar.setEnabled(false);
        jButtonModificar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonConsultar.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jCboActivo;
    private javax.swing.JComboBox<TipoUsuario> jCboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
