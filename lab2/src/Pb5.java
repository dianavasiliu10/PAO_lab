/*
   Scrieti un program care calculeaza puterea intreaga a unui numar intreg
   si o metoda pentru afisarea rezultatului.
*/

import java.util.Scanner;

public class Pb5 {
    public static int power (int base, int pwr) {
//        return (int)Math.pow(base, pwr);
        if (base == 0 && pwr == 0) {
            System.out.println("Undefined");
            return -1;
        }
        int res = 1;
        while (pwr != 0) {
            res *= base;
            pwr--;
        }
        return res;
    }

    public static void pb5() {
        System.out.println("Let's calculate the power of a number:");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert base: ");
        int base = sc.nextInt();
        System.out.print("Insert power: ");
        int pwr = sc.nextInt();

        System.out.println("Result = " + power(base, pwr));
    }
}
