/**
 * Created by Raquel on 15/03/14.
 */
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class Inicio extends JFrame {
    JPanel pFondoInicio;

    public static void main(String[] argumentos){
        Inicio pantallaInicio = new Inicio();
        pantallaInicio.isShowing();
    }

    public Inicio(){

        //Ventana
        this.setBounds(600,100,400,600);
        this.setTitle("Nombre del Juego");
        this.setVisible(true);

        //Panel
        pFondoInicio = new JPanel();
        pFondoInicio.setBounds(600,100,400,600);
        pFondoInicio.setBackground(Color.black);
        pFondoInicio.setLayout(null);
        this.add(pFondoInicio);

    }





}
