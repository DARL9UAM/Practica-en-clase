import juego.Jugador;
import juego.Tablero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Jugador j1 = new Jugador("Anthony", 'X');
            Jugador j2 = new Jugador("Leyssi", 'O');

            Tablero t = new Tablero();
            Jugador actual = j1;
            boolean hayGanador = false;

            while (!hayGanador && !t.tableroLleno()) {
                t.mostrar();
                System.out.println(actual.getNombre() + " (" + actual.getFicha() + "), ingresa fila y columna (0-2): ");
                int fila = sc.nextInt();
                int col = sc.nextInt();

                if (t.colocarFicha(fila, col, actual.getFicha())) {
                    if (t.hayGanador(actual.getFicha())) {
                        t.mostrar();
                        System.out.println("¡Ganó " + actual.getNombre() + "!");
                        hayGanador = true;
                    } else {
                        // Cambiar turno
                        actual = (actual == j1) ? j2 : j1;
                    }
                } else {
                    System.out.println("Movimiento inválido, intenta otra vez.");
                }
            }

            if (!hayGanador) {
                t.mostrar();
                System.out.println("¡Empate!");
            }
        }
    }
}

