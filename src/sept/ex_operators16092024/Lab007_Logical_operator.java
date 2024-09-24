package sept.ex_operators16092024;

public class Lab007_Logical_operator {
    public static void main(String[] args) {

        // 1, &&, //
        boolean a = true;
        boolean b = false;
        //boolean c = a && b; // in AND gate both of operands should be true for answer to be true
        //System.out.println(c);
        //boolean c = a || b; // in OR gate ONE of the operands should be true for answer to be true
        //System.out.println(c);
        boolean c = !b;
        System.out.println(c);

    }
}
