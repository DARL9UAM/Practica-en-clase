import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class EstadisticaTexto {
    private String[] palabras;

    public EstadisticaTexto(String[] palabras) {
        this.palabras = Arrays.stream(palabras)
                              .map(p -> p.replaceAll("\\p{Punct}", "").toLowerCase().trim())
                              .filter(p -> !p.isEmpty())
                              .toArray(String[]::new);
    }

    // Cantidad total de palabras (incluye repetidas)
    public int contarPalabras() {
        return palabras.length;
    }

    // Palabras únicas (sin repetir, en orden de aparición)
    public Set<String> palabrasUnicas() {
        return new LinkedHashSet<>(Arrays.asList(palabras));
    }

    // Palabras más largas
    public List<String> palabrasMasLargas() {
        int max = Arrays.stream(palabras).mapToInt(String::length).max().orElse(0);
        return Arrays.stream(palabras).filter(p -> p.length() == max).distinct().toList();
    }

    // Palabras más cortas
    public List<String> palabrasMasCortas() {
        int min = Arrays.stream(palabras).mapToInt(String::length).min().orElse(0);
        return Arrays.stream(palabras).filter(p -> p.length() == min).distinct().toList();
    }
}
