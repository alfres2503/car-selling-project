package capaVista;

import capaLogica.Auto;
import capaLogica.Electrico;
import capaLogica.Fosil;
import capaLogica.Hibrido;
import capaLogica.TipoMantenimiento;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoVehiculos extends javax.swing.JFrame {
    Usuario user;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    Auto auto1;
    
    public MantenimientoVehiculos() {
        initComponents();
        modeloTabla = (DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Mantenimiento de Vehículos");
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
        Bar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtModelo = new javax.swing.JTextField();
        jCboTipo = new javax.swing.JComboBox<>();
        jTxtPrecio = new javax.swing.JTextField();
        jTxtIncluye = new javax.swing.JTextField();
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

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 240, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Modelo", "Precio", "Incuye"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 810, 180));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Mantenimiento de Vehículos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Modelo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Incluye:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));
        getContentPane().add(jTxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, -1));
        getContentPane().add(jTxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 70, -1));

        getContentPane().add(jCboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 90, -1));
        getContentPane().add(jTxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 70, -1));
        getContentPane().add(jTxtIncluye, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 110, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 810, 120));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoVehiculos.png"))); // NOI18N
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
        jCboTipo.addItem("Eléctrico");
        jCboTipo.addItem("Hibrido");
        jCboTipo.addItem("Fósil");
        jCboTipo.setSelectedIndex(-1);
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String codigo=jTxtCodigo.getText();
        String modelo=jTxtModelo.getText();
        String tipo=(String)jCboTipo.getSelectedItem();
        String incluye=jTxtIncluye.getText();
        double precio=Double.parseDouble(jTxtPrecio.getText());
        //         Validar datos 
        if (codigo.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite un código");
            jTxtCodigo.requestFocus();
            return;
        }
        if (modelo.matches("")) {
            JOptionPane.showMessageDialog(this,"Digite un modelo");
            jTxtModelo.requestFocus();
            return;
        } 
        if(precio==0){
            JOptionPane.showMessageDialog(this, "Ingrese un precio");
            jTxtPrecio.requestFocus();
            return;
        }
        if (tipo == null) {
            
            JOptionPane.showMessageDialog(this,"Seleccione un tipo de vehículo");
            jCboTipo.requestFocus();
            return;
        }
        
        
        if("fósil".equalsIgnoreCase(tipo)){
            auto1=new Fosil(codigo, modelo, tipo, precio, incluye);
        }else{
            if("hibrido".equalsIgnoreCase(tipo)){
                 auto1=new Hibrido(codigo, modelo, tipo, precio, incluye);
            }else{
                auto1=new Electrico(codigo, modelo, tipo, precio, incluye);
            }
        }
        boolean encontrado=false;
        try {
            for (int i = 0; i < Auto.listadoAutos().size(); i++) {
                if(auto1.getCodigoAuto().equalsIgnoreCase( Auto.listadoAutos().get(i).getCodigoAuto())){
                    encontrado=true;
                }
            }
            if(encontrado==false){
                Auto.agregarAuto(auto1);
            }else{
                    JOptionPane.showMessageDialog(this, "El código del vehículo ya se encuentra registrado");
                }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al agregar el vehículo\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
        
        
        
        llenarTabla();
        limpiar();
                
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            String codigo=String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            String modelo=jTxtModelo.getText();
            String tipo=(String)jCboTipo.getSelectedItem();
            String incluye=jTxtIncluye.getText();
            double precio=Double.parseDouble(jTxtPrecio.getText());
            
            if (modelo.matches("")) {
                JOptionPane.showMessageDialog(this,"Digite un modelo");
                jTxtModelo.requestFocus();
                return;
            } 
        
            if (tipo == null) {
            
                JOptionPane.showMessageDialog(this,"Seleccione un tipo de vehículo");
                jCboTipo.requestFocus();
                return;
            }
            
            if("fósil".equalsIgnoreCase(tipo)){
                auto1=new Fosil(codigo, modelo, tipo, precio, incluye);

               
            }else{
                if("hibrido".equalsIgnoreCase(tipo)){
                    auto1=new Hibrido(codigo, modelo, tipo, precio, incluye);
                     
                }else{
                    if("Eléctrico".equalsIgnoreCase(tipo)){
                       auto1=new Electrico(codigo, modelo, tipo, precio, incluye);

                    }
                }   
            }
                                   
            auto1.setCodigoAuto(codigo);
            auto1.setTipo(tipo);
            auto1.setModelo(modelo);
            auto1.setPrecio(precio);
            auto1.setIncluye(incluye);
                        
            try {
                Auto.modificarAuto(auto1);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar el vehículo\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
                    e.printStackTrace();
                System.exit(0);
            }

            llenarTabla(); 
            
           jTable1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el vehículo a modificar");
            return;
        }
        desactivarBotones();
        limpiar();
        jTxtCodigo.setEditable(true);
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        for(int i=0;i<jTable1.getRowCount();i++){
             if(jTable1.isRowSelected(i)){
                 jTxtCodigo.setText(String.valueOf(modeloTabla.getValueAt(i,0)));
                 jTxtModelo.setText(String.valueOf(modeloTabla.getValueAt(i,2)));
                 jTxtPrecio.setText(String.valueOf(modeloTabla.getValueAt(i,3)));
                 jTxtIncluye.setText(String.valueOf(modeloTabla.getValueAt(i,4)));
                 
                 if(String.valueOf(modeloTabla.getValueAt(i,1)).equalsIgnoreCase("Eléctrico")){
                     jCboTipo.setSelectedIndex(0);
                 }else{
                     if(String.valueOf(modeloTabla.getValueAt(i,1)).equalsIgnoreCase("Hibrido")){
                        jCboTipo.setSelectedIndex(1);
                    }else{
                     jCboTipo.setSelectedIndex(2);
                     }
                 }
             }                 
     }
     jTxtCodigo.setEditable(false);
     activarBotones();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
           
         JOptionPane.showConfirmDialog(this,  "Código: "+jTxtCodigo.getText()+
                                              "\nTipo: "+jCboTipo.getSelectedItem()+
                                              "\nModelo: "+jTxtModelo.getText()+
                                              "\nPrecio: "+jTxtPrecio.getText()+
                                              "\nIncluye: "+jTxtIncluye.getText(), 
                                              "Información del Vehículo", JOptionPane.DEFAULT_OPTION,
                                              JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el vehículo a consultar");
            return;
        }
        jTable1.clearSelection();
        desactivarBotones();
        jTxtCodigo.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el vehículo a eliminar");
            return;
        }

        String codigo = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

        try {
            Auto.eliminarAuto(codigo);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el vehículo\n"
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
        jTxtCodigo.setEditable(true);
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
     private void llenarTabla() {
        try {
            
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[5];
            
            ArrayList<Auto> lista = Auto.listadoAutos();
            for (int i = 0; i < lista.size(); i++) {
                datos[0] = lista.get(i).getCodigoAuto();
                datos[1] = lista.get(i).getTipo();
                datos[2] = lista.get(i).getModelo();
                datos[3] = "$"+lista.get(i).getPrecio();
                datos[4]=lista.get(i).getIncluye();
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de vehículos\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
        }
    }
    private void limpiar(){
        jTxtCodigo.setText("");
        jTxtModelo.setText("");
        jTxtPrecio.setText("");
        jTxtIncluye.setText("");
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
        jButtonGuardar.setEnabled(true);
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
    private javax.swing.JComboBox<String> jCboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtIncluye;
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
