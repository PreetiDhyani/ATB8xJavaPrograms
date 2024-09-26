package sept.ex_typecasting18092024;

public class Lab007_TypeCasting2example {
    public static void main(String[] args) {

    //GST = 18.45;
    int course = 100;
    float GST = 18.45f;
    // int total_price = course+GST; // Narrowing-JVM-Invalid
    // Float total_price = course+GST;
     int total_price = course + (int)GST;
        System.out.println(total_price);//explicit
    }
}
