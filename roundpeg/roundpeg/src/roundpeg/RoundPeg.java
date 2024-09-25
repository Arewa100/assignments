package roundpeg;

public class RoundPeg {
    private int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    @Override
    public String toString() {
       return String.format("%d", radius);
    }
}
