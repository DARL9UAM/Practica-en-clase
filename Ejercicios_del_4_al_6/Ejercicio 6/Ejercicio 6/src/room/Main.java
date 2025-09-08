package room;

import models.Ciudad;

public class Main {
    public static void main(String[] args) {
        double[][] datos = {
                {30, 32, 28, 27}, // Lunes
                {31, 29, 30, 26}, // Martes
                {28, 27, 29, 25}, // Miércoles
                {29, 28, 27, 24}, // Jueves
                {32, 30, 31, 28}, // Viernes
                {33, 31, 32, 29}, // Sábado
                {34, 33, 30, 27}  // Domingo
        };

        Ciudad ciudad = new Ciudad(datos);

        // Mostrar todas las temperaturas
        ciudad.mostrarTemperaturas();

        // Promedios de todas las semanas
        double[] promedios = ciudad.promediosTodasLasSemanas();
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("Promedio semana %d: %.2f%n", (i + 1), promedios[i]);
        }

        // Otros cálculos
        System.out.println("Temperatura máxima del mes: " + ciudad.temperaturaMaximaMes() + "°C");
        System.out.println(ciudad.diaMasFrio());
    }
}
