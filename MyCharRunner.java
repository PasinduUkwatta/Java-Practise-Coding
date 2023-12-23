package org.example;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar =new MyChar('@');

        System.out.println( myChar.isVowel());
        System.out.println( myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.lowercaseAlphabet());
        System.out.println(myChar.uppercaseAlphabet());
    }
}
