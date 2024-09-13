package guitar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryTest {
    Inventory inventory;
    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
    }
    @Test
    public void testThatInventoryExists() {
        Inventory inventory = new Inventory();
    }
    @Test
    public void testThatInventoryCanAddGuitarToInventory() {
        inventory.addGuitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
        assertEquals(1, inventory.guitarCount());

    }
    @Test
    public void testToAddMoreGuitarToInventory() {
        inventory.addGuitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
        inventory.addGuitar("143", 2000, "fender", "stratocaster", "acoustic", "backwood", "topwood");
        assertEquals(2, inventory.guitarCount());
    }
    @Test
    public void testToGetGuitarBySerialNumber() {
       inventory.addGuitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
       Guitar guitar = inventory.getGuitar("123");
       assertEquals("stratocaster", guitar.getModel());
    }
    @Test
    public void testToAddMoreGuitarsAndGetTheirModels() {
        inventory.addGuitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
        inventory.addGuitar("124", 2000, "fender", "cooper", "electric", "backwood", "topwood");
        inventory.addGuitar("125", 2000, "fender", "leecopper", "electric", "backwood", "topwood");
        assertEquals(3, inventory.guitarCount());
        assertEquals("stratocaster", inventory.getGuitar("123").getModel());
        assertEquals("cooper", inventory.getGuitar("124").getModel());
        assertEquals("leecopper", inventory.getGuitar("125").getModel());
    }
    @Test
    public void testToSearchGuitarByPassingInAGuitar() {
        inventory.addGuitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
        inventory.addGuitar("124", 2000, "fender", "cooper", "electric", "backwood", "topwood");
        inventory.addGuitar("125", 2000, "fender", "leecopper", "electric", "backwood", "topwood");
        Guitar guitar = new Guitar("125", 2000, "fender", "leecopper", "electric", "backwood", "topwood");
        assertEquals(guitar.toString(), inventory.searchGuitar(guitar).toString());
        System.out.print("first guitar Object: " + guitar.toString() + "\n");
        System.out.print("second guitar object: " + inventory.searchGuitar(guitar).toString());

    }
}