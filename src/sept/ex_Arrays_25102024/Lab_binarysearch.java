package sept.ex_Arrays_25102024;

import java.util.Arrays;

public class Lab_binarysearch {
    public static void main(String[] args) {
        int[] marks = {100,200,300,400,50};
        System.out.println(marks.length);
        int item = Arrays.binarySearch(marks,300);
        System.out.println(item);
    }
}
