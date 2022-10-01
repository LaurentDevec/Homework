package FifthHomeWork;

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0, j = 2; i < arr1.length; i++, j += 2) {
            arr1[i] = j;

          /*  for (int i = 0; i < arr1.length / 2; i+=2) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp; */

            System.out.print(Arrays.toString(arr1));
         /*    int[] arr2 = new int[arr1.length];

            for (int m = 2; i < arr1.length; m++) {
                arr2[arr1.length - 1 - m] = arr1[m];
                System.out.println(arr1[m] + " ");

            } */
        }
    }
}

