package protocolmeet;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static protocolmeet.index.base3;

public class encuesta extends javax.swing.JFrame {

    public encuesta() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(si1);
        grupo1.add(no1);

        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(si2);
        grupo2.add(no2);
        grupo2.add(poca2);

        ButtonGroup grupo3 = new ButtonGroup();
        grupo3.add(si3);
        grupo3.add(no3);

        ButtonGroup grupo4 = new ButtonGroup();
        grupo4.add(si4);
        grupo4.add(no4);

        ButtonGroup grupo5 = new ButtonGroup();
        grupo5.add(si5);
        grupo5.add(no5);
        grupo5.add(normal5);

        ButtonGroup grupo6 = new ButtonGroup();
        grupo6.add(si6);
        grupo6.add(no6);

        ButtonGroup grupo7 = new ButtonGroup();
        grupo7.add(si7);
        grupo7.add(no7);

        ButtonGroup grupo8 = new ButtonGroup();
        grupo8.add(si8);
        grupo8.add(no8);

        ButtonGroup grupo9 = new ButtonGroup();
        grupo9.add(si9);
        grupo9.add(no9);

        ButtonGroup grupo10 = new ButtonGroup();
        grupo10.add(si10);
        grupo10.add(no10);

        ButtonGroup grupo11 = new ButtonGroup();
        grupo11.add(si11);
        grupo11.add(no11);

        ButtonGroup grupo12 = new ButtonGroup();
        grupo12.add(si12);
        grupo12.add(no12);

