public class SuperClassConstructor {

    SuperClassConstructor() {
        System.out.println("Superclass constructor");

    }
}

class Chil extends SuperClassConstructor{
    Chil(){
        System.out.println("Child1 class constructor");
    }
}

class Child2 extends Chil{
    Child2(){
        System.out.println("Child2 consytructor is called");
    }

    public static void main(String[] args) {
        Child2 c =new Child2();
    }
}
