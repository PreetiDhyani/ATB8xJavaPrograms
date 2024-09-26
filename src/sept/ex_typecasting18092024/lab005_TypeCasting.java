package sept.ex_typecasting18092024;

public class lab005_TypeCasting {
    public static void main(String[] args) {
        int a = 10; // valid implicit casting - JVM
        int a1 = (int)10; // Valid explicit casting - JVM

        //nARROWING
        int val = 200;
        //byte b1 = val; Invalid implicit casting -JVM
        byte b2 = (byte)val; // Explicit casting loss of data
        System.out.println(b2);

    }
}
