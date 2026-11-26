import java.util.Scanner;

public class Task8_3_Search {
    static int indexOf(int[] a, int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {14, 27, 3, 56, 9, 42, 31, 8};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        int x = in.nextInt();
        int pos = indexOf(data, x);
        if (pos >= 0) System.out.println(x + " found at position (index) " + pos);
        else System.out.println(x + " was not found.");
        in.close();
    }
}
