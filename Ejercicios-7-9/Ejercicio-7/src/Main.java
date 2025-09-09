public class Main {
    public static void main(String[] args) {
        // Lista de estudiantes
        String[] estudiantes = {"Anthony", "Mateo", "Carlos"};

        // Matriz de notas [estudiantes][evaluaciones]
        double[][] notas = {
            {85, 90, 78},  
            {92, 88, 95},  
            {70, 75, 80} 
        };

        // Crear curso
        Curso curso = new Curso("Programación I", estudiantes, notas);

        // Mostrar resultados
        curso.mostrar_curso();
    }
}
