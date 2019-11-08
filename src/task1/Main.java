package task1;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[]num = {3,4848,254,2164,3,17,5,9746,298,6,16};
        Arrays.sort(num);
        System.out.println("Sorted by asc");
        System.out.println(Arrays.toString(num));
        Arrays.sort(num, Collections.reverseOrder());
        System.out.println("Sorted by desc");
        System.out.println(Arrays.toString(num));

    }
}
