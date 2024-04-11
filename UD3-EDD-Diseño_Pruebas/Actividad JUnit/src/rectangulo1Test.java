package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rectangulo1Test {

    @Test
    void test() {
        rectangulo1 r = new rectangulo1(3, 4);
        assertAll(
                () -> assertEquals(12, r.area()),
                () -> assertEquals(15, r.perimetro())
        );
    }

}