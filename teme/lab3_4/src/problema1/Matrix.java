package problema1;

import java.util.Random;
import java.util.Scanner;

class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n, m;
        double[][] mat;

        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("m = ");
        m = sc.nextInt();

        mat = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = rand.nextDouble();
//                System.out.print(mat[i][j] + " ");
            }
//            System.out.println();
        }

        System.out.println(calculateSum(mat));
    }

    public static double calculateSum(double[][] mat){
        double sum = 0;
        for (double[] line : mat) {
            for (double element : line) {
                sum += element;
            }
        }

        return sum;
    }

}
