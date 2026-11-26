import java.util.Scanner;

public class Task4_1_PassOrFail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int PASS_MARK = 40;
        System.out.print("Enter score: ");
        int score = in.nextInt();
        if (score >= PASS_MARK) System.out.println("Pass");
        else System.out.println("Fail");
        in.close();
    }
}
