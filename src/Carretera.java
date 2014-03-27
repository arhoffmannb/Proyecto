import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;


public class Carretera{
    public JFrame ventana;
    public JLabel etiquetaImagen;
    public BufferedImage fondo;

    public Carretera(){ //Constructor que inicializa las variables
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
            fondo = null;
            fondo = ImageIO.read(new File("C:/Users/Raquel/Desktop/Tareas/USAC/IPC1/Proyecto/Images/Fondo.jpg"));
            ImageIcon iconoFondo = new ImageIcon(fondo);
            etiquetaImagen.setIcon(iconoFondo);

            Graphics dibujarFondo = fondo.getGraphics();
            dibujarFondo.drawImage(fondo,0,0,800,500,null);

        } catch (IOException exception){
            System.out.println("No se encuentra la imagen");
        }
    }

}
