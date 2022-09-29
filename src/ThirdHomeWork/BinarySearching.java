package ThirdHomeWork;

import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        int max = 100;
        int min = 2;
        int compNum = (int) (Math.random() * ((max - min) + 1));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 2 до 100 ");
        int userNum = in.nextInt();
        if (userNum < 2 && userNum > 100) {
            System.out.println("Ошибка");
            ;
        } else {
            while (compNum != userNum) {
                if (compNum > userNum) {
                    compNum = compNum / 2;
                } else if (compNum < userNum) {
                    compNum += 1;
                } else {
                    break;
                }
                System.out.println("Загаданное число = " + compNum);
            }
        }
    }
}

