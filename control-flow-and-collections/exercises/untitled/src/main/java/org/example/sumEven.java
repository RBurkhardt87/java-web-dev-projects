package org.example;

import java.util.ArrayList;

public class sumEven {

    public static int sumOfEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
