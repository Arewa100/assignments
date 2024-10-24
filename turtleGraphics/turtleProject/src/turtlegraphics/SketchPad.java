package turtlegraphics;

import java.util.Arrays;

public class SketchPad {
    private final String[][] floor = new String[50][50];

    public SketchPad() {
        for(String[] array : floor) {
            Arrays.fill(array, " ");
        }
    }
    public String[][] getFloor() {
        return floor;
    }

}
