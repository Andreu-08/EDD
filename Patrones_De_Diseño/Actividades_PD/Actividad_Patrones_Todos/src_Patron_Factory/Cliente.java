package src_Patron_Factory;

public class Cliente {
    public static void main(String[] args) {
        // Usar FactoryConcretoA para crear ProductoConcretoA
        Factory factoryA = new FactoryConcretoA();
        Producto productoA = factoryA.crearProducto();
        productoA.operacion();

        // Usar FactoryConcretoB para crear ProductoConcretoB
        Factory factoryB = new FactoryConcretoB();
        Producto productoB = factoryB.crearProducto();
        productoB.operacion();
    }
}
