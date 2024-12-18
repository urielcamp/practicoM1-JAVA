package EjerciciosDelExamen;

public class duplicarPares {

    public static void main(String[] args) {

    }
    //Completa una función llamada duplicarPares que reciba un arreglo de números enteros y devuelva otro arreglo con los números del arreglo original, pero duplicando los números pares.
    //
    //duplicarPares([1, 2, 3, 4, 5]) me devuelve el arreglo:
    //
    //[1, 4, 3, 8, 5]
    //
    //
    //No debes incluir el método main, solo completar la lógica del método.
    //No debes probar el método con llamadas, de eso se encarga CodeRunner, solo completar la lógica del método.
    //
    //Por ejemplo:
    //
    //Prueba	Resultado
    //int [] arr = {1, 3, 5, 7};
    //int [] res = duplicarPares(arr);
    //System.out.println(java.util.Arrays.toString(res));
    //[1, 3, 5, 7]
    //int [] arr = {1, 2, 3, 4, 5};
    //int [] res = duplicarPares(arr);
    //System.out.println(java.util.Arrays.toString(res));
    //[1, 4, 3, 8, 5]

    public static int[] duplicarPares(int[] arr){
        int[] res = new int [arr.length];

        for (int i = 0; i < arr.length; i++){
            if (arr[i]% 2 == 0){
                res[i] = arr[i]*2;
            }else {
                res[i] = arr[i];
            }

        }




        return res;
    }



}
