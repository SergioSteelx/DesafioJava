


public class Soluciones
{
    public static void main(String[] args) implements Solucion()
    {



        //String prueba1 = "Hola mundo";
        String prueba1 = "esto es otro ejemplo practico";
        //---- esto regresa la cantidad de o
        prueba1.indexOf( 'o' );
        //----  esto indica de donde empieza el texto
        prueba1.substring(2,6);
        //---- esto te dice que tan larga es la palabra
        int largo = prueba1.length();
        String respuesta = "";
        int j =0;
        for (int i = 0; i < largo; i++)
        {

            if (i == prueba1.indexOf('o',i))
            {
                j++;
                for (int x = 0; x<j; x++){
                    respuesta=respuesta+"x";
                }
            }
            else
            {
                respuesta = respuesta + prueba1.substring(i,i+1);
            }

        }

        System.out.println(respuesta);
        System.out.println(prueba1);
    }
}
