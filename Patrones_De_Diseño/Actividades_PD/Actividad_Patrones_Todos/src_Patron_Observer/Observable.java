// Interfaz Observer
public interface Observer {
    void actualizar();
}

// Interfaz Observable
public interface Observable {
    void agregarObservador(Observer o);
    void removerObservador(Observer o);
    void notificarObservadores();
}
