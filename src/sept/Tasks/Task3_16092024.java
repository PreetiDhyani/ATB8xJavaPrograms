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
       byte b = 10; long l = 10l; → How much Byte will be used.
Answer :
        b = 1 byte
        long = 8 bytes , so total 8+1 = 9 bytes

        String s = "name" //8 bytes

       Another =byte b  10; byte c = 10;  What is the answer if to perform b+c,
       What is the data type it will give in result.

       By default, it leads to int  i.e. greater version of byte
                */


        byte b = 10;
        byte c= 10;
        System.out.println(b+c);


        //Answer 3: if you print character then it prints character, but if you print concatenation of the characters, it
        //will take ASCII value

        short s = 10;

        char g = 'A'; //65

        int ss = s+g;

        System.out.println(ss);
    }
}
