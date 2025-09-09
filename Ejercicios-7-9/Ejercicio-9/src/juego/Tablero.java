package juego;

public class Tablero {
    private char[][] tablero;

    public Tablero() {
        tablero = new char[3][3];
        // Inicializar con espacios vacíos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Colocar ficha si la casilla está libre
    public boolean colocarFicha(int fila, int col, char ficha) {
        if (fila < 0 || fila >= 3 || col < 0 || col >= 3) {
            return false; // fuera de rango
        }
        if (tablero[fila][col] == ' ') {
            tablero[fila][col] = ficha;
            return true;
        }
        return false; // casilla ocupada
    }

    // Mostrar tablero en consola
    public void mostrar() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Verificar si hay ganador
    public boolean hayGanador(char ficha) {
        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha) return true;
        }
        // Revisar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == ficha && tablero[1][j] == ficha && tablero[2][j] == ficha) return true;
        }
        // Revisar diagonales
        if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha) return true;
        if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha) return true;

        return false;
    }

    // Verificar empate (tablero lleno)
    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
