public class Sistema_de_estudiantes {
    private String nombre;
    private int edad;
    private double[] notas;

    public Sistema_de_estudiantes(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + calcularPromedio());
    }
}
