package com.alpha.exercise.puzzles;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingNumbers {

    public static void main(String[] args) {
        
        Set<Integer> expectedSet = new HashSet<>();
        IntStream.rangeClosed(1, 20).forEach(n -> expectedSet.add(n));
        expectedSet.removeAll(Arrays.asList( 7, 3, 6, 4, 2, 8, 9, 10, 12, 14, 13, 11, 15, 18));
        expectedSet.stream().forEach(i-> System.out.println(i));
    }
}
