public interface StaticMethod {
    static void run(){
        System.out.println("Static run method inside the interface");
    }

}

class StaticClass implements StaticMethod{
    public static void main(String[] args) {
       //we can direcly call the static method by using the interface name
        StaticMethod.run();
    }
}
