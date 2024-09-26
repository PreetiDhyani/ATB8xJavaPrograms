package sept.ex_t18092024incrementdecrementoperator;

public class Lab005Postincrement {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        //line no.   /  Exp   /   a
        // 5         / Exp    / 10
        // 6         / Result / 10
        // 7         / Result / 11
        // 8         / Result / 10
    }
}
