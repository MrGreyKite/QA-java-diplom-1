import org.junit.Test;
import org.mockito.Spy;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    @Spy
    private Database database = new Database();

    @Test
    public void testAvailableBuns() {
        List<Bun> buns = database.availableBuns();
        assertEquals(3, buns.size());
    }

    @Test
    public void testAvailableIngredients() {
        List<Ingredient> ingredients = database.availableIngredients();
        assertEquals(6, ingredients.size());
    }
}
