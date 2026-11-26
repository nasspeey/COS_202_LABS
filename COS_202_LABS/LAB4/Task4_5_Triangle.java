import java.util.Scanner;

public class Task4_5_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three side lengths: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("These sides do NOT form a triangle.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
        in.close();
    }
}
