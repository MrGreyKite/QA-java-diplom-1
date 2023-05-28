import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    private Burger burger;

    @Before
    public void setUp() {
        burger = new Burger();
        burger.setBuns(bun);
    }

    @Test
    public void testAddIngredient() {
        burger.addIngredient(ingredient);
        assertEquals(1, burger.ingredients.size());
        assertEquals(ingredient, burger.ingredients.get(0));
    }

    @Test
    public void testRemoveIngredient() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void testMoveIngredient() {
        Ingredient ingredient1 = mock(Ingredient.class);
        Ingredient ingredient2 = mock(Ingredient.class);
        Ingredient ingredient3 = mock(Ingredient.class);
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.addIngredient(ingredient3);
        burger.moveIngredient(0, 2);
        assertEquals(ingredient2, burger.ingredients.get(0));
        assertEquals(ingredient3, burger.ingredients.get(1));
        assertEquals(ingredient1, burger.ingredients.get(2));
    }

    @Test
    public void testGetPrice() {
        when(bun.getPrice()).thenReturn(2.0f);
        when(ingredient.getPrice()).thenReturn(1.0f);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        assertEquals(6.0f, burger.getPrice(), 0.0f);
    }

    @Test
    public void testGetReceipt() {
        when(bun.getName()).thenReturn("Corn bun");
        when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        when(ingredient.getName()).thenReturn("Cheese");
        when(bun.getPrice()).thenReturn(2.0f);
        when(ingredient.getPrice()).thenReturn(1.0f);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        String expectedReceipt = "(==== Corn bun ====)\n" +
                "= filling Cheese =\n" +
                "= filling Cheese =\n" +
                "(==== Corn bun ====)\n" +
                "\n" +
                "Price: 6,000000\n";
        expectedReceipt = expectedReceipt.replaceAll("\n", System.lineSeparator());
        assertEquals(expectedReceipt, burger.getReceipt());
    }

}
