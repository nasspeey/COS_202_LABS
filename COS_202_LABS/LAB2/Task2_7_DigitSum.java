import java.util.Scanner;

public class Task2_7_DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int n = Math.abs(in.nextInt());
        int sum = n / 100 + (n / 10) % 10 + n % 10;
        System.out.println("Sum of digits = " + sum);
        in.close();
    }
}
