package EjerciciosDelExamen;//Escribe una función llamada factoriales que, dado un entero n,
// calcule los factoriales de todos los números desde 0 hasta n y devuelva un arreglo con los resultados.
//
//El factorial de un número k (denotado como k!) es el producto de todos los enteros positivos menores o iguales a k.
// Por ejemplo, el factorial de 5 es 5! = 5 * 4 * 3 * 2 * 1 = 120.
//
//factorial(5) , me devuelve:
//
//[1, 1, 2, 6, 24, 120]
//
//
//No debes incluir el método main, solo completar la lógica del método.
//No debes probar el método con llamadas, de eso se encarga CodeRunner, solo completar la lógica del método.

public class FactorialArray {
    public static void main(String[] args) {




    }


        public static int[] factoriales(int n) {
            //Completa el código aquí.

            int[] resultado = new int[n + 1]; // Crear un array para almacenar los factoriales
            int factorial = 1; // Variable para calcular el factorial, inicia en 1

            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    factorial = 1; // Por definición, 0! = 1
                } else {
                    factorial *= i; // Multiplicamos el factorial actual por 'i'
                }
                resultado[i] = factorial; // Guardar el factorial en el array
            }

            return resultado; // Devolver el array con los resultados
        }



    public static int [] Factorial(int n){

      int[] res = new int[n + 1];
      int fac = 1;

      for (int i = 0; i<= n; i++){
          if (i == 0){
              fac = 1;
          }else {
              fac *= i;
          }
          res[i] = fac;
      }

      return res;
    }







    }


