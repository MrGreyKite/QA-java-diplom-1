import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    float bunPrice = 2.0f;
    String bunName = "corn";
    Bun someBun = new Bun(bunName, bunPrice);

    @Test
    public void testRealBunPrice() {
        assertEquals(bunPrice, someBun.getPrice(), 0.000f);
    }

    @Test
    public void testRealBunName() {
        assertEquals(bunName, someBun.getName());
    }
}
