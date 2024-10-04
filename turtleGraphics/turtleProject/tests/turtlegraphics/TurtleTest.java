package turtlegraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    public void test_To_Move_PenDown_And_Move_It_BackUp() {
        totois.movePenDown();
        assertFalse(totois.penIsUp());
        totois.movePenUp();
        assertTrue(totois.penIsUp());
    }
    @Test
    public void test_That_Turtle_Default_Position_Is_0_0() {
        totois.setPosition(0, 0);
        assertEquals("0,0", totois.getCurrentPosition());
    }

    @Test
    @DisplayName("test that turtle position is always 0, 0 and pen is up when initialized")
    public void test_That_Turtle_Position_Is_0_0() {
        assertEquals("0,0", totois.getCurrentPosition());
        assertTrue(totois.penIsUp());
    }

    @Test
    @DisplayName("test that there is a sketchpad with size 20")
    public void test_That_Turtle_Has_A_sketchpad() {
        SketchPad sketchPad = new SketchPad();
        assertEquals(20, sketchPad.getFloor().length);
    }

    @Test
    @DisplayName("test that turtle has sketchpad")
    public void test_that_turtle_has_a_sketchpad() {
        SketchPad sketchPad = totois.getSketchPad();
        assertEquals(20, sketchPad.getFloor().length);
    }
}
