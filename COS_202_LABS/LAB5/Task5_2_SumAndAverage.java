import java.util.Scanner;

public class Task5_2_SumAndAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, sum = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        System.out.println("Enter marks (-1 to stop):");
        int mark = in.nextInt();
        while (mark != -1) {
            count++;
            sum += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
            mark = in.nextInt();
        }
        if (count == 0) {
            System.out.println("No marks were entered.");
        } else {
            System.out.println("Count   : " + count);
            System.out.println("Sum     : " + sum);
            System.out.printf("Average : %.2f%n", (double) sum / count);
            System.out.println("Highest : " + highest);
            System.out.println("Lowest  : " + lowest);
        }
        in.close();
    }
}
