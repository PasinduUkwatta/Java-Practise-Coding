public class Super {

    int x = 10;
    int y =20;
}

class Child extends Super{
    int x=100;

    public static void main(String[] args) {
        Super s1 =new Super();
        Super s2 = new Child();
        Child c = new Child();

        /*when we using parent reference to hold child object , variables values are at first
        first look at the paren class , then only taken by the child class.
        *
        */
        System.out.println(s1.x+"  "+s1.y);
        System.out.println(s2.x+"  "+s2.y);
        System.out.println(c.x+"   "+c.y);

    }
}
