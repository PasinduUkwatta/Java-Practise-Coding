package org.example;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(4,6,8,13,15,5,3);
        numbers.stream().forEach(element->System.out.println(element));
    }
}
