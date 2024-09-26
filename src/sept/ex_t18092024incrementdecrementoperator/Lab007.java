package sept.ex_t18092024incrementdecrementoperator;

public class Lab007 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a); // 10+12
        // A -> a++ > 10, after assignment it increments a;s value to 11. a = 11
        //B --> ++11, B= 12
    }

}

