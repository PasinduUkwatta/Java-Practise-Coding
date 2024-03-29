package org.example;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputing =new Book();
        Book effectiveJava =new Book();
        Book cleanCode =new Book();
        artOfComputing.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);
        System.out.println(artOfComputing.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());

        Book book =new Book(123,"Object oriented programming","ranga");
        book.addReviews(new Review(10,"great book",5));
        System.out.println(book.toString());

    }
}
