public class Main {
    public static void main(String[] args) {
        String[] palabras = { "Hola", "mundo!", "Java,", "programación", "hola", "MUNDO", "¡bienvenido!", "a", "Java" };

        EstadisticaTexto est = new EstadisticaTexto(palabras);

        System.out.println("Total de palabras: " + est.contarPalabras());
        System.out.println("Únicas: " + est.palabrasUnicas());
        System.out.println("Más largas: " + est.palabrasMasLargas());
        System.out.println("Más cortas: " + est.palabrasMasCortas());
    }
}
