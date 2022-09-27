package ThirdHomeWork;

import java.util.Scanner;

        public class PlatesWashingMachine {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите число тарелок");
                int userPlates = input.nextInt();
                if (userPlates <= 0 && (userPlates % 1 != 0)) {
                    System.out.println("Error");
                } else {
                    System.out.println("Введите количество средства");
                    double userDetergent = input.nextDouble();
                    if (userDetergent <= 0) {
                        System.out.println("Error");
                    } else {


                        while (userPlates > 0 && userDetergent > 0) {
                            userPlates = userPlates - 1;
                            userDetergent = userDetergent - 0.5;
                            System.out.println("Осталось моющего средства " + userDetergent);
                        }
                            System.out.println("Осталось тарелок " + userPlates + " Осталось моющего средства " + userDetergent);

                    }
                }
            }
        }
