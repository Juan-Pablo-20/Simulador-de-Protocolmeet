package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static protocolmeet.index.base;
import static protocolmeet.index.base2;
import static protocolmeet.index.base3;

public class colaborador extends javax.swing.JFrame {

    static String hora;
    static String fecha;
    static String lugar;
    static String id3;
    static boolean colabora;

    public colaborador() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        colabora = false;
        ceduLabel.setVisible(false);
        ceduText.setVisible(false);
        nameLabel.setVisible(false);
        tempLabel.setVisible(false);
        tempText.setVisible(false);
        regisBtn.setVisible(false);
        hacerBtn.setVisible(false);
        labelRegis.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        escuchaCC();
        listenCombo();
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
        nitText = new javax.swing.JTextField();
        horaBox = new javax.swing.JComboBox<>();
        calendar = new rojeru_san.componentes.RSDateChooser();
        jButton1 = new javax.swing.JButton();
        ceduText = new javax.swing.JTextField();
        ceduLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        tempText = new javax.swing.JTextField();
        tempLabel = new javax.swing.JLabel();
        regisBtn = new javax.swing.JButton();
        hacerBtn = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        labelRegis = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Soy colaborador");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("NIT de la parroquia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 78, -1, -1));

        nitText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nitText.setName(""); // NOI18N
        getContentPane().add(nitText, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 74, 186, -1));

        horaBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(horaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 119, 186, -1));
        getContentPane().add(calendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 75, 200, 26));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verifBtnV.png"))); // NOI18N
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 166, 186, 35));

        ceduText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(ceduText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 186, -1));

        ceduLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ceduLabel.setText("Cedula:");
        getContentPane().add(ceduLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        nameLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 469, 21));

        tempText.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tempText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTextActionPerformed(evt);
            }
        });
        getContentPane().add(tempText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 186, -1));

        tempLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tempLabel.setText("Temperatura:");
        getContentPane().add(tempLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        regisBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        regisBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regisBtnA.png"))); // NOI18N
        regisBtn.setBorder(null);
        regisBtn.setContentAreaFilled(false);
        regisBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regisBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regisBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regisBtnMouseExited(evt);
            }
        });
        regisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisBtnActionPerformed(evt);
            }
        });
        getContentPane().add(regisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, 43));

        hacerBtn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hacerBtn.setForeground(new java.awt.Color(0, 153, 0));
        hacerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hacerEBtn.png"))); // NOI18N
        hacerBtn.setBorder(null);
        hacerBtn.setContentAreaFilled(false);
        hacerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hacerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hacerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hacerBtnMouseExited(evt);
            }
        });
        hacerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(hacerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 200, 40));

        titulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        titulo.setText("Toma de temperatura");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 32, -1, -1));
        getContentPane().add(labelRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 300, 24));

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirBtnR.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 166, 190, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hacerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerBtnActionPerformed
        colabora = true;
        encuesta e = new encuesta();
        e.setVisible(true);
    }//GEN-LAST:event_hacerBtnActionPerformed

    private void escuchaCC() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!ceduText.getText().equals("")) {
                    try {
                        try {
                            labelRegis.setText("");
                            nameLabel.setText("");
                            tempText.setText("");
                            hacerBtn.setVisible(false);
                            persona ps = base.queryForId(Long.parseLong(ceduText.getText()));
                            id3 = hora + " - " + fecha + " - " + lugar + " - " + ps.getNombre();
                            asistencia at = base3.queryForId(id3);
                            if (at.getName().equals(ps.getNombre())) {
                                nameLabel.setVisible(true);
                                nameLabel.setForeground(Color.black);
                                if (at.isEncuesta()) {
                                    nameLabel.setText(ps.getNombre());
                                    tempLabel.setVisible(true);
                                    tempText.setVisible(true);
                                    regisBtn.setVisible(true);
                                } else {
                                    nameLabel.setText("No ha realizado la encuesta");
                                    hacerBtn.setVisible(true);
                                }

                            }
                        } catch (SQLException a) {
                        }
                    } catch (Exception ex) {
                        nameLabel.setVisible(false);
                        nameLabel.setForeground(Color.black);
                        nameLabel.setText("");
                        tempLabel.setVisible(false);
                        tempText.setVisible(false);
                        regisBtn.setVisible(false);
                    }
                }
            }
        };
        ceduText.addKeyListener(kl);
    }

    private void listenCombo() {
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (calendar.getDatoFecha() != null) {
                    horaBox.removeAllItems();
                    if (calendar.getDatoFecha().getDay() == 0) {
                        horaBox.addItem("7:00 am");
                        horaBox.addItem("8:30 am");
                        horaBox.addItem("10:00 am");
                        horaBox.addItem("12:00 pm");
                        horaBox.addItem("5:30 pm");
                        horaBox.addItem("6:30 pm");
                    } else if (calendar.getDatoFecha().getDay() == 6) {
                        horaBox.addItem("6:30 am");
                        horaBox.addItem("4:00 pm");
                    } else if (calendar.getDatoFecha().getDay() == 1) {
                        JOptionPane.showMessageDialog(null, "Los días lunes no se celebran Eucaristias");
                    } else {
                        horaBox.addItem("6:30 am");
                        horaBox.addItem("6:00 pm");
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        horaBox.addMouseListener(ml);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!nitText.equals("") && calendar.getDatoFecha() != null && !horaBox.getSelectedItem().toString().equals("")) {
            try {
                try {
                    boolean verif = false;
                    parroquia pq = base2.queryForId(Long.parseLong(nitText.getText()));
                    lugar = pq.getNombreP();
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
                    for (asistencia asi : base3.queryForAll()) {
                        if (asi.getFecha().equals(sd.format(calendar.getDatoFecha()))
                                && asi.getHour().equals(horaBox.getSelectedItem().toString())
                                && asi.getLugar().equals(pq.getNombreP())) {
                            verif = true;
                        }
                    }
                    if (verif == true) {
                        titulo.setText("Toma de temperatura - " + pq.getNombreP());
                        hora = horaBox.getSelectedItem().toString();
                        fecha = sd.format(calendar.getDatoFecha());

                        nameLabel.setText("");
                        ceduLabel.setVisible(true);
                        ceduText.setVisible(true);
                    } else {
                        titulo.setText("Toma de temperatura - " + pq.getNombreP());
                        nameLabel.setVisible(true);
                        nameLabel.setText("¡No hay personas regitradas para esta Eucaristia!");
                        nameLabel.setForeground(Color.red);
                        ceduLabel.setVisible(false);
                        ceduText.setVisible(false);
                    }
                } catch (SQLException ec) {
                    System.out.println("EL ERROR ES: " + ec);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Parroquia con NIT " + nitText.getText() + " no registrada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Completa todos los espacios para continuar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisBtnActionPerformed
        try {
            asistencia ast = base3.queryForId(id3);
            double t = Double.parseDouble(tempText.getText());
            if (t >= 38) {
                labelRegis.setForeground(Color.red);
                labelRegis.setText("No puede ingresar por exceder los 38°C");
            } else {
                ast.setTemp(t);
                base3.update(ast);
                labelRegis.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
                labelRegis.setForeground(Color.white);
                labelRegis.setText("Registrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(colaborador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regisBtnActionPerformed

    private void tempTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        index idx = new index();
        index.visible = true;
        idx.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered

    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited

    }//GEN-LAST:event_jButton4MouseExited

    private void hacerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacerBtnMouseEntered

    }//GEN-LAST:event_hacerBtnMouseEntered

    private void hacerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hacerBtnMouseExited

    }//GEN-LAST:event_hacerBtnMouseExited

    private void regisBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisBtnMouseEntered
        regisBtn.setIcon(new ImageIcon(colaborador.class.getResource("/imagenes/regisBtnAO.png")));
    }//GEN-LAST:event_regisBtnMouseEntered

    private void regisBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisBtnMouseExited
        regisBtn.setIcon(new ImageIcon(colaborador.class.getResource("/imagenes/regisBtnA.png")));
    }//GEN-LAST:event_regisBtnMouseExited

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colaborador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser calendar;
    private javax.swing.JLabel ceduLabel;
    private javax.swing.JTextField ceduText;
    private javax.swing.JButton hacerBtn;
    private javax.swing.JComboBox<String> horaBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelRegis;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nitText;
    private javax.swing.JButton regisBtn;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JTextField tempText;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
