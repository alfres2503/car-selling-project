/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaVista;

import capaLogica.Auto;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ReporteVehiculos extends javax.swing.JFrame {

    Usuario user;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    public ReporteVehiculos() {
        initComponents();
        modeloTabla = (DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Reporte de Vehículos");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipos = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JLabel();
        jRadioElectrico = new javax.swing.JRadioButton();
        jRadioHibrido = new javax.swing.JRadioButton();
        jRadioFosil = new javax.swing.JRadioButton();
        jPanelBarra = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Reporte de Vehículos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

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
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jRadioElectrico.setBackground(new java.awt.Color(51, 51, 51));
        grupoTipos.add(jRadioElectrico);
        jRadioElectrico.setForeground(new java.awt.Color(204, 204, 204));
        jRadioElectrico.setText("Eléctrico");
        jRadioElectrico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioElectricoMouseClicked(evt);
            }
        });
        getContentPane().add(jRadioElectrico, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jRadioHibrido.setBackground(new java.awt.Color(51, 51, 51));
        grupoTipos.add(jRadioHibrido);
        jRadioHibrido.setForeground(new java.awt.Color(204, 204, 204));
        jRadioHibrido.setText("Híbrido");
        jRadioHibrido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioHibridoMouseClicked(evt);
            }
        });
        getContentPane().add(jRadioHibrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jRadioFosil.setBackground(new java.awt.Color(51, 51, 51));
        grupoTipos.add(jRadioFosil);
        jRadioFosil.setForeground(new java.awt.Color(204, 204, 204));
        jRadioFosil.setText("Fósil");
        jRadioFosil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioFosilMouseClicked(evt);
            }
        });
        getContentPane().add(jRadioFosil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jPanelBarra.setBackground(new java.awt.Color(51, 51, 51));
        jPanelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario");
        jPanelBarra.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 149, -1));

        jLabelTipo.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo");
        jPanelBarra.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 149, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jPanelBarra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, 60));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 240, 270));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Modelo", "Precio", "Incuye"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 832, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoVehiculos.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void setUser(Usuario user) {
        this.user = user;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelUsuario.setText(user.getNom());
        jLabelTipo.setText(user.getTipo().toString());
    }//GEN-LAST:event_formWindowOpened

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backMouse.png")));
    }//GEN-LAST:event_botonSalirMouseExited

    private void jRadioElectricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioElectricoMouseClicked
        try {

            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[5];

            ArrayList<Auto> lista = Auto.listadoAutos();
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTipo().equalsIgnoreCase("Eléctrico")){
                    datos[0] = lista.get(i).getCodigoAuto();
                    datos[1] = lista.get(i).getTipo();
                    datos[2] = lista.get(i).getModelo();
                    datos[3] = "$"+lista.get(i).getPrecio();
                    datos[4]=lista.get(i).getIncluye();
                    modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
                }

            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de vehículos\n"
                + "el programa se cerrará consulte con el administrador\n"
                + e.toString());
        }
    }//GEN-LAST:event_jRadioElectricoMouseClicked

    private void jRadioFosilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioFosilMouseClicked
        try {

            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[5];

            ArrayList<Auto> lista = Auto.listadoAutos();
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTipo().equalsIgnoreCase("Fósil")){
                    datos[0] = lista.get(i).getCodigoAuto();
                    datos[1] = lista.get(i).getTipo();
                    datos[2] = lista.get(i).getModelo();
                    datos[3] = "$"+lista.get(i).getPrecio();
                    datos[4]=lista.get(i).getIncluye();
                    modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
                }

            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de vehículos\n"
                + "el programa se cerrará consulte con el administrador\n"
                + e.toString());
        }
    }//GEN-LAST:event_jRadioFosilMouseClicked

    private void jRadioHibridoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioHibridoMouseClicked
        try {

            modeloTabla.setRowCount(0);//Limpia la tabla
            Object[] datos = new Object[5];

            ArrayList<Auto> lista = Auto.listadoAutos();
            for (int i = 0; i < lista.size(); i++) {
                if(lista.get(i).getTipo().equalsIgnoreCase("Hibrido")){
                    datos[0] = lista.get(i).getCodigoAuto();
                    datos[1] = lista.get(i).getTipo();
                    datos[2] = lista.get(i).getModelo();
                    datos[3] = "$"+lista.get(i).getPrecio();
                    datos[4]=lista.get(i).getIncluye();
                    modeloTabla.addRow(datos);//Agrega el arreglo como una nueva fila de la tabla
                }

            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de vehículos\n"
                + "el programa se cerrará consulte con el administrador\n"
                + e.toString());
        }
    }//GEN-LAST:event_jRadioHibridoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel botonSalir;
    private javax.swing.ButtonGroup grupoTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JRadioButton jRadioElectrico;
    private javax.swing.JRadioButton jRadioFosil;
    private javax.swing.JRadioButton jRadioHibrido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
