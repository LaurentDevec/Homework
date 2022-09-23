package FirstHomeWork;

public class ParallelepipedSquare {
    public static void main(String[] args) {
        int length = 7;
        int width = 3;
        int high = 4;

        int square = 2 * ((length*width) + (width*high) + (length*high));

        System.out.println(square);

    }
}
