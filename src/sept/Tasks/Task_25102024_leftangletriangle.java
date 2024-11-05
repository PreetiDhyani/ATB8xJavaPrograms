package sept.Tasks;

import java.util.Scanner;

public class Task_25102024_leftangletriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int Num = sc.nextInt();

        for (int i=Num; i>0; i--) {
            for (int j =i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
