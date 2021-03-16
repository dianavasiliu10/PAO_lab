package problema4;

public class Paralelogram extends Patrulater {

    private double h;

    public Paralelogram(double lungime, double latime, double d1, double d2) {
        super(lungime, latime, lungime, latime, d1, d2);
    }

    public Paralelogram(double lungime, double latime) {
        super(lungime, latime);
    }

    public Paralelogram(double lungime, double latime, double inaltime) {
        super(lungime, latime);
        h = inaltime;
    }

    public Paralelogram() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public double area() {
        if (l1 > l2) {
            return l1 * h;
        }
        else {
            return l2 * h;
        }
    }

}
