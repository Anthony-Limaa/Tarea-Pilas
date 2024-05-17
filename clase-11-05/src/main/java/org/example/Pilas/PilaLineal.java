package org.example.Pilas;

public class PilaLineal {

    private static final int TAMPILA = 49; //Este es el tamaño máximo de la pila
    private int cima; //Valor del elemento en la cima
    private Object[] listaPila;

    public PilaLineal(){
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()){
            throw new Exception("Ups, StackOverlow");
        }
        //cima++;
        listaPila[++cima] = elemento;
    }

    public boolean pilaLlena(){
        return cima == TAMPILA -1;
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()){
            throw new Exception("Pila Vacía (UnderFlow)");
        }
        aux = listaPila[cima];
        cima--;
        return aux;
    }

    public boolean pilaVacia(){
        return cima == -1;
    }

    public void limpiarPila(){
        cima = -1;
    }

}
