import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    Ingredient someIngredient = new Ingredient(IngredientType.FILLING, "chicken", 3.5f);

    @Test
    public void testGetRealName() {
        assertEquals("chicken", someIngredient.getName());
    }

    @Test
    public void testGetRealPrice() {
        assertEquals(3.5f, someIngredient.getPrice(), 0.000f);
    }
}
