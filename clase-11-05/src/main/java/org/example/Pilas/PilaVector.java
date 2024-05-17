package org.example.Pilas;

import java.util.ArrayList;
import java.util.List;

public class PilaVector {

    private static final int INICIAL = 49; //Este es el tamaño máximo de la pila
    private int cima; //Valor del elemento en la cima
    private List<Object> listaPila;

    public PilaVector(){
        cima = -1;
        listaPila = new ArrayList<>(INICIAL);
    }

    public void insertar(Object elemento) throws Exception {
      cima++;
      listaPila.add(elemento);
    }

    public boolean pilaLlena(){
        return cima == INICIAL -1;
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()){
            throw new Exception("Pila Vacía (UnderFlow)");
        }
        aux = listaPila.remove(cima);
        cima--;
        return aux;
    }

    public boolean pilaVacia(){
        return cima == -1;
    }

    public void limpiarPila() throws Exception {
        while(!pilaVacia())   quitar();

    }
}
