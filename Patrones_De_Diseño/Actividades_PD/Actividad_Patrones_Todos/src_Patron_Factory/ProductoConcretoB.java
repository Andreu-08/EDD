package src_Patron_Factory;

// Clase concreta que implementa Producto
public class ProductoConcretoA implements Producto {
    @Override
    public void operacion() {
        System.out.println("Operación de Producto Concreto A");
    }
}

// Clase concreta que implementa Producto
public class ProductoConcretoB implements Producto {
    @Override
    public void operacion() {
        System.out.println("Operación de Producto Concreto B");
    }
}

// Fábrica concreta que crea ProductoConcretoA
public class FactoryConcretoA implements Factory {
    @Override
    public Producto crearProducto() {
        return new ProductoConcretoA();
    }
}

// Fábrica concreta que crea ProductoConcretoB
public class FactoryConcretoB implements Factory {
    @Override
    public Producto crearProducto() {
        return new ProductoConcretoB();
    }
}
