public interface DefaultInterface {

    //default keyword can be used before the interface
    //then we can give the implemnt in the same palace
    //without implmet it in the concerate class
    default void run(){
        System.out.println("THIS IS THE DEFAULT METHOD IN INTERFACE");
    }
}

class RunInterface implements DefaultInterface{
    public static void main(String[] args) {
     DefaultInterface d = new RunInterface();
     d.run();

    }
}

