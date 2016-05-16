package com.alpha.exercise.puzzles;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseStringUsingStringBuilder("hello"));
        System.out.println(recursiveReverse("hello"));
    }

    private static String reverseStringUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    private static String recursiveReverse(String str) {

        if (str.length() <= 1) {
            return str;
        }

        int len = str.length();
        return str.substring(len - 1) + recursiveReverse(str.substring(0, len - 1));
    }
}
