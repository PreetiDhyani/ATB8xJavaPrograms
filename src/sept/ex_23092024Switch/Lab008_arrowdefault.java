package sept.ex_23092024Switch;

public class Lab008_arrowdefault {
    public static void main(String[] args) {
        int itemcode = 005;
        switch (itemcode){
            case 001 -> System.out.println("Preeti");
            case 002 -> System.out.println("Charu");
            case 003 -> System.out.println("Ashu");
            case 004 -> System.out.println("bunty");
            default-> System.out.println("this is right");
        }
    }
}
