package src_Patron_Factory;

// Interfaz Producto
public inteface Producto {

    void operacion();
}
// Interfaz Factory
public interface Factory {
    Producto crearProducto();
}
