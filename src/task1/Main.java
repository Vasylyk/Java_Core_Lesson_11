package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList num = new ArrayList();
        num.add(3);
        num.add(4848);
        num.add(254);
        num.add(2164);
        num.add(3);
        num.add(17);
        num.add(5);
        num.add(9746);
        num.add(298);
        num.add(6);
        num.add(16);
        Collections.sort(num);
        System.out.println("Sorted by asc");
        System.out.println(num);
        Collections.reverse(num);
        System.out.println("Sorted by desc");
        System.out.println(num);

    }
}
