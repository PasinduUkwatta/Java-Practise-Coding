public class SuperClass {
    String str1 = "this is a super class string";
}


class Child1 extends SuperClass{
    String str1 = "this is a the child class string";


    public static void main(String[] args) {
        SuperClass s1 = new SuperClass();
        SuperClass s2 = new Child1();
        Child1 c1 = new Child1();

        System.out.println(s1.str1);
        System.out.println(s2.str1);
        System.out.println(c1.str1);
    }
}