package ThirdHomeWork;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        double compNum = (Math.random() * ((9 - 1) + 1)) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9. Для выхода нажмите 0");
        double userNum = input.nextDouble();
        if (userNum < 1 || userNum > 9) System.out.println("Ошибка");
        if (userNum == 0) {
            System.out.println("Выход из программы");
            return;
        } else {
            while (userNum != compNum) {

                if (userNum > compNum) {
                    System.out.println("Загаданное число меньше");

                }
                if (userNum < compNum) {
                    System.out.println("Загаданное число больше");
                    }
                }
            }
        }
    }

