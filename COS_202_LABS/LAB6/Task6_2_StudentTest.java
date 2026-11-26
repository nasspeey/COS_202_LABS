public class Task6_2_StudentTest {
    public static void main(String[] args) {
        Student[] list = {
            new Student("Anass Haruna", "CIS/CSS/041", 78),
            new Student("Aisha Bello", "CIS/CSS/012", 91.5),
            new Student("Musa Danjuma", "CIS/CSS/027", 64),
            new Student("Zainab Yusuf", "CIS/CSS/033", 55),
            new Student("Ibrahim Sani", "CIS/CSS/050", 83)
        };
        for (Student s : list) System.out.println(s);
    }
}
