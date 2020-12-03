package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import static protocolmeet.index.base3;

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
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ico.png"));
        return retValue;
    }

    public void verBotones() {
        try {
            int contador = 0;
            if (base3.countOf() != 0) {
                int largo = 15;
                for (asistencia as : base3.queryForAll()) {
                    if (as.getName().equals(reservar.nomb)) {
                        botones b = new botones();
                        b.mostrarBoton(largo, as.getHour(), as.getFecha(), as.getLugar(), as.isEncuesta());
                        panelUno.add(botones.boton);
                        panelUno.add(botones.label);
                        botones.boton.addActionListener(new BotonPulsadoListener());
                        contador++;
                        largo += 52;//estos deben ir dentro del for para que no se lean cuando no se cumple el if
                    }
                } 
                if (contador < 1) {
                    label = new JLabel();
                    label.setBounds(10, 15, 720, 100);
                    label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    label.setForeground(Color.red);
                    label.setText("UPS ...\n"
                            + "Aún no tienes reservas: Elige tu parroquia y reserva un cupo\n"
                            + " en la Eucaristia a la que quieres asistir.");
                    panelUno.add(label);
                }
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

        setTitle("Mis reservas");
        setIconImage(getIconImage());
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
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volverBtnR.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 250, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reserv = false;
        index id = new index();
        index.visible = true;
        id.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private class BotonPulsadoListener implements ActionListener {//una bonita forma de hacer funcionar todos los botones 

        @Override
        public void actionPerformed(ActionEvent e) {
            id2 = e.getActionCommand() + " - " + reservar.nomb;//getActionCommand para obtener el texto de culquier boton
            infoAsistir ia = new infoAsistir();
            ia.setVisible(true);
            hide();
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelUno;
    // End of variables declaration//GEN-END:variables
}
