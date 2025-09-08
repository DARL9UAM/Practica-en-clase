package room;

import models.AnalizadorTexto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine();

        AnalizadorTexto analizador = new AnalizadorTexto(frase);

        // Contar palabras
        System.out.println("Número de palabras: " + analizador.contarPalabras());

        // Pedir al usuario una palabra para contar apariciones
        System.out.println("Ingresa una palabra para buscar cuántas veces aparece:");
        String palabra = sc.nextLine();

        System.out.println("Apariciones de '" + palabra + "': " + analizador.contarApariciones(palabra));

        // Pedir al usuario la palabra por la que reemplazar
        System.out.println("Ingresa la palabra por la que deseas reemplazar '" + palabra + "':");
        String reemplazo = sc.nextLine();

        String textoModificado = analizador.reemplazarPalabra(palabra, reemplazo);
        System.out.println("Texto modificado: " + textoModificado);

        sc.close();
    }
}
