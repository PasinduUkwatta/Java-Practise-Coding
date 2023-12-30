package org.example;

public class Book {

  private  int noOfCopies;
  private int id;

  private String name;

  private String author;

  private Review review;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Book() {

    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = Math.max(noOfCopies, 0);
    }

    public void increaseBook(int howMuch){
        setNoOfCopies(this.noOfCopies+howMuch);
    }

    public void decreaseBook(int howMuch){
            setNoOfCopies(this.noOfCopies-howMuch);
    }

    public void addReviews(Review review){
        new Review(review.getId(),review.getDescription(),review.getRating());
    }

    @Override
    public String toString() {
        return "Book{" +
                "noOfCopies=" + noOfCopies +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review=" + review +
                '}';
    }
}
