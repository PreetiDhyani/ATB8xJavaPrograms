package sept.ex_25092024_Loops1;

public class Lab013_evenandOddNumber {
    public static void main(String[] args) {
        for (int i=0; i<=50; i++) {
            if (i%2==0){
                System.out.println("Even ->"+i);
                continue;
            }
            System.out.println("Odd->" +i);
        }
    }
}
