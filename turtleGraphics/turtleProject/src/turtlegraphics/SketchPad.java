package turtlegraphics;

public class SketchPad {
    private final int[][] floor = new int[20][20];
    private Turtle turtle;

    public int[][] getFloor() {
        return floor;
    }

    public Turtle getTurtle() {
        return turtle;
    }
}
