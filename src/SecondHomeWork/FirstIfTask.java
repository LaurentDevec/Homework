package SecondHomeWork;

import java.util.Scanner;

public class FirstIfTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number");
        int month = scanner.nextInt();

        if (month < 3 && month > 0 || month == 12) {
            System.out.println("Winter");
        } else if (month < 6 && month > 2) {
            System.out.println("Spring");
        } else if (month < 9 && month > 5) {
            System.out.println("Summer");
        } else if (month < 12 && month > 8) {
            System.out.println("Fall");
        } else {
            System.out.println("Error");
        }
    }
}
