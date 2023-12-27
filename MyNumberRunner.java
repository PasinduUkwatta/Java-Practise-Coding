package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MyNumberRunner {
    public static void main(String[] args) {
//        MyNumbers myNumbers =new MyNumbers(10);
//        WhileNumberPlayer player =new WhileNumberPlayer(100);
////        System.out.println(myNumbers.sumUptoN());
//        myNumbers.printNumberTriangel();

        Scanner scanner =new Scanner(System.in);

        String someString ="this is a lot of text again";
//
//        player.printSqureUptoLimit();
//        player.printCubeUptoLimit();
//        player.printCubeNumberUptoLimit();5



//        int number;
//
//            do{
//                System.out.print("Enter the number  :");
//                number = scanner.nextInt();
//                System.out.println(number*number*number);
//            }while(number>0);

        try {
            for(int i=0;i<=someString.length();i++){
                System.out.println(someString.charAt(i));
            }
        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfYear());
    }

}
