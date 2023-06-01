import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    Bun someBun = new Bun("corn", 2.0f);

    @Test
    public void testRealBunPrice() {
        assertEquals(2.0f, someBun.getPrice(), 0.000f);
    }

    @Test
    public void testRealBunName() {
        assertEquals("corn", someBun.getName());
    }
}
