package capaVista;

import capaLogica.Estado;
import capaLogica.Parte;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class MantenimientoPartes extends javax.swing.JFrame {
    Usuario user;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private Parte parteA;
    

    public MantenimientoPartes() {
        initComponents();
        modeloTabla =(DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Mantenimiento de Partes");
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtNumero = new javax.swing.JTextField();
        jTxtModelo = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        jTxtTipo = new javax.swing.JTextField();
        jCboEstado = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jBtnGuardar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnConsultar = new javax.swing.JButton();
        jBtnBorrar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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
                "Número", "Nombre", "Modelo", "Precio", "Estado", "Tipo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 810, 200));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Mantenimiento de Partes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Número:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Modelo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tipo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));
        getContentPane().add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 70, -1));
        getContentPane().add(jTxtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, -1));
        getContentPane().add(jTxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));
        getContentPane().add(jTxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 80, -1));
        getContentPane().add(jTxtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 70, -1));

        getContentPane().add(jCboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 95));

        jBtnModificar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnModificar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 95));

        jBtnConsultar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnConsultar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar.png"))); // NOI18N
        jBtnConsultar.setText("Consultar");
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, 95));

        jBtnBorrar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnBorrar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jBtnBorrar.setText("Borrar");
        jBtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 150, 95));

        jBtnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jBtnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 150, 95));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 810, 120));

        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoPartes.png"))); // NOI18N
        Fondo.setText("Nombre");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 590));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Mantenimiento de Partes:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Mantenimiento de Partes:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

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
        for(Estado estado:Estado.values()){
            jCboEstado.addItem(estado);
        }
        jCboEstado.setSelectedIndex(-1);
        llenarTabla();
        desactivarBotones();
    }//GEN-LAST:event_formWindowOpened

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        String nombre=jTxtNombre.getText();
        int numero=Integer.parseInt(jTxtNumero.getText());
        String tipo=jTxtTipo.getText();
        String modelo=jTxtModelo.getText();
        double precio=Double.parseDouble(jTxtPrecio.getText());
        if (nombre.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Digite un nombre");
            jTxtNombre.requestFocus();
            return;
        }
        if (modelo.matches("")) {
            JOptionPane.showMessageDialog(this,"Digite un modelo");
            jTxtModelo.requestFocus();
            return;
        } 
        if(numero==0){
            JOptionPane.showMessageDialog(this, "Ingrese un numero mayor que 0");
            jTxtPrecio.requestFocus();
            return;
        }
        if(precio==0){
            JOptionPane.showMessageDialog(this, "Ingrese un precio");
            jTxtPrecio.requestFocus();
            return;
        }
        if (tipo.matches("")) {
            
            JOptionPane.showMessageDialog(this,"Ingrese un tipo");
            jTxtTipo.requestFocus();
            return;
        }
        if (jCboEstado.getSelectedIndex()==-1) {
            
            JOptionPane.showMessageDialog(this,"Seleccione el estado");
            jCboEstado.requestFocus();
            return;
        }
        parteA=new Parte(nombre, numero, tipo, modelo, precio);
        
        parteA.setEstado((Estado)jCboEstado.getSelectedItem());
        
        boolean encontrado=false;
        try {
            for (int i = 0; i < Parte.listadoPartes().size(); i++) {
                if(parteA.getNumeroParte()==Parte.listadoPartes().get(i).getNumeroParte()){
                    encontrado=true;
                }
            }
            if(encontrado==false){
                Parte.agregarParte(parteA);
            }else{
                JOptionPane.showMessageDialog(this, "El número de parte ya se encuentra registrado");
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al agregar la parte extra\n"
                        + "el programa se cerrará consulte con el administrador\n"
                        + e.toString());
                System.exit(0);
            }
        
        
        
        llenarTabla();
        limpiar();
        
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        for(int i=0;i<jTable1.getRowCount();i++){
             if(jTable1.isRowSelected(i)){
                 jTxtNumero.setText(String.valueOf(modeloTabla.getValueAt(i,0)));
                 jTxtNombre.setText(String.valueOf(modeloTabla.getValueAt(i,1)));
                 jTxtModelo.setText(String.valueOf(modeloTabla.getValueAt(i,2)));
                 jTxtPrecio.setText(String.valueOf(modeloTabla.getValueAt(i,3)));
                 jTxtTipo.setText(String.valueOf(modeloTabla.getValueAt(i,5)));
                 if((Estado)modeloTabla.getValueAt(i,4)==Estado.Nuevo){
                     jCboEstado.setSelectedItem(Estado.Nuevo);
                 }else{
                     jCboEstado.setSelectedItem(Estado.Usado);
                 }
             }                 
     }
     jTxtNumero.setEditable(false);
     activarBotones();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            
            int numero=Integer.parseInt((jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            String nombre=jTxtNombre.getText();
            String tipo=jTxtTipo.getText();
            String modelo=jTxtModelo.getText();
            double precio;
            Estado estado=(Estado)jCboEstado.getSelectedItem();
            try{
                 precio=Double.parseDouble(jTxtPrecio.getText());
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ingrese un precio válido(sólo números)");
                jTxtPrecio.requestFocus();
                return;
            }
            if (nombre.matches("")) {
            
                JOptionPane.showMessageDialog(this,"Digite un nombre");
                jTxtNombre.requestFocus();
                return;
            }
            if (modelo.matches("")) {
                JOptionPane.showMessageDialog(this,"Digite un modelo");
                jTxtModelo.requestFocus();
                return;
            } 
        
            
            if (tipo.matches("")) {
            
                JOptionPane.showMessageDialog(this,"Ingrese un tipo");
                jTxtTipo.requestFocus();
                return;
            }
            if (jCboEstado.getSelectedIndex()==-1) {
            
                JOptionPane.showMessageDialog(this,"Seleccione el estado");
                jCboEstado.requestFocus();
                return;
            }
            parteA=new Parte(nombre, numero, tipo, modelo, precio);
            
            if(parteA instanceof Parte){
                parteA.setEstado(estado);
                parteA.setModelo(modelo);
                parteA.setNombre(nombre);
                parteA.setNumeroParte(numero);
                parteA.setTipo(tipo);
                parteA.setPrecio(precio);
            }
            
            try {
                Parte.modificarParte(parteA);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al modificar la parte\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
                    e.printStackTrace();
                System.exit(0);
            }

            llenarTabla(); 
            
            jTable1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la parte a modificar");
            return;
        }
        desactivarBotones();
        limpiar();
        jTxtNumero.setEditable(true);
        
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultarActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
           
         JOptionPane.showConfirmDialog(this, "Nombre: "+jTxtNombre.getText()+
                                              "\nModelo: "+jTxtModelo.getText()+
                                              "\nPrecio: "+jTxtPrecio.getText()+
                                              "\nEstado: "+jCboEstado.getSelectedItem()+
                                              "\nTipo: "+jTxtTipo.getText(), 
                                              "Información de la parte", JOptionPane.DEFAULT_OPTION,
                                              JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la parte a consultar");
            return;
        }
        jTable1.clearSelection();
        desactivarBotones();
        jTxtNumero.setEditable(true);
        limpiar();
        
    }//GEN-LAST:event_jBtnConsultarActionPerformed

    private void jBtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBorrarActionPerformed
       if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la parte a eliminar");
            return;
        }

        int numero = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());

        try {
            Parte.eliminarParte(numero);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar la parte\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
            System.exit(0);
        }
        llenarTabla(); //actualiza la tabla con el nuevo departamento  
        desactivarBotones();
    }//GEN-LAST:event_jBtnBorrarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        desactivarBotones();
        limpiar();
         jTxtNumero.setEditable(true);
    }//GEN-LAST:event_jBtnCancelarActionPerformed
    private void llenarTabla() {
        try {
            modeloTabla.setRowCount(0);
            ArrayList<Parte> listaPartes = Parte.listadoPartes();
            Object datos[]=new Object[6];
            
            
            for(int i=0;i<listaPartes.size();i++){
              datos[0]=listaPartes.get(i).getNumeroParte();
              datos[1]=listaPartes.get(i).getNombre();
              datos[2]=listaPartes.get(i).getModelo();
              datos[3]="$"+listaPartes.get(i).getPrecio();
              datos[4]=listaPartes.get(i).getEstado();
              datos[5]=listaPartes.get(i).getTipo();
              modeloTabla.addRow(datos);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de partes extra\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString() );
                    e.printStackTrace();
        }
        
    }
    private void activarBotones() {
        jBtnGuardar.setEnabled(false);
        jBtnBorrar.setEnabled(true);
        jBtnModificar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jBtnConsultar.setEnabled(true);
    }

    private void desactivarBotones() {
        jBtnGuardar.setEnabled(true);
        jBtnBorrar.setEnabled(false);
        jBtnModificar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jBtnConsultar.setEnabled(false);

    }
    private void limpiar(){
        jTxtNombre.setText("");
        jTxtNumero.setText("");
        jTxtModelo.setText("");
        jTxtPrecio.setText("");
        jTxtTipo.setText("");
        jCboEstado.setSelectedIndex(-1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JButton jBtnBorrar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox<Estado> jCboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTxtModelo;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtPrecio;
    private javax.swing.JTextField jTxtTipo;
    // End of variables declaration//GEN-END:variables
}
