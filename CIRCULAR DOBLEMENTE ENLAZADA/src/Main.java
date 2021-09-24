public class Main {
    public static void main(String[] args){
        ListaCircularDoblementeEnlazada ListaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();
        System.out.println(ListaCircularDoblementeEnlazada.estaVacio());
        for (int i = 1; i <= 5; i++) {
            ListaCircularDoblementeEnlazada.insertarFinal(i);
        }
        ListaCircularDoblementeEnlazada.mostrar();

        //ListaCircularDoblementeEnlazada.eliminarFinal();
        //ListaCircularDoblementeEnlazada.eliminarFinal();
        //ListaCircularDoblementeEnlazada.eliminarFinal();
        //ListaCircularDoblementeEnlazada.mostrar();

        ListaCircularDoblementeEnlazada.mostrarAdelante(5);
        ListaCircularDoblementeEnlazada.mostrarAtras(5);
    }
}