public class Cadena {
    private String texto;

    public Cadena(String texto) {
        this.texto = texto;
    }

    // Convertir a mayúsculas
    public String aMayusculas() {
        return texto.toUpperCase();
    }

    // Convertir a minúsculas
    public String aMinusculas() {
        return texto.toLowerCase();
    }

    // Invertir cadena
    public String invertir() {
        return new StringBuilder(texto).reverse().toString();
    }

    // Verificar si es palíndromo
    public boolean esPalindromo() {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(invertido);
    }

    // Contar vocales
    public int contarVocales() {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Contar consonantes
    public int contarConsonantes() {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                contador++;
            }
        }
        return contador;
    }
}
