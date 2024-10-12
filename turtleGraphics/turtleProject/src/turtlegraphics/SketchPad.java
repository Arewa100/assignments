package turtlegraphics;

import java.util.Arrays;

public class SketchPad {
    private final String[][] floor = new String[20][20];
    private Turtle turtle;

    public SketchPad() {
        for(String[] array : floor) {
            Arrays.fill(array, " ");
        }
    }
    public String[][] getFloor() {
        return floor;
    }

    public Turtle getTurtle() {
        return turtle;
    }

}
