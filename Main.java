package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int[] receivedValues= getIntegers();
      printIntegers(receivedValues);
	// write your code here
    }

    public static int[] getIntegers(){
        Scanner scanner =new Scanner(System.in);
        int [] array =new int[5];

       

        for(int i =0;i<5;i++){
            System.out.println("Enter Your Number  "+i+" :");
            int values =scanner.nextInt();
            array[i]=values;
        }
        return array;
    }

    public static void printIntegers(int [] array){
        for (int j : array) {
            System.out.println(j);
        }
    }
}
