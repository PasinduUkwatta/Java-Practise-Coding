package org.example;

public class MyNumbers {
    private int number;

    public MyNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    boolean isPrime(){

        for(int i =1;i<number;i++){
            int devide =number%i;
            return true;
        }
        return false;
    }

    int sumUptoN(){
        int sum =0;
        for(int i =0;i<=number;i++){
            sum=sum+i;
        }
        return sum;
    }

    void printNumberTriangel(){
        for(int i=0;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");

        }
    }
}
