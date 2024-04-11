public class Mayor {

    public static int Mayor(int a, int b)   {
        int mayor = a;

        if (b < a) mayor = b;

        return mayor;
    }

    public static boolean EsMayor(int a, int b) {
        return a > b;
    }
}
