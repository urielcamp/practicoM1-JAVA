public class Condicionales {

    public static void main(String[] args) {


        // EJERCICIOS FACILES

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //Escribe un programa que solicite un número e imprima si es positivo.

        int num = 4;

        if(num > 0){
            System.out.println("es positivo");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Solicita un número y verifica si es impar.

        if (num%2 == 0){
            System.out.println(num + " es par");
        }else {
            System.out.println(num + " es impar");
        }


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //Pide dos números y muestra cuál es el mayor.

        int aNum = 13;
        int bNum = 9;

        if (aNum > bNum){
            System.out.println(aNum + " es mayor que " + bNum);
        }else {
            System.out.println(bNum + " es mayor que " + aNum);
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //Verifica si una persona es mayor de edad.

        int edad = 18;

        if (edad > 17){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Solicita un número y comprueba si es divisible entre 5.

        int n = 30;

        if (n%5 == 0){
            System.out.println(n + " Es divisible entre 5");
        }else {
            System.out.println(n + " No es divisible entre 5");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Ingresa una letra y verifica si es una vocal.

        String letra = "p";

        if (
                letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"
        ){
            System.out.println(letra + " es una vocal");
        }else {
            System.out.println(letra + " no es una vocal");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");





























    }



}
