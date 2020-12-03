package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static protocolmeet.index.base3;

public class infoAsistir extends javax.swing.JFrame {

    public infoAsistir() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        try {
            asistencia ab = base3.queryForId(misReservas.id2);
            placeLabel.setText("Lugar: " + ab.getLugar());
            dateLabel.setText("Fecha: " + ab.getFecha());
            hourLabel.setText("Hora: " + ab.getHour());
            if(ab.isEncuesta()){
                hacerEnc.setVisible(false);
                hizoLabel.setForeground(Color.green);
                hizoLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
                hizoLabel.setText("Encuesta realizada");
            } else {
                hacerEnc.setVisible(true);
                hizoLabel.setForeground(Color.red);
                hizoLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                hizoLabel.setText("No se ha realizado la encuesta");
            }
        } catch (SQLException ex) {
            Logger.getLogger(infoAsistir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        hourLabel = new javax.swing.JLabel();
        hizoLabel = new javax.swing.JLabel();
        hacerEnc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Información de tu reserva");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 25, 278, -1));

        placeLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        placeLabel.setText("Lugar");
        getContentPane().add(placeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 79, 278, -1));

        dateLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        dateLabel.setText("Fecha");
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 110, 278, -1));

        hourLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hourLabel.setText("Hora");
        getContentPane().add(hourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 141, 278, -1));

        hizoLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hizoLabel.setText("Encuesta");
        getContentPane().add(hizoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 178, 278, -1));

        hacerEnc.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hacerEnc.setForeground(new java.awt.Color(0, 153, 0));
        hacerEnc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hencvdBtn.png"))); // NOI18N
        hacerEnc.setBorder(null);
        hacerEnc.setContentAreaFilled(false);
        hacerEnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hacerEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerEncActionPerformed(evt);
            }
        });
        getContentPane().add(hacerEnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 215, 190, 38));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nasistBtn.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 271, 190, 38));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volverBtnA.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 271, 190, 38));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            asistencia ad = base3.queryForId(misReservas.id2);
            base3.delete(ad);
            JOptionPane.showMessageDialog(null, "Tu reserva ha sido eliminada");
            misReservas mir = new misReservas();
            mir.setVisible(true);
            this.hide();
        } catch (SQLException ex) {
            Logger.getLogger(infoAsistir.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hacerEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerEncActionPerformed
        misReservas.reserv = true;
        encuesta enc = new encuesta();
        enc.setVisible(true);
        this.hide();
    }//GEN-LAST:event_hacerEncActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        misReservas mre = new misReservas();
        mre.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(infoAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoAsistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton hacerEnc;
    private javax.swing.JLabel hizoLabel;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel placeLabel;
    // End of variables declaration//GEN-END:variables
}
