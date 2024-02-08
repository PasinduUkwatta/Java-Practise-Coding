package org.example;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat","Dog");
        printBasicList(list);
        printBasicListFP(list);

        list.forEach(System.out::println);
        ;
    }

    static void printBasicList(List<String> list){
        for(String data :list){
            System.out.println(data);
        }
    }

    static void printBasicListFP(List<String> list){
       list.stream().forEach(element-> System.out.println(element));
        }


}
