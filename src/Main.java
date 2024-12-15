import ClasesYObjetos.Circulo;
import ClasesYObjetos.Persona;
import ClasesYObjetos.Producto;
import ClasesYObjetos.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1 ClasesYObjetos

        Persona juan = new Persona("Juan", 21);

        juan.MostrarPersona();

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Ejercicio 2 ClasesYObjetos


        Circulo circulo1 = new Circulo(2.0);

        circulo1.CalcularArea();

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


        Producto producto1 = new Producto("Lentes", 200);

        producto1.mostrarDescuento();


        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");

        //Ejercicio 3

        Triangulo triangulo1 = new Triangulo(6,4,3);
        triangulo1.calcularPerimetro();

        System.out.println(" ");
        System.out.println("-----------------------------------------");
        System.out.println(" ");


    }
}