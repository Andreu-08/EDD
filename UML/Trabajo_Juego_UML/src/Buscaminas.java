import java.util.*;
public class Buscaminas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero(10, 10, 20); // Tablero de 10x10 con 20 minas

        while (!tablero.juegoTerminado()) {
            System.out.println(tablero);
            System.out.print("Introduce fila y columna para revelar o marcar (e.g., r 5 3 o m 5 3): ");
            String comando = scanner.next();
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (comando.equals("r")) {
                tablero.revelarCelda(fila, columna);
            } else if (comando.equals("m")) {
                tablero.marcarCelda(fila, columna);
            }

            if (tablero.juegoTerminado()) {
                System.out.println("¡Oh no! Has revelado una mina.");
            }
        }

        System.out.println(tablero);
        System.out.println("Juego terminado!");
        scanner.close();
    }
}

