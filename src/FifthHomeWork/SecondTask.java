package FifthHomeWork;

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr1 = new int[10];


            int[] arr2 = new int[arr1.length];

            for (int m = 2; m < arr1.length; m++) {
                arr2[arr1.length - 1 - m] = arr1[m];
                System.out.println(arr1[m] + " ");

                System.out.print(Arrays.toString(arr1));


            }
        }
    }


