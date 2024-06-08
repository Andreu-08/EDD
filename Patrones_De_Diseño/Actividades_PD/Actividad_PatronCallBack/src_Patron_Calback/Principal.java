package src;

public class Principal {
    public static void main(String[] args) {
        MiClase miClase = new MiClase(new Retrollamada() {
            @Override
            public void llamar() {
                System.out.println("¡La operación ha terminado!");
            }
        });

        miClase.ejecutar();
    }
}
