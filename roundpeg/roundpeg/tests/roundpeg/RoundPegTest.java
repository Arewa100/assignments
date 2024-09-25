package roundpeg;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundPegTest {
    @Test
    public void testThatRoundPegExists() {
        RoundPeg roundPeg = new RoundPeg(10);
    }

    @Test
    @DisplayName("test to get the radius of the round peg")
    public void testToGetTheRadiusOfTheRoundPeg() {
        RoundPeg roundPeg = new RoundPeg(10);
        assertEquals(10, roundPeg.getRadius());
    }
}
