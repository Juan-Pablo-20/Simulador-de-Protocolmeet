package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static protocolmeet.index.base3;
import static protocolmeet.index.base;

public class misReservas extends javax.swing.JFrame {

    private JLabel label;
    static String id2;
    static boolean reserv;

    public misReservas() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        reserv = false;

        verBotones();
        jLabel1.setText("Mis reservas - " + reservar.nomb);
    }

    public void verBotones() {
        try {
            if (base3.countOf() != 0) {
                persona a = base.queryForId(reservar.cedu);
                int largo = 15;
                int contador = 0;
                for (asistencia as : base3.queryForAll()) {
                    if (as.getName().equals(reservar.nomb)) {
                        botones b = new botones();
                        b.mostrarBoton(largo, as.getHour(), as.getFecha(), as.getLugar(), as.isEncuesta());
                        panelUno.add(botones.botones2[contador]);
                        panelUno.add(botones.label);
                        botones.botones2[contador].addActionListener(new BotonPulsadoListener());
                    }
                    contador++;
                    largo += 52;
                }
            } else {
                label = new JLabel();
                label.setBounds(10, 15, 720, 100);
                label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                label.setForeground(Color.red);
                label.setText("UPS ...\n"
                        + "Aún no tienes reservas: Elige tu parroquia y reserva un cupo\n"
                        + " en la Eucaristia a la que quieres asistir.");
                panelUno.add(label);
            }
        } catch (SQLException ex) {
            Logger.getLogger(misReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelUno = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Mis Reservas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 22, -1, -1));

        panelUno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelUno.setForeground(new java.awt.Color(0, 102, 102));
        panelUno.setOpaque(false);

        javax.swing.GroupLayout panelUnoLayout = new javax.swing.GroupLayout(panelUno);
        panelUno.setLayout(panelUnoLayout);
        panelUnoLayout.setHorizontalGroup(
            panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        panelUnoLayout.setVerticalGroup(
            panelUnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        getContentPane().add(panelUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 730, 500));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 240, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        index id = new index();
        index.visible = true;
        id.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private class BotonPulsadoListener implements ActionListener {//una bonita forma de hacer funcionar todos los botones 

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                id2 = e.getActionCommand().substring(0, 21).trim() + " - " + reservar.nomb;
                asistencia at = base3.queryForId(id2);
                String datos = "Información sobre tu reserva\n"
                        + "Lugar: " + at.getLugar() + "\n"
                        + "Fecha: " + at.getFecha() + "\n"
                        + "Hora: " + at.getHour() + "\n\n";
                if (at.isEncuesta()) {
                    JOptionPane.showMessageDialog(null, datos);
                } else {
                    int c = JOptionPane.showConfirmDialog(null, datos + "¿Deseas realizar la encuesta covid?",
                            "", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (c == JOptionPane.YES_OPTION) {
                        reserv = true;
                        encuesta ec = new encuesta();
                        ec.setVisible(true);
                        hide();
                    } else {
                        JOptionPane.showMessageDialog(null, "Te recomendamos realizar la encuesta el mismo día de la Eucaristia",
                                "", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(misReservas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(misReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(misReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(misReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(misReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new misReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelUno;
    // End of variables declaration//GEN-END:variables
}
