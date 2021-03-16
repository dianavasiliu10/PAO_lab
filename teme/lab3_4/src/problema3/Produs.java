package problema3;

class Produs {

    private final String nume;
    private final double pret;
    private final int cantitate;

    public Produs(String n, double p, int c) {
        nume = n;
        pret = p;
        cantitate = c;
    }

    public Produs() {
        this("Noname", 0.0, 0);
    }

    @Override
    public String toString() {
        return "Produs " +
                "'" + nume + "' " +
                pret + " " +
                cantitate;
    }

    public double getTotalProdus() {
        return this.cantitate * this.pret;
    }
}
