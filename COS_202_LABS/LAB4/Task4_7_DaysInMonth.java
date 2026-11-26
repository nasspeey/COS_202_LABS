import java.util.Scanner;

public class Task4_7_DaysInMonth {
    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = in.nextInt();
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
            case 4: case 6: case 9: case 11: days = 30; break;
            case 2: days = isLeap(year) ? 29 : 28; break;
            default:
                System.out.println("Invalid month.");
                in.close();
                return;
        }
        System.out.println("Month " + month + " of " + year + " has " + days + " days.");
        in.close();
    }
}