        ButtonGroup grupo13 = new ButtonGroup();
        grupo13.add(si13);
        grupo13.add(no13);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("protocolmeet/ico.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        no1 = new javax.swing.JRadioButton();
        si1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        si2 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        si3 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        si6 = new javax.swing.JRadioButton();
        no6 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JRadioButton();
        si5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        si4 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        si9 = new javax.swing.JRadioButton();
        no9 = new javax.swing.JRadioButton();
        no8 = new javax.swing.JRadioButton();
        si8 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        si7 = new javax.swing.JRadioButton();
        no7 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        poca2 = new javax.swing.JRadioButton();
        normal5 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        si10 = new javax.swing.JRadioButton();
        no10 = new javax.swing.JRadioButton();
        no11 = new javax.swing.JRadioButton();
        si11 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        no12 = new javax.swing.JRadioButton();
        si12 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        si13 = new javax.swing.JRadioButton();
        no13 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Encuesta covid para el estado de salud");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("¿Ha tenido fiebre? (Mayor a 38° C)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 341, -1));

        no1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no1.setText("No");
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 132, -1, -1));

        si1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si1.setText("Si");
        si1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si1ActionPerformed(evt);
            }
        });
        getContentPane().add(si1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("¿Ha presentado tos seca?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 178, 341, -1));

        si2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si2.setText("Si");
        getContentPane().add(si2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 215, -1, -1));

        no2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no2.setText("No");
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 215, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("¿Siente que se cansa con el minimo esfuerzo?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 261, 341, -1));

        si3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si3.setText("Si");
        getContentPane().add(si3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 298, -1, -1));

        no3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no3.setText("No");
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 298, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("¿Ha sentido dolor de cabeza?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 523, 268, -1));

        si6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si6.setText("Si");
        getContentPane().add(si6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        no6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no6.setText("No");
        getContentPane().add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 560, -1, -1));

        no5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no5.setText("No");
        getContentPane().add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 477, -1, -1));

        si5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si5.setText("Si");
        getContentPane().add(si5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 477, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("¿Siente que le duelen los musculos?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 265, -1));

        si4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si4.setText("Si");
        getContentPane().add(si4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 394, -1, -1));

        no4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no4.setText("No");
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 394, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("¿Ha tenido malestar general? (Maluquera)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 357, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("¿Ha tenido la nariz tapada o fluido nasal?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 272, 265, -1));

        si9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si9.setText("Si");
        getContentPane().add(si9, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 309, -1, -1));

        no9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no9.setText("No");
        getContentPane().add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 309, -1, -1));

        no8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no8.setText("No");
        getContentPane().add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 226, -1, -1));

        si8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si8.setText("Si");
        getContentPane().add(si8, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 226, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("¿Siente alguna molestia en el pecho? (Opresión o ardor)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 189, -1, -1));

        si7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si7.setText("Si");
        getContentPane().add(si7, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 143, -1, -1));

        no7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no7.setText("No");
        getContentPane().add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 143, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("¿Siente que respiera normal?");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 95, 265, -1));

        poca2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        poca2.setText("Poca tos");
        getContentPane().add(poca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 215, -1, -1));

        normal5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        normal5.setText("Dolor normal");
        getContentPane().add(normal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 477, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("¿Ha tenido dolor de garganta?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 357, 265, -1));

        si10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si10.setText("Sin dolor");
        getContentPane().add(si10, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 394, -1, -1));

        no10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no10.setText("Dolor fuerte");
        getContentPane().add(no10, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 394, -1, -1));

        no11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no11.setText("No");
        getContentPane().add(no11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 477, -1, -1));

        si11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si11.setText("Si");
        getContentPane().add(si11, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 477, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("¿Siente que ha dejado de percibir olores y / o sabores?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 440, 369, -1));

        no12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no12.setText("No");
        getContentPane().add(no12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        si12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si12.setText("Si");
        getContentPane().add(si12, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setText("¿Ha tenido diarrea?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 523, 265, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("¿Ha tenido contacto en los ultimos 14 días o vive con");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 95, -1, -1));

        si13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        si13.setText("Si");
        getContentPane().add(si13, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 154, -1, -1));

        no13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        no13.setText("No");
        getContentPane().add(no13, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 154, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel20.setText("alguien sospechoso o confirmado de tener Covid-19?");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 120, 299, 16));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 0));
        jButton1.setText("Enviar respuestas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 200, 335, 41));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 272, 335, 41));

        label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 359, 335, 63));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void si1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si1ActionPerformed

    }//GEN-LAST:event_si1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        label.setText("");
        if (qAsistir.asistir == true) {
            index in = new index();
            index.visible = true;
            in.setVisible(true);
            this.hide();
        } else if (misReservas.reserv == true) {
            misReservas mi = new misReservas();
            mi.setVisible(true);
            hide();
        } else if(colaborador.colabora == true){
            colaborador.colabora = false;
            this.hide();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean pasa = false;
        if (no1.isSelected() && no2.isSelected() || poca2.isSelected() && no3.isSelected() && no4.isSelected()
                && no5.isSelected() || normal5.isSelected() && no6.isSelected() && si7.isSelected() && no8.isSelected()
                && no9.isSelected() && si10.isSelected() && no11.isSelected() && no12.isSelected()
                && no13.isSelected()) {
            pasa = true;
        } else if (si1.isSelected() || si2.isSelected() || si3.isSelected() || si4.isSelected()
                || si5.isSelected() || si6.isSelected() || no7.isSelected() || si9.isSelected()
                || no10.isSelected() || si11.isSelected() || si12.isSelected() || si13.isSelected()) {
            pasa = false;
            JOptionPane.showMessageDialog(null, "No podemos aprobar tu ingreso a la eucaristia porque presentas sintomas\n "
                    + "de covid-19 que pueden afectar la salud de las personas a tu alrededor.\n"
                    + "Recomendamos quedarte en casa los proximos días y si los sintomas persisten\n"
                    + " comunicate con tu eps.", "", JOptionPane.WARNING_MESSAGE);
            label.setForeground(Color.red);
            label.setText("#QuedateEnCasa");
        } else {
            JOptionPane.showMessageDialog(null, "La salud es importante, asegurate de haber completado todas las preguntas");
        }

        if (pasa == true) {
            if (qAsistir.asistir == true) {
                registroEnc(qAsistir.id);
            } else if (misReservas.reserv == true) {
                registroEnc(misReservas.id2);
            } else if (colaborador.colabora == true) {
                registroEnc(colaborador.id3);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registroEnc(String id) {
        try {
            asistencia asi = base3.queryForId(id);
            asi.setEncuesta(true);
            base3.update(asi);
            label.setForeground(Color.green);
            label.setText("¡Encuesta completada exitosamente!");
        } catch (SQLException ex) {
            Logger.getLogger(encuesta.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton no1;
    private javax.swing.JRadioButton no10;
    private javax.swing.JRadioButton no11;
    private javax.swing.JRadioButton no12;
    private javax.swing.JRadioButton no13;
    private javax.swing.JRadioButton no2;
    private javax.swing.JRadioButton no3;
    private javax.swing.JRadioButton no4;
    private javax.swing.JRadioButton no5;
    private javax.swing.JRadioButton no6;
    private javax.swing.JRadioButton no7;
    private javax.swing.JRadioButton no8;
    private javax.swing.JRadioButton no9;
    private javax.swing.JRadioButton normal5;
    private javax.swing.JRadioButton poca2;
    private javax.swing.JRadioButton si1;
    private javax.swing.JRadioButton si10;
    private javax.swing.JRadioButton si11;
    private javax.swing.JRadioButton si12;
    private javax.swing.JRadioButton si13;
    private javax.swing.JRadioButton si2;
    private javax.swing.JRadioButton si3;
    private javax.swing.JRadioButton si4;
    private javax.swing.JRadioButton si5;
    private javax.swing.JRadioButton si6;
    private javax.swing.JRadioButton si7;
    private javax.swing.JRadioButton si8;
    private javax.swing.JRadioButton si9;
    // End of variables declaration//GEN-END:variables
}
