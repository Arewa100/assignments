package turtlegraphics;

public class Turtle {
    private Pen pen;
    private Position position;
    private final SketchPad sketchPad = new SketchPad();
    private Coordinate turtleCoordinate;

    public Turtle() {
        position = new Position(0,0);
        turtleCoordinate = Coordinate.EAST;
    }
    public void createPen(String penName) {
        pen = new Pen(penName);
    }
    public Pen getPen() {
        return pen;
    }

    public boolean penIsUp() {
        return pen.penIsUp();
    }

    public void movePenDown() {
        pen.movePenDown();
    }

    public void movePenUp() {
        pen.movePenUp();
    }

    public void setPosition(int row, int column) {
        position = new Position(row, column);
    }

    public String getCurrentPosition() {
        return position.getPosition();
    }

    public SketchPad getSketchPad() {
        return sketchPad;
    }

    public Coordinate getCoordinate() {
        return turtleCoordinate;
    }

    public void turnRight() {
        if(turtleCoordinate == Coordinate.WEST) {
            turtleCoordinate = Coordinate.NORTH;
        }else if(turtleCoordinate == Coordinate.SOUTH) {
            turtleCoordinate = Coordinate.WEST;
        }else if(turtleCoordinate == Coordinate.EAST) {
            turtleCoordinate = Coordinate.SOUTH;
        }else if(turtleCoordinate == Coordinate.NORTH) {
            turtleCoordinate = Coordinate.EAST;
        }

    }

    public void turnLeft() {
        if(turtleCoordinate == Coordinate.NORTH) turtleCoordinate = Coordinate.WEST;
        if(turtleCoordinate == Coordinate.EAST) turtleCoordinate = Coordinate.NORTH;
        if(turtleCoordinate == Coordinate.WEST) turtleCoordinate = Coordinate.SOUTH;
    }
}
