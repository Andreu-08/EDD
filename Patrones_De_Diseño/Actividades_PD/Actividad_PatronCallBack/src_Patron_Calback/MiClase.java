package src;
public class MiClase {
    private Retrollamada retrollamada;

    public MiClase(Retrollamada retrollamada) {
        this.retrollamada = retrollamada;
    }

    public void ejecutar() {
        // Simula una operación que toma tiempo
        try {
            Thread.sleep(1000); // Simula tiempo de espera
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Llama al método de callback una vez completada la operación
        retrollamada.llamar();
    }
}

