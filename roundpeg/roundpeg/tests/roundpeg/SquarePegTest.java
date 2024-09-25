package roundpeg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquarePegTest {
    @Test
    public void testThatSquarePegExist() {
        SquarePeg squarePeg = new SquarePeg(5);
    }

    @Test
    public void testToGetTheLengthAndWidthOfASquarePeg() {
        SquarePeg squarePeg = new SquarePeg(5);
        assertEquals(5, squarePeg.getWidth());
    }
}
