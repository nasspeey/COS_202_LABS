public class Task5_5_Patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Right triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("\nInverted triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("\nNumber pyramid:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
}
