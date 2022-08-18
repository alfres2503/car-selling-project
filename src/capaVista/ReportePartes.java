
package capaVista;

import capaLogica.Parte;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ReportePartes extends javax.swing.JFrame {
    Usuario user;
    DefaultTableModel modeloTabla = new DefaultTableModel();
   
    public ReportePartes() {
        initComponents();
        modeloTabla = (DefaultTableModel)jTable1.getModel();
        this.setTitle("BMW - Reporte de Partes");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 100, 100));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reporte de Partes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 380, 100));

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

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 200, 70));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 240, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 810, 210));

        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MantenimientoPartes.png"))); // NOI18N
        Fondo.setText("Nombre");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 860, 540));

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelUsuario.setText(user.getNom());
        jLabelTipo.setText(user.getTipo().toString());
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened
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
              modeloTabla.addRow(datos);//Inserta el arreglo como una nueva fila
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la tabla de partes extra\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString() );
                    e.printStackTrace();
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
