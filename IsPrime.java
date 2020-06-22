public class IsPrime {


    public static void main(String[] args) {
        IsPrime num = new IsPrime();
        num.isPrimeNumber(8);
        num.sumUpToNum(9);
        num.printTheTriangle(8);

    }

    private void printTheTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

    public void sumUpToNum(int num) {


        for (int i = 1; i <= num; i++) {



        }

    }

    private void isPrimeNumber(int num) {
        for (int i = 1; i <= num-1; i++) {
            if(num%i==0){
                System.out.println("Prime Number");

            }
        }
    }
}
