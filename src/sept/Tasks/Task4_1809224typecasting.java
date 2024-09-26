package sept.Tasks;

public class Task4_1809224typecasting {
    public static void main(String[] args) {
        //Give some another example of Widening with Implicit and Explicit,
        // Narrowing with implicit and explicit.

        //Implicit and explicit widening
        int a1 = 10;
        int b1 = 20;
        long c1 = a1+b1;
        long d1 = (a1+b1);
        System.out.println(c1);
        System.out.println(d1);


        //Implicit and explicit narrowing
        long a = 500;
        float b = 50.55f;

        long s = a+(long)b;
        System.out.println(s);

    }
}
