import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IngredientTypeTest {

    @Parameterized.Parameter(0)
    public IngredientType ingredientType;

    @Parameterized.Parameter(1)
    public String name;

    @Parameterized.Parameter(2)
    public float price;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {IngredientType.SAUCE, "test sauce", 1.0f},
                {IngredientType.FILLING, "test filling", 2.0f}
        });
    }

    @Test
    public void testIngredientCreation() {
            Ingredient ingredient = new Ingredient(ingredientType, name, price);
            assertEquals(ingredientType, ingredient.getType());
            assertEquals(ingredientType.name(), ingredient.getType().name());
    }

    @Test(expected = Exception.class)
    public void testConstructorWithInvalidType() {
        new Ingredient(IngredientType.valueOf("INVALID_TYPE"), name, price);
    }

}
