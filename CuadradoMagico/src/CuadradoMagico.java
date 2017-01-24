/**
 * Created by artiaga on 02/12/2016.
 */
public class CuadradoMagico
{
    public static void main(String[] args)
    {
        int sumacontrol = 0, suma = 0;
        boolean esMagico = true;
        int numeros[][] =
                {
                        {16,3,2,13},
                        {5,10,11,8},
                        {9,6,7,12},
                        {4,15,14,1}
                };
             //suma diagonal, esta suma debe ser la misma
            // para todas las formas posibles del cuadrado mágico
        for (int i = 0; i < numeros.length; i++) {
            sumacontrol += numeros[i][i];

        }
        //suma filas
        for (int i = 0; i < numeros.length; i++ ) {

        for (int j = 0; j < numeros.length; j++ ) {

            suma += numeros[i][j];
        }
            if(sumacontrol != suma){
                    esMagico = false;

            }
            suma = 0;
        }
        //suma columnas
        for (int i = 0; i < numeros.length; i++ ) {

            for (int j = 0; j < numeros.length; j++ ) {

                suma += numeros[j][i];
            }
            if(sumacontrol != suma){
                esMagico = false;

            }
            suma = 0;
        }
            //diagonal inversa
        for (int i = 0; i < numeros.length; i++ ) {

            for (int j = 0; j <= numeros.length; j-- ) {

                suma += numeros[i][j];
            }
            if(sumacontrol != suma){
                esMagico = false;

            }
            suma = 0;
        }
        if (esMagico = true){
            System.out.println("Es mágico");
        }else{
            System.out.println("No es mágico");
        }

    }
}
