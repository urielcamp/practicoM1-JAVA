package ClasesYObjetos;

public class Persona {

    //Clase Persona:
    //Define una clase Persona con atributos como nombre y edad.
    // Crea un método para mostrar los datos de la persona.

    //Atributos

    private String nombre;
    private int edad;

    //Constructor

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void MostrarPersona(){
        System.out.println("Mostrar informacion Persona");
        System.out.println("La persona se llama " + nombre);
        System.out.println("La persona tiene " + edad);
    }



}
