package src;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class rectangulo1dosTest {
    @BeforeAll
    static void setUpBeforeAll() {
        // Código de inicialización que se ejecutará una vez antes de todas las pruebas
        System.out.println("Inicialización antes de todas las pruebas");
    }
   @Test
    void test1() {
        // Tu lógica de prueba aquí
        System.out.println("Prueba 1");
    }

    @Test
    void test2() {
        // Otra prueba
        System.out.println("Prueba 2");
    }
}