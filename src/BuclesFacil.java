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


    }
}
