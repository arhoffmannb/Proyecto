/**
 * Created by Raquel on 23/03/14.
 */

public class MostrarPantalla {

    Carretera ventanaFondo;

    public MostrarPantalla(){
        ventanaFondo = new Carretera();
    }

    public void FondoPantalla(){
        ventanaFondo.propiedades();
    }


    public static void main(String[] argumentos){
        MostrarPantalla pantallaJuego = new MostrarPantalla();
        pantallaJuego.FondoPantalla();

    }

}
