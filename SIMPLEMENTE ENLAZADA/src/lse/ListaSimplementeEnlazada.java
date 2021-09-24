package lse;

public class ListaSimplementeEnlazada {
    protected Nodo primero;

    public ListaSimplementeEnlazada() {
        primero = null;
    }
    public boolean estaVavio(){
        return primero == null;
    }
    public void insertar(Object dato){
        if(estaVavio()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        }else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }
    }
    public void eliminar(){
        if (!estaVavio()){
            primero = primero.getSiguiente();

        }
    }
    public void mostrar(){
        Nodo temp = primero;
        while (temp !=null){
            System.out.print(temp.getDato()+ "  ");

            temp = temp.getSiguiente();
        }
        System.out.println();
    }
}