public class Task6_6_ClassList {
    public static void main(String[] args) {
        Student[] cls = {
            new Student("Anass Haruna", "CIS/CSS/041", 78),
            new Student("Aisha Bello", "CIS/CSS/012", 91.5),
            new Student("Musa Danjuma", "CIS/CSS/027", 64),
            new Student("Zainab Yusuf", "CIS/CSS/033", 55),
            new Student("Ibrahim Sani", "CIS/CSS/050", 83),
            new Student("Fatima Garba", "CIS/CSS/018", 47),
            new Student("Yusuf Lawal", "CIS/CSS/060", 69),
            new Student("Hauwa Abdul", "CIS/CSS/071", 88),
            new Student("Sadiq Umar", "CIS/CSS/005", 39),
            new Student("Maryam Ali", "CIS/CSS/022", 72)
        };
        Student best = cls[0];
        double total = 0;
        for (Student s : cls) {
            total += s.getScore();
            if (s.getScore() > best.getScore()) best = s;
        }
        System.out.println("Top student  : " + best);
        System.out.printf("Class average: %.2f%n", total / cls.length);
    }
}
