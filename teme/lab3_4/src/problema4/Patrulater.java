package problema4;

class Patrulater {

    protected double l1, l2, l3, l4;
    protected double diag1, diag2;

    public Patrulater(double lung1, double lung2, double lung3, double lung4,
                      double d1, double d2) {
        l1 = lung1;
        l2 = lung2;
        l3 = lung3;
        l4 = lung4;
        diag1 = d1;
        diag2 = d2;
    }

    protected Patrulater(double lung1, double lung2) {
        l1 = lung1;
        l2 = lung2;
        l3 = lung1;
        l4 = lung2;
    }

    public Patrulater() {
        this(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

}
