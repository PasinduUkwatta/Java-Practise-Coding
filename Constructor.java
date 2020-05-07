public class Constructor {

    //constructor overloading
    //all the constructor have the same name as the class
    //from this no argument constructr
    Constructor(){
        int a = 10;
        int b = 20;
        int total = a+b;

        System.out.println("No argument constructor is called");
        System.out.println(total);
    }

    //single argument constructor
    Constructor(int a){
        int mul =a*5;

        System.out.println("single argument construtor is called");
        System.out.println(mul);
    }

    //double argumet contructor
    Constructor(int a,int b){
       int sum = (a+b)/(a-b);

       System.out.println("double argument constructor is called");
       System.out.println(sum);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(5);
        Constructor c3 = new Constructor(9,3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }




}
