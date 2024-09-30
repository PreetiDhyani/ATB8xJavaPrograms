package sept.Tasks;

public class Task8_20092024Ternaryoperator {
    public static void main(String[] args) {

    int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";

        System.out.println("The Grade is " + grade);

    }

}
