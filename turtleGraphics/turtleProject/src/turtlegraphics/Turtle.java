package turtlegraphics;

public class Turtle {
    private Pen pen;
    private int row;
    private int column;

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

    public void position(int row, int column) {
        this.row = row;
        this.column = column;
        floor.position(row, column);
    }
}
