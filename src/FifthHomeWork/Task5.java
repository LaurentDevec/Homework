package FifthHomeWork;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Введите длинну массива");
            int a = input.nextInt();
            int[] arr1 = new int[a];

            for (int i = 0; i < arr1.length; i++)
                arr1[i] = (int) (Math.random() * a);
            for (int i : arr1)
                System.out.print(i + ", ");
    }
}
