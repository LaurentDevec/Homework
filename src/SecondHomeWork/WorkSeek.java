package SecondHomeWork;

import java.util.Scanner;

public class WorkSeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your working experience");
        int exp = scanner.nextInt();
        if (age > 100) {
            System.out.println("Мы Вам перезвоним");
        } else {
            if (exp < 5) {
                System.out.println("Вы подходите на должность стажера");
            } else {
                System.out.println("Вы подходите на должность разработчика");
            }
        }
    }
}
