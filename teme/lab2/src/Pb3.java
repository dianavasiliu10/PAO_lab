/*
   Scrieti un program care verifica daca un numar este prim
   si o alta metoda care afiseaza toate numerele prime mai mici ca 50.
*/

public class Pb3 {
    public static boolean isPrime (int x) {
        if (x % 2 == 0 && x != 2) {
            return false;
        }
        for (int d = 3; d * d <= x; d += 2) {
            if (x % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pb3 () {
        System.out.println("Prime numbers less than 50:");

        for (int i = 2; i < 50; i++) {
            if (Pb3.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
