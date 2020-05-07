public class OverLoading {

    public void area(int a){
         int sqrArea = a*a;
         System.out.println("area of the squre is :"+sqrArea);
    }

    public void area(int a,int b){
        int rectangleArea = a*b;
        System.out.println("area of the rectangle is :"+rectangleArea);
    }

    public void area(double a){
        double circleArea = (22.0/7)*a*a;
        System.out.println("area of the circul is :"+circleArea);
    }

    public void area(int a,double b){
        double triangleArea = 0.5*a*b;
        System.out.println("area of the triangle is :"+triangleArea);
    }

    public static void main(String[] args) {
        OverLoading a1 = new OverLoading();
        OverLoading a2 = new OverLoading();
        OverLoading a3 = new OverLoading();
        OverLoading a4 = new OverLoading();

        a1.area(5);
        a2.area(4,6);
        a3.area(4.8);
        a4.area(6,6.4);
    }
}
