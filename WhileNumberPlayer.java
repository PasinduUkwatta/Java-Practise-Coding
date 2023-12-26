package org.example;

import java.util.Scanner;

public class WhileNumberPlayer {
    private int number;

    Scanner scanner = new Scanner(System.in);
    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    void printSqureUptoLimit(){
        int i=0;

        while ((i*i)<number){
            System.out.println(i*i);
            i++;
        }
    }

    void printCubeUptoLimit(){
        int i=0;

        while ((i*i*i)<number){
            System.out.println(i*i*i);
            i++;
        }
    }

    void printCubeNumberUptoLimit(){
        do{
            System.out.print("Enter the number  :");
            int number = scanner.nextInt();
            System.out.println(number*number*number);
        }while(number<0);

    }
}
