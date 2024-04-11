package src;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class rectangulo1tresTest {
    @BeforeAll
    static void setUpBeforeAll() {
        // Código de inicialización que se ejecutará una vez antes de todas las pruebas
        System.out.println("Inicialización antes de todas las pruebas");
    }
    @BeforeEach
    void setUpBeforeEach() {
        // Código de inicialización que se ejecutará antes de cada prueba
        System.out.println("Inicialización antes de cada prueba");
    } @Test
    void testArea() {
        rectangulo1 r = new rectangulo1(3, 4);
        assertEquals(12, r.area());
    }
    @Test
    void testPerimetro() {
        rectangulo1 r = new rectangulo1(3, 4);
        assertEquals(14, r.perimetro());
    }
    @AfterEach
    void tearDownAfterEach() {
        // Código de limpieza que se ejecutará después de cada prueba
        System.out.println("Limpieza después de cada prueba");
    }
    @AfterAll
    static void tearDownAfterAll() {
        // Código de limpieza que se ejecutará una vez después de todas las pruebas
        System.out.println("Limpieza después de todas las pruebas");
    }
}