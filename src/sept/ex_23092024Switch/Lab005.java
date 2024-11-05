package sept.ex_23092024Switch;

public class Lab005 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("yes");
            case 003, 004, 006:
                System.out.println("No");

        }
    }
}
