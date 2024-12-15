public class CondicionalesMedio {
    public static void main(String[] args) {


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        //MEDIOS

        //Solicita dos números y verifica si el primero es múltiplo del segundo.

        int num1 = 8;
        int num2 = 2;

        if (num1%num2 == 0){
            System.out.println("Son multiplos");
        }else {
            System.out.println("no son multiplos");
        }


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Pide una contraseña y verifica si coincide con la palabra "JavaRocks".

        String contra = "JavaRocks";

        if (contra.equals("JavaRocks")){
            System.out.println("son iguales");
        }else {
            System.out.println("son distintos ");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Solicita un número y verifica si es divisible entre 4 pero no entre 8.

        int num = 20;

        if (num%4 == 0 && num%8 != 0){
            System.out.println("es divisible entre 4 y no entre 8");
        }else {
            System.out.println("falla");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

    }



}
