package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code hereS
        String parsingString ="2022";
        System.out.println(parsingString);

        int number =Integer.parseInt(parsingString);
        System.out.println(number);

//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter Your Name :");
//        String name =scanner.nextLine();
//        System.out.println("Enter Your Year of Birth :");
//
//        boolean hasNextInt =scanner.hasNextInt();
//
//
//        if(hasNextInt){
//            int year =scanner.nextInt();
//            int age =2022 -year;
//            System.out.println("Your Name is :"+name);
//            System.out.println(age);
//            System.out.println(year);
//
//            if((year>=0) && (year<=100)){
//                System.out.println("Your Age is :"+year);
//
//            }
//            else {
//                System.out.println("Invalid Age");
//            }
//        }
//        else {
//            System.out.println("Wrong Age Type");
//        }
//
//        scanner.close();
//        ReadingUserInput();
        MinMaxSearch();

    }

    public static void ReadingUserInput(){
        int counter =0;
        int sum =0;
        Scanner scanner =new Scanner(System.in);



        while (counter<10){
            System.out.println("Enter Your Number "+(counter+1)+" :");

            boolean hasNextInt =scanner.hasNextInt();
            int number =scanner.nextInt();


            if(hasNextInt){

                sum=sum+number;
                counter++;
            }
            else {
                System.out.println("Please Enter Valid Number");
            }

        }
        scanner.close();

        System.out.println("Total of the Number :"+sum);

    }

    public static void MinMaxSearch(){
        while (true){
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter Your Number");

            int minValue =0;
            int maxValue =0;

            boolean hasNextInt = scanner.hasNextInt();
            int enteredValue= scanner.nextInt();

            if (hasNextInt){
                if(enteredValue>maxValue ){
                    maxValue=enteredValue;

                }
                if(enteredValue<minValue){
                    maxValue=enteredValue;
                }
            }
            else {
                break;
            }

            System.out.println("Min Value :"+minValue);
            System.out.println("Max Value :"+maxValue);
        }
    }
}
