package ClasesYObjetos;

public class Producto {

    //Clase Producto:
    //Crea una clase Producto con atributos nombre y precio.
    //Incluye un método para mostrar el precio con un descuento del 10%.

    //Atributos

    private String nombre;
    private  int precio;

    //Constructor

    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //metodo mostrar descuento

    public void mostrarDescuento(){
        System.out.println(precio * 0.10);
    }


}
