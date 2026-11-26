import java.util.Arrays;
import java.util.Scanner;

public class Task8_5_BinarySearch {
    static int comparisons = 0;

    static int binarySearch(int[] a, int target) {
        int low = 0, high = a.length - 1;
        comparisons = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {42, 7, 19, 88, 3, 56, 71, 25, 64, 10, 33, 95};
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find: ");
        int x = in.nextInt();
        int pos = binarySearch(a, x);
        if (pos >= 0) System.out.println(x + " found at index " + pos);
        else System.out.println(x + " not found.");
        System.out.println("Comparisons made: " + comparisons);
        in.close();
    }
}
