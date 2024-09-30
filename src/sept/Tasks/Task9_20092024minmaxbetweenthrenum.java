package sept.Tasks;

public class Task9_20092024minmaxbetweenthrenum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = a>b ? ((a>c)?a:c): ((b>c)? b : c);
        System.out.println(max);
    }
}
