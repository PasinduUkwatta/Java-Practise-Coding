public class DynamicBinding {
     void bind(){
        System.out.println("Parent class bid method");
    }
}

class Book extends DynamicBinding{
    @Override
     void bind() {
        System.out.println("child class bind method");
    }

    public static void main(String[] args) {

        //run time polymophrisum
        DynamicBinding d1 = new DynamicBinding();
        DynamicBinding d2 = new Book();
        Book b = new Book();

        d1.bind();
        d2.bind();
        b.bind();
    }

}
