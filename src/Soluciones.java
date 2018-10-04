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
        String respuesta;
        /*System.out.println("Seleccione su opcion:\n0= Usar la prueba por defecto \n1 = Ingresar un texto");

        String opcion = entrada.nextLine();

        System.out.println(opcion);

        if("0" == opcion)
        {
            String prueba1 = "esto es otro ejemplo practico";
            respuesta = data.prosesamientoDatos(prueba1);
        }
        else
        {*/
            System.out.println("Ingrese frase/palabra a prosesar:");
            String Cadena = entrada.nextLine();
            respuesta = data.prosesamientoDatos(Cadena);
        //}

        System.out.println(respuesta);
    }
}
