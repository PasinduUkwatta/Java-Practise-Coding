public interface Money {
    //this is abstract method
    //so the class should implemnt this method
    void operation();
}

class Debit implements Money{
    @Override
    public void operation() {
        System.out.println("Money put from the machine");
    }
}

class Credit implements Money{
    @Override
    public void operation() {
        System.out.println("Money take from the machine");
    }
}

class InterfaceImpl{
    public static void main(String[] args) {
        Money m1 = new Credit();
        Money m2 = new Debit();

        m1.operation();
        m2.operation();



    }
}