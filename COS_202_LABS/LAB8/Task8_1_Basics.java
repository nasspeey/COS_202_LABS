import java.util.Scanner;

public class Task8_1_Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < a.length; i++) a[i] = in.nextInt();
        int sum = 0, max = a[0], min = a[0];
        for (int v : a) {
            sum += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }
        double avg = (double) sum / a.length;
        int above = 0;
        for (int v : a) if (v > avg) above++;
        System.out.println("Sum     : " + sum);
        System.out.printf("Average : %.2f%n", avg);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
        System.out.println("Values above average: " + above);
        in.close();
    }
}
