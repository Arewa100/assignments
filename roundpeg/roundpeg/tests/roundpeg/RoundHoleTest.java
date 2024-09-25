package roundpeg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
