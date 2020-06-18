import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        //type obj =new Type()
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no 1 :");
        int num1 = scanner.nextInt();
        System.out.println("The 1 number you enter :" + num1);

        System.out.print("Enter no 2 :");
        int num2 = scanner.nextInt();
        System.out.println("The 2 number you enter :" + num2);

        System.out.println("1 :ADD");
        System.out.println("2 :SUBSTRACT");
        System.out.println("3 :DEVIDE");
        System.out.println("4 :MULTIPLY");
        System.out.print("Enter Your Choice :");

        int choice = scanner.nextInt();
        System.out.println("Your Choice is  :" + choice);
        {
            if (choice == 1) {
                System.out.println("Answer is :" + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Answer is :" + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Answer is :" + (num1 / num2));
            } else if (choice == 4) {
                System.out.println("Answer is :" + (num1 * num2));

            }else{
                System.out.println("invalid entry");
            }


        }
    }

}
