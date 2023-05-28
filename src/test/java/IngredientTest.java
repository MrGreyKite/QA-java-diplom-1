import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    Ingredient realIngredient = new Ingredient(IngredientType.FILLING, "chicken", 3.5f);

    /*
    @Test
    public void testGetNameWithMock(){
        when(ingredient.getName()).thenReturn("spice sauce");
        assertEquals("spice sauce", ingredient.getName());
    }

    @Test
    public void testGetPriceWithMock() {
        when(ingredient.getPrice()).thenReturn(2.00f);
        assertEquals(2.00f, ingredient.getPrice(), 0.00f);
    }*/

    @Test
    public void testGetRealName() {
        assertEquals("chicken", realIngredient.getName());
    }

    @Test
    public void testGetRealPrice() {
        assertEquals(3.5f, realIngredient.getPrice(), 0.000f);
    }
}
