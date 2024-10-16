package turtlegraphics;

import java.util.Arrays;

public class SketchPad {
    private final String[][] floor = new String[40][40];

    public SketchPad() {
        for(String[] array : floor) {
            Arrays.fill(array, " ");
        }
    }
    public String[][] getFloor() {
        return floor;
    }

}
