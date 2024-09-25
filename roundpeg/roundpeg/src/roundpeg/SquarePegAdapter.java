package roundpeg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg, int size) {
        super(size);
        this.squarePeg = squarePeg;
    }


}
