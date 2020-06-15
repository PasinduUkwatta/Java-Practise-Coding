public class Book {
   private int noOfBooks;

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    void inceaseBooks(int noofCopies){
        noofCopies = noOfBooks+noofCopies;
        System.out.println(noofCopies);
    }

    void  decereaseBooks(int noOfCopies){
        noOfCopies =noOfBooks-noOfCopies;
        if(noOfCopies<0){
            System.out.println(0);
        }else {
            System.out.println(noOfCopies);
        }
    }
}

class BookRunner{
    public static void main(String[] args) {
        Book acp =new Book();
        Book cp =new Book();
        Book pp =new Book();

        acp.setNoOfBooks(100);
        System.out.println(acp.getNoOfBooks());

        cp.setNoOfBooks(20);
        cp.inceaseBooks(60);

        pp.setNoOfBooks(75);
        pp.decereaseBooks(80);
    }
}
