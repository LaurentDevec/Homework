package FifthHomeWork;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String string1 = new String ("в предложении все слова разной длины");
        String arrStr[] = string1.split(";");
        String maxString = "";
        for (String w : arrStr) {
            if (w.length() > maxString.length()) {
                maxString = w;
            }
        }

        System.out.println(maxString);
    }
}







