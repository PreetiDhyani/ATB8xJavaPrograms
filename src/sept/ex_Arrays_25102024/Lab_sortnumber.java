package sept.ex_Arrays_25102024;

import java.util.Arrays;

public class Lab_sortnumber {
    public static void main(String[] args) {
        int[] marks = {100,200,300,400,50};
      System.out.println(marks.length);

        Arrays.sort(marks);
        for (int i=0; i<marks.length; i++) {
            System.out.println(marks[i]);

        }



    }
}
