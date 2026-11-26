public class Task2_1_Temperature {
    public static void main(String[] args) {
        double c = 36.6;
        double f = c * 9.0 / 5 + 32;
        System.out.println(c + " C = " + f + " F");
        // Integer division trap: 9/5 is 1 (both ints), so the fraction is lost
        double wrong = c * (9 / 5) + 32;
        System.out.println("Using 9/5 instead of 9.0/5: " + wrong + " F (WRONG, 9/5 = " + (9 / 5) + ")");
    }
}
