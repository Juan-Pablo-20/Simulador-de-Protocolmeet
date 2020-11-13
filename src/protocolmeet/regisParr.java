package protocolmeet;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static protocolmeet.index.base2;

public class regisParr extends javax.swing.JFrame {

    private String diss;
    private String nombre;
    private String parroco;
    private long tel;
    private String mail;
    private String dirc;
    private int cap;
    private long nit;
    private String pass;
    
    
    public regisParr() {
        initComponents();
        this.setVisible(false);
        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        capText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dissText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nacoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        corrText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        napaText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nitText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dircText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setTitle("Registro de nueva parroquia");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro nueva parroquia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 15, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Diocesis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 60, -1, -1));

        capText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(capText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 394, 373, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre de la parroquia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 112, -1, -1));

        dissText.setBackground(new java.awt.Color(204, 255, 255));
        dissText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dissTextActionPerformed(evt);
            }
        });
        getContentPane().add(dissText, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 82, 370, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del parroco");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 164, -1, -1));

        nacoText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(nacoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 186, 373, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 216, -1, -1));

        corrText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(corrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 290, 373, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 268, -1, -1));

        telText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(telText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 238, 373, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Capacidad maxima de personas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 372, -1, -1));

        napaText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(napaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 134, 373, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NIT de la parroquia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 424, -1, -1));

        nitText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(nitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 446, 373, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 476, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 540, 140, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Volver al inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 540, 140, 40));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dirección");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 320, -1, -1));

        dircText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(dircText, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 342, 373, -1));

        passText.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 370, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dissTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dissTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dissTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        index v = new index();
        v.setVisible(true);
        index.visible = true;
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        diss = dissText.getText();
        nombre = napaText.getText();
        parroco = nacoText.getText();
        tel = Long.parseLong(telText.getText());
        mail = corrText.getText();
        dirc = dircText.getText();
        cap = Integer.parseInt(capText.getText());
        nit = Long.parseLong(nitText.getText());
        pass = passText.getText();
        
        parroquia p = new parroquia(diss, nombre, parroco, tel, mail, dirc, cap, nit, pass);
        
        try {
            base2.create(p);
            JOptionPane.showMessageDialog(null, "Parroquia registrada exitosamente");
            dissText.setText("");
            napaText.setText("");
            nacoText.setText("");
            telText.setText("");
            corrText.setText("");
            dircText.setText("");
            capText.setText("");
            nitText.setText("");
            passText.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(regisParr.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ups ocurrio un error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regisParr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regisParr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regisParr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regisParr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regisParr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capText;
    private javax.swing.JTextField corrText;
    private javax.swing.JTextField dircText;
    private javax.swing.JTextField dissText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}
