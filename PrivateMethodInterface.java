public interface PrivateMethodInterface {
    default void print(){
         sentencePrint();
        System.out.println("We can call private methods inside interface from the default method");
    }

    private void sentencePrint(){
        System.out.println("private method inside the interface can be print");

    }
}

class Letter implements PrivateMethodInterface{

}


class ImplPrivateInterface{
    public static void main(String[] args) {
        PrivateMethodInterface p = new Letter();
        p.print();
    }
}
