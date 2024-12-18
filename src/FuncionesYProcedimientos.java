

public class FuncionesYProcedimientos {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //ejercicio 1
        System.out.println(Saludar("Uriel"));

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //ejercicio 2

        System.out.println(Suma(2, 4));

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //ejercicio 3

        System.out.println(ParOImpar(5));

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //ejercicio 4

        System.out.println(Acuadrado(4));

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //ejercicio fibonacci

        SecuenciaFibonacci(20);


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        SecuenciaPadovan(10);

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");






    }

    //Escribe una función que reciba un nombre como parámetro y devuelva
    // un saludo personalizado
    // (por ejemplo, "Hola, Ana")


    public static String Saludar(String nombre){
        return "Hola, " + nombre;
    }

    //Suma de Dos Números:
    //Escribe una función que reciba dos números como parámetros y devuelva su suma.

    public static int Suma(int a, int b){
        return a + b;
    }


    //Número Par o Impar:
    //Crea una función que determine si un número es par o impar.

    public static String ParOImpar(int n){
        if (n%2 == 0){
            return "es par";
        }else {
            return "es impar";
        }
    }

    //Área de un Cuadrado:
    //Escribe una función que calcule el área de un cuadrado dada su radio.

    public static double Acuadrado(double l){
        return l * 4;
    }

    //Generar Secuencia de Fibonacci:
    //Escribe una función recursiva que genere los primeros n términos
    // de la secuencia de Fibonacci.

    public static void SecuenciaFibonacci(int n){
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){

            System.out.println(a + " ");
            int next = a + b;

            a = b;
            b = next;
        }
    }

    //Generar Secuencia de padovan:
    //Escribe una función recursiva que genere los primeros n términos
    // de la secuencia de padovan.

    public static void SecuenciaPadovan(int n){

        int a = 1;
        int b = 1;
        int c = 1;

        System.out.println(a + " " + b + " " + c + " ");
        for (int i = 0; i < n; i ++){
            int next = b + c;

            System.out.println(next + " ");

            a = b;
            b = c;
            c = next;
        }












    }



}
