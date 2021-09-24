import PC.Cola;
import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args){
        /*ListaSimplementeEnlazada ListaSimplementeEnlazada = new ListaSimplementeEnlazada();
        ListaSimplementeEnlazada.insertar(5);
        ListaSimplementeEnlazada.insertar(4);
        ListaSimplementeEnlazada.insertar(3);
        ListaSimplementeEnlazada.insertar(2);
        ListaSimplementeEnlazada.insertar(1);
        ListaSimplementeEnlazada.insertar(0);


        ListaSimplementeEnlazada.mostrar();


        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();

        ListaSimplementeEnlazada.mostrar();*/

        Cola Cola = new Cola();
        System.out.println(Cola.estaVavio());
        for (int i=0; i<=20; i++){
            Cola.insertar(i);
        }
        Cola.mostrar();

        Cola.eliminar();
        Cola.eliminar();
        Cola.eliminar();
        Cola.eliminar();
        Cola.eliminar();
        Cola.eliminar();
        Cola.mostrar();
    }
}