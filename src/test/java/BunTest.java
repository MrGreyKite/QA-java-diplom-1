import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    Bun realBun = new Bun("corn", 2.0f);

    /*
    @Test
    public void testGetNameWithMock() {
        when(bun.getName()).thenReturn("sesame");
        assertEquals("sesame", bun.getName());
    }

    @Test
    public void testGetPriceWithMock() {
        when(bun.getPrice()).thenReturn(1.5f);
        assertEquals(1.5f, bun.getPrice(), 0.000f);
    }*/

    @Test
    public void testRealBunPrice() {
        assertEquals(2.0f, realBun.getPrice(), 0.000f);
    }

    @Test
    public void testRealBunName() {
        assertEquals("corn", realBun.getName());
    }
}
