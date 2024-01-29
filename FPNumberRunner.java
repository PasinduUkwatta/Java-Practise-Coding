package org.example;

import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;


public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers =List.of(4,6,8,13,15,5,3);
        numbers.stream().forEach(element->System.out.println(element));

        IntStream.range(1,11).forEach(p-> System.out.println(p));
        IntStream.range(1,11).map(e->e*e).forEach(p-> System.out.println(p));

        List.of("APPLE","ORANGE").stream().map(e->e.toLowerCase(Locale.ROOT)).forEach(p-> System.out.println(p));
        List.of("APPLE","ORANGE").stream().map(e->e.length()).forEach(p-> System.out.println(p));
        int sum =numbers.stream()
                .filter(number->number%2==1)
                .reduce(0,
                        (number1,number2)->number1+number2);
        System.out.println(sum);
    }
}
