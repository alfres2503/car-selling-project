package capaVista;

import capaLogica.Cliente;
import capaLogica.Corporativo;
import capaLogica.Personal;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoClientes extends javax.swing.JFrame {
    Usuario user;
    Cliente cliente1;
    DefaultTableModel modeloTabla;
    
    public MantenimientoClientes() { 
        initComponents();
        modeloTabla= new DefaultTableModel();
        modeloTabla = (DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Mantenimiento de Clientes");
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
        jTxtNombre = new javax.swing.JTextField();
        jTxtCorreo = new javax.swing.JTextField();
        jTxtPais = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jCboTipo = new javax.swing.JComboBox<>();
        jTxtCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
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
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("País:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Dirección:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Teléfono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));
        getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));
        getContentPane().add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 170, -1));
        getContentPane().add(jTxtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 90, -1));
        getContentPane().add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 150, 20));
        getContentPane().add(jTxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 150, -1));

        getContentPane().add(jCboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 110, -1));

        jTxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Cédula:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 240, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Correo", "País", "Dirección", "Teléfono", "Tipo"
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
        jLabel1.setText("Mantenimiento de Clientes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 40));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 810, 120));

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoClientes.png"))); // NOI18N
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
        jCboTipo.addItem("Corporativo");
        jCboTipo.addItem("Personal");
        jCboTipo.setSelectedIndex(-1);
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String cedula=jTxtCedula.getText();
        String nombre=jTxtNombre.getText();
        String correo=jTxtCorreo.getText();
        String tipo=(String)jCboTipo.getSelectedItem();
        String pais=jTxtPais.getText();
        String direccion=jTxtDireccion.getText();
        String telefono=jTxtTelefono.getText();
         boolean activo=false;
//         Validar datos 
        if (nombre.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite un nombre");
            jTxtNombre.requestFocus();
            return;
        }
        if (!cedula.matches("[1-9]{1}[0-9]{8,9}")) {
            JOptionPane.showMessageDialog(this,"Cédula inválida");
            jTxtCedula.requestFocus();
            return;
        } else {
        }
        if (!correo.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            
            JOptionPane.showMessageDialog(this,"Correo inválido");
            jTxtCedula.requestFocus();
            return;
        }
        if (pais.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite el país");
            jTxtPais.requestFocus();
            return;
        }
        if (tipo == null) {
            
            JOptionPane.showMessageDialog(this,"Seleccione un tipo de cliente");
            jCboTipo.requestFocus();
            return;
        }
        if (direccion.matches("")) {
           
            JOptionPane.showMessageDialog(this,"Digite una dirección");
            jTxtDireccion.requestFocus();
            return;
        }
        if (!telefono.matches("[0-9]{8,12}")) {
            
            JOptionPane.showMessageDialog(this,"Digite un telefono válido");
            jTxtTelefono.requestFocus();
            return;
        }
        
        
        if(tipo.equalsIgnoreCase("Corporativo")){
            cliente1=new Corporativo(nombre, correo, pais, direccion, telefono, tipo, activo, cedula);
            cliente1.setId(((Corporativo)cliente1).getCedulaJuridica());
            
        }else{
            
            cliente1=new Personal(nombre, correo, pais, direccion, telefono, tipo, activo, cedula);
            cliente1.setId(((Personal)cliente1).getCedulaFisica());
        }
        boolean encontrado=false;
        try {
                for (int i = 0; i < Cliente.listadoClientes().size(); i++) {
                     if(cliente1.getId().equalsIgnoreCase( Cliente.listadoClientes().get(i).getId())){
                         encontrado=true;
                     }
                }
                if(encontrado==false){
                   Cliente.agregarCliente(cliente1);
                }else{
                    JOptionPane.showMessageDialog(this, "El id del cliente ya se encuentra registrado");
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al agregar el cliente\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
        
        
        
        llenarTabla();
        limpiar();
                
        
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       if (jTable1.getSelectedRow() >= 0) {
            String cedula=String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            String nombre=jTxtNombre.getText();
            String correo=jTxtCorreo.getText();
            String tipo=(String)jCboTipo.getSelectedItem();
            String pais=jTxtPais.getText();
            String direccion=jTxtDireccion.getText();
            String telefono=jTxtTelefono.getText();
            boolean activo=false;
            
            //Validar datos 
        if (nombre.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite un nombre");
            jTxtNombre.requestFocus();
            return;
        }
        
        if (!correo.matches("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            
            JOptionPane.showMessageDialog(this,"Correo inválido");
            jTxtCedula.requestFocus();
            return;
        }
        if (pais.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite el país");
            jTxtPais.requestFocus();
            return;
        }
        if (tipo == null) {
            
            JOptionPane.showMessageDialog(this,"Seleccione un tipo de cliente");
            jCboTipo.requestFocus();
            return;
        }
        if (direccion.matches("")) {
           
            JOptionPane.showMessageDialog(this,"Digite una dirección");
            jTxtDireccion.requestFocus();
            return;
        }
//        if (!telefono.matches("[0-9]{8,12}")) {
//            
//            JOptionPane.showMessageDialog(this,"Digite un telefono válido");
//            jTxtTelefono.requestFocus();
//            return;
//        }

        
            if(tipo.equalsIgnoreCase("Corporativo")){
                cliente1=new Corporativo(nombre, correo, pais, direccion, telefono, tipo, activo, cedula);
                
                
            }else{
            
                cliente1=new Personal(nombre, correo, pais, direccion, telefono, tipo, activo, cedula);
                
         
            }
                                   
            cliente1.setActivo(activo);
            cliente1.setTipo(tipo);
            cliente1.setCorreo(correo);
            cliente1.setDireccion(direccion);
            cliente1.setNombre(nombre);
            cliente1.setTelefono(telefono);
            cliente1.setPais(pais);
            if(cliente1 instanceof Corporativo){
                cliente1.setId(((Corporativo)cliente1).getCedulaJuridica());
            }else{
                cliente1.setId(((Personal)cliente1).getCedulaFisica());
            }
                
           
                        
            try {
                Cliente.modificarCliente(cliente1);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar el cliente\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
                    e.printStackTrace();
                System.exit(0);
            }

            llenarTabla(); 
            
           jTable1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el cliente a modificar");
            return;
        }
        desactivarBotones();
        limpiar();
        jTxtCedula.setEditable(true);
        jTable1.clearSelection();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
           
         JOptionPane.showConfirmDialog(this,  "Nombre: "+jTxtNombre.getText()+
                                              "\nCédula: "+jTxtCedula.getText()+
                                              "\nCorreo: "+jTxtCorreo.getText()+
                                              "\nPais: "+jTxtPais.getText()+
                                              "\nDirección: "+jTxtDireccion.getText() +
                                              "\nTeléfono: "+jTxtTelefono.getText()+ 
                                              "\nTipo: "+jCboTipo.getSelectedItem(),
                                              "Información del Cliente", JOptionPane.DEFAULT_OPTION,
                                              JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el cliente a consultar");
            return;
        }
        jTable1.clearSelection();
        desactivarBotones();
        jTxtCedula.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el cliente a eliminar");
            return;
        }

        String cedula = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());

        try {
            Cliente.eliminarCliente(cedula);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el cliente\n"
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
        jTxtCedula.setEditable(true);
        jTable1.clearSelection();
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         for(int i=0;i<jTable1.getRowCount();i++){
             if(jTable1.isRowSelected(i)){//llena los campos de texto con los datos de la tabla
                 jTxtCedula.setText(String.valueOf(modeloTabla.getValueAt(i,0)));
                 jTxtNombre.setText(String.valueOf(modeloTabla.getValueAt(i,1)));
                 jTxtCorreo.setText(String.valueOf(modeloTabla.getValueAt(i,2)));
                 jTxtPais.setText(String.valueOf(modeloTabla.getValueAt(i,3)));
                 jTxtDireccion.setText(String.valueOf(modeloTabla.getValueAt(i,4)));
                 jTxtTelefono.setText(String.valueOf(modeloTabla.getValueAt(i,5)));
                
                 
                 if(String.valueOf(modeloTabla.getValueAt(i,6)).equalsIgnoreCase("Corporativo")){
                     jCboTipo.setSelectedIndex(0);
                 }else{
                     if(String.valueOf(modeloTabla.getValueAt(i,6)).equalsIgnoreCase("Personal")){
                        jCboTipo.setSelectedIndex(1);
                    }
                 }
             }                 
     }
     jTxtCedula.setEditable(false);
     activarBotones();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCedulaActionPerformed
    private void llenarTabla() {
        try {
            
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[7];
            
            ArrayList<Cliente> lista = Cliente.listadoClientes();
            for (int i = 0; i < lista.size(); i++) {
                datos[0] = lista.get(i).getId();
                datos[1] = lista.get(i).getNombre();
                datos[2] = lista.get(i).getCorreo();
                datos[3] = lista.get(i).getPais();
                datos[4]=lista.get(i).getDireccion();
                datos[5] = lista.get(i).getTelefono();
                datos[6] = lista.get(i).getTipo();
                
                
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de clientes\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
                      e.printStackTrace();
        }
    }
    private void limpiar(){
        jTxtNombre.setText("");
        jTxtCedula.setText("");
        jTxtCorreo.setText("");
        jTxtPais.setText("");
        jTxtDireccion.setText("");
        jTxtTelefono.setText("");
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
