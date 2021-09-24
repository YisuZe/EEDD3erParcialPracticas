public class ejercicios {

    /*
    Maximo comun divisor (mcd), algoritmo de Euclides
    a = 412 y b = 184
     */
    /*public static int mcd(int a, int b){
        int mcd;

        if(a == b){
            //caso base
            mcd = b;

        } else {
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }
    /*
    Suma de los elementos de un vector
    vector = {2, 4, 6}
    suma = 2 + {4, 6}
    suma = 4 + {6}
    suma = 6 (caso base)
     */
    /*public static int sumaVector(int[] vector, int indice){
        int suma;

        if(indice == vector.length - 1){
            suma = vector[indice];
        } else {
            suma = vector[indice] + sumaVector(vector, indice + 1);


        }
        return suma;
        // Invertir cadena con recursividad
    }*/
    public  static  char  invertirPalabra ( char  palabra , int  longitud ) {
        if (longitud == 0 ) {
            return palabra.charAt (longitud) + " " ;


        } else
        return palabra . char (longitud) + invertirPalabra (palabra, longitud - 1 );


    }
    public  static  void  main ( char [] args ) {
         teclado =  nuevo  Escáner ( Sistema . En);
        char palabra;
        int longitud;
        System.out. println ( " ingrese una palabra " );
        palabra = teclado . Siguiente();
        longitud = palabra . largo();
        char palabra_invertida = invertirPalabra (palabra, longitud - 1 );
        System.out.println ( " La palabra invertida es " + palabra_invertida);
    }

}
