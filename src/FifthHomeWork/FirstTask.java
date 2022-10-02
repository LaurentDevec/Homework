package FifthHomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите длинну массива");
        int a = input.nextInt();
        int[] arr1 = new int[a];

        for (int i=0; i<arr1.length; i++)
            arr1[i] = (int) (Math.random() * a);
        for (int i: arr1)
            System.out.print( i + ", " );

        int maxNum = arr1[0];

        for (int j : arr1) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Максимальный элемент = " + maxNum);

        int minNum = arr1[0];

        for (int j : arr1) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Минимальный элемент = " + minNum);

        int averageArr = 0;

        int sumArr = 0;
        for (int j = 0; j < arr1.length; j++) {
            sumArr += arr1[j];
        }
        averageArr = sumArr / arr1.length;

        System.out.println("Среднее арифметическое элементов = " + averageArr);

    }
}

