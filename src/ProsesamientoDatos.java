import mx.com.sintelti.desafios.oporx.Solucion;

public class ProsesamientoDatos implements Solucion
{

    public String prosesamientoDatos(String frace)
    {
       String contestacion = convertir(frace);
       return contestacion;
    }

    @Override
    public String convertir(String entrada) {
        int largo = entrada.length();
        String respuesta = "";
        int j =0;
        for (int i = 0; i < largo; i++)
        {

            if (i == entrada.indexOf('o',i))
            {
                j++;
                for (int x = 0; x<j; x++){
                    respuesta=respuesta+"x";
                }
            }
            else
            {
                respuesta = respuesta + entrada.substring(i,i+1);
            }

        }
        return respuesta;
    }
}
