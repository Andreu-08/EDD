public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();
        AutomovilBuilder builder = new SedanBuilder();
        Automovil miAutomovil = concesionario.construirAutomovil(builder);
        System.out.println(miAutomovil);
    }
}



