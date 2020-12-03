package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static JPanel panel; //Public para que se pueda leer en otros paquetes
    static JComboBox combo = new JComboBox();
    static  JLabel parrq;
    private JLabel lugar;
    private JLabel diocesis;
    private JLabel sacdt;
    private JButton asistir;
    private JButton asistir2;
    private JButton asistir3;
    private JButton asistir4;
    public static JButton [] botones = new JButton[4];
    public static String [] nombres = new String[4];
    public Panel(){
        
    }
    
    public void paneles(int i, int la, String igle, String dir, String dio, String sacerd) {
        //Font fuente = new Font(Font.SANS_SERIF,Font.PLAIN,20);

        panel = new JPanel();
        panel.setBounds(la, 30, 300, 267);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);//eto es para desactivar el layout y que los Label se ubiquen oorrectamente

        parrq = new JLabel();
        parrq.setBounds(10, 10, 280, 50);
        parrq.setText(igle);
        parrq.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));//a esto se le llama instancia anonima
        panel.add(parrq);

        lugar = new JLabel();
        lugar.setBounds(10, 60, 280, 30);
        lugar.setText(dir);
        lugar.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        panel.add(lugar);

        diocesis = new JLabel();
        diocesis.setBounds(10, 105, 280, 30);
        diocesis.setText(dio);
        diocesis.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        panel.add(diocesis);

        sacdt = new JLabel();
        sacdt.setBounds(10, 150, 280, 30);
        sacdt.setText(sacerd);
        sacdt.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        panel.add(sacdt);

        asistir = new JButton();
        asistir.setBounds(50, 215, 200, 40);
        asistir.setText("¡Quiero asistir!");
        asistir.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        /*asistir.setIcon(new Icon() {
            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getIconWidth() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int getIconHeight() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });*/
        
        asistir2 = new JButton();
        asistir2.setBounds(50, 215, 200, 40);
        asistir2.setText("¡Quiero asistir!");
        asistir2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        
        asistir3 = new JButton();
        asistir3.setBounds(50, 215, 200, 40);
        asistir3.setText("¡Quiero asistir!");
        asistir3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        
        asistir4 = new JButton();
        asistir4.setBounds(50, 215, 200, 40);
        asistir4.setText("¡Quiero asistir!");
        asistir4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        
        botones[0] = asistir;
        botones[1] = asistir2;
        botones[2] = asistir3;
        botones[3] = asistir4;

        panel.add(botones[i]);//para poner el boton en el panel cuadrado
    }
}
