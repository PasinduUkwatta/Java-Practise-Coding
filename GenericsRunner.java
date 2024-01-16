package org.example;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list =new MyCustomList<String>();

        list.addElement("Element1");
        list.addElement("Element2");
        String value = String.valueOf(list.getElement(String.valueOf(0)));

        MyCustomList<Integer> list2 =new MyCustomList<Integer>();

        list2.addElement(7);
        list2.addElement(5);
        Integer number = list2.getElement(0);


        System.out.println(list.toString());
        System.out.println(list2.toString());

    }
}
