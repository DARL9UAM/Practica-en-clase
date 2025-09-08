package models;

public class AnalizadorTexto {

    private String texto;

    public AnalizadorTexto(String texto) {
        this.texto = texto;
    }

    public int contarPalabras() {
        if (texto == null || texto.trim().isEmpty())
        {
            return 0;
        }

        // Divide el texto por espacios en blanco y filtra palabras vacías
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    // Metodo para contar cuántas veces aparece una palabra específica
    public int contarApariciones(String palabra)
    {
        if (texto == null || palabra == null || texto.trim().isEmpty() || palabra.trim().isEmpty())
        {
            return 0;
        }
        // Convierte a minúsculas para hacer la búsqueda insensible a mayúsculas
        String textoLower = texto.toLowerCase();
        String palabraLower = palabra.toLowerCase();

        // Usa expresión regular para contar apariciones exactas
        int contador = 0;
        String[] palabras = textoLower.split("\\s+");
        for (String p : palabras)
        {
            // Elimina signos de puntuación al inicio y final de la palabra
            p = p.replaceAll("^[\\p{Punct}]+|[\\p{Punct}]+$", "");
            if (p.equals(palabraLower))
            {
                contador++;
            }
        }
        return contador;
    }

    // Metodo para reemplazar una palabra por otra
    public String reemplazarPalabra(String palabraAntigua, String palabraNueva) {
        if (texto == null || palabraAntigua == null || palabraNueva == null || texto.trim().isEmpty()) {
            return texto;
        }
        // Usa expresión regular con \\b para reemplazar palabras completas
        String regex = "\\b" + palabraAntigua + "\\b";
        return texto.replaceAll(regex, palabraNueva);
    }

    // Getter para el texto (opcional)
    public String getTexto() {
        return texto;
    }

    // Setter para el texto (opcional)
    public void setTexto(String texto) {
        this.texto = texto;
    }
}