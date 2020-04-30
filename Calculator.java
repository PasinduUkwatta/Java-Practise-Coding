public class Calculator {
    public int add(int a,int b){
        int result = a+b;
        return result;
    }

    public int sub(int a,int b){
        int result = a-b;
        return result;
    }

    public int mul(int a,int b){
        int result = a*b;
        return result;
    }

    public int div(int a,int b){
        int result = a/b;
        return result;
    }

    public int rem(int a,int b){
        int result = a%b;
        return result;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int answer1 = cal.add(10,20);
        int answer2 = cal.sub(40,20);
        int answer3 = cal.mul(5,6);
        int answer4 = cal.div(100,10);
        int answer5 = cal.rem(70,6);

        System.out.println("Addition is :"+answer1);
        System.out.println("Substarction is :"+answer2);
        System.out.println("Multplication is :"+answer3);
        System.out.println("Division is :"+answer4);
        System.out.println("Reminder is :"+answer5);

    }
}
