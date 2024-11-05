package sept.ex_25092024_Loops1;

public class Lab011_PrintEvenNumbers {
    // public class PrintEvenNumbers {
//    public static void main(String[] args) {
//        System.out.println("Even numbers from 0 to 50:");
//
//        for (int i = 0; i <= 50; i += 2) {
//            System.out.print(i + " ");
//        }
//    }
//}

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



