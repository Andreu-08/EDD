package src_Patron_Adapter;

// Clase Adaptador que implementa la interfaz Objetivo
public class Adaptador implements Objetivo {
    private Adaptado adaptado;

    public Adaptador(Adaptado adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void peticion() {
        // Traduce la llamada a una llamada al método del Adaptado
        adaptado.peticionEspecifica();
    }
}
