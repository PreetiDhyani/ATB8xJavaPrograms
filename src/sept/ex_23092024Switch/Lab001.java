package sept.ex_23092024Switch;

public class Lab001 {
    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("hiha");
                break;
            default:
                System.out.println("No idea");
                break;
        }
        System.out.println("End of the loop");
    }
}
