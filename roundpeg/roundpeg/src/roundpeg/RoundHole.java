package roundpeg;

public class RoundHole {
    private int radius;


    public RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public boolean fit(RoundPeg roundPeg) {
        if(roundPeg.getRadius() == this.radius) return true;
        else throw new IllegalArgumentException("RoundPeg does not fit into the round hole");
    }
}
