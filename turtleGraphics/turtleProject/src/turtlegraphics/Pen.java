package turtlegraphics;

public class Pen {
    private final String penName;
    private boolean penIsUp = true;

    public Pen(String penName) {
        this.penName = penName;
    }

    public boolean penIsUp() {
        return penIsUp;
    }

    public void movePenDown() {
        penIsUp = false;
    }

    public void movePenUp() {
        penIsUp = true;
    }
}
