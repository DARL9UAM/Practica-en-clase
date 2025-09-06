public class Producto {
    private String nombre;
    private String codigo;
    private int cantidad;

    public Producto(String nombre, String codigo, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }
    @Override
    public String toString() {
        return "Producto: " + nombre + " | Código: " + codigo + " | Cantidad: " + cantidad;
    }
}
