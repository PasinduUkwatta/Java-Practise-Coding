public class BiNumbers {
    public static void main(String[] args) {
        Methods m1 = new Methods(2, 3);

        System.out.println(m1.add());
        System.out.println(m1.mul());
        m1.doubleValue();

        System.out.println(m1.getNum1());
        System.out.println(m1.getNum2());


    }
}

class Methods {
    private int num1, num2;

    public Methods(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public void doubleValue() {
        this.num1 = num1 * 2;
        this.num2 = num2 * 2;
    }
}
