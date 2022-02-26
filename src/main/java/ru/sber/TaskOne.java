package ru.sber;

import java.util.Deque;
import java.util.LinkedList;

public class TaskOne {

    private static final long startTime = System.nanoTime();

    public static void main(String[] args) {

        System.out.println(new TaskOne().isBalanced("()()"));
        System.out.println(new TaskOne().isBalanced("(some_text (some_text? x) some_text (/ 1 x))"));
        System.out.println(new TaskOne().isBalanced("Я сказал ему (что это (еще) не сделано). (Но он не слушал)"));
        System.out.println(new TaskOne().isBalanced(":-)"));
        System.out.println(new TaskOne().isBalanced("()) ("));
        System.out.println(new TaskOne().isBalanced(""));

        System.out.println("Total execution time: " + (System.nanoTime() - startTime));
    }

    // O(n)
    public Boolean isBalanced(String someText) {
        int count = 0;
        char[] chars = someText.toCharArray();
        if (chars.length != 0) {
            for (char ch : chars) {
                if (count == -1) {
                    break;
                }
                if (ch == '(') {
                    count++;
                }
                if (ch == ')') {
                    count--;
                }
            }
            if (count == 0) {
                return true;
            }
        }
        return false;
    }
}

