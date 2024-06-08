package src_Patron_Adapter;

public class Cliente {
    public static void main(String[] args) {
        // Instanciar la clase Adaptado
        Adaptado adaptado = new Adaptado();

        // Instanciar la clase Adaptador pasándole la instancia de Adaptado
        Objetivo adaptador = new Adaptador(adaptado);

        // Usar el método del Adaptador que el cliente espera
        adaptador.peticion();
    }
}

