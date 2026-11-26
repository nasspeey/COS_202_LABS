public class Student {
    private static int count = 0;   // Task 6.5: counts objects created

    private String name;
    private String matricNumber;
    private double score;

    public Student(String name, String matricNumber, double score) {
        this.name = name;
        this.matricNumber = matricNumber;
        setScore(score);
        count++;
    }

    public String getName()         { return name; }
    public String getMatricNumber() { return matricNumber; }
    public double getScore()        { return score; }

    public void setName(String name) { this.name = name; }

    // Task 6.3: validation (score must be 0 to 100)
    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score (" + score + ") for " + name + ": must be 0-100. Score set to 0.");
            this.score = 0;
        } else {
            this.score = score;
        }
    }

    public static int getCount() { return count; }

    @Override
    public String toString() {
        return "Student[name=" + name + ", matric=" + matricNumber + ", score=" + score + "]";
    }
}
