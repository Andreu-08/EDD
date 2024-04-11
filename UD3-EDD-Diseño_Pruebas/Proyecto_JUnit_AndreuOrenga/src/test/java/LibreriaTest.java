// LibreriaTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Esta clase contiene pruebas unitarias para los métodos de la clase Libreria.
 */
public class LibreriaTest {

    /**
     * Prueba el método factorial de la clase Libreria.
     * Se comprueba que el método devuelve el factorial correcto para varios números,
     * y que lanza una excepción cuando se le pasa un número negativo.
     */
    @Test
    public void testFactorial() {
        // Prueba con un número positivo
        assertEquals(120, Libreria.factorial(5));
        // Prueba con cero
        assertEquals(1, Libreria.factorial(0));
        // Prueba con un número negativo
        assertThrows(IllegalArgumentException.class, () -> Libreria.factorial(-1));
        // Prueba con un número grande
        assertEquals(3628800, Libreria.factorial(10));
    }

    /**
     * Prueba el método invertir de la clase Libreria.
     * Se comprueba que el método devuelve la cadena invertida correctamente para varias cadenas.
     */
    @Test
    public void testInvertir() {
        // Prueba con una cadena no vacía
        assertEquals("odnuM", Libreria.invertir("Mundo"));
        // Prueba con una cadena vacía
        assertEquals("", Libreria.invertir(""));
        // Prueba con una cadena de un solo carácter
        assertEquals("a", Libreria.invertir("a"));
        // Prueba con una cadena con espacios
        assertEquals(" odnuM ", Libreria.invertir(" Mundo "));
    }

    /**
     * Prueba el método ordenar de la clase Libreria.
     * Se comprueba que el método ordena correctamente varios arrays.
     */
    @Test
    public void testOrdenar() {
        // Prueba con un array desordenado
        int[] array1 = {3, 1, 4, 1, 5, 9, 2};
        Libreria.ordenar(array1);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5, 9}, array1);
        // Prueba con un array ordenado
        int[] array2 = {1, 2, 3, 4, 5};
        Libreria.ordenar(array2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array2);
        // Prueba con un array vacío
        int[] array3 = {};
        Libreria.ordenar(array3);
        assertArrayEquals(new int[]{}, array3);
        // Prueba con un array de un solo elemento
        int[] array4 = {1};
        Libreria.ordenar(array4);
        assertArrayEquals(new int[]{1}, array4);
    }

    /**
     * Prueba el método validarEmail de la clase Libreria.
     * Se comprueba que el método valida correctamente varias direcciones de correo electrónico.
     */
    @Test
    public void testValidarEmail() {
        // Prueba con un email válido
        assertTrue(Libreria.validarEmail("usuario@example.com"));
        // Prueba con un email sin arroba
        assertFalse(Libreria.validarEmail("usuarioexample.com"));
        // Prueba con un email sin dominio
        assertFalse(Libreria.validarEmail("usuario@"));
        // Prueba con un email con caracteres especiales
        assertTrue(Libreria.validarEmail("usuario.nombre+alias@example.com"));
    }

    /**
     * Prueba el método raizCuadrada de la clase Libreria.
     * Se comprueba que el método calcula correctamente la raíz cuadrada de varios números,
     * y que lanza una excepción cuando se le pasa un número negativo.
     */
    @Test
    public void testRaizCuadrada() {
        // Prueba con un número positivo
        assertEquals(2.0, Libreria.raizCuadrada(4.0), 0.0001);
        // Prueba con cero
        assertEquals(0.0, Libreria.raizCuadrada(0.0), 0.0001);
        // Prueba con un número negativo
        assertThrows(IllegalArgumentException.class, () -> Libreria.raizCuadrada(-1.0));
        // Prueba con un número grande
        assertEquals(10000.0, Libreria.raizCuadrada(100000000.0), 0.0001);
    }

    /**
     * Prueba el método aleatorio de la clase Libreria.
     * Se comprueba que el método genera un número aleatorio dentro del rango especificado,
     * y que lanza una excepción cuando el límite inferior es mayor que el superior.
     */
    @Test
    public void testAleatorio() {
        // Prueba con un rango válido
        int aleatorio = Libreria.aleatorio(1, 10);
        assertTrue(aleatorio >= 1 && aleatorio <= 10);
        // Prueba con un rango de un solo número
        assertEquals(5, Libreria.aleatorio(5, 5));
        // Prueba con un rango inválido
        assertThrows(IllegalArgumentException.class, () -> Libreria.aleatorio(10, 1));
        // Prueba con un rango grande
        aleatorio = Libreria.aleatorio(1, 1000000);
        assertTrue(aleatorio >= 1 && aleatorio <= 1000000);
    }

    /**
     * Prueba adicional para el método factorial de la clase Libreria.
     * Se comprueba que el método devuelve el factorial correcto para varios números.
     */
    @Test
    public void testFactorial2() {
        // Prueba con un número grande
        assertEquals(479001600, Libreria.factorial(12));
        // Prueba con un número pequeño
        assertEquals(6, Libreria.factorial(3));
    }

    /**
     * Prueba adicional para el método invertir de la clase Libreria.
     * Se comprueba que el método devuelve la cadena invertida correctamente para varias cadenas.
     */
    @Test
    public void testInvertir2() {
        // Prueba con una cadena larga
        assertEquals("odnuM aloH", Libreria.invertir("Hola Mundo"));
        // Prueba con una cadena de varios caracteres iguales
        assertEquals("aaaaa", Libreria.invertir("aaaaa"));
    }

    /**
     * Prueba adicional para el método ordenar de la clase Libreria.
     * Se comprueba que el método ordena correctamente varios arrays.
     */
    @Test
    public void testOrdenar2() {
        // Prueba con un array de números negativos
        int[] array1 = {-3, -1, -4, -1, -5, -9, -2};
        Libreria.ordenar(array1);
        assertArrayEquals(new int[]{-9, -5, -4, -3, -2, -1, -1}, array1);
        // Prueba con un array de un solo número repetido
        int[] array2 = {5, 5, 5, 5, 5};
        Libreria.ordenar(array2);
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, array2);
    }

    /**
     * Prueba adicional para el método validarEmail de la clase Libreria.
     * Se comprueba que el método valida correctamente varias direcciones de correo electrónico.
     */
    @Test
    public void testValidarEmail2() {
        // Prueba con un email con un dominio de dos letras
        assertTrue(Libreria.validarEmail("usuario@example.co"));
        // Prueba con un email sin usuario
        assertFalse(Libreria.validarEmail("@example.com"));
    }

    /**
     * Prueba adicional para el método raizCuadrada de la clase Libreria.
     * Se comprueba que el método calcula correctamente la raíz cuadrada de varios números.
     */
    @Test
    public void testRaizCuadrada2() {
        // Prueba con un número pequeño
        assertEquals(0.5, Libreria.raizCuadrada(0.25), 0.0001);
        // Prueba con un número grande
        assertEquals(316.2278, Libreria.raizCuadrada(100000.0), 0.0001);
    }

    /**
     * Prueba adicional para el método aleatorio de la clase Libreria.
     * Se comprueba que el método genera un número aleatorio dentro del rango especificado.
     */
    @Test
    public void testAleatorio2() {
        // Prueba con un rango de números negativos
        int aleatorio = Libreria.aleatorio(-10, -1);
        assertTrue(aleatorio >= -10 && aleatorio <= -1);
        // Prueba con un rango que incluye números positivos y negativos
        aleatorio = Libreria.aleatorio(-5, 5);
        assertTrue(aleatorio >= -5 && aleatorio <= 5);
    }
}
