package protocolmeet;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static protocolmeet.index.base;
import static protocolmeet.index.base2;
import static protocolmeet.index.base3;

public class tablaAsist extends javax.swing.JFrame {

    public tablaAsist() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        try {
            parroquia par = base2.queryForId(reservar.nitt);
            jLabel1.setText(par.getNombreP());
        } catch (SQLException ex) {
            Logger.getLogger(tablaAsist.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboShema();
        comboCambia();
    }
    
    @Override
    public java.awt.Image getIconImage(){
        java.awt.Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("protocolmeet/ico.png"));
        return retValue;
    }

    private void comboShema() {
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
                if (calendar2.getDatoFecha() != null) {
                    comboBox.removeAllItems();
                    if (calendar2.getDatoFecha().getDay() == 0) {
                        comboBox.addItem("7:00 am");
                        comboBox.addItem("8:30 am");
                        comboBox.addItem("10:00 am");
                        comboBox.addItem("12:00 pm");
                        comboBox.addItem("5:30 pm");
                        comboBox.addItem("6:30 pm");
                    } else if (calendar2.getDatoFecha().getDay() == 6) {
                        comboBox.addItem("6:30 am");
                        comboBox.addItem("4:00 pm");
                    } else if (calendar2.getDatoFecha().getDay() == 1) {
                        JOptionPane.showMessageDialog(null, "Los días lunes no celebramos Eucaristías");
                    } else {
                        comboBox.addItem("6:30 am");
                        comboBox.addItem("6:00 pm");
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
        comboBox.addMouseListener(mouse);
    }

    private void comboCambia() {
        ItemListener itml = (ItemEvent e) -> {
            try {
                if (!calendar2.equals(null) && !comboBox.getSelectedItem().equals(null)) {
                    int count = 0;
                    String encu = "";
                    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");
                    String date = sdf2.format(calendar2.getDatoFecha());
                    DefaultTableModel dtm = (DefaultTableModel) listas.getModel();
                    dtm.setRowCount(0);
                    try {
                        for (asistencia asis : base3.queryForAll()) {
                            if (asis.getFecha().equals(date) && asis.getHour().equals(comboBox.getSelectedItem().toString())) {

                                for (persona ps : base.queryForAll()) {
                                    if (ps.getNombre().equals(asis.getName())) {
                                        if (asis.isEncuesta()) {
                                            encu = "Realizada";
                                        } else {
                                            encu = "No realizada";
                                        }
                                        Object[] objeto = {asis.getName(), ps.getCedula(), asis.getTemp(), encu, ps.getFechaR()};
                                        dtm.addRow(objeto);
                                        count++;
                                    }
                                }
                            }
                        }
                        if (dtm.getRowCount() == 0) {
                            advert.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                            advert.setForeground(Color.red);
                            advert.setText("No hay personas registradas");
                        } else {
                            advert.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                            advert.setForeground(Color.green);
                            advert.setText(count + " personas");
                        }
                    } catch (SQLException ex) {
                        System.out.println("ESTE ES EL ERROR: " + ex);
                    }
                }
            } catch (Exception ec) {
                System.out.println("ESTE ES EL ERROR: " + ec);
            }
        };
        comboBox.addItemListener(itml);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listas = new javax.swing.JTable();
        calendar2 = new rojeru_san.componentes.RSDateChooser();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        advert = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        listas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Temperatura", "Encuesta", "Fecha de registro"
            }
        ));
        jScrollPane1.setViewportView(listas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 98, 806, 460));
        getContentPane().add(calendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 24, 212, 34));

        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 24, 212, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Asistencia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 24, 332, 34));

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 275, 39));
        getContentPane().add(advert, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 68, 324, 24));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/impresora.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 120, 90));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Imprimir lista");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolmeet/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        index is = new index();
        index.visible = true;
        is.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document documento = new Document();
        try {
            String nombrePdf = jLabel1.getText().trim() + ".pdf";
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/" + nombrePdf + ".pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/protocolmeet/header.png");
            header.scaleToFit(600, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            header.setBorder(Image.NO_BORDER);//???

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);

            parrafo.setFont(FontFactory.getFont("Tahoma", 14, Font.BOLD, BaseColor.BLACK));

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Nombre");
            tabla.addCell("Cedula");
            tabla.addCell("Temperatura");
            tabla.addCell("Encuesta");
            tabla.addCell("Fecha de registro");

            try {
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");
                String date = sdf2.format(calendar2.getDatoFecha());
                String encu = "";
                String parr = "";
                String horario = "";
                for (asistencia asis : base3.queryForAll()) {
                    if (asis.getFecha().equals(date) && asis.getHour().equals(comboBox.getSelectedItem().toString())) {
                        for (persona ps : base.queryForAll()) {
                            if (ps.getNombre().equals(asis.getName())) {
                                parr = asis.getLugar();
                                horario = asis.getHour();
                                if (asis.isEncuesta()) {
                                    encu = "Realizada";
                                } else {
                                    encu = "No realizada";
                                }
                                tabla.addCell(asis.getName());
                                tabla.addCell(String.valueOf(ps.getCedula()));
                                tabla.addCell(String.valueOf(asis.getTemp()));
                                tabla.addCell(encu);
                                tabla.addCell(ps.getFechaR());
                            }
                        }

                    }
                }

                parrafo.add("Lista de asistencia " + date + " - " + horario + "\n\n");
                documento.open();
                documento.add(header);
                documento.add(parrafo);
                documento.add(tabla);

            } catch (SQLException ex) {
                System.out.println("ESTE ES EL ERROR: " + ex);
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "¡Documento PDF creado!");
        } catch (Exception e) {

        }
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
            java.util.logging.Logger.getLogger(tablaAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaAsist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advert;
    private rojeru_san.componentes.RSDateChooser calendar2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listas;
    // End of variables declaration//GEN-END:variables
}
