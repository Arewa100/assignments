package turtlegraphics;

import java.util.Arrays;

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
        if(turtleCoordinate == Coordinate.WEST) {
            turtleCoordinate = Coordinate.SOUTH;
        }else if(turtleCoordinate == Coordinate.NORTH) {
            turtleCoordinate = Coordinate.WEST;
        }else if(turtleCoordinate == Coordinate.EAST) {
            turtleCoordinate = Coordinate.NORTH;
        }else if(turtleCoordinate == Coordinate.SOUTH) {
            turtleCoordinate = Coordinate.EAST;
        }
    }

    public void draw(int steps) {
      if (!pen.penIsUp()) {
          drawOnSketchPad(steps);
        }
    }

    private void drawOnSketchPad(int steps) {
        coordinateIsEast(steps);
        coordinateIsSouth(steps);
    }

    private void coordinateIsEast(int steps) {
        int count = 1;
        int row = position.getRow();
        int start = position.getColumn();
        if(turtlePositionIsEast()) {
            for (int theColumn = start; theColumn < sketchPad.getFloor()[row].length; theColumn++) {
                if (count <= steps) {
                    sketchPad.getFloor()[row][theColumn] = "*";
                }
                count = count + 1;
            }
            trackPositionWhenEast(steps);
        }
    }

    private void coordinateIsSouth(int steps) {
        if (turtlePositionIsSouth()) {
            int count = 1;
            int nextRow = position.getRow() + 1;
            int start = position.getColumn();
            if (turtlePositionIsSouth()) {
                for (int theColumn = 0; theColumn < sketchPad.getFloor()[start].length; theColumn++) {
                    if (count <= steps) {
                        sketchPad.getFloor()[nextRow][start] = "*";
                    }
                    nextRow = nextRow + 1;
                    count = count + 1;
                }
            }
        }
    }

    private void trackPositionWhenEast(int steps) {
        int row = position.getRow();
        int start = position.getColumn();
        setPosition(row, start + (steps - 1)); ///this is where  i am
    }

    private boolean turtlePositionIsSouth() {
        return Coordinate.SOUTH.equals(turtleCoordinate);
    }

    private boolean turtlePositionIsNorth() {
        return Coordinate.NORTH.equals(turtleCoordinate);
    }
    private boolean turtlePositionIsEast() {
        return Coordinate.EAST.equals(turtleCoordinate);
    }
}
