package src_Patron_Observer;


public class Cliente {
    public static void main(String[] args) {
        SujetoConcreto sujeto = new SujetoConcreto();

        ObservadorConcreto observador1 = new ObservadorConcreto(sujeto);
        ObservadorConcreto observador2 = new ObservadorConcreto(sujeto);

        sujeto.setEstado("Estado 1");
        sujeto.setEstado("Estado 2");
    }
}
