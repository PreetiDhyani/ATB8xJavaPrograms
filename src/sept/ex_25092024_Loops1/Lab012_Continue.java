package sept.ex_25092024_Loops1;

public class Lab012_Continue {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After");
        }
    }
}
