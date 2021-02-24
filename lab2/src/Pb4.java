/*
   Scrieti un program care citeste de la tastaura numere pana cand primeste -1.
   Sa se afiseze media aritmetica a tuturor numerelor citite.
*/

import java.util.Scanner;

public class Pb4 {
    public static void pb4() {
        System.out.println("Insert numbers to calculate their average (-1 stops inserting)");

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double sum = 0;
        int count = 0;

        while (number != -1) {
            sum += number;
            count++;
            number = sc.nextDouble();
        }

        if (count == 0) {
            System.out.println("No numbers inserted");
        }
        else {
            System.out.println("Average: " + sum / count);
        }
    }
}
