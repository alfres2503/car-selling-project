

package capaVista;

import capaLogica.Auto;
import capaLogica.Cliente;
import capaLogica.Corporativo;
import capaLogica.Factura;
import capaLogica.Parte;
import capaLogica.Personal;
import capaLogica.TipoFactura;
import capaLogica.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.print.ServiceUIFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrameCompra extends javax.swing.JFrame {

    Usuario user;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultListModel modeloLista = new DefaultListModel();
    DefaultListModel modeloLista2 = new DefaultListModel();
    Factura factura1=null;
    Cliente cliente1 = null;
    
    
    public FrameCompra() {
        initComponents();
        modeloTabla = (DefaultTableModel) jTableAutos.getModel();
        jListNo.setModel(modeloLista);
        jListSi.setModel(modeloLista2);
        this.setTitle("BMW - Compra de Vehículos");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonVehiculos = new javax.swing.ButtonGroup();
        buttonGroupTipo = new javax.swing.ButtonGroup();
        buttonGroupTipoFac = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckCredito = new javax.swing.JCheckBox();
        jCheckContado = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanelCliente = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckPersonal = new javax.swing.JCheckBox();
        jCheckCorporativo = new javax.swing.JCheckBox();
        jLabelCedula = new javax.swing.JLabel();
        jTextCedula = new javax.swing.JTextField();
        jPanelVehiculos = new javax.swing.JPanel();
        Titulo2 = new javax.swing.JLabel();
        jRadioElectrico = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioFosil = new javax.swing.JRadioButton();
        jRadioHibrido = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutos = new javax.swing.JTable();
        jButtonCompra = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonPagar = new javax.swing.JButton();
        jPanelPartes = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListNo = new javax.swing.JList<>();
        jButtonPasar = new javax.swing.JButton();
        jButtonTodo = new javax.swing.JButton();
        jButtonQuitar = new javax.swing.JButton();
        jButtonQuitarTodo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio Final: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(0, 0, 153));
        jLabelPrecio.setText("jLabelPrecio");
        jPanel1.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 300, 30));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jCheckCredito.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroupTipoFac.add(jCheckCredito);
        jCheckCredito.setForeground(new java.awt.Color(255, 255, 255));
        jCheckCredito.setText("Crédito");

        jCheckContado.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroupTipoFac.add(jCheckContado);
        jCheckContado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckContado.setText("Contado");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo de factura:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jCheckCredito)
                        .addGap(58, 58, 58)
                        .addComponent(jCheckContado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckCredito)
                    .addComponent(jCheckContado))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 400, 130));

        jPanelCliente.setBackground(new java.awt.Color(51, 51, 51));

        Titulo1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(204, 204, 204));
        Titulo1.setText("Personalización y Facturación de Vehículos:");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cliente:");

        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("jLabelCliente");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Tipo:");

        jCheckPersonal.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroupTipo.add(jCheckPersonal);
        jCheckPersonal.setForeground(new java.awt.Color(255, 255, 255));
        jCheckPersonal.setText("Personal");
        jCheckPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPersonalActionPerformed(evt);
            }
        });

        jCheckCorporativo.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroupTipo.add(jCheckCorporativo);
        jCheckCorporativo.setForeground(new java.awt.Color(255, 255, 255));
        jCheckCorporativo.setText("Corporativo");
        jCheckCorporativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckCorporativoActionPerformed(evt);
            }
        });

        jLabelCedula.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCedula.setText("Cédula :");

        jTextCedula.setBackground(new java.awt.Color(51, 51, 51));
        jTextCedula.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(jLabelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jCheckPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckCorporativo)
                                .addGap(108, 108, 108)
                                .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCliente))
                    .addComponent(jLabelCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckPersonal)
                    .addComponent(jCheckCorporativo)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 130));

        jPanelVehiculos.setBackground(new java.awt.Color(51, 51, 51));

        Titulo2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(204, 204, 204));
        Titulo2.setText("Vehículos:");

        jRadioElectrico.setBackground(new java.awt.Color(51, 51, 51));
        buttonVehiculos.add(jRadioElectrico);
        jRadioElectrico.setForeground(new java.awt.Color(204, 204, 204));
        jRadioElectrico.setText("Eléctrico");
        jRadioElectrico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioElectricoMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Tipo:");

        jRadioFosil.setBackground(new java.awt.Color(51, 51, 51));
        buttonVehiculos.add(jRadioFosil);
        jRadioFosil.setForeground(new java.awt.Color(204, 204, 204));
        jRadioFosil.setText("Fósil");
        jRadioFosil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioFosilMouseClicked(evt);
            }
        });

        jRadioHibrido.setBackground(new java.awt.Color(51, 51, 51));
        buttonVehiculos.add(jRadioHibrido);
        jRadioHibrido.setForeground(new java.awt.Color(204, 204, 204));
        jRadioHibrido.setText("Híbrido");
        jRadioHibrido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioHibridoMouseClicked(evt);
            }
        });

        jTableAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo", "Modelo", "Precio", "Incluye"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAutos);

        javax.swing.GroupLayout jPanelVehiculosLayout = new javax.swing.GroupLayout(jPanelVehiculos);
        jPanelVehiculos.setLayout(jPanelVehiculosLayout);
        jPanelVehiculosLayout.setHorizontalGroup(
            jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                        .addGroup(jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                                .addComponent(jRadioElectrico)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioFosil)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioHibrido))
                            .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVehiculosLayout.setVerticalGroup(
            jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioElectrico)
                    .addComponent(jRadioFosil)
                    .addComponent(jRadioHibrido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 630, 270));

        jButtonCompra.setBackground(new java.awt.Color(51, 51, 51));
        jButtonCompra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCompra.setText("Confirmar");
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 630, 133, 50));

        jButtonSalir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSalir.setForeground(new java.awt.Color(204, 204, 204));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 133, 50));

        jButtonPagar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagar.setText("Pagar");
        jButtonPagar.setEnabled(false);
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 130, 50));

        jPanelPartes.setBackground(new java.awt.Color(51, 51, 51));

        Titulo3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Titulo3.setForeground(new java.awt.Color(204, 204, 204));
        Titulo3.setText("Extras:");

        jListSi.setBackground(new java.awt.Color(51, 51, 51));
        jListSi.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jListSi);

        jListNo.setBackground(new java.awt.Color(51, 51, 51));
        jListNo.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jListNo);

        jButtonPasar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPasar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPasar.setText(">");
        jButtonPasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasarActionPerformed(evt);
            }
        });

        jButtonTodo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonTodo.setForeground(new java.awt.Color(204, 204, 204));
        jButtonTodo.setText(">>");
        jButtonTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTodoActionPerformed(evt);
            }
        });

        jButtonQuitar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonQuitar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonQuitar.setText("<");
        jButtonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarActionPerformed(evt);
            }
        });

        jButtonQuitarTodo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonQuitarTodo.setForeground(new java.awt.Color(204, 204, 204));
        jButtonQuitarTodo.setText("<<");
        jButtonQuitarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPartesLayout = new javax.swing.GroupLayout(jPanelPartes);
        jPanelPartes.setLayout(jPanelPartesLayout);
        jPanelPartesLayout.setHorizontalGroup(
            jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPartesLayout.createSequentialGroup()
                        .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPartesLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonPasar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonQuitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonQuitarTodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanelPartesLayout.setVerticalGroup(
            jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPartesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addGroup(jPanelPartesLayout.createSequentialGroup()
                        .addComponent(jButtonPasar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonQuitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQuitarTodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(13, 13, 13))
        );

        jPanel1.add(jPanelPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 630, 260));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Compra.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -100, 380, 930));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Compra.png"))); // NOI18N
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, 710, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelCliente.setText(user.getNom());
        jLabelPrecio.setText("$ 0       ₡ 0 ");
        llenarLista();

        
    }//GEN-LAST:event_formWindowOpened

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

    private void jButtonPasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasarActionPerformed
        if(jListNo.getSelectedIndex()>=0){
         int i=jListNo.getSelectedIndex();
         modeloLista2.addElement(modeloLista.getElementAt(i));
         modeloLista.remove(i);
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar la parte a agregar");
        }
    }//GEN-LAST:event_jButtonPasarActionPerformed

    private void jButtonTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTodoActionPerformed
        for (int i = 0; i < modeloLista.size(); i++) {
            modeloLista2.addElement(modeloLista.getElementAt(i)); 
        }
        modeloLista.clear();
    }//GEN-LAST:event_jButtonTodoActionPerformed

    private void jButtonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarActionPerformed
       if(jListSi.getSelectedIndex()>=0){
            int i=jListSi.getSelectedIndex();
            modeloLista.addElement(modeloLista2.getElementAt(i));
            modeloLista2.remove(i);
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar la parte a remover");
        }
      
       
    }//GEN-LAST:event_jButtonQuitarActionPerformed

    private void jButtonQuitarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarTodoActionPerformed
        for (int i = 0; i < modeloLista2.size(); i++) {
            modeloLista.addElement(modeloLista2.getElementAt(i)); 
        }
        modeloLista2.clear();
    }//GEN-LAST:event_jButtonQuitarTodoActionPerformed

    private void jCheckPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPersonalActionPerformed
        jLabelCedula.setText("Cédula Física:");
    }//GEN-LAST:event_jCheckPersonalActionPerformed

    private void jCheckCorporativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckCorporativoActionPerformed
         jLabelCedula.setText("Cédula Jurídica:");
    }//GEN-LAST:event_jCheckCorporativoActionPerformed

    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        
        String cedula=jTextCedula.getText();
        user.setId(cedula);
            
        
        try{
            if(jCheckPersonal.isSelected()){
                user.setTipoC("Personal");
            }else{
                user.setTipoC("Corporativo");
            }
            if(jCheckCorporativo.isSelected()){
                cliente1=new Corporativo(user, cedula);
            }else{
                if (jCheckPersonal.isSelected()) {
                cliente1=new Personal(user, cedula);
                }  
            }
          
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un tipo de cliente");  
        }
        
        TipoFactura tipoFactura = null;
        try{
            if(jCheckContado.isSelected()){
                tipoFactura=TipoFactura.Contado;
            }else{
                if(jCheckCredito.isSelected()){
                    tipoFactura=TipoFactura.Credito;
                }    
            }
            factura1=new Factura(cliente1, tipoFactura);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un tipo de factura");  
        }
        for (int i = 0; i < modeloLista2.getSize(); i++) {
            cliente1.agregarParte((Parte)modeloLista2.getElementAt(i));
        }
        String codigo;
        try{
            if(jTableAutos.getSelectedRow()>-1){
                codigo=String.valueOf(jTableAutos.getValueAt(jTableAutos.getSelectedRow(),0));
                ArrayList<Auto>lista= Auto.listadoAutos();
                for (int i = 0; i <lista.size(); i++) {
                    if(lista.get(i).getCodigoAuto().equalsIgnoreCase(codigo)){
                        factura1.agregarAuto(lista.get(i));
                    }
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Ha ocurrido un error consulte con el administrador");
        }
        jLabelPrecio.setText("$ "+String.valueOf(factura1.calculaTotalAuto()) + 
                            "   ₡ "+factura1.calculaTotalAutoColones());
        
        
        jButtonPagar.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_jButtonCompraActionPerformed

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
          String hilera="";
          for (int i = 0; i < modeloLista2.getSize(); i++) {
              hilera+="\n"+modeloLista2.get(i).toString();  
          }
          
        JOptionPane.showConfirmDialog(this,   "\nNo.Factura: "+ factura1.getNumeroFactura()+
                                              "\nFecha: "+ factura1.getFecha()+ 
                                              "\nID Cliente: "+ jTextCedula.getText()+
                                              "\nNombre Cliente: "+ user.getNom()+
                                              "\n "+ factura1.toString()+
                                              "\nPartes extra agregadas: "+hilera+
                                               factura1.toString2(),"Detalle de Factura ",
                                               JOptionPane.DEFAULT_OPTION,
                                               JOptionPane.INFORMATION_MESSAGE);
          try{
            Cliente.agregarCliente(cliente1);
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error al agregar el pago del cliente "
                                                + " consulte con el administrador");
          }
          
          try{
            
            
                Factura.agregarFactura(factura1);
            
            
            JOptionPane.showMessageDialog(this,"Gracias por la compra , pronto nos comunicaremos "
                                                + "con usted para hacer la entrega del producto ");
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,"Ha ocurrido un error al agregar el pago de la factura "
                                                + " consulte con el administrador");
              e.printStackTrace();
          }
    }//GEN-LAST:event_jButtonPagarActionPerformed
    private void llenarLista(){
        try {
            
           ArrayList<Parte>lista=Parte.listadoPartes();
           for (int i = 0; i < lista.size(); i++) {
               modeloLista.addElement(lista.get(i));
            }
                
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al llenar la lista de partes\n"
                    + "el programa se cerrará consulte con el administrador\n"
                    + e.toString());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.ButtonGroup buttonGroupTipoFac;
    private javax.swing.ButtonGroup buttonVehiculos;
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JButton jButtonPasar;
    private javax.swing.JButton jButtonQuitar;
    private javax.swing.JButton jButtonQuitarTodo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTodo;
    private javax.swing.JCheckBox jCheckContado;
    private javax.swing.JCheckBox jCheckCorporativo;
    private javax.swing.JCheckBox jCheckCredito;
    private javax.swing.JCheckBox jCheckPersonal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JList<Parte> jListNo;
    private javax.swing.JList<Parte> jListSi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelPartes;
    private javax.swing.JPanel jPanelVehiculos;
    private javax.swing.JRadioButton jRadioElectrico;
    private javax.swing.JRadioButton jRadioFosil;
    private javax.swing.JRadioButton jRadioHibrido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAutos;
    private javax.swing.JTextField jTextCedula;
    // End of variables declaration//GEN-END:variables
}
