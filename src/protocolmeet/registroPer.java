package protocolmeet;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static protocolmeet.index.base;

public class registroPer extends javax.swing.JFrame {
    
    private String nombre;
    private long cedula;
    private String correo;
    private long celular;
    private String direcc;
    private String ciudad;
    private String password;
    private Date dateR;
    private String fechaR;
    
    public registroPer() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/ico.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cedText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        celText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        corText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dirText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ciuText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pswText = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        jLabel1.setText("Registro de personas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        cedText.setBackground(new java.awt.Color(204, 255, 255));
        cedText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(cedText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 325, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 533, 172, 50));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("Volver al inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 533, 172, 50));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nombre completo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 134, -1, -1));

        nomText.setBackground(new java.awt.Color(204, 255, 255));
        nomText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(nomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 159, 325, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Celular");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 198, -1, -1));

        celText.setBackground(new java.awt.Color(204, 255, 255));
        celText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(celText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 223, 325, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Correo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 262, -1, -1));

        corText.setBackground(new java.awt.Color(204, 255, 255));
        corText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(corText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 287, 325, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Dirección");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 326, -1, -1));

        dirText.setBackground(new java.awt.Color(204, 255, 255));
        dirText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(dirText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 351, 325, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        ciuText.setBackground(new java.awt.Color(204, 255, 255));
        ciuText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ciuText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciuTextActionPerformed(evt);
            }
        });
        getContentPane().add(ciuText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 415, 325, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 454, -1, -1));

        pswText.setBackground(new java.awt.Color(204, 255, 255));
        pswText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(pswText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 479, 325, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciuTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciuTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciuTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); //para darle formato simple a la fecha
        GregorianCalendar cal = new GregorianCalendar();
        dateR = cal.getTime();
        
        if (!cedText.getText().equals("") && !nomText.equals("") && !celText.getText().equals("")
                && !corText.getText().equals("") && !dirText.getText().equals("")
                && !ciuText.getText().equals("") && !pswText.getText().equals("")) {
            
            cedula = Long.parseLong(cedText.getText());
            nombre = nomText.getText();
            celular = Long.parseLong(celText.getText());
            correo = corText.getText();
            direcc = dirText.getText();
            ciudad = ciuText.getText();
            password = pswText.getText();
            fechaR = sdf.format(dateR);
            
            persona pp = new persona(cedula, nombre, password, celular, correo, 
                    direcc, ciudad, fechaR);
            try {
                base.create(pp);
                JOptionPane.showMessageDialog(null, "¡Has sido registrado exitosamente!");
            } catch (SQLException ex) {
                Logger.getLogger(registroPer.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "!¡Error! Revisa los textos que ingresaste");
            }
            nomText.setText("");
            cedText.setText("");
            celText.setText("");
            dirText.setText("");
            corText.setText("");
            ciuText.setText("");
            pswText.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los espacios");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        index ii = new index();
        index.visible = true;
        ii.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroPer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroPer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedText;
    private javax.swing.JTextField celText;
    private javax.swing.JTextField ciuText;
    private javax.swing.JTextField corText;
    private javax.swing.JTextField dirText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomText;
    private javax.swing.JPasswordField pswText;
    // End of variables declaration//GEN-END:variables
}
