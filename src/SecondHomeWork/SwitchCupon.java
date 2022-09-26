package SecondHomeWork;

import java.util.Scanner;

public class SwitchCupon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coupon number");
        int number = scanner.nextInt();

        System.out.println("Enter sum of purchase");
        int sum = scanner.nextInt();
        switch (number) {
            case 4525:
              sum = (int) (sum * 0.7);
                System.out.println("The real sum of your purchase is " + sum);
                break;
            case 6424:
            case 7012:
                sum = (int) (sum * 0.8);
                System.out.println("The real sum of your purchase is " + sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum = (int) (sum * 0.9);
                System.out.println("The real sum of your purchase is " + sum);
                break;
        }
    }
}
