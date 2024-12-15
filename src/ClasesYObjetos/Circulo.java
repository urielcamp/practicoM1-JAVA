package ClasesYObjetos;

public class Circulo {

    //Clase Círculo:
    //Crea una clase Círculo con un atributo radio.
    // Incluye un método que calcule el área del círculo.

    //Atributos
    private double radio;


    //constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    public void CalcularArea(){
        System.out.println(Math.PI* Math.pow(radio, 2));
    }

}
