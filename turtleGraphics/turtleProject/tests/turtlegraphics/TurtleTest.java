package turtlegraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;

import java.util.Arrays;

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
        SketchPad totoisSketchPad = totois.getSketchPad();
        assertEquals(20, totoisSketchPad.getFloor().length);
    }

    @Test
    @DisplayName("test that the array floor owned by the turtle is initialized to null")
    public void test_that_turtle_floor_is_initialised_to_null() {
        SketchPad totoisSketchPad = totois.getSketchPad();
        for(String[] sketchPad: totoisSketchPad.getFloor()) {
            assertEquals("[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(sketchPad));
        }

    }
    @Test
    @DisplayName("test that turtle is facing east by default")
    public void test_that_turtle_is_facing_east_by_default() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
    }

    @Test
    @DisplayName("test to turn turtle right and it should face south")
    public void test_that_turtle_right_and_it_should_face_South() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
    }

    @Test
    @DisplayName("test to turn to right twice and it will be facing WEST")
    public void test_To_Turn_Right_And_West() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
    }
    @Test
    @DisplayName("test to turn to right three times and it will be facing NORTH")
    public void test_To_Turn_Right_Three_Times() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
    }

    @Test
    @DisplayName("test to turn to right four times and it will be facing EAST")
    public void test_To_Turn_Right_Four_Times() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
        totois.turnRight();
        assertEquals(Coordinate.EAST, totois.getCoordinate());
    }

    @Test
    @DisplayName("test that turtle can turn left and the coordinate should be pointing north")
    public void test_That_Module_Can_Turn_Left() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
    }
    @Test
    @DisplayName("test that turtle can turn left when it is north and the coordinate will be pointing West")
    public void test_That_Turtle_Can_Turn_Left_When_It_Is_North_And_Coordinate_Should_Be_West() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
    }
    @Test
    @DisplayName("test that turtle can turn left when it is West and the coordinate will be pointing South")
    public void test_That_Turtle_Can_Turn_Left_When_It_Is_West_And_Coordinate_Should_Be_South() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
    }

    @Test
    @DisplayName("test that turtle can turn left when it is South and the coordinate will be pointing East")
    public void test_That_Turtle_Can_Turn_Left_When_It_Is_South_And_Coordinate_Should_Be_East() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.NORTH, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.WEST, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
        totois.turnLeft();
        assertEquals(Coordinate.EAST, totois.getCoordinate());
    }

    @Test
    @DisplayName("test that turtle can draw a straight line")
    public void test_That_Turtle_Can_Draw_A_Straight_Line() {
        assertEquals(Coordinate.EAST, totois.getCoordinate());
        totois.movePenDown();
        assertEquals("0,0", totois.getCurrentPosition());
        totois.draw(10);
        totois.draw(4);
        String [][] sketchPad= totois.getSketchPad().getFloor();
        assertEquals("[*, *, *, *, *, *, *, *, *, *, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(sketchPad[0]));;

    }
    @Test
    @DisplayName("test that turtle can start from any where and draw a straight line")
    public void test_That_Turtle_Can_Start_From_Anywhere() {
        assertEquals("0,0", totois.getCurrentPosition());
        totois.setPosition(2, 6);
        totois.movePenDown();
        totois.draw(4);
        String [][] sketchPad= totois.getSketchPad().getFloor();
        assertEquals("[null, null, null, null, null, null, *, *, *, *, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(sketchPad[2]));
    }

    @Test
    @DisplayName("test That_Turtle_Can_Draw_Only_When_Pen_Is_Down")
    public void test_That_Turtle_Can_Draw_Only_When_Pen_Is_Down() {
        assertEquals("0,0", totois.getCurrentPosition());
        totois.setPosition(2, 6);
        totois.draw(4);
        String [][] sketchPad= totois.getSketchPad().getFloor();
        assertEquals("[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(sketchPad[2]));
        totois.movePenDown();
        totois.draw(4);
        assertEquals("[null, null, null, null, null, null, *, *, *, *, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(sketchPad[2]));

    }

    @Test
    @DisplayName("test that turtle can draw when it turns right")
    public void test_That_Turtle_Can_Draw_When_Turns_Right() {
        assertEquals("0,0", totois.getCurrentPosition());
        totois.setPosition(2, 6);
        totois.turnRight();
        totois.movePenDown();
        totois.draw(10);
        assertEquals(Coordinate.SOUTH, totois.getCoordinate());
        SketchPad turtleSketchPad = totois.getSketchPad();
        for(String[] sketchPad: turtleSketchPad.getFloor()) {
            System.out.println(Arrays.toString(sketchPad));
        }
    }
    @Test
    @DisplayName("test to draw a straight line and then a vertical line from the end of that straight line")
    public void test_To_Draw_A_Straight_Line_And_The_Vertical_Line() {
        assertEquals("0,0", totois.getCurrentPosition());
        totois.setPosition(3, 5);
        totois.movePenDown();
        totois.draw(10);
        totois.turnRight();
        totois.draw(4);
        SketchPad turtleSketchPad = totois.getSketchPad();
        for(String[] sketchPad: turtleSketchPad.getFloor()) {
            System.out.println(Arrays.toString(sketchPad));
        }
    }



}
