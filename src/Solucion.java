//import mx.com.sintelti.desafios.oporx.Solucion;

public class Solucion
{
    public static void main(String[] args) //implements Solucion()
    {



        String prueba1 = "Hola mundo";
        //String prueba1 = "este es otro ejemplo practico"
        //---- esto regresa la cantidad de o
        prueba1.indexOf( 'o' );
        //----  esto indica de donde empieza el texto
        prueba1.substring(2,6);
        //---- esto te dice que tan larga es la palabra
        int largo = prueba1.length();
        String respuesta = "";
        for (int i = 0; i < largo; i++)
        {
            if (i == prueba1.indexOf('o',i))
            {
                respuesta = respuesta + prueba1.substring(i,i)+"x";

                if (i == prueba1.indexOf('o',2)) {
                    respuesta = respuesta + prueba1.substring(i,i)+"x";
                }
            }
            else
            {
                respuesta = respuesta + prueba1.substring(i,i+1);
            }

        }
        System.out.println(respuesta);
    }
}
