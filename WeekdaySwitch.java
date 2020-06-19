package Pack1;

import java.util.Scanner;

public class WeekdaySwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                System.out.println("Days of the week");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Days of the weekend");
                break;
            }


            default: {
                System.out.println("Enter Valid Number");
            }
        }

    }
}
