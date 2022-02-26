package ru.sber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TaskTwo {
    private static final long startTime = System.nanoTime();
    private final static int[] massive = {1, 2, 7, -5, 10, 2, 2, -7};
    private static int numbToFind = 3;

    public static void main(String[] args) {
        System.out.println(new TaskTwo().findNumber(massive.length, numbToFind));
//        System.out.println(new TaskTwo().findNumber(massive, numbToFind));
        System.out.println("Total execution time: " + (System.nanoTime() - startTime));
    }


    // O(n)
    public boolean findNumber(int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(massive[i])) {
                hm.put(massive[i], 0);
            }
        }
        int twice_count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - massive[i]) != null)
                return true;
        }
        return false;
    }


//   O(n^2)

//    private Boolean findNumber(int[] massive, int numbToFind) {
//        for (int i = 0; i < massive.length - 1; i++) {
//            for (int j = i + 1; j < massive.length; j++) {
//                if (massive[i] + massive[j] == numbToFind) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}


