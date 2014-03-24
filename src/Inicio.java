/**
 * Created by Raquel on 15/03/14.
 */
import java.awt.*;
import javax.swing.*;

public class Inicio{

    public static void main(String[] argumentos){
        // Carga Fondo.jpg al ImageIcon
        FondoCarretera panel = new FondoCarretera(
                new ImageIcon("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Fondo.jpg").getImage());

        // Agrega el fondo a una ventana
        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("I see dead people");

    }
}

    class FondoCarretera extends JPanel{
        private Image fondo;

    // Obtiene las dimensiones de Fondo.jpg y las guarda en fondo
    public FondoCarretera(Image fondo){
        this.fondo = fondo;
        Dimension size = new Dimension(fondo.getWidth(null), fondo.getHeight(null));
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
        setSize(size);
        setLayout(null);
    }


    //Dibuja la imagen Fondo.jpg
    public void paintComponent(Graphics g){
        g.drawImage(fondo,0,0,null);
    }

}

