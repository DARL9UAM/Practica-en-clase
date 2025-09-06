public class Main {
    public static void main(String[] args) {
        Libro[] libros = {
                new Libro("Cien años de soledad", "Gabriel García Márquez", 1967),
                new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001),
                new Libro("El juego del ángel", "Carlos Ruiz Zafón", 2008),
                new Libro("El héroe discreto", "Mario Vargas Llosa", 2013)
        };

        // Buscar libros por autor
        String autorBuscado = "Carlos Ruiz Zafón";
        System.out.println("\nLibros de " + autorBuscado + ":");
        for (Libro l : libros) {
            if (l.getAutor().equalsIgnoreCase(autorBuscado)) {
                System.out.println(l);
            }
        }

        // Buscar palabra clave en el título
        String palabraClave = "ángel";
        System.out.println("\nLibros que contienen \"" + palabraClave + "\" en el título:");
        for (Libro l : libros) {
            if (l.getTitulo().toLowerCase().contains(palabraClave.toLowerCase())) {
                System.out.println(l);
            }
        }

        // Mostrar libros posteriores a 2010
        System.out.println("\nLibros publicados después del 2010:");
        for (Libro l : libros) {
            if (l.getAño() > 2010) {
                System.out.println(l);
            }
        }
    }
}
