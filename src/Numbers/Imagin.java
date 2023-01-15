package Numbers;

public class Imagin extends Rational{
    private int y;
    public Imagin(int x, int y) {
        super(x);
        this.y=y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
