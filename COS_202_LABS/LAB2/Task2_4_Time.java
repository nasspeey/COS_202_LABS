public class Task2_4_Time {
    public static void main(String[] args) {
        int total = 10000;
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;
        System.out.println(total + " seconds = " + hours + "h " + minutes + "m " + seconds + "s");
    }
}
