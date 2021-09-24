public class Ejercicios {
    public static int factorial(int n){
        int factorial;
        if ( n == 1){
            factorial = n;
        }else{
            factorial = n * factorial(n - 1);
        }
        return factorial;
    }
    public static int mcd(int a, int b){
            int mcd;
            if (a == b){
                mcd = b;
            }else {
                if (a > b){
                    a = a - b;
                }else {
                    b = b - a;
                }

                mcd = mcd (a, b);
            }

            return mcd;
    }
    public static int sumaVector(int[] vector, int indice){
        int suma;

        if (indice == vector.length - 1){
            suma = vector[indice];
        }else{
            suma = vector[indice] + sumaVector(vector, indice + 1);
        }
        return suma;
    }
}
