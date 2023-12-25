package org.example;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumbers myNumbers =new MyNumbers(10);
        System.out.println(myNumbers.sumUptoN());
        myNumbers.printNumberTriangel();
    }
}
