package capaVista;

import capaLogica.TipoUsuario;
import capaLogica.Usuario;
import java.awt.Toolkit;

public class MenuPrincipal extends javax.swing.JFrame {

    private Usuario user;

    public MenuPrincipal() {
        initComponents();
        this.setTitle("BMW - Menú Principal");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/BMWLogo2.png")));
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBMW = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JLabel();
        Cliente = new javax.swing.JPanel();
        clienteLabel = new javax.swing.JLabel();
        BotonAdquirir = new javax.swing.JLabel();
        cambio1 = new javax.swing.JLabel();
        vendedor = new javax.swing.JPanel();
        vendedorLabel = new javax.swing.JLabel();
        ManClientes = new javax.swing.JLabel();
        ManExtras = new javax.swing.JLabel();
        ManUsuarios = new javax.swing.JLabel();
        cambio2 = new javax.swing.JLabel();
        ManAuto = new javax.swing.JLabel();
        Reportes = new javax.swing.JPanel();
        ReporteVehiculos = new javax.swing.JLabel();
        ReporteClientes = new javax.swing.JLabel();
        ReportePartes = new javax.swing.JLabel();
        ReporteFacturas = new javax.swing.JLabel();
        cambio3 = new javax.swing.JLabel();
        vendedorLabel1 = new javax.swing.JLabel();
        jPanelBarra = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBMW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BMWLogoMenuPrincipal.png"))); // NOI18N
        getContentPane().add(jLabelBMW, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, 120, 120));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido al Sistema BMW");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 650, 100));

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
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 560, 100, 100));

        Cliente.setBackground(new java.awt.Color(51, 51, 51));
        Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clienteLabel.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        clienteLabel.setForeground(new java.awt.Color(255, 255, 255));
        clienteLabel.setText("Cliente:");
        Cliente.add(clienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 252, 40));

        BotonAdquirir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png"))); // NOI18N
        BotonAdquirir.setText("jLabel1");
        BotonAdquirir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAdquirirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonAdquirirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonAdquirirMouseExited(evt);
            }
        });
        Cliente.add(BotonAdquirir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 400, 220));

        cambio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambio.png"))); // NOI18N
        cambio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambio1MouseClicked(evt);
            }
        });
        Cliente.add(cambio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 80, 80));

        getContentPane().add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 540, 340));

        vendedor.setBackground(new java.awt.Color(51, 51, 51));
        vendedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vendedorLabel.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        vendedorLabel.setForeground(new java.awt.Color(255, 255, 255));
        vendedorLabel.setText("Vendededor:");
        vendedor.add(vendedorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 252, 40));

        ManClientes.setForeground(new java.awt.Color(255, 255, 255));
        ManClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man1.png"))); // NOI18N
        ManClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManClientesMouseExited(evt);
            }
        });
        vendedor.add(ManClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, 50));

        ManExtras.setForeground(new java.awt.Color(255, 255, 255));
        ManExtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man2.png"))); // NOI18N
        ManExtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManExtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManExtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManExtrasMouseExited(evt);
            }
        });
        vendedor.add(ManExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 480, 50));

        ManUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        ManUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManUMouse.png"))); // NOI18N
        ManUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManUsuariosMouseExited(evt);
            }
        });
        vendedor.add(ManUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 480, 50));

        cambio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambio.png"))); // NOI18N
        cambio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambio2MouseClicked(evt);
            }
        });
        vendedor.add(cambio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 80, 80));

        ManAuto.setForeground(new java.awt.Color(255, 255, 255));
        ManAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man3.png"))); // NOI18N
        ManAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManAutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManAutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManAutoMouseExited(evt);
            }
        });
        vendedor.add(ManAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 480, 50));

        getContentPane().add(vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 540, 340));

        Reportes.setBackground(new java.awt.Color(51, 51, 51));
        Reportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReporteVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        ReporteVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RV.png"))); // NOI18N
        ReporteVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteVehiculosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteVehiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteVehiculosMouseExited(evt);
            }
        });
        Reportes.add(ReporteVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 480, 50));

        ReporteClientes.setForeground(new java.awt.Color(255, 255, 255));
        ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RC.png"))); // NOI18N
        ReporteClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteClientesMouseExited(evt);
            }
        });
        Reportes.add(ReporteClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 480, 50));

        ReportePartes.setForeground(new java.awt.Color(255, 255, 255));
        ReportePartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RE.png"))); // NOI18N
        ReportePartes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportePartesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportePartesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportePartesMouseExited(evt);
            }
        });
        Reportes.add(ReportePartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 480, 50));

        ReporteFacturas.setForeground(new java.awt.Color(255, 255, 255));
        ReporteFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RF.png"))); // NOI18N
        ReporteFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteFacturasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReporteFacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReporteFacturasMouseExited(evt);
            }
        });
        Reportes.add(ReporteFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 480, 50));

        cambio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cambio.png"))); // NOI18N
        cambio3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambio3MouseClicked(evt);
            }
        });
        Reportes.add(cambio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 80, 80));

        vendedorLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        vendedorLabel1.setForeground(new java.awt.Color(255, 255, 255));
        vendedorLabel1.setText("Reportes:");
        Reportes.add(vendedorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 252, 40));

        getContentPane().add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 350));

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

        getContentPane().add(jPanelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CuadroDecorativo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 580, 380));

        Bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bar.png"))); // NOI18N
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, 240, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu1.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //jButton1.setVisible(false);
        activarFunciones();

        jLabelUsuario.setText(user.getNom());
        jLabelTipo.setText(user.getTipo().toString());
    }//GEN-LAST:event_formWindowOpened

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/backMouse.png")));
    }//GEN-LAST:event_botonSalirMouseExited

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        this.dispose();
        LogIn inicio = new LogIn();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_botonSalirMouseClicked

    private void BotonAdquirirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAdquirirMouseClicked
        FrameCompra compra = new FrameCompra();
        compra.setVisible(true);
        compra.setLocationRelativeTo(null);
        compra.setUser(user);

    }//GEN-LAST:event_BotonAdquirirMouseClicked

    private void BotonAdquirirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAdquirirMouseEntered
        BotonAdquirir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1Mouse.png")));
    }//GEN-LAST:event_BotonAdquirirMouseEntered

    private void BotonAdquirirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAdquirirMouseExited
        BotonAdquirir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton1.png")));
    }//GEN-LAST:event_BotonAdquirirMouseExited

    private void ManClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManClientesMouseEntered
        ManClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man1Mouse.png")));
    }//GEN-LAST:event_ManClientesMouseEntered

    private void ManClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManClientesMouseExited
        ManClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man1.png")));
    }//GEN-LAST:event_ManClientesMouseExited

    private void ManExtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManExtrasMouseEntered
        ManExtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man2Mouse.png")));
    }//GEN-LAST:event_ManExtrasMouseEntered

    private void ManExtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManExtrasMouseExited
        ManExtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man2.png")));
    }//GEN-LAST:event_ManExtrasMouseExited

    private void ManUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManUsuariosMouseEntered
        ManUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManU.png")));
    }//GEN-LAST:event_ManUsuariosMouseEntered

    private void ManUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManUsuariosMouseExited
        ManUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ManUMouse.png")));
    }//GEN-LAST:event_ManUsuariosMouseExited

    private void ManClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManClientesMouseClicked
        MantenimientoClientes c = new MantenimientoClientes();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        c.setUser(user);
    }//GEN-LAST:event_ManClientesMouseClicked

    private void ManExtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManExtrasMouseClicked
        MantenimientoPartes p = new MantenimientoPartes();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        p.setUser(user);
    }//GEN-LAST:event_ManExtrasMouseClicked

    private void ManUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManUsuariosMouseClicked
        MantenimientoUsuarios us = new MantenimientoUsuarios();
        us.setVisible(true);
        us.setLocationRelativeTo(null);
        us.setUser(user);
    }//GEN-LAST:event_ManUsuariosMouseClicked

    private void cambio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambio1MouseClicked
        Cliente.setVisible(false);
        if (user.getTipo() != TipoUsuario.Regular) {
            vendedor.setVisible(true);
            Reportes.setVisible(false);
        } else {
            vendedor.setVisible(false);
            Reportes.setVisible(true);
        }
    }//GEN-LAST:event_cambio1MouseClicked

    private void cambio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambio2MouseClicked
        Cliente.setVisible(false);
        vendedor.setVisible(false);
        Reportes.setVisible(true);
    }//GEN-LAST:event_cambio2MouseClicked

    private void ReporteVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVehiculosMouseClicked
        ReporteVehiculos rv = new ReporteVehiculos();
        rv.setVisible(true);
        rv.setLocationRelativeTo(null);
        rv.setUser(user);
    }//GEN-LAST:event_ReporteVehiculosMouseClicked

    private void ReporteVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVehiculosMouseEntered
        ReporteVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RVMouse.png")));
    }//GEN-LAST:event_ReporteVehiculosMouseEntered

    private void ReporteVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteVehiculosMouseExited
        ReporteVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RV.png")));
    }//GEN-LAST:event_ReporteVehiculosMouseExited

    private void ReporteClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseClicked
        ReporteClientes rc = new ReporteClientes();
        rc.setVisible(true);
        rc.setLocationRelativeTo(null);
        rc.setUser(user);
    }//GEN-LAST:event_ReporteClientesMouseClicked

    private void ReporteClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseEntered
        ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RCMouse.png")));
    }//GEN-LAST:event_ReporteClientesMouseEntered

    private void ReporteClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteClientesMouseExited
        ReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RC.png")));
    }//GEN-LAST:event_ReporteClientesMouseExited

    private void ReportePartesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportePartesMouseClicked
        ReportePartes rp = new ReportePartes();
        rp.setVisible(true);
        rp.setLocationRelativeTo(null);
        rp.setUser(user);
    }//GEN-LAST:event_ReportePartesMouseClicked

    private void ReportePartesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportePartesMouseEntered
        ReportePartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REMouse.png")));
    }//GEN-LAST:event_ReportePartesMouseEntered

    private void ReportePartesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportePartesMouseExited
        ReportePartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RE.png")));
    }//GEN-LAST:event_ReportePartesMouseExited

    private void cambio3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambio3MouseClicked
        if (user.getTipo() == TipoUsuario.Vendedor) {
            Cliente.setVisible(false);
            vendedor.setVisible(true);
        } else {
            Cliente.setVisible(true);
            vendedor.setVisible(false);
            Reportes.setVisible(false);
        }
    }//GEN-LAST:event_cambio3MouseClicked

    private void ReporteFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteFacturasMouseClicked
        ReporteFacturas rf = new ReporteFacturas();
        rf.setVisible(true);
        rf.setLocationRelativeTo(null);
        rf.setUser(user);
    }//GEN-LAST:event_ReporteFacturasMouseClicked

    private void ReporteFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteFacturasMouseEntered
        ReporteFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RFMouse.png")));
    }//GEN-LAST:event_ReporteFacturasMouseEntered

    private void ReporteFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteFacturasMouseExited
        ReporteFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RF.png")));
    }//GEN-LAST:event_ReporteFacturasMouseExited

    private void ManAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManAutoMouseClicked
        MantenimientoVehiculos v = new MantenimientoVehiculos();
        v.setVisible(true);
        v.setLocationRelativeTo(null);
        v.setUser(user);
    }//GEN-LAST:event_ManAutoMouseClicked

    private void ManAutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManAutoMouseEntered
        ManAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man3Mouse.png")));
    }//GEN-LAST:event_ManAutoMouseEntered

    private void ManAutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManAutoMouseExited
        ManAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Man3.png")));
    }//GEN-LAST:event_ManAutoMouseExited

    private void activarFunciones() {
        if (user.getTipo() == TipoUsuario.Administrador) {
            Cliente.setVisible(true);
            vendedor.setVisible(false);
            cambio1.setVisible(true);
            Reportes.setVisible(false);

        } else {
            if (user.getTipo() == TipoUsuario.Vendedor) {
                Cliente.setVisible(false);
                Reportes.setVisible(false);
                cambio1.setVisible(true);
                cambio2.setVisible(true);
                ManUsuarios.setVisible(false);
                ReporteClientes.setVisible(false);
                ReporteFacturas.setVisible(false);
            } else {
                Cliente.setVisible(true);
                vendedor.setVisible(false);
                Reportes.setVisible(false);
                cambio1.setVisible(true);
                ManUsuarios.setVisible(false);
                ReporteClientes.setVisible(false);
                ReporteFacturas.setVisible(false);
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel BotonAdquirir;
    private javax.swing.JPanel Cliente;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ManAuto;
    private javax.swing.JLabel ManClientes;
    private javax.swing.JLabel ManExtras;
    private javax.swing.JLabel ManUsuarios;
    private javax.swing.JLabel ReporteClientes;
    private javax.swing.JLabel ReporteFacturas;
    private javax.swing.JLabel ReportePartes;
    private javax.swing.JLabel ReporteVehiculos;
    private javax.swing.JPanel Reportes;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JLabel cambio1;
    private javax.swing.JLabel cambio2;
    private javax.swing.JLabel cambio3;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBMW;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel vendedor;
    private javax.swing.JLabel vendedorLabel;
    private javax.swing.JLabel vendedorLabel1;
    // End of variables declaration//GEN-END:variables
}
