/*
   Scrieti un program care citeste 3 numere de la tastatura si le compara,
   afisand relatia dintre ele.
*/

import java.util.Scanner;

public class Pb2 {
    public static void pb2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let's compare three numbers:");

        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();
        System.out.print("c=");
        int c = sc.nextInt();

        if (a < b) {
            if (a < c) {
                if (b < c) {
                    System.out.println("a < b < c");
                }
                else if (c < b) {
                    System.out.println("a < c < b");
                }
                else {
                    System.out.println("a < b = c");
                }
            }
            else if (c < a){
                System.out.println("c < a < b");
            }
            else {
                System.out.println("a = c < b");
            }
        }
        else if (b < a) {
            if (a < c) {
                System.out.println("b < a < c");
            }
            else if (c < a){
                if (b < c) {
                    System.out.println("b < c < a");
                }
                else if (c < b){
                    System.out.println("c < b < a");
                }
                else {
                    System.out.println("b = c < a");
                }
            }
            else {
                System.out.println("b < a = c");
            }
        }
        else {
            if (a < c) {
                System.out.println("a = b < c");
            }
            else if (c < a) {
                System.out.println("c < a = b");
            }
            else {
                System.out.println("a = b = c");
            }
        }
    }
}
