package models;

public class Ciudad {
    private double[][] temperaturas; // 7 días x 4 semanas

    public Ciudad(double[][] temperaturas) {
        if (temperaturas.length == 7 && temperaturas[0].length == 4) {
            this.temperaturas = temperaturas;
        } else {
            throw new IllegalArgumentException("La matriz debe ser de 7x4");
        }
    }

    // Devuelve los promedios de las 4 semanas
    public double[] promediosTodasLasSemanas() {
        double[] promedios = new double[4];
        for (int semana = 0; semana < 4; semana++) {
            double suma = 0;
            for (int dia = 0; dia < 7; dia++) {
                suma += temperaturas[dia][semana];
            }
            promedios[semana] = suma / 7;
        }
        return promedios;
    }


    // Temperatura máxima del mes
    public double temperaturaMaximaMes() {
        double max = temperaturas[0][0];
        for (int dia = 0; dia < 7; dia++) {
            for (int semana = 0; semana < 4; semana++) {
                if (temperaturas[dia][semana] > max) {
                    max = temperaturas[dia][semana];
                }
            }
        }
        return max;
    }

    // Día más frío (día y semana)
    public String diaMasFrio() {
        double min = temperaturas[0][0];
        int diaFrio = 0;
        int semanaFria = 0;

        for (int dia = 0; dia < 7; dia++) {
            for (int semana = 0; semana < 4; semana++) {
                if (temperaturas[dia][semana] < min) {
                    min = temperaturas[dia][semana];
                    diaFrio = dia;
                    semanaFria = semana;
                }
            }
        }

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return "Día más frío: " + dias[diaFrio] + " de la semana " + (semanaFria + 1) +
                " con " + min + "°C";
    }

    // Mostrar todas las temperaturas (ahora bien ordenadas por semanas)
    public void mostrarTemperaturas() {
        for (int semana = 0; semana < 4; semana++) {
            System.out.println("Semana " + (semana + 1) + ":");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print(temperaturas[dia][semana] + " ");
            }
            System.out.println();
        }
    }
}
