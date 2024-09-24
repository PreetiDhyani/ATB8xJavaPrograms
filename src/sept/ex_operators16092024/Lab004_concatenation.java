package sept.ex_operators16092024;

public class Lab004_concatenation {
    public static void main(String[] args) {
        String first_name = "Preeti";
        String last_name = "Dhyani";
        System.out.println("Preeti" + "Dhyani");
        // Concatenation operator>> +
        // = >> in case of int +int = addition _math
        // In case of string it combines
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b); // concatenation done first
        System.out.println(a + b +first_name + last_name);// arithmetic done first

    }
}
