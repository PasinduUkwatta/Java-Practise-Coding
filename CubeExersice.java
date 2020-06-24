import java.util.Scanner;

public class CubeExersice {
    public static void main(String[] args) {
        CubeExersice cb = new CubeExersice();
        cb.printCubeNum();
    }

    public void printCubeNum() {

        Scanner scanner = new Scanner(System.in);
        while (true) {


            System.out.print("Enter Your Number :");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number * number * number);

            } else {
                System.out.println("Enter the Positive Number");
                System.out.println("Thank you !!!");
                System.exit(0);
            }

        }

    }
}
