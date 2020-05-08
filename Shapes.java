public abstract class Shapes {
    abstract int area();
}

class Triangle1 extends Shapes{
    int area(){
        System.out.println("area of the Triangle is printing");
        return 10;
    }
}

class Squre1 extends Shapes {
    int area() {
        System.out.println("area of the squre is printing");
        return 5;
    }

}


class Test{

        public static void main(String[] args) {
            Shapes sh =new Triangle1();
            Shapes sc =new Squre1();

            sh.area();
            System.out.println( sh.area());
            sc.area();
            System.out.println( sc.area());
    }





}

