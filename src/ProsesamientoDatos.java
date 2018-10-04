import mx.com.sintelti.desafios.oporx.Solucion;

public class ProsesamientoDatos implements Solucion
{

    public void prosesamientoDatos(String frace)
    {
        int largo = frace.length();
        String respuesta = "";
        int j =0;
        for (int i = 0; i < largo; i++)
        {

            if (i == frace.indexOf('o',i))
            {
                j++;
                for (int x = 0; x<j; x++){
                    respuesta=respuesta+"x";
                }
            }
            else
            {
                respuesta = respuesta + frace.substring(i,i+1);
            }

        }
    }

}
