package org.example;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("main ended");
    }

    private static void method1() {
        method2();
        System.out.println("method1 ended");

    }

    private static void method2() {
        try {
            String str =null;
            str.length();
            System.out.println("method2 ended");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
