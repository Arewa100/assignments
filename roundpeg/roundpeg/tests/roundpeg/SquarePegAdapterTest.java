package roundpeg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquarePegAdapterTest {
    @Test
    public void testThatSquarePegAdapterExists() {
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg, 5);
    }
    @Test
    public void testThatAdapterCanConvertSquareHoleToRoundHole() {
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg, 5);
        assertEquals(5, squarePegAdapter.getRadius());
    }
}
