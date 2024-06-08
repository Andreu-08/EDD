package src_Patron_Singleton;


public class Singleton {
    // La única instancia de la clase Singleton
    private static Singleton instancia;

    // Constructor privado para evitar instanciación externa
    private Singleton() {}

    // Método estático para obtener la única instancia de la clase
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // Ejemplo de un método de la clase Singleton
    public void operacion() {
        System.out.println("Operación de la instancia Singleton");
    }
}

