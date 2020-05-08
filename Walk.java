public interface Walk {
    void work();
}

 interface Run{
    void run();
}

abstract class Animal {
  abstract void swim();

}


//in this class all method in the interface and abstarct class should be delcard
class Human extends Animal implements Run,Walk{

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    public void swim(){
        System.out.println("Human is swimming");
    }
}


class Impl {
    public static void main(String[] args) {
        Run r = new Human();
        Walk w = new Human();
        Animal a = new Human();

        r.run();
        w.work();
        a.swim();
    }
}