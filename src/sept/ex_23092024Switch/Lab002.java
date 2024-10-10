package sept.ex_23092024Switch;

public class Lab002 {
    public static void main(String[] args) {
        String browser = "Firefox";

        switch (browser){
            default:
                System.out.println("Starting Opera browser");
                break;
            case "Chrome" :
                System.out.println("starting the chrome browser");
            break;
            case "Edge" :
                System.out.println("starting the Edge browser");
                break;
            case "Opera" :
                System.out.println("starting the Opera browser");
                break;


        }
    }
}
