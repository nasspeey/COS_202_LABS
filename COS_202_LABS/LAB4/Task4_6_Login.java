import java.util.Scanner;

public class Task4_6_Login {
    public static void main(String[] args) {
        String username = "anass";
        String password = "java123";
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String u = in.nextLine();
        System.out.print("Password: ");
        String p = in.nextLine();
        if (username.equals(u) && password.equals(p)) System.out.println("Access granted");
        else System.out.println("Access denied");
        in.close();
    }
}
