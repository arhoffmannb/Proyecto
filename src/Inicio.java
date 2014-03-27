/**
 * Created by Raquel on 15/03/14.
 */
/*
import java.awt.*;
import javax.swing.*;

public class Inicio extends JFrame{

    public ImageIcon imageIcon = new ImageIcon("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Fondo.jpg");
    public Image image = imageIcon.getImage();

    public static void main(String[] argumentos){
        // Carga Fondo.jpg al ImageIcon
        /*FondoCarretera panel = new FondoCarretera(
                new ImageIcon("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Fondo.jpg").getImage());*/

        // Agrega el fondo a una ventana
        /*JFrame frame = new JFrame();
        //frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("I see dead people");
        Inicio inicio = new Inicio();
        inicio.setVisible(true);

    }

    public Inicio() {

        this.setTitle("I see dead people");




        Dimension dimension = new Dimension(image.getWidth(null), image.getHeight(null));

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(dimension);
        jPanel.setMinimumSize(dimension);
        jPanel.setMaximumSize(dimension);
        jPanel.setSize(dimension);
        jPanel.setLayout(null);

        this.add(jPanel);
    }

    public void paintComponent(Graphics g){
        g.drawImage(image,0,0,null);
    }
}

    /*class FondoCarretera extends JPanel{
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
    }*/

//}

import java.awt.*;
import javax.imageio.*;
import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.*;

public class Inicio{
    public JFrame ventana;
    public JLabel etiquetaImagen;

    public Inicio(){ //Constructor que inicializa las variables
        ventana = new JFrame("I see dead People");
        etiquetaImagen = new JLabel();
    }


    public void propiedades (){

    //Propiedades y componentes de la ventana.
        ventana.setLayout(null);
        ventana.setSize(800,500);
        ventana.add(etiquetaImagen);
        ventana.setVisible(true);

        etiquetaImagen.setBounds(0,0,800,500);

        try{
            //Carga la imagen
            BufferedImage fondo = null;
            fondo = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Fondo.jpg"));
            ImageIcon iconoFondo = new ImageIcon(fondo);
            etiquetaImagen.setIcon(iconoFondo);

            Graphics dibujarFondo = fondo.getGraphics();
            dibujarFondo.drawImage(fondo,0,0,800,400,null);

        } catch (IOException exception){
            System.out.println("No se encuentra la imagen");
        }
    }

    public static void main(String[] argumentos){
        Inicio ventanaFondo = new Inicio();
        ventanaFondo.propiedades();
    }


}
