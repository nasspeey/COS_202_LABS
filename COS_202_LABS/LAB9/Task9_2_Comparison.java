import java.util.Scanner;

public class Task9_2_Comparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String a = in.nextLine().trim();
        System.out.print("Enter second word: ");
        String b = in.nextLine().trim();
        System.out.println("Equal                : " + a.equals(b));
        System.out.println("Equal ignoring case  : " + a.equalsIgnoreCase(b));
        int cmp = a.compareToIgnoreCase(b);
        if (cmp < 0) System.out.println("Alphabetically first : " + a);
        else if (cmp > 0) System.out.println("Alphabetically first : " + b);
        else System.out.println("Alphabetically first : both are the same (ignoring case)");
        in.close();
    }
}
