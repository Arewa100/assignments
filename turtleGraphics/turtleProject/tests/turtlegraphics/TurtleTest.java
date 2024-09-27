package turtlegraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {
    private Turtle totois;

    @BeforeEach
    public void setUp() {
        totois = new Turtle();
        totois.createPen("biro");
    }

    @Test
    public void test_To_Assert_That_turtle_Has_Been_Created() {
        Turtle totois = new Turtle();
    }
    @Test
    public void test_That_turtle_Has_A_Pen() {
        totois.createPen("biro");
        assertNotNull(totois.getPen());
    }
    @Test
    public void test_That_Turtle_Pen_Is_Up() {
        assertTrue(totois.penIsUp());
    }
    @Test
    public void test_To_Move_Pen_Down_Pen_Is_Up_Should_Return_False() {
        assertTrue(totois.penIsUp());
        totois.movePenDown();
        assertFalse(totois.penIsUp());
    }
}
