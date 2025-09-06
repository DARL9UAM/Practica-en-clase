public class Main {
    public static void main(String[] args) {
        Sistema_de_estudiantes[] estudiantes = {
                new Sistema_de_estudiantes("Ana", 20, new double[]{9.0, 8.5, 9.5}),
                new Sistema_de_estudiantes("Luis", 22, new double[]{7.0, 6.5, 8.0}),
                new Sistema_de_estudiantes("Marta", 19, new double[]{9.2, 8.8, 9.7})
        };

        System.out.println("Estudiantes con promedio mayor a 8.0:");
        for (Sistema_de_estudiantes e : estudiantes) {
            if (e.calcularPromedio() > 8.0) {
                e.mostrarDatos();
            }
        }
    }
}
