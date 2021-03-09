/*
   Scrieti un program care afiseaza toate numerele cuprinse intre 0 si n
   care sunt divizibile cu 5, dar nu si cu 10,
   unde n este citit de la tastatura.
*/

import java.util.Scanner;

public class Pb1 {

    public static void pb1 () {
        System.out.println("Numbers divisible by 5 but not by 10 less than n:");

        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();

        // Var 1
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Var 2
        for (int i = 5; i <= n; i+=10) {
            System.out.print(i + " ");
        }
    }
}
