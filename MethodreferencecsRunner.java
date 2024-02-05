package org.example;

import java.util.List;

public class MethodreferencecsRunner {
    public static void main(String[] args) {
        List.of("Ant","Bat","Cat","Dog").stream()
                .map(s->s.length())
                .forEach(s->System.out.println(s));
    }
}
