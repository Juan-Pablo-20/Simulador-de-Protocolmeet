package protocolmeet;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static protocolmeet.index.base;
import static protocolmeet.index.base2;
import static protocolmeet.index.base3;

public class qAsistir extends javax.swing.JFrame {

    static long per;
    static String id;
    static boolean asistir;

    public qAsistir() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        asistir = false;

        if (index.buscado == true) {
            iglesia.setText("HORARIOS " + index.nombPq3.toUpperCase());
        } else if (index.buscado == false) {
            iglesia.setText("HORARIOS " + index.nombPq2.toUpperCase());
        }

        persona.setText(reservar.nomb);
        horasCombo.addItem("...");
        horasCombo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        comboHora();
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("protocolmeet/ico.png"));
        return retValue;
    }

    private void comboHora() {
        MouseListener mouse = new MouseListener() {
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
                if (fechaC.getDatoFecha() != null) {
                    horasCombo.removeAllItems();
                    if (fechaC.getDatoFecha().getDay() == 0) {
                        horasCombo.addItem("7:00 am");
                        horasCombo.addItem("8:30 am");
                        horasCombo.addItem("10:00 am");
                        horasCombo.addItem("12:00 pm");
                        horasCombo.addItem("5:30 pm");
                        horasCombo.addItem("6:30 pm");
                    } else if (fechaC.getDatoFecha().getDay() == 6) {
                        horasCombo.addItem("6:30 am");
                        horasCombo.addItem("4:00 pm");
                    } else if (fechaC.getDatoFecha().getDay() == 1) {
                        JOptionPane.showMessageDialog(null, "Lo sentimos, los días lunes no celebramos eucaristias");
                    } else {
                        horasCombo.addItem("6:30 am");
                        horasCombo.addItem("6:00 pm");
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        horasCombo.addMouseListener(mouse);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        iglesia = new javax.swing.JLabel();
        persona = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        horasCombo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        fechaC = new rojeru_san.componentes.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iglesia.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        iglesia.setText("Parroquia");
        getContentPane().add(iglesia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 39, -1, -1));

        persona.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        persona.setText("Persona");
        getContentPane().add(persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 228, -1, -1));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Asistir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 239, 47));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Realizar encuesta covid ahora");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 239, 47));

        getContentPane().add(horasCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 225, 240, -1));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 230, 47));
        getContentPane().add(fechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String lugar = "";
            if (index.buscado == true) {
                lugar = index.nombPq3;
            } else if (index.buscado == false) {
                lugar = index.nombPq2;
            }
            for (parroquia pr : base2.queryForAll()) {
                if (iglesia.getText().substring(9, iglesia.getText().length()).equals(pr.getNombreP())) {
                    lugar = pr.getNombreP();
                }
            }
            if (fechaC.getDatoFecha() != null && !horasCombo.getSelectedItem().equals("")) {

                persona pa = base.queryForId(reservar.cedu);
                persona pdt = new persona(pa.getCedula(), pa.getNombre(), pa.getPassw(), pa.getCelular(),
                        pa.getCorreo(), pa.getDireccion(), pa.getCiudad(),
                        pa.getFechaR());
                per = pa.getCedula();

                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");
                Date dt = fechaC.getDatoFecha();
                String horas = horasCombo.getSelectedItem().toString();
                String place = "";

                if (index.buscado == true) {
                    place = index.nombPq3;
                } else if (index.buscado == false) {
                    place = index.nombPq2;
                }

                id = horas + " - " + sdf2.format(dt) + " - " + place + " - " + pa.getNombre();//para el id de asistencia, para que sea unico

                asistencia a = new asistencia(pa.getNombre(), lugar, sdf2.format(dt), horas, false, 0, id);
                
                base3.create(a);
                base.update(pdt);

                JOptionPane.showMessageDialog(null, "¡" + pdt.getNombre() + " registrado exitosamente!\n\n"
                        + "Día: " + sdf2.format(dt) + "\n\n"
                        + "Hora: " + horas + "\n\n"
                        + "Lugar: " + lugar + "\n");
                asistencia s = base3.queryForId(id);
                if (s.isEncuesta() == false) {
                    int con = JOptionPane.showConfirmDialog(null, "¿Deseas hacer la encuesta covid ahora?", "", JOptionPane.YES_NO_OPTION);
                    if (con == JOptionPane.YES_OPTION) {
                        asistir = true;
                        encuesta e = new encuesta();
                        e.setVisible(true);
                        this.hide();
                    } else {
                        JOptionPane.showMessageDialog(null, "Por tu seguridad y la de los demas, es nuestro deber informarte que es necesario realizar\n"
                                + "la encuesta covid antes de entrar a la eucaristia, de lo contrario no se te permitirá el ingreso.\n"
                                + "Recomendamos realizar la encuesta el mismo día de la eucaristia a traves de este mismo medio.", "", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Selecciona una fecha y una hora!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(qAsistir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int s = JOptionPane.showConfirmDialog(null, "¿Estas seguro de cerrar sesión", "", JOptionPane.YES_NO_OPTION);
        if (s == JOptionPane.YES_OPTION) {
            asistir = false;
            index is = new index();
            index.visible = true;
            index.buscado = false;
            is.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        asistir = true;
        encuesta en = new encuesta();
        en.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(qAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qAsistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qAsistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.componentes.RSDateChooser fechaC;
    private javax.swing.JComboBox<String> horasCombo;
    private javax.swing.JLabel iglesia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel persona;
    // End of variables declaration//GEN-END:variables
}
