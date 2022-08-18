package capaVista;

import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    
    RegistroUsuario registro;
    MenuPrincipal menu;
    int contPassword=0;
    
    public LogIn() {
        initComponents();
        //Cambiar Nombre de la pestaña e ícono
        this.setTitle("BMW - Inicio de Sesión");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelError = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        jLabelArroba = new javax.swing.JLabel();
        jLabelLlave = new javax.swing.JLabel();
        jTextMail = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jLabelBMW = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jCheckBoxMostrar = new javax.swing.JCheckBox();
        jButtonRegistro = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frameLogin"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelError.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 460, -1));

        jPanelLogin.setBackground(new java.awt.Color(0, 0, 0, 100));

        Bienvenido.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenido.setText("Bienvenido");

        jLabelArroba.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabelArroba.setForeground(new java.awt.Color(0, 103, 175));
        jLabelArroba.setText("@");

        jLabelLlave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLlave.png"))); // NOI18N

        jTextMail.setBackground(new java.awt.Color(51, 51, 51));
        jTextMail.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTextMail.setForeground(new java.awt.Color(255, 255, 255));
        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });

        jButtonLogin.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLogin.setForeground(new java.awt.Color(204, 204, 204));
        jButtonLogin.setText("Iniciar Sesión");
        jButtonLogin.setBorderPainted(false);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelBMW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BMWLogo2.png"))); // NOI18N

        jPassword.setBackground(new java.awt.Color(51, 51, 51));
        jPassword.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });

        jCheckBoxMostrar.setBackground(new java.awt.Color(9, 73, 119));
        jCheckBoxMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxMostrar.setText("Mostrar Contraseña");
        jCheckBoxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMostrarActionPerformed(evt);
            }
        });

        jButtonRegistro.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRegistro.setForeground(new java.awt.Color(204, 204, 204));
        jButtonRegistro.setText("Registrarse");
        jButtonRegistro.setBorderPainted(false);
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelLlave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelArroba, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword)
                                    .addComponent(jTextMail))
                                .addGap(12, 12, 12))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jCheckBoxMostrar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addGap(0, 145, Short.MAX_VALUE)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jLabelBMW)
                                .addGap(138, 138, 138))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addComponent(Bienvenido)
                                .addGap(157, 157, 157))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBMW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMostrar)
                        .addGap(17, 17, 17)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelArroba, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabelLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );

        getContentPane().add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 460, 470));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperMenu2.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMostrarActionPerformed
        //Ocultar o mostrar contraseña
        jPassword.setEchoChar('●');
        if (jCheckBoxMostrar.isSelected()) {
            jPassword.setEchoChar((char) 0);
        } 
    }//GEN-LAST:event_jCheckBoxMostrarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String mail = jTextMail.getText();
        char[] claveDigitada = jPassword.getPassword();

        try {
            for (int i = 0; i < Usuario.listadoUsuarios().size(); i++) {
                Usuario user = Usuario.listadoUsuarios().get(i);
                if(user.getActivo()==false){
                    jLabelError.setText("Usuario Inactivo, contacte con el administrador");
                    return;
                }
                if (mail.equalsIgnoreCase(user.getEmail())) {
                    if(Arrays.equals(user.getClave(), claveDigitada)){
                        this.dispose();
                        menu = new MenuPrincipal();
                        menu.setVisible(true);
                        menu.setLocationRelativeTo(null);
                        menu.setUser(user);   
                    } else {
                        jLabelError.setText("Contraseña inválida");
                        contPassword++;
                        if(contPassword==3){
                            user.setActivo(false);
                            Usuario.modificarUusario(user);
                            JOptionPane.showMessageDialog(this, "Falló tres veces, su cuenta se ha inactivado");
                            System.exit(0);
                        }
                    }
                } else {
                    jLabelError.setText("Mail inválido");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        jButtonLogin.doClick();
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        jPassword.requestFocus();
    }//GEN-LAST:event_jTextMailActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        registro = new RegistroUsuario();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JCheckBox jCheckBoxMostrar;
    private javax.swing.JLabel jLabelArroba;
    private javax.swing.JLabel jLabelBMW;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLlave;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextMail;
    // End of variables declaration//GEN-END:variables
}
