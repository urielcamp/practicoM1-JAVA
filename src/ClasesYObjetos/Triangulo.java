package ClasesYObjetos;

public class Triangulo {

    //Clase Triángulo:
    //Define una clase Triángulo con atributos lado1, lado2, y lado3.
    // Agrega un método para calcular el perímetro y determinar si es equilátero, isósceles o escaleno.

    //Atributos

   private int pLado;
   private int sLado;
   private int tLado;

    //Constructor
    public Triangulo(int pLado, int sLado, int tLado){
        this.pLado = pLado;
        this.sLado = sLado;
        this.tLado = tLado;
    }



    //metodo

    public void calcularPerimetro(){
        int p = pLado + sLado + tLado;

        System.out.println("El perimetro del triangulo es " + p);

        if (pLado == sLado && pLado == tLado){
            System.out.println("El triangulo es equilatero");
        } else if (

                pLado == sLado && pLado != tLado || sLado == tLado && sLado != pLado || pLado == tLado && pLado != sLado

        ) {
            System.out.println("El triangulo es isosceles");
        }else{
            System.out.println("El triangulo es escaleno ");
        }
    }
}
