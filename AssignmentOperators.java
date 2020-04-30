public class AssignmentOperators {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

        //from this new ac = old a + old a
        //a+=a ==> a=a+a
        a+=a;

        System.out.println(a);


    }
}
