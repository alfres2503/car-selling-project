/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaVista;

import capaLogica.Cliente;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class ReporteClientes extends javax.swing.JFrame {
    Usuario user;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    TableRowSorter<DefaultTableModel> sorter;
    List<SortKey> sortKeys = new ArrayList();
    List<SortKey> sortKeys2 = new ArrayList();
    
    public ReporteClientes() {
        initComponents();
        modeloTabla = (DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Reporte de Clientes");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelBarra = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        botonSalir = new javax.swing.JLabel();
        jButtonOrdenaID = new javax.swing.JButton();
        jButtonOrdenaNom = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reporte de Clientes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 40));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Correo", "País", "Dirección", "Teléfono", "Tipo", "Activo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 810, 230));

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

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, 70));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 240, -1));

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
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 100, 100));

        jButtonOrdenaID.setBackground(new java.awt.Color(51, 51, 51));
        jButtonOrdenaID.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrdenaID.setText("Ordenar por ID");
        jButtonOrdenaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenaIDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrdenaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 100, 150, -1));

        jButtonOrdenaNom.setBackground(new java.awt.Color(51, 51, 51));
        jButtonOrdenaNom.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrdenaNom.setText("Ordenar por Nombre");
        jButtonOrdenaNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenaNomActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrdenaNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        Fondo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoClientes.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 880, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setUser(Usuario user) {
        this.user = user;
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

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
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonOrdenaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenaIDActionPerformed

        sortKeys2.add(new SortKey(0,SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys2);
        jTable1.setRowSorter(sorter);
       //Ordena la tabla por el campo ID o Cédula de manera ascendente
        
    }//GEN-LAST:event_jButtonOrdenaIDActionPerformed

    private void jButtonOrdenaNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenaNomActionPerformed

         sortKeys.add(new SortKey(1,SortOrder.ASCENDING));
         sorter.setSortKeys(sortKeys);
         jTable1.setRowSorter(sorter);
       //Ordena la tabla por el campo nombre de manera ascendente
        
    }//GEN-LAST:event_jButtonOrdenaNomActionPerformed

     private void llenarTabla(){
        try {
            
            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[8];
            
            ArrayList<Cliente> lista = Cliente.listadoClientes();
            for (int i = 0; i < lista.size(); i++) {
                datos[0] = lista.get(i).getId();
                datos[1] = lista.get(i).getNombre();
                datos[2] = lista.get(i).getCorreo();
                datos[3] = lista.get(i).getPais();
                datos[4]=lista.get(i).getDireccion();
                datos[5] = lista.get(i).getTelefono();
                datos[6] = lista.get(i).getTipo();
                datos[7] = (lista.get(i).isActivo()?"Sí":"No");
                
                
                modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
                
                sorter=new TableRowSorter<>(modeloTabla); //Construye el sorter para poder ordenar la tabla
                
                
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de clientes\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
                      e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JButton jButtonOrdenaID;
    private javax.swing.JButton jButtonOrdenaNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
