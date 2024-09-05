package guitar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GuitarTest {
    private Guitar guitar;

    @BeforeEach
    public void setTup() {
        guitar = new Guitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
    }
    @Test
    public void testThatAGuitarExists() {
        Guitar guitar = new Guitar("123", 2000, "fender", "stratocaster", "electric", "backwood", "topwood");
    }
    @Test
    public void testThatPriceCannotBeInitializedToANegativePrice() {
        assertThrows(IllegalArgumentException.class, ()-> new Guitar("123", -2000, "fender", "stratocaster", "electric", "backwood", "topwood"));
    }
    @Test
    public void testThatPriceIsZero() {
        Guitar guitar = new Guitar("123", 0, "fender", "stratocaster", "electric", "backwood", "topwood");
        assertEquals(0, guitar.getPrice());
    }
    @Test
    public void testToAddPriceOfGuitarAs_2k_AndGet_4k() {
        guitar.setPrice(2000);
        assertEquals(4000, guitar.getPrice());
    }
    @Test
    public void testToAddANegativePriceAndPriceShouldBeMaintained() {
        guitar.setPrice(-2000);
        assertEquals(2000, guitar.getPrice());
    }
    @Test
    public void testToCreateGuitarFromItsConstructor() {
        assertEquals(2000, guitar.getPrice());
    }
    @Test
    public void testToGetBuilderOfGuitar() {
        assertEquals("fender", guitar.getBuilder());
    }
    @Test
    public void testToGetGuitarModel() {
        assertEquals("stratocaster", guitar.getModel());
    }
    @Test
    public void testToGetGuitarType(){
        assertEquals("electric", guitar.getType());
    }
    @Test
    public void testToGetBackWood() {
        assertEquals("backwood", guitar.getBackWood());
    }
    @Test
    public void testToGetTopWood() {
        assertEquals("topwood", guitar.getTopWood());
    }
}