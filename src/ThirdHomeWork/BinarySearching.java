package ThirdHomeWork;

import java.util.Scanner;

public class BinarySearching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 2 до 100 ");
        int userNum = in.nextInt();
        if (userNum < 2 && userNum > 100) {
            System.out.println("Ошибка");;
        } else {
            System.out.println("Число больше 50 ?");

        }
    }
}
