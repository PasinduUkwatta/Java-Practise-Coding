package org.example;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G56","G49","G60","G50","g64",
                "I26","I17","129",
                "O71");

        List<String> gNumbers =new ArrayList<>();

//        someBingoNumbers.forEach(number->{
//            if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1,String s2)->s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String>  ioNumbersStream =Stream.of("I27","I17","I29","O71");
        Stream<String> inNumbersStream =Stream.of("N40","N23","I26","I17","I29","O71");
        Stream<String> concatString =Stream.concat(ioNumbersStream,inNumbersStream);
        System.out.println("===============================");
        System.out.println(concatString
                .distinct()
                .peek(System.out::println)
                .count());

    }
}
