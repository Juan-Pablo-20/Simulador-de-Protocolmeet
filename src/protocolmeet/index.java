package protocolmeet;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo Ballesteros Obando Software diseñado para el registro de
 * personas que asisten a eucaristias a las parroquias de Colombia según la
 * hora y la fecha que dessen, ofreciendo una encuesta para conocer el estado de
 * salud de las personas
 */

/*
2. Calendario en qAsistir con registro de fecha y hora
9. Ventana para encuesta despues de registrar una persona y en qAsistir
4. Boton de asistencia cuadrarlo con reservar.java
5. Boton de ver mis reservas cuadrarlo con reserva.java
6. Hacer la tabla de asistentes en asistencia
7. Boton de soy colaborador
8. Ventana para registro de temperatura
10. Opción de eliminar a una persona con la contraseña de una persona
11. Agregar una opcion de ya no voy a asistir en qAsistir
12. Al final mejorar el diseño de la interfaz gráfica
 */
public class index extends javax.swing.JFrame {

    static Dao<persona, Long> base;
    static Dao<parroquia, Long> base2;
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

        combo.setBounds(30, 20, 287, 30);
        panelGrande.setOpaque(false);

        combo();
        mostrarPanel();
        comboListen();
        buscaListen();
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

                /*puse este metodo listen(); aca en index.javay no en el objeto Panel.java para que me funcionen 
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
                    String igls = combo.getSelectedItem().toString();
                    nombPq3 = igls;
                    try {
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

    public void buscaListen() {
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
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panelGrande = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Busca tu parroquia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Ver mis reservas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        entrada.setText("Buscar...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 86, 900, 70));

        jButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton6.setText("Registrar parroquia");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 191, 60));

        jButton7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, 191, 60));

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
        jButton1.setText("Editar parroquia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 250, 60));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Asistencia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 250, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
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

        String archivo = "jdbc:h2:./personaBD";
        ConnectionSource conexion = new JdbcConnectionSource(archivo);
        base = DaoManager.createDao(conexion, persona.class);

        String archivoDos = "jdbc:h2:./baseParroquia2";
        ConnectionSource conexion2 = new JdbcConnectionSource(archivoDos);
        base2 = DaoManager.createDao(conexion2, parroquia.class);

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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelGrande;
    // End of variables declaration//GEN-END:variables
}
