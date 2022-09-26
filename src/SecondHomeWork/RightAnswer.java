package SecondHomeWork;

import java.util.Scanner;

public class RightAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter right answer count");
        int count = scanner.nextInt();
        if (count > 89 && count < 101) {
            System.out.println("Excellent!");
        } else if (count > 59 && count < 90) {
            System.out.println("Good!");
        } else if (count > 39 && count < 60) {
            System.out.println("Satisfactory!");
        } else if (count > 0 && count < 40) {
            System.out.println("Unsatisfactory!");
        } else {
            System.out.println("Error!");
        }


    }
}
