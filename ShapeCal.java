public interface ShapeCal {
    void area();
}

class Squre implements ShapeCal{
    @Override
    public void area() {
        int area = 10*15;
        System.out.println("Area of the Squre is :"+area);
    }
}

class Triangle implements ShapeCal{
    @Override
    public void area() {
        int area = (int)0.5*4*15;
        System.out.println("Area of the Triangle is :"+area);
    }
}

class ShapeCalImpl{
    public static void main(String[] args) {
        ShapeCal s1 = new Squre();
        ShapeCal s2 = new Triangle();
        s1.area();
        s2.area();
    }
}