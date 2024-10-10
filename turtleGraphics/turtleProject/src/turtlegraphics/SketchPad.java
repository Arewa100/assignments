package turtlegraphics;

public class SketchPad {
    private final String[][] floor = new String[20][20];
    private Turtle turtle;

    public String[][] getFloor() {
        return floor;
    }

    public Turtle getTurtle() {
        return turtle;
    }
}
