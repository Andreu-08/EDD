package src_Patron_Adapter;


// Interfaz que el cliente espera usar
public interface Objetivo {
    void peticion();
}

// Clase con la funcionalidad existente que necesita ser adaptada
public class Adaptado {
    public void peticionEspecifica() {
        System.out.println("Llamada a petición específica");
    }
}
