package org.example;

import org.example.Pilas.Evaluación.TransformadorPalabras;
import org.example.Pilas.PilaLineal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void palindromo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = scanner.nextLine();

        PilaLineal pila = new PilaLineal();
        String palabraTransformada = TransformadorPalabras.transformar(palabra);
        String palabraInvertida = "";

        //Creamos la pila con la palabra transformada
        for (int i = 0; i < palabraTransformada.length(); i++) {
            try {
                pila.insertar(palabraTransformada.charAt(i));
            } catch (Exception ex) {
                System.out.println("Problema al insertar: " + ex.getMessage());
            }
        }

        //Se comprueba si es palíndromo
        while (!pila.pilaVacia()) {
            try {
                palabraInvertida += pila.quitar();
            } catch (Exception ex) {
                System.out.println("Error comprobado.");
            }
        }

        if (palabraTransformada.equals(palabraInvertida)) {
            System.out.println("Sí, es un palíndromo");
        } else {
            System.out.println("No, no lo es");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char teclaSalir = '1';
        char teclaPresionada;

        do {
            palindromo();
            System.out.print("Presione 1 para salir o cualquier otra tecla para continuar: ");
            teclaPresionada = scanner.nextLine().charAt(0);
        } while (teclaPresionada != teclaSalir);
    }
}