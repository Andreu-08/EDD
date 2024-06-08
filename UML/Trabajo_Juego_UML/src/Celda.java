
public class Celda {
    private boolean esMina;
    private boolean revelada;
    private boolean marcada;
    private int minasAdyacentes;

    // Constructor
    public Celda() {
        esMina = false;
        revelada = false;
        marcada = false;
        minasAdyacentes = 0;
    }

    // Getters y Setters
    public boolean esMina() {
        return esMina;
    }

    public void setMina(boolean esMina) {
        this.esMina = esMina;
    }

    public boolean estaRevelada() {
        return revelada;
    }

    public void revelar() {
        revelada = true;
        marcada = false;
    }

    public boolean estaMarcada() {
        return marcada;
    }

    public void toggleMarca() {
        if (!revelada) {
            marcada = !marcada;
        }
    }

    public int getMinasAdyacentes() {
        return minasAdyacentes;
    }

    public void setMinasAdyacentes(int minasAdyacentes) {
        this.minasAdyacentes = minasAdyacentes;
    }

    // Visualización de la celda en el tablero
    public String toString() {
        if (marcada) {
            return "F";
        } else if (!revelada) {
            return ".";
        } else if (esMina) {
            return "*";
        } else if (minasAdyacentes > 0) {
            return String.valueOf(minasAdyacentes);
        } else {
            return " ";
        }
    }

}
