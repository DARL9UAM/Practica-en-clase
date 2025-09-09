import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cadena al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String entrada = sc.nextLine();

        Cadena cadena = new Cadena(entrada);

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Original: " + entrada);
        System.out.println("Mayúsculas: " + cadena.aMayusculas());
        System.out.println("Minúsculas: " + cadena.aMinusculas());
        System.out.println("Invertida: " + cadena.invertir());
        System.out.println("¿Es palíndromo?: " + (cadena.esPalindromo() ? "Sí" : "No"));
        System.out.println("Cantidad de vocales: " + cadena.contarVocales());
        System.out.println("Cantidad de consonantes: " + cadena.contarConsonantes());

        sc.close();
    }
}
