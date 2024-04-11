import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MayorTest {

    @Test
    void mayor() {

        int mayorUltimo = Mayor.Mayor(3, 4);
        assertEquals (4, mayorUltimo);

        int mayorPrimero  = Mayor.Mayor (4,3);
        assertEquals(4,mayorPrimero);

        int mayorNegativos = Mayor.Mayor(-3, -4);
        assertEquals(-3,mayorNegativos);
    }

    @Test
    void esMayor() {
        assertTrue(Mayor.EsMayor(4,3));
        assertTrue(Mayor.EsMayor(-3,-4));
        assertFalse(Mayor.EsMayor(3,4));
        assertFalse(Mayor.EsMayor(4,4));
        assertFalse(Mayor.EsMayor(-4,-3));
    }
}