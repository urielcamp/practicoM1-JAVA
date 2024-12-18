package EjerciciosDelExamen;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

    }


    //Debemos completar un procedimiento en la cual esta recibe como parámetro un array unidimensional de enteros, y debemos ordenarlo usando el algoritmo de ordenamiento de bubuja (bubble sort),  el array ordenado en forma decreciente, o sea de mayor a menor, primero los números mas grandes a los números más chicos. Se le brinda un trozo de código el cual deben completar, no se deben usar funciones o clases de ordenamiento, en caso de uso de funciones el cuestionario no lleva puntos.
    //
    //   Ejemplo   {3,10,2}   --ordenado-->  {10,3,2}
    //
    //No debes incluir el método main, solo completar la lógica del método.
    //No debes probar el método con llamadas, de eso se encarga CodeRunner, solo completar la lógica del método.
    //
    //Por ejemplo:
    //
    //Prueba	Resultado
    //int [] numeros = {13,25,1,-24,100,27,12};
    //ordenamientoBurbuja(numeros);
    //System.out.println("Ordenado  "+ java.util.Arrays.toString(numeros));
    //Ordenado  [100, 27, 25, 13, 12, 1, -24]
    //int [] numeros2 = {30,12,22,18,-1,50,66};
    //ordenamientoBurbuja(numeros2);
    //System.out.println("Ordenado  "+ java.util.Arrays.toString(numeros2));
    //Ordenado  [66, 50, 30, 22, 18, 12, -1]

    public static  void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // aca deben colocar su código para terminar el
                // algoritmo de ordenamiento de mayor a menor.
              if (arreglo[j] < arreglo[j+ 1]){
                  int temp = arreglo[j];
                  arreglo[j] = arreglo[j+ 1];
                  arreglo[j+1] = temp;
              }

            }
        }
    }
}
