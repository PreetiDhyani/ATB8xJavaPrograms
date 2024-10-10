package sept.ex_20092024_Conditionsandloops;

import java.sql.SQLOutput;

public class lb_gradecalucaltor {
    public static void main(String[] args) {
        char grade = 'F';
        int score = 89;

        if (score >=90 && score <=100) {
            grade = 'A';
        }
        else if (score >= 80 && score <=89) {
            grade = 'B';
        }
        else if (score >= 70 && score <=79) {
            grade = 'C';
        }
        else if (score >= 60 && score <=69) {
            grade = 'D';
        }
        else {
            grade = 'F';
    }
        System.out.println("Your Grade is -->" + grade);
    }
}
