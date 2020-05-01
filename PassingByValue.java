public class PassingByValue {
    public int addTwo(int a,int b){
        a = 100;
        b =200;
        int sum = a+b;
        return sum;

    }

    //method overriding
    public int addTwo(int a,int b,int c){
        a = 100;
        b =200;
        c =300;
        int sum = a+b+c;
        return sum;

    }


    public static void main(String[] args) {
        PassingByValue p = new PassingByValue();
        int a =10;
        int b =20;
        int c =30;

        System.out.println("value before passing"+a);
        int result1 = p.addTwo(a,b);
        int result2 = p.addTwo(a,b,c);
        System.out.println("result1 is :"+result1);
        System.out.println("result2 is :"+result2);

        System.out.println("value before passing"+a);


    }


}

