import java.util.Scanner;

public class Task8_7_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[3][3];
        System.out.println("Enter 9 integers for a 3x3 matrix (row by row):");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) m[i][j] = in.nextInt();

        System.out.println("\nMatrix:");
        for (int[] row : m) {
            for (int v : row) System.out.printf("%5d", v);
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            int rs = 0;
            for (int j = 0; j < 3; j++) rs += m[i][j];
            System.out.println("Sum of row " + (i + 1) + "    : " + rs);
        }
        for (int j = 0; j < 3; j++) {
            int cs = 0;
            for (int i = 0; i < 3; i++) cs += m[i][j];
            System.out.println("Sum of column " + (j + 1) + " : " + cs);
        }
        int diag = 0;
        for (int i = 0; i < 3; i++) diag += m[i][i];
        System.out.println("Main diagonal sum: " + diag);
        in.close();
    }
}
