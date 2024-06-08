package src_Patron_Singleton;


public class Cliente {
    public static void main(String[] args) {
        // Obtener la única instancia de Singleton
        Singleton singleton1 = Singleton.getInstancia();
        singleton1.operacion();

        // Intentar obtener otra instancia de Singleton
        Singleton singleton2 = Singleton.getInstancia();
        singleton2.operacion();

        // Verificar que ambas referencias apuntan al mismo objeto
        if (singleton1 == singleton2) {
            System.out.println("Ambas referencias apuntan a la misma instancia Singleton");
        } else {
            System.out.println("Las referencias apuntan a diferentes instancias Singleton");
        }
    }
}
