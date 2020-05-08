public interface SciCalculator {
    int add();
    int sub();
}

class Cal1 implements SciCalculator{
    @Override
    public int add() {
        int add = 10+20;
        return add;
    }

    @Override
    public int sub() {
        int sub = 40-20;
        return sub;
    }
}

class CalImpl{
    public static void main(String[] args) {
        SciCalculator s =new Cal1();
        System.out.println("Answer is :"+s.add());
        System.out.println("Answer is :"+s.sub());

    }
}
