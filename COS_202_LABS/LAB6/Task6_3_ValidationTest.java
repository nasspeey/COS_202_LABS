public class Task6_3_ValidationTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        r.setLength(-5);
        r.setWidth(-1);
        System.out.println("After invalid data: " + r + " area=" + r.area());
        r.setLength(8);
        System.out.println("After valid data  : " + r + " area=" + r.area());

        Rectangle bad = new Rectangle(-2, 3);
        System.out.println("Constructed with bad length: " + bad);

        Student s = new Student("Test Student", "CIS/CSS/999", 50);
        s.setScore(150);
        System.out.println(s);
    }
}
