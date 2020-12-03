package protocolmeet;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class botones {

    static JButton boton;
    static JLabel label;

    public void mostrarBoton(int largo, String hora, String fecha, String lugar, boolean encuesta) {
        boton = new JButton();
        boton.setBounds(20, largo, 387, 37);
        boton.setText(hora + " - " + fecha + " - " + lugar);
        boton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));

        label = new JLabel();
        label.setBounds(440, largo + 5, 270, 27);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        if (encuesta == true) {
            label.setForeground(Color.white);
            label.setText("Encuesta realizada");
        } else {
            label.setForeground(Color.red);
            label.setText("Encuesta no realizada");
        }
    }
}
