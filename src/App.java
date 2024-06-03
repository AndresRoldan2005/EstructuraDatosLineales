import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilasGenericas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento de la cima de la pila es: " + pila.peek());
        System.out.println("elemento eliminado de la pila es: " + pila.pop());


        System.out.println();

        //Pila generica
        PilasGenericas<Pantalla> pilaPantallas = new PilasGenericas<>();
        pilaPantallas.push (new Pantalla("Home page", "/home"));
        pilaPantallas.push (new Pantalla("Menu page", "/home/menu"));
        pilaPantallas.push (new Pantalla("Setting page", "/home/menu/setting"));

        System.out.println("estou en las pabntallas" + pilaPantallas.peek().getNombre() );
        System.out.println("destruir pantalla" + pilaPantallas.peek().getNombre() );
        System.out.println("estoy  en las pantallas" + pilaPantallas.peek().getNombre() );
        pilaPantallas.push(new Pantalla("user page", "/Home/menu/user"));
        System.out.println("estoy en la pantralla: \n\t---->" + pilaPantallas.peek().getNombre());



    }
}
