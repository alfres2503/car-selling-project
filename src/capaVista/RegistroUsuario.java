package capaVista;

import capaLogica.Usuario;
import capaLogica.TipoUsuario;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroUsuario extends javax.swing.JFrame {

    Usuario user;

    String nombre, correo, pais, direccion, telefono;
    TipoUsuario tipo;

    public RegistroUsuario() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPais = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPassword2 = new javax.swing.JPasswordField();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(0, 0, 0, 200));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bmwLogo.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre: ");

        jTextFieldNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Correo Electrónico: ");

        jTextFieldCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldCorreo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("País: ");

        jComboBoxPais.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxPais.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemania", "Brasil", "China", "Costa Rica", "India", "Sudáfrica", "Reino Unido", "Estados Unidos", "México", "Otro" }));
        jComboBoxPais.setSelectedIndex(-1);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Dirección: ");

        jTextDireccion.setBackground(new java.awt.Color(51, 51, 51));
        jTextDireccion.setForeground(new java.awt.Color(255, 255, 255));

        jTextTelefono.setBackground(new java.awt.Color(51, 51, 51));
        jTextTelefono.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Teléfono: ");

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Clave:");

        jPassword1.setBackground(new java.awt.Color(51, 51, 51));
        jPassword1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Condirmar Clave:");

        jPassword2.setBackground(new java.awt.Color(51, 51, 51));
        jPassword2.setForeground(new java.awt.Color(255, 255, 255));

        jButtonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registro de Usuario");

        jButtonSalir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setForeground(new java.awt.Color(204, 204, 204));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelError.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Tipo de Usuario:");

        jComboBoxTipo.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxTipo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextTelefono)
                            .addComponent(jPassword2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxPais, 0, 262, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel9))
                                            .addComponent(Logo)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPais, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 690));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperRegistro.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -100, 490, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        //Obtener datos
        nombre = jTextFieldNombre.getText();
        correo = jTextFieldCorreo.getText();
        pais = jComboBoxPais.getItemAt(jComboBoxPais.getSelectedIndex());
        tipo = jComboBoxTipo.getItemAt(jComboBoxTipo.getSelectedIndex());
        direccion = jTextDireccion.getText();
        telefono = jTextTelefono.getText();

        //Obtener contraseñas
        char[] claveDigitada = jPassword1.getPassword();
        char[] confirmarClave = jPassword2.getPassword();

        //Validar datos 
        if (nombre.matches("")) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Digite un nombre");
            jTextFieldNombre.requestFocus();
            return;
        }
        if (!correo.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Correo inválido");
            jTextFieldCorreo.requestFocus();
            return;
        }
        if (pais == null) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Seleccione un país");
            jComboBoxPais.requestFocus();
            return;
        }
        if (tipo == null) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Seleccione un tipo de usuario");
            jComboBoxTipo.requestFocus();
            return;
        }
        if (direccion.matches("")) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Digite una dirección");
            jTextDireccion.requestFocus();
            return;
        }
        if (!telefono.matches("[0-9]{8,12}")) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Digite un telefono válido");
            jTextTelefono.requestFocus();
            return;
        }
        if (jPassword1.getPassword().length == 0) {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Digite una contraseña válida");
            jPassword1.requestFocus();
            return;
        }

        //Validar que no existan dos usuarios iguales
        try {
            for (int i = 0; i < Usuario.listadoUsuarios().size(); i++) {
                user = Usuario.listadoUsuarios().get(i);
                if (correo.equalsIgnoreCase(user.getEmail())) {
                    jLabelError.setForeground(new java.awt.Color(255, 51, 51));
                    jLabelError.setText("Correo ya en uso");
                    return;
                } else {
                    if (telefono.matches(user.getTelefono())) {
                        jLabelError.setForeground(new java.awt.Color(255, 51, 51));
                        jLabelError.setText("Telefono ya en uso");
                        return;
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Validar claves iguales 
        if (Arrays.equals(claveDigitada, confirmarClave)) {
            jLabelError.setForeground(new java.awt.Color(102, 255, 102));
            jLabelError.setText("Usuario registrado");
            //Crear Usuario y asignar clave

            user = new Usuario(nombre, correo, pais, direccion, telefono, tipo);
            user.setClave(confirmarClave);
            try {
                Usuario.agregarUsuario(user);
            } catch (Exception ex) {
                Logger.getLogger(RegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jLabelError.setForeground(new java.awt.Color(255, 51, 51));
            jLabelError.setText("Las contraseñas no coinciden");
            jPassword2.requestFocus();
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (TipoUsuario tipo : TipoUsuario.values()) {
            jComboBoxTipo.addItem(tipo);
        }
        jComboBoxTipo.setSelectedIndex(-1);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxPais;
    private javax.swing.JComboBox<TipoUsuario> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JPasswordField jPassword2;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
