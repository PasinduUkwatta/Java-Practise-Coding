package org.example;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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

        StreamEmployee john =new StreamEmployee("John doe",30);
        StreamEmployee mark =new StreamEmployee("mark dear",25);
        StreamEmployee kack =new StreamEmployee("kack when",32);
        StreamEmployee snow =new StreamEmployee("snow white",23);

        Department hr =new Department("Human Resourses");
        hr.addEmployee(john);
        hr.addEmployee(mark);
        hr.addEmployee(kack);
        hr.addEmployee(snow);


        List<Department> departments =new ArrayList<>();
        departments.add(hr);

        System.out.println(departments);

        departments.stream()
                .flatMap(department -> department.getEmployee().stream())
                .forEach(System.out::println);

        List<String> sortedNumbers =someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

        for (String s :sortedNumbers){
            System.out.println(s);
        }

        Map<Integer,List<StreamEmployee>> groupByAge =departments.stream()
                .flatMap(department -> department.getEmployee().stream())
                .collect(Collectors.groupingBy(streamEmployee -> streamEmployee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployee().stream())
                .reduce((e1,e2)->e1.getAge()<e2.getAge()?e1:e2)
                .ifPresent(System.out::println);
    }
}
