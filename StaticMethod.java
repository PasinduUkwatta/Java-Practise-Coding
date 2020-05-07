public class StaticMethod {
    static String t = "Total is :";

    StaticMethod(int a,int b) {

        int total = a+b;
        System.out.println(total);
    }

    public static void print() {
        System.out.println(t + " ");
    }

    public static void main(String[] args) {
        StaticMethod s = new StaticMethod(10,20);
        s.print();
    }

}

