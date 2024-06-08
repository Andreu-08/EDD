package src_Patron_Observer;

import java.util.ArrayList;
import java.util.List;

public class SujetoConcreto {
    
private List<Observer> observadores;
    private String estado;

    public SujetoConcreto() {
        this.observadores = new ArrayList<>();
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar();
        }
    }
}

// Clase concreta que implementa Observer
public class ObservadorConcreto implements Observer {
    private SujetoConcreto sujeto;

    public ObservadorConcreto(SujetoConcreto sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregarObservador(this);
    }

    @Override
    public void actualizar() {
        System.out.println("El estado del sujeto ha cambiado a: " + sujeto.getEstado());
    }
}
