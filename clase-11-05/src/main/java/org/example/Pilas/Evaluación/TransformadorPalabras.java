package org.example.Pilas.Evaluación;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class TransformadorPalabras {

    public static String transformar(String palabra) {
        String palabraTransformada = palabra.toLowerCase(); // Convertir a minúsculas

        // Quitar espacios en blanco
        palabraTransformada = palabraTransformada.replaceAll("\\s", "");

        // Quitar signos de puntuación
        palabraTransformada = palabraTransformada.replaceAll("\\p{Punct}", "");

        // Quitar acentos
        palabraTransformada = Normalizer.normalize(palabraTransformada, Normalizer.Form.NFD);
        palabraTransformada = palabraTransformada.replaceAll("[^\\p{ASCII}]", "");

        // Quitar números
        palabraTransformada = palabraTransformada.replaceAll("\\d", "");

        // Quitar símbolos
        palabraTransformada = palabraTransformada.replaceAll("[^a-zA-Z]", "");

        return palabraTransformada;
    }
}