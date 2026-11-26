import java.util.Scanner;

public class Task4_3_LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest = " + largest);
        in.close();
    }
}
