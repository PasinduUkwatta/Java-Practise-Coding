package com.example.springsection1.controller;

import java.awt.print.Book;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Memory {
    public static void main(String[] args) {
        Date start = new Date();
        Map<Integer, Book> books = new HashMap<Integer, Book>(500000,0.9f);
        for (int i = 0; i < 10000000; i++) {
            books.put(i,new Book());

            Date end = new Date();
            System.out.println(end.getTime() - start.getTime()+"ms");
        }
    }
}
