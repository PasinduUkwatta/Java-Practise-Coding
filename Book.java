package org.example;

public class Book {

  private  int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
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
}
