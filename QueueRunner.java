package org.example;

import java.util.*;


class StringLengthComaprator implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value2.length(),value1.length());
    }
}

public class QueueRunner {

    public static void main(String[] args) {
        Queue<String> queue =new PriorityQueue<>(new StringLengthComaprator());
        Map<String,Integer> map =Map.of("A",3,"B",5,"Z",10);
        queue.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(map);

        String sentence = "this is an awesome occasion, this has never happened before";

        Map<Character, Integer> occurrences = new HashMap<>();
        char[] characters = sentence.toCharArray();

        for (char character : characters) {
            occurrences.put(character, occurrences.getOrDefault(character, 0) + 1);
        }

        System.out.println("Character counts: " + occurrences);
    }
}
