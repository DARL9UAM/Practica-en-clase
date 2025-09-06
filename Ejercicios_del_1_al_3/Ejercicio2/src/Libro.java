public class Libro {
    private String titulo;
    private String autor;
    private int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAño() { return año; }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor + " (" + año + ")";
    }
}
