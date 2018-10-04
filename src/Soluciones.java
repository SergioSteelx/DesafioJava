import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Soluciones
{
    public static void main(String[] args)
    {
        ProsesamientoDatos data = new ProsesamientoDatos();
        Scanner entrada = new Scanner(System.in);

        //String prueba1 = "Hola mundo";
        //String prueba1 = "esto es otro ejemplo practico";
        System.out.println("Ingrese frase/palabra a prosesar: ");
        String Cadena = entrada.nextLine();

        String respuesta = data.prosesamientoDatos(Cadena);

        System.out.println(respuesta);
    }
}
