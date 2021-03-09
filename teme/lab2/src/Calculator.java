/*
    Se dau doua numere si o operatie.
    Sa se afiseze rezultatul aplicarii operatiei celor doi termeni.
*/

import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        System.out.println("Calculator!");

        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        int value1 = sc.nextInt();
        System.out.print("Second number: ");
        int value2 = sc.nextInt();
        System.out.print("Operation: ");
        String operation = sc.next();

        switch (operation) {
            case "sum":
            case "plus":
            case "+":
                System.out.println("Result = " + (value1 + value2));
                break;
            case "diff":
            case "difference":
            case "minus":
            case "-":
                System.out.println("Result = " + (value1 - value2));
                break;
            case "mult":
            case "multiply":
            case "*":
                System.out.println("Result = " + (value1 * value2));
                break;
            case "div":
            case "divide":
            case "/":
                System.out.println("Result = " + (value1 / value2));
                break;
            default:
                System.out.println("Undefined operation");
        }
    }
}
