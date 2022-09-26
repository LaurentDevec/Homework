package SecondHomeWork;

import java.util.Random;

public class MathRandomTask {
    public static void main(String[] args) {


        int min = 10;
        int max = 500;
        int randNum = max - min;
        Random random = new Random();
        int i = random.nextInt(randNum + 1);
        i += min;
        if (25 <= randNum && randNum <= 200) {
            System.out.println("Число " + randNum + " содержится в интервале (25; 200)");
        } else {
            System.out.println("Число " + randNum + " не содержится в интервале (25; 200)");
        }
    }
}
