import java.util.*;
public class Tablero {
    private final int alto;
    private Celda[][] celdas;
    private int ancho;
    private int cantidadMinas;
    private boolean juegoTerminado;

    // Constructor
    public Tablero(int alto, int ancho, int cantidadMinas) {
        this.alto = alto;
        this.ancho = ancho;
        this.cantidadMinas = cantidadMinas;
        this.celdas = new Celda[alto][ancho];
        this.juegoTerminado = false;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                celdas[i][j] = new Celda();
            }
        }
        colocarMinas();
        calcularMinasAdyacentes();
    }

    // Coloca las minas de manera aleatoria en el tablero
    private void colocarMinas() {
        Random random = new Random();
        for (int i = 0; i < cantidadMinas; i++) {
            int fila, columna;
            do {
                fila = random.nextInt(alto);
                columna = random.nextInt(ancho);
            } while (celdas[fila][columna].esMina());
            celdas[fila][columna].setMina(true);
        }
    }

    // Calcula el número de minas adyacentes para cada celda
    private void calcularMinasAdyacentes() {
        for (int fila = 0; fila < alto; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                if (!celdas[fila][columna].esMina()) {
                    int numMinas = 0;
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            int ni = fila + i;
                            int nj = columna + j;
                            if (ni >= 0 && ni < alto && nj >= 0 && nj < ancho && celdas[ni][nj].esMina()) {
                                numMinas++;
                            }
                        }
                    }
                    celdas[fila][columna].setMinasAdyacentes(numMinas);
                }
            }
        }
    }

    // Revela una celda y, si no tiene minas adyacentes, revela también sus celdas adyacentes
    public void revelarCelda(int fila, int columna) {
        if (!celdas[fila][columna].estaRevelada() && !celdas[fila][columna].estaMarcada()) {
            celdas[fila][columna].revelar();
            if (celdas[fila][columna].esMina()) {
                juegoTerminado = true;
            } else if (celdas[fila][columna].getMinasAdyacentes() == 0) {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int ni = fila + i;
                        int nj = columna + j;
                        if (ni >= 0 && ni < alto && nj >= 0 && nj < ancho) {
                            revelarCelda(ni, nj);
                        }
                    }
                }
            }
        }
    }

    // Cambia el estado de marcado de una celda
    public void marcarCelda(int fila, int columna) {
        celdas[fila][columna].toggleMarca();
    }

    // Verifica si el juego ha terminado
    public boolean juegoTerminado() {
        return juegoTerminado;
    }

    // Visualización del tablero
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ");
        for (int i = 0; i < ancho; i++) {
            sb.append(i).append(" ");
        }
        sb.append("\n");

        for (int i = 0; i < alto; i++) {
            sb.append(i).append(" ");
            for (int j = 0; j < ancho; j++) {
                sb.append(celdas[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}


