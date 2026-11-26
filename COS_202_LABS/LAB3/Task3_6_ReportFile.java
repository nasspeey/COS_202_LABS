import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3_6_ReportFile {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter("names.txt");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name " + i + ": ");
            out.println(i + ". " + in.nextLine());
        }
        out.close();
        in.close();
        System.out.println("Saved 5 names to names.txt");
    }
}
