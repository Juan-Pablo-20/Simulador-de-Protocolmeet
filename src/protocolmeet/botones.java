package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class botones {

    static JButton boton;
    static JButton boton2;
    static JButton boton3;
    static JButton boton4;
    static JButton boton5;
    static JButton boton6;
    static JButton boton7;
    static JButton boton8;
    static JButton boton9;
    static JButton[] botones2 = new JButton[9];
    static JLabel label;

    public void mostrarBoton(int largo, String hora, String fecha, String lugar, boolean encuesta) {
        boton = new JButton();
        boton.setBounds(20, largo, 337, 37);
        boton.setText(hora + " - " + fecha + " - " + lugar);
        boton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton2 = new JButton();
        boton2.setBounds(20, largo, 337, 37);
        boton2.setText(hora + " - " + fecha + " - " + lugar);
        boton2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton3 = new JButton();
        boton3.setBounds(20, largo, 337, 37);
        boton3.setText(hora + " - " + fecha + " - " + lugar);
        boton3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton4 = new JButton();
        boton4.setBounds(20, largo, 337, 37);
        boton4.setText(hora + " - " + fecha + " - " + lugar);
        boton4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton5 = new JButton();
        boton5.setBounds(20, largo, 337, 37);
        boton5.setText(hora + " - " + fecha + " - " + lugar);
        boton5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton6 = new JButton();
        boton6.setBounds(20, largo, 337, 37);
        boton6.setText(hora + " - " + fecha + " - " + lugar);
        boton6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton7 = new JButton();
        boton7.setBounds(20, largo, 337, 37);
        boton7.setText(hora + " - " + fecha + " - " + lugar);
        boton7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton8 = new JButton();
        boton8.setBounds(20, largo, 337, 37);
        boton8.setText(hora + " - " + fecha + " - " + lugar);
        boton8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        boton9 = new JButton();
        boton9.setBounds(20, largo, 337, 37);
        boton9.setText(hora + " - " + fecha + " - " + lugar);
        boton9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        label = new JLabel();
        label.setBounds(390, largo + 5, 270, 27);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        if (encuesta == true) {
            label.setForeground(Color.green);
            label.setText("Encuesta realizada");
        } else {
            label.setForeground(Color.red);
            label.setText("Encuesta no realizada");
        }

        botones2[0] = boton;
        botones2[1] = boton2;
        botones2[2] = boton3;
        botones2[3] = boton4;
        botones2[4] = boton5;
        botones2[5] = boton6;
        botones2[6] = boton7;
        botones2[7] = boton8;
        botones2[8] = boton9;
    }
}
