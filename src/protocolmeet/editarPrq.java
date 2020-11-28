package protocolmeet;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static protocolmeet.index.base2;

public class editarPrq extends javax.swing.JFrame {

    public editarPrq() {
        initComponents();
        this.setLocationRelativeTo(null);
        escribir();
    }

    public void escribir() {
        dissText.setText(reservar.dio);
        napaText.setText(reservar.namepa);
        nacoText.setText(reservar.namepo);
        ciuText.setText(reservar.ciudPa);
        telText.setText(String.valueOf(reservar.telf));
        corrText.setText(reservar.cor);
        dircText.setText(reservar.dir);
        capText.setText(String.valueOf(reservar.capa));
        nitText.setText(String.valueOf(reservar.nitt));
        passText.setText(reservar.psw);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("protocolmeet/ico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        dissText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        napaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nacoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        corrText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dircText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        capText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nitText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        passText = new javax.swing.JTextField();
        ciuText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Diocesis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 92, -1, -1));

        dissText.setBackground(new java.awt.Color(204, 255, 255));
        dissText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dissTextActionPerformed(evt);
            }
        });
        getContentPane().add(dissText, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 117, 370, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de la parroquia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 147, -1, -1));

        napaText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(napaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 172, 373, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del parroco");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 202, -1, -1));

        nacoText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(nacoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 227, 373, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        telText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(telText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 373, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        corrText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(corrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 373, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dirección");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        dircText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(dircText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 373, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Capacidad maxima de personas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        capText.setBackground(new java.awt.Color(204, 255, 255));
        capText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capTextActionPerformed(evt);
            }
        });
        getContentPane().add(capText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 373, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NIT de la parroquia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        nitText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(nitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 373, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Guardar cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 427, 249, 47));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Volver al inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 427, 249, 47));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setText("Actualizacion de datos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 32, 373, -1));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Eliminar parroquia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 427, 249, 47));

        passText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 373, -1));

        ciuText.setBackground(new java.awt.Color(204, 255, 255));
        ciuText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciuTextActionPerformed(evt);
            }
        });
        getContentPane().add(ciuText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 373, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ciudad");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dissTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dissTextActionPerformed

    }//GEN-LAST:event_dissTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        index ix = new index();
        ix.setVisible(true);
        index.visible = true;
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reservar.dio = dissText.getText();
        reservar.namepa = napaText.getText();
        reservar.namepo = nacoText.getText();
        reservar.ciudPa = ciuText.getText();
        reservar.telf = Long.parseLong(telText.getText());
        reservar.cor = corrText.getText();
        reservar.dir = dircText.getText();
        reservar.capa = Integer.parseInt(capText.getText());
        reservar.nitt = Long.parseLong(nitText.getText());
        reservar.psw = passText.getText();

        parroquia np = new parroquia(reservar.dio, reservar.namepa, reservar.namepo,reservar.ciudPa, reservar.telf, reservar.cor, reservar.dir, reservar.capa, reservar.nitt, reservar.psw);
        try {
            base2.update(np);
            JOptionPane.showMessageDialog(null, "¡Parroquia actualizada exitosamente!");
            index j = new index();
            index.visible = true;
            j.setVisible(true);
            this.hide();
        } catch (SQLException ex) {
            Logger.getLogger(editarPrq.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "¡Error! revisa lo que has ingresado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            parroquia d = base2.queryForId(reservar.nitt);
            int n = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar a " + d.getNombreP() + " de la base de datos?", "", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                base2.delete(d);
                JOptionPane.showMessageDialog(null, "Parroquia eliminada exitosamente");
                index.visible = true;
                index j = new index();
                j.setVisible(true);
                this.hide();
            }

        } catch (SQLException ex) {
            Logger.getLogger(editarPrq.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo realizar el proceso, intenta nuevamente");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ciuTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciuTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciuTextActionPerformed

    private void capTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capTextActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editarPrq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarPrq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarPrq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarPrq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarPrq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capText;
    private javax.swing.JTextField ciuText;
    private javax.swing.JTextField corrText;
    private javax.swing.JTextField dircText;
    private javax.swing.JTextField dissText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nacoText;
    private javax.swing.JTextField napaText;
    private javax.swing.JTextField nitText;
    private javax.swing.JTextField passText;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}
