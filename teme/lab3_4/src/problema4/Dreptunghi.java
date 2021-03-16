package problema4;

public class Dreptunghi extends Paralelogram {

    public Dreptunghi(double lungime, double latime) {
        super(lungime, latime);
    }

    public Dreptunghi() {
        this(0.0, 0.0);
    }

    @Override
    public double area() {
        return l1 * l2;
    }
}



