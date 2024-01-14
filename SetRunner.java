package org.example;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters =List.of('A','Z','Z','B','F','A');

        Set<Character> treeSet =new TreeSet<>(characters);
        Set<Character> linkedHashSet =new LinkedHashSet<>(characters);
        Set<Character> hashSet =new HashSet<>(characters);

        System.out.println("treeset"+treeSet);
        System.out.println("linkedHashSet"+linkedHashSet);
        System.out.println("HashSet"+hashSet);
    }
}
