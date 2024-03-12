package objectbasic.assignment8;

public class Percentage {
    public static void main(String[] args) {
        float computer = 31;
        float science = 32;
        float maths = 98;
        float english = 91;
        float account = 94;

        boolean isFailed = computer < 32 || science < 32 || maths < 32 || english < 32 || account < 32;

        float totalOfAllMarks=computer+science+maths+english+account;
        float percentage=(totalOfAllMarks/500)*100;


        if (isFailed)
            System.out.printf("Student percentage is: %.2f, Student failed ",percentage);
        else if (percentage >= 80)
            System.out.printf("Student percentage is: %.2f, passed with Distinction",percentage);
        else if (percentage >= 70 || percentage < 80)
            System.out.printf("Student percentage is: %.2f, passed with First Division",percentage);
        else if (percentage >= 60)
            System.out.printf("Student percentage is: %.2f, passed with Second Division",percentage);
        else
            System.out.printf("Student percentage is: %.2f, passed with Third Division",percentage);
    }
}
