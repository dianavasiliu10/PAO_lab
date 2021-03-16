package problema4;

public class Romb extends Paralelogram {

    public Romb(double lungime, double d1, double d2) {
        super(lungime, lungime, d1, d2);
    }

    public Romb() {
        this(0.0, 0.0, 0.0);
    }

    @Override
    public double area() {
        return diag1 * diag2 / 2;
    }
}
