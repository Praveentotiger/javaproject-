package com.sample.school;

public class ReverseDemo {
    public static String reverseWithCharArray(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "Example";
        System.out.println("Reversed: " + reverseWithCharArray(input));
    }
}
