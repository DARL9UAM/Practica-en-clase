public class Curso {
    private String nombre;
    private double[][] notas; // Matriz [estudiantes][evaluaciones]
    private String[] estudiantes;

    // Constructor
    public Curso(String nombre, String[] estudiantes, double[][] notas) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.notas = notas;
    }

    // Promedio por estudiante
    public double promedio_estudiante(int indice_estudiante) {
        double suma = 0;
        for (int j = 0; j < notas[indice_estudiante].length; j++) {
            suma += notas[indice_estudiante][j];
        }
        return suma / notas[indice_estudiante].length;
    }

    // Promedio por evaluación
    public double promedio_evaluacion(int indiceEvaluacion) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][indiceEvaluacion];
        }
        return suma / notas.length;
    }

    // Mejor estudiante 
    public String mejor_estudiante() {
        int mejor_indice = 0;
        double mejor_promedio = promedio_estudiante(0);

        for (int i = 1; i < notas.length; i++) {
            double prom = promedio_estudiante(i);
            if (prom > mejor_promedio) {
                mejor_promedio = prom;
                mejor_indice = i;
            }
        }
        return estudiantes[mejor_indice] + " con promedio " + mejor_promedio;
    }

    // Mostrar datos del curso
    public void mostrar_curso() {
        System.out.println("Curso: " + nombre);
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " → Promedio: " + promedio_estudiante(i));
        }
        for (int j = 0; j < notas[0].length; j++) {
            System.out.println("Promedio Evaluación " + (j+1) + ": " + promedio_evaluacion(j));
        }
        System.out.println("Mejor estudiante: " + mejor_estudiante());
    }
}
