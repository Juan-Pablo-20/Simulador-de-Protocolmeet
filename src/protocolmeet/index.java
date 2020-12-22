package protocolmeet;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Juan Pablo Ballesteros Obando Software diseñado para el registro de
 * personas que asisten a eucaristias a las parroquias de Colombia según la hora
 * y la fecha que dessen, ofreciendo una encuesta para conocer el estado de
 * salud de las personas
 */

/*
1. Corregir lo de las tildes en las barra de busqueda
 */
public class index extends javax.swing.JFrame {

    static Dao<persona, Long> base;
    static Dao<parroquia, Long> base2;
    static Dao<asistencia, String> base3;
    private int j = 0;
    static boolean visible = true;
    static String nombPq2;
    static String nombPq3;
    static boolean buscado;
    static JComboBox combo = new JComboBox();
    static String titleBtn;

    public index() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        entrada.setText("Busca por ciudad o parroquia...");
        entrada.setForeground(Color.gray);

        combo.setBounds(30, 20, 287, 30);
        panelGrande.setOpaque(false);

        combo();
        mostrarPanel();
        comboListen();
        buscaListen();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ico.png"));
        return retValue;
    }

    public void combo() {
        combo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        jPanel3.setLayout(null);
        try {
            combo.removeAllItems();
            for (parroquia pa : base2.queryForAll()) {
                combo.addItem(pa.getNombreP());
                System.out.println("EL NIT ES " + pa.getNit());
                System.out.println("LA CONTRASEÑA " + pa.getPass());
            }
            jPanel3.add(combo);

        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrarPanel() {
        try {
            if (base2.countOf() != 0) {
                int i = 0;
                for (parroquia pr : base2.queryForAll()) {
                    Panel pa = new Panel();
                    if (i < 4) {
                        pa.paneles(i, j, pr.getNombreP(), pr.getDirecc(), pr.getDiocesis(), pr.getParroco());
                        listen();
                        Panel.nombres[i] = pr.getNombreP();
                    }
                    j += 330;
                    i++;
                    panelGrande.add(Panel.panel);
                }
            } else {
                JLabel adLabel = new JLabel();
                adLabel.setBounds(0, 40, 500, 50);
                adLabel.setText("¡No hay parroquias registradas actualmente!");
                adLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
                panelGrande.add(adLabel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void listen() {

        ActionListener accionBtn = (ActionEvent evento) -> { //esta es una forma actual (2020) de escribir ActionListener, sin su metodo ActionPerformed
            evento.setSource(Panel.botones[0]); //esto solo lo pongo aca para que me deje funcionar todos los botones de cada panel y no solo uno
            if (evento.getSource() == Panel.botones[0]) {
                nombPq2 = Panel.nombres[0];
                titleBtn = "Quiero asistir";
                visible = false;
                reservar rv = new reservar();
                rv.pintar("Cedula", "Contraseña", "Volver", "Ingresar", "No estoy registrado");
                rv.setVisible(true);
                this.hide();

                /*puse este metodo listen(); aca en index.java y no en el objeto Panel.java para que me funcionen 
                bien todos los botones y para que se cierren y abran las ventanas correspondientes*/
            }
        };
        ActionListener accionBtn2 = (ActionEvent evento) -> {
            evento.setSource(Panel.botones[1]);
            if (evento.getSource() == Panel.botones[1]) {
                nombPq2 = Panel.nombres[1];
                titleBtn = "Quiero asistir";
                visible = false;
                reservar rv = new reservar();
                rv.pintar("Cedula", "Contraseña", "Volver", "Ingresar", "No estoy registrado");
                rv.setVisible(true);
                this.hide();
            }
        };
        ActionListener accionBtn3 = (ActionEvent evento) -> {
            evento.setSource(Panel.botones[2]);
            if (evento.getSource() == Panel.botones[2]) {
                nombPq2 = Panel.nombres[2];
                titleBtn = "Quiero asistir";
                visible = false;
                reservar rv = new reservar();
                rv.pintar("Cedula", "Contraseña", "Volver", "Ingresar", "No estoy registrado");
                rv.setVisible(true);
                this.hide();
            }
        };
        ActionListener accionBtn4 = (ActionEvent evento) -> {
            evento.setSource(Panel.botones[3]);
            if (evento.getSource() == Panel.botones[3]) {
                nombPq2 = Panel.nombres[3];
                titleBtn = "Quiero asistir";
                visible = false;
                reservar rv = new reservar();
                rv.pintar("Cedula", "Contraseña", "Volver", "Ingresar", "No estoy registrado");
                rv.setVisible(true);
                this.hide();
            }
        };
        Panel.botones[0].addActionListener(accionBtn);
        Panel.botones[1].addActionListener(accionBtn2);
        Panel.botones[2].addActionListener(accionBtn3);
        Panel.botones[3].addActionListener(accionBtn4);
    }

    public void comboListen() {
        ItemListener itm = new ItemListener() {
            Panel pb = new Panel();

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (visible == true) {
                    buscado = true;
                    panelGrande.removeAll();//para "remover" el contenido del panel
                    panelGrande.setVisible(false);
                    try {
                        String igls = "";
                        try {
                            igls = combo.getSelectedItem().toString();
                        } catch (Exception ec) {
                            mostrarPanel();
                        }
                        nombPq3 = igls;
                        for (parroquia pq : base2.queryForAll()) {
                            if (pq.getNombreP().equals(igls)) {
                                pb.paneles(0, 0, pq.getNombreP(), pq.getDirecc(), pq.getDiocesis(), pq.getParroco());
                                panelGrande.add(Panel.panel);
                                listen();//este metodo siempre debe estar junto a paneles();
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    panelGrande.setVisible(true);//para desaparecerlo y hacerlo aparecer vacio nuevamente
                }
            }
        };
        combo.addItemListener(itm);
    }

    private void buscaListen() {
        KeyListener buscar = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                buscado = true;//para definir que si se uso la caja de texto
                int k = 0;
                int lon = 0;
                if (!entrada.getText().equals("")) {
                    panelGrande.removeAll();
                    panelGrande.setVisible(false);
                    k = 0;
                    lon = 0;
                    lon = entrada.getText().length();
                    String en = entrada.getText();
                    String[] st = new String[lon];

                    for (int i = 0; i < lon; i++) {
                        k = 0;
                        st[i] = en.substring(0, lon);
                        try {
                            for (parroquia b : base2.queryForAll()) {
                                try {
                                    if (b.getNombreP().substring(0, lon).equalsIgnoreCase(st[i]) || b.getCiudad().substring(0, lon).equalsIgnoreCase(st[i])) {
                                        nombPq3 = b.getNombreP();
                                        panelGrande.setVisible(true);
                                        Panel p = new Panel();
                                        p.paneles(0, k, b.getNombreP(), b.getDirecc(), b.getDiocesis(), b.getParroco());
                                        panelGrande.add(Panel.panel);
                                        listen();
                                        k += 330;
                                    }
                                } catch (Exception exc) {
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(index.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } else {
                    panelGrande.removeAll();
                    panelGrande.setVisible(false);
                    panelGrande.setVisible(true);
                    mostrarPanel();
                }
            }
        };
        entrada.addKeyListener(buscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panelGrande = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Protocolmeet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reservasBtn.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        entrada.setToolTipText("");
        entrada.setName(""); // NOI18N
        entrada.setOpaque(false);
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entradaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entradaMouseExited(evt);
            }
        });
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 86, 960, 70));

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regisBtn.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 540, 270, 60));

        jButton7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirBtn.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 540, 270, 60));

        javax.swing.GroupLayout panelGrandeLayout = new javax.swing.GroupLayout(panelGrande);
        panelGrande.setLayout(panelGrandeLayout);
        panelGrandeLayout.setHorizontalGroup(
            panelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panelGrandeLayout.setVerticalGroup(
            panelGrandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        getContentPane().add(panelGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, 1280, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editBtn.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 540, 270, 60));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asisBtn.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 540, 270, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ico.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 130, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        regisParr vr = new regisParr();
        vr.setVisible(true);
        visible = false;
        this.hide();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        titleBtn = "Editar parroquia";
        reservar rv = new reservar();
        rv.pintar("NIT de la parroquia", "Contraseña", "Volver", "Entrar", "Registrar parroquia");
        rv.setVisible(true);
        this.hide();
        visible = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        titleBtn = "Asistencia";
        reservar as = new reservar();
        as.pintar("Nit de la parroquia", "Contraseña", "Volver", "Ver asistencia", "Soy colaborador");
        as.setVisible(true);
        this.hide();
        visible = false;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        titleBtn = "Ver mis reservas";
        reservar vmr = new reservar();
        vmr.pintar("Cedula", "Contraseña", "Volver", "Ver reservas", "No estoy registrado");
        vmr.setVisible(true);
        this.hide();
        visible = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed

    }//GEN-LAST:event_entradaActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setBounds(jButton6.getX(), jButton6.getY() - 7, 270, 60);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBounds(jButton6.getX(), jButton6.getY() + 7, 270, 60);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBounds(jButton1.getX(), jButton1.getY() - 7, 270, 60);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBounds(jButton1.getX(), jButton1.getY() + 7, 270, 60);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBounds(jButton3.getX(), jButton3.getY() - 7, 270, 60);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBounds(jButton3.getX(), jButton3.getY() + 7, 270, 60);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBounds(jButton7.getX(), jButton7.getY() - 7, 270, 60);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBounds(jButton7.getX(), jButton7.getY() + 7, 270, 60);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setRolloverIcon(new ImageIcon(index.class.getResource("/imagenes/reservasBtnO.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setRolloverIcon(new ImageIcon(index.class.getResource("/imagenes/reservasBtn.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void entradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseClicked
        entrada.setFocusable(true);
        entrada.setText("");
        entrada.setForeground(Color.black);
    }//GEN-LAST:event_entradaMouseClicked

    private void entradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMouseExited
        if (entrada.getText().equals("")) {
            entrada.setText("Busca por ciudad o parroquia...");
            entrada.setForeground(Color.gray);
            entrada.setFocusable(false);
        }
    }//GEN-LAST:event_entradaMouseExited

    public static void main(String args[]) throws SQLException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        String archivo = "jdbc:h2:./baseDatosPerson";
        ConnectionSource conexion = new JdbcConnectionSource(archivo);
        base = DaoManager.createDao(conexion, persona.class);

        String archivoDos = "jdbc:h2:./baseParroquia2";
        ConnectionSource conexion2 = new JdbcConnectionSource(archivoDos);
        base2 = DaoManager.createDao(conexion2, parroquia.class);

        String archivo3 = "jdbc:h2:./baseDatosAsist";
        ConnectionSource conexion3 = new JdbcConnectionSource(archivo3);
        base3 = DaoManager.createDao(conexion3, asistencia.class);

        java.awt.EventQueue.invokeLater(() -> {
            new index().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelGrande;
    // End of variables declaration//GEN-END:variables
}
