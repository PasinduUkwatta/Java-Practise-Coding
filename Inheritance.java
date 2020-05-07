public class Inheritance {
    void print(){
        System.out.println("parent class method");
    }
}

class Child1 extends Inheritance{

    @Override
    void print() {
       System.out.println("Child1 class method");

    }

    public static void main(String[] args) {
        Child1 c1 =new Child1();
        c1.print();
    }
}

class Child2 extends Inheritance{
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.print();
    }
}


/*
*
*java is only supporting single inheritance
*hierarchical inheritance is not supported in the java
*
*/