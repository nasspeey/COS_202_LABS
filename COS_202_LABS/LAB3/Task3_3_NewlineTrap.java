import java.util.Scanner;

public class Task3_3_NewlineTrap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // THE PROBLEM: nextInt() reads only the number and leaves the Enter key
        // (the newline) in the buffer. If we now call nextLine() directly, it
        // reads that leftover newline and returns an EMPTY string, so the user
        // never gets the chance to type the name.
        //
        //   System.out.print("Enter full name: ");
        //   String name = in.nextLine();   // <-- returns "" immediately

        // THE FIX: consume the leftover newline first.
        in.nextLine();

        System.out.print("Enter your full name: ");
        String name = in.nextLine();
        System.out.println("Name: " + name + ", Age: " + age);
        in.close();
    }
}
