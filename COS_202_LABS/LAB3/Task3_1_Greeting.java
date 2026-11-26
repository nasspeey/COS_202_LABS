import java.util.Scanner;

public class Task3_1_Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = in.nextLine();
        System.out.print("Enter last name: ");
        String last = in.nextLine();
        System.out.println("Welcome, " + last + ", " + first);
        in.close();
    }
}
