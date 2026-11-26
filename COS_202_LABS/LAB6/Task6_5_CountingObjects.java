public class Task6_5_CountingObjects {
    public static void main(String[] args) {
        new Student("A", "CIS/CSS/001", 50);
        new Student("B", "CIS/CSS/002", 60);
        new Student("C", "CIS/CSS/003", 70);
        new Student("D", "CIS/CSS/004", 80);
        System.out.println("Student objects created: " + Student.getCount());
    }
}
