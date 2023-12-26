package org.example;

import java.util.Scanner;

public class MyNumberRunner {
    public static void main(String[] args) {
//        MyNumbers myNumbers =new MyNumbers(10);
//        WhileNumberPlayer player =new WhileNumberPlayer(100);
////        System.out.println(myNumbers.sumUptoN());
//        myNumbers.printNumberTriangel();

        Scanner scanner =new Scanner(System.in);
//
//        player.printSqureUptoLimit();
//        player.printCubeUptoLimit();
//        player.printCubeNumberUptoLimit();5



        int number;

            do{
                System.out.print("Enter the number  :");
                number = scanner.nextInt();
                System.out.println(number*number*number);
            }while(number>0);


    }
}
