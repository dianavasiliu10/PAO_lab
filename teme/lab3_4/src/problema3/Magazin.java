package problema3;

import java.util.ArrayList;
import java.util.List;

class Magazin {

    private final String nume;
    public static List<Produs> produse;

    public static void main(String[] args) {
        Magazin magazin = new Magazin("John's Shop",
                new Produs("Mancare pentru catei", 43.4, 11),
                new Produs("Mancare pentru pisici", 39.2, 12),
                new Produs());

        System.out.println(magazin);

        System.out.println(magazin.getTotalMagazin());

        MagazinService.addProduct(new Produs("Hrana pentru papagali", 10.0, 10));

        System.out.println(magazin);
        System.out.println(magazin.getTotalMagazin());
    }

    public Magazin(String n, Produs p1, Produs p2, Produs p3) {
        nume = n;
        produse = new ArrayList<>();
        produse.add(p1);
        produse.add(p2);
        produse.add(p3);
    }

    public Magazin() {
        this("Noname", new Produs(), new Produs(), new Produs());
    }

    @Override
    public String toString() {
        String magazin = "Magazin " + "'" + nume + "'\n";
        for (Produs produs : produse) {
            magazin += "\t" + produs.toString() + "\n";
        }
        return magazin;
    }

    public double getTotalMagazin() {
        double sum = 0;
        for (Produs produs : produse) {
            sum += produs.getTotalProdus();
        }
        return sum;
    }
}
