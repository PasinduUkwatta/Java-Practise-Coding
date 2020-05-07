import javax.imageio.stream.ImageInputStream;

public class ConstrauctorChain {
    ConstrauctorChain(){
        this(10);

        System.out.println("single parameter constructor called");
        System.out.println("no argument constructor");
    }

    ConstrauctorChain(int a){
        this(20,30);

        System.out.println("two parameter constructor called");
        System.out.println("single argument constructor : "+a);

    }

    ConstrauctorChain(int a,int b) {
        int sum = a + b;
        System.out.println("two parameter constructor called :"+(a)+(b));
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ConstrauctorChain c =new ConstrauctorChain();
        System.out.println("end of the programme");
    }




}
