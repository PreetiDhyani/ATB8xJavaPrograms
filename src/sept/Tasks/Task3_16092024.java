package sept.Tasks;

public class Task3_16092024 {
    public static void main(String[] args) {
     /*
        Answer 1: Difference between = and  ==?

        = is an assignment operator, assignment operators in programming are symbols used to assign values to variables. eg: int a=10;
        == it is a relational operator and is used to compare the values if both are equal or not.
       */

        int x = 10;
        int y = 11;
        if (x == y)
            System.out.println("x is equal to b\n");
        else
            System.out.println("x and y are not equal\n");

/*
       Answer 2:  byte b = 10; long l = 10l; → How much Byte will be used.

        b = 1 byte
        long = 8 8 bytes , so total 8+1 = 9 bytes

        String s = "name" //8 bytes

       Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c,
       What is the data type it will give in result.

       By default it leads to int  i.e greater version of byte
                */


        byte b = 10;
        byte c= 10;
        System.out.println(b+c);


        // if you print character then it prints character, but if you print concatenation of the characters, it
        //will take ASCII value
        char c1='A';
        System.out.println(c1);
        char d1 = 'B';
        int e1 = c1+d1;
        System.out.println(e1);
    }
}
