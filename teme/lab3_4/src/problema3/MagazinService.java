package problema3;

class MagazinService {

    public static void addProduct(Produs p) {
        Magazin.produse.add(p);
        System.out.println("Adaugat: " + p.toString());
    }
}
