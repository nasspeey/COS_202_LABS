public class Task8_8_MarksTable {
    public static void main(String[] args) {
        String[] students = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};
        String[] courses  = {"CSC101", "CSC102", "MTH101", "GST101"};
        int[][] marks = {
            {72, 65, 80, 58},
            {55, 61, 49, 70},
            {90, 85, 78, 92},
            {43, 50, 60, 38},
            {68, 74, 66, 81}
        };

        System.out.printf("%-12s", "Student");
        for (String c : courses) System.out.printf("%8s", c);
        System.out.printf("%8s%10s%n", "Total", "Average");
        System.out.println("-".repeat(12 + 8 * courses.length + 18));

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            System.out.printf("%-12s", students[i]);
            for (int j = 0; j < courses.length; j++) {
                System.out.printf("%8d", marks[i][j]);
                total += marks[i][j];
            }
            System.out.printf("%8d%10.2f%n", total, (double) total / courses.length);
        }

        System.out.println("-".repeat(12 + 8 * courses.length + 18));
        System.out.printf("%-12s", "Course avg");
        for (int j = 0; j < courses.length; j++) {
            int t = 0;
            for (int i = 0; i < students.length; i++) t += marks[i][j];
            System.out.printf("%8.2f", (double) t / students.length);
        }
        System.out.println();
    }
}
