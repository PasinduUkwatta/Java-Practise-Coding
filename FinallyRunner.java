package org.example;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int [] numbers ={1,2,3,4,5};
            int number =numbers[5];
            System.out.println("Before Scanner Close");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
            System.out.println("Finally called");

        }
    }
}
