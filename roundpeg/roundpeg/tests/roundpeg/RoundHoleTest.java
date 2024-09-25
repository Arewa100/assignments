package roundpeg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoundHoleTest {
    @Test
    public void testThatRoundHoleExists() {
        RoundHole roundhole = new RoundHole(10);
    }
    @Test
    public void testThatWeCanInitializeTheRadiusOfTheRoundHole() {
        RoundHole roundhole = new RoundHole(10);
    }
    @Test
    public void testToGetTheRadiusOfTheRoundHole() {
        RoundHole roundhole = new RoundHole(10);
        assertEquals(10, roundhole.getRadius());
    }

    @Test
    public void testThatRoundHoleCanCompareTheRadiusOfARoundPegAndItsRadius() {
        RoundHole roundhole = new RoundHole(10);
        assertEquals(10, roundhole.getRadius());
        RoundPeg roundPeg = new RoundPeg(10);
        assertTrue(roundhole.fit(roundPeg));
    }
    @Test
    public void testThatRoundHoleThrowsExceptionWhenRoundPegDoesNotFitIn() {
        RoundHole roundHole = new RoundHole(20);
        assertEquals(20, roundHole.getRadius());
        RoundPeg roundPeg = new RoundPeg(10);
        assertThrows(IllegalArgumentException.class, ()-> roundHole.fit(roundPeg));
    }
    @Test
    public void testThatSquarePegCannotFitIntoRoundHole() {
        RoundHole roundHole = new RoundHole(10);
        assertEquals(10, roundHole.getRadius());
        RoundPeg roundPeg = new RoundPeg(10);
        assertTrue(roundHole.fit(roundPeg));
        SquarePeg squarePeg = new SquarePeg(10);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg, 10);
        assertTrue(roundHole.fit(squarePegAdapter));
    }
}
