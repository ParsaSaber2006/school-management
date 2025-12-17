public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    private int score;
    private String nationalCode;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score > 20) {
            Menu.print("This Score is greater than 20\n");
            return;
        }
        if (score < 0 ){
            Menu.print("This Score is less than 0\n");
            return;
        }
        this.score = score;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
    public String getNationalCode() {
        return this.nationalCode;
    }

}
