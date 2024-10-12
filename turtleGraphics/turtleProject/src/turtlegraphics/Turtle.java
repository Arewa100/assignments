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
        coordinateIsWest(steps);
        coordinateIsNorth(steps);
    }

    private void coordinateIsEast(int steps) {
        drawWhenEast(steps);
    }

    private void coordinateIsSouth(int steps) {
        if (turtlePositionIsSouth()) drawWhenSouth(steps);
    }

    private void coordinateIsWest(int steps) {
        if(turtlePositionIsWest()) drawWhenWest(steps);
    }

    private void coordinateIsNorth(int steps) {
        if(turtlePositionIsNorth()) drawWhenNorth(steps);
    }

    private void trackPositionWhenEast(int steps) {
        int row = position.getRow();
        int column = position.getColumn();
        setPosition(row, column + (steps - 1));
    }

    private void trackPositionWhenSouth(int steps) {
        int row = position.getRow();
        int column = position.getColumn();
        setPosition(row + steps, column);
    }

    private void trackPositionWhenWest(int column) {
        int row = position.getRow();
        setPosition(row, column);
    }

    private void trackPositionWhenNorth(int row, int column) {
        setPosition(row-1, column);
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

    private boolean turtlePositionIsWest() {
        return Coordinate.WEST.equals(turtleCoordinate);
    }

    private void drawWhenSouth(int steps) {
        int count = 1;
        int nextRow = position.getRow() + 1;
        int start = position.getColumn();
        if (turtlePositionIsSouth()) {
            for (int theColumn = 0; theColumn < sketchPad.getFloor()[start].length; theColumn++) {
                if (count <= steps) sketchPad.getFloor()[nextRow][start] = "*";
                nextRow = nextRow + 1;
                count = count + 1;
            }
            trackPositionWhenSouth(steps);
        }
    }
    private void drawWhenWest(int steps)  {
        int count = 1;
        int newStart = 0;
        int nextRow = position.getRow() + 1;
        int start = position.getColumn();
        if (turtlePositionIsWest()) {
            for (int theColumn = sketchPad.getFloor()[start].length - 1; theColumn >= 0; theColumn--) {
                if (count <= steps) {
                    sketchPad.getFloor()[nextRow][start] = "*";
                    newStart = start;
                }
                start = start - 1;
                count = count + 1;
            }
            trackPositionWhenWest(newStart);
        }
    }
    private void drawWhenEast(int steps) {
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
    private void drawWhenNorth(int steps) {
        int count = 1;
        int newRowValue = 0;
        int nextRow = position.getRow();
        int start = position.getColumn();
        if (turtlePositionIsNorth()) {
            for (int theColumn = 0; theColumn < sketchPad.getFloor()[start].length; theColumn++) {
                if (count <= steps) {
                    sketchPad.getFloor()[nextRow][start] = "*";
                    newRowValue = nextRow;
                }
                nextRow = nextRow - 1;
                count = count + 1;
            }
            trackPositionWhenNorth(newRowValue, start);
        }
    }
}
