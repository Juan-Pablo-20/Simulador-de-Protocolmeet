package protocolmeet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static protocolmeet.index.base;
import static protocolmeet.index.base2;
public class reservar extends javax.swing.JFrame {

    private JLabel jlabel1 = new JLabel();
    private JLabel jlabel2 = new JLabel();
    private JTextField field1 = new JTextField();
    private JPasswordField field2 = new JPasswordField();
    private JButton boton1 = new JButton();
    private JButton boton2 = new JButton();
    private JButton boton3 = new JButton();

    static String dio;
    static String namepa;
    static String namepo;
    static String ciudPa;
    static long telf;
    static String cor;
    static String dir;
    static int capa;
    static long nitt;
    static String psw;

    static long cedu;
    static String nomb;
    static long celu;
    static String mail;
    static String dire;
    static String ciud;
    static String pasw;

    public reservar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle(index.titleBtn);
    }

    public void pintar(String texto1, String texto2, String texto3, String texto4, String texto5) {
        jlabel1.setBounds(30, 45, 170, 23);
        jlabel1.setText(texto1);
        jlabel1.setVisible(true);
        jPanel1.add(jlabel1);

        jlabel2.setBounds(30, 110, 170, 23);
        jlabel2.setText(texto2);
        jlabel2.setVisible(true);
        jPanel1.add(jlabel2);

        field1.setBounds(30, 65, 250, 30);
        field1.setText("");
        field1.setVisible(true);
        jPanel1.add(field1);

        field2.setBounds(30, 130, 250, 30);
        field2.setText("");
        field2.setVisible(true);
        jPanel1.add(field2);

        boton1.setBounds(30, 175, 115, 40);
        boton1.setText(texto3);
        boton1.setVisible(true);
        jPanel1.add(boton1);

        boton2.setBounds(165, 175, 115, 40);
        boton2.setText(texto4);
        boton2.setVisible(true);
        jPanel1.add(boton2);

        boton3.setBounds(30, 235, 250, 30);
        boton3.setText(texto5);
        boton3.setVisible(true);
        jPanel1.add(boton3);

        ActionListener acc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == boton2) {
                    if (index.titleBtn.equals("Editar parroquia")) {
                        editParroquia();
                    } else if (index.titleBtn.equals("Quiero asistir")) {
                        ingresoPersona();
                    } else if (index.titleBtn.equals("Asistencia")) {
                        //aqui va para ver asistencia en una parroquia
                    } else if (index.titleBtn.equals("Soy colaborador")) {
                        
                    } else if (index.titleBtn.equals("Ver mis reservas")) {
                        verMisReservas();
                    }
                } else if (e.getSource() == boton1) {
                    index in = new index();
                    index.visible = true;
                    index.buscado = false;
                    in.setVisible(true);
                    hide();
                } else if (e.getSource() == boton3) {
                    if (index.titleBtn.equals("Editar parroquia")) {
                        regisParr rp = new regisParr();
                        rp.setVisible(true);
                        hide();
                    } else if (index.titleBtn.equals("Quiero asistir") || index.titleBtn.equals("Ver mis reservas")) {
                        registroPer rk = new registroPer();
                        rk.setVisible(true);
                        hide();
                    } else if (index.titleBtn.equals("Asistencia")) {
                        colaborador c = new colaborador();
                        c.setVisible(true);
                        hide();
                    }
                }
            }
        };
        boton1.addActionListener(acc);
        boton2.addActionListener(acc);
        boton3.addActionListener(acc);
    }

    private void ingresoPersona() {
        boolean ingreso = false;
        try {
            if (!field1.getText().equals("") && !field2.getText().equals("")) {
                cedu = Long.parseLong(field1.getText());
                try {
                    persona per = base.queryForId(cedu);
                    nomb = per.getNombre();
                    pasw = per.getPassw();
                    if (pasw.equals(field2.getText())) {
                        ingreso = true;
                    } else {
                        ingreso = false;
                        jlabel2.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                    if (ingreso == true) {
                        qAsistir qa = new qAsistir();
                        qa.setVisible(true);
                        jlabel2.setForeground(Color.black);
                        hide();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "La persona con cedula " + cedu + " no está registrada");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Completa los espacios para continuar");
            }
        } catch (Exception ex) {
            Logger.getLogger(reservar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void editParroquia() {
        boolean pasa = false;
        try {
            nitt = Long.parseLong(field1.getText());
            parroquia pq = base2.queryForId(nitt);
            dio = pq.getDiocesis();
            namepa = pq.getNombreP();
            namepo = pq.getParroco();
            ciudPa = pq.getCiudad();
            telf = pq.getTelefono();
            cor = pq.getCorreo();
            dir = pq.getDirecc();
            capa = pq.getCapc();
            psw = pq.getPass();
            if (field2.getText().equals(psw)) {
                pasa = true;
            } else {
                pasa = false;
                jlabel2.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        } catch (Exception ec) {
            JOptionPane.showMessageDialog(null, "Revisa si el NIT esta bien escrito");
            pasa = false;
        }
        if (pasa == true) {
            jlabel2.setForeground(Color.black);
            editarPrq ep = new editarPrq();
            ep.setVisible(true);
            hide();
        }
    }

    public void verMisReservas() {
        boolean ingreso = false;
        try {
            if (!field1.getText().equals("") && !field2.getText().equals("")) {
                cedu = Long.parseLong(field1.getText());
                try {
                    persona per = base.queryForId(cedu);
                    nomb = per.getNombre();
                    pasw = per.getPassw();
                    if (pasw.equals(field2.getText())) {
                        ingreso = true;
                    } else {
                        ingreso = false;
                        jlabel2.setForeground(Color.red);
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                    if (ingreso == true) {
                        misReservas mr = new misReservas();
                        mr.setVisible(true);
                        hide();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "La persona con cedula " + cedu + " no está registrada");
                    System.out.println("ESTE ES EL ERROR " + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Completa los espacios para continuar");
            }
        } catch (Exception ex) {
            Logger.getLogger(reservar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 320, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}
