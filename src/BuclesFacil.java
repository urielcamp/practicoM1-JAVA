public class BuclesFacil {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //Imprime los números del 1 al 10.

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Imprime los números pares del 1 al 20.

        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Calcula la suma de los números del 1 al 100.

        int sum = 0;
        for (int i = 1; i <=100; i++){
            sum += i;

        }
        System.out.println(sum);

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //Muestra los números del 10 al 1 en orden descendente.

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Imprime la tabla de multiplicar del 5.

        for (int i = 5; i <= 50; i = i + 5){
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Genera los primeros 20 números de la secuencia de Fibonacci.

        System.out.println("secuencia de fibonacci");

        int a = 0;
        int b = 1;
        int n = 20;

        for (int i = 0; i <n; i++){

            System.out.println( a + " ");
            int next = a+b;
            a = b;
            b = next;
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Genera los primeros 20 números de la secuencia de padovan.

        int c = 1;
        int d = 1;
        int e = 1;
        int m = 20;

        System.out.println(c + " " + d + " " + e + " ");

        for (int i = 0; i < m; i++){
            int Pn = c + d;

            System.out.println(Pn + " ");

            c = d;
            d = e;
            e = Pn;

        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");




    }
}
