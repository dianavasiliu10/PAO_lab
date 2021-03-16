package problema4;

public class Patrat extends Dreptunghi {

    public Patrat(double l) {
        super(l, l);
    }

    public Patrat() {
        this(0.0);
    }

    @Override
    public double area() {
        return l1 * l1;
    }
}
