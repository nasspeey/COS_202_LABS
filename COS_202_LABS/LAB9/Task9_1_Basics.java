import java.util.Scanner;

public class Task9_1_Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = in.nextLine();
        if (s.isEmpty()) {
            System.out.println("Nothing was entered.");
        } else {
            System.out.println("Length         : " + s.length());
            System.out.println("First character: " + s.charAt(0));
            System.out.println("Last character : " + s.charAt(s.length() - 1));
            System.out.println("Upper case     : " + s.toUpperCase());
            System.out.println("Lower case     : " + s.toLowerCase());
        }
        in.close();
    }
}
