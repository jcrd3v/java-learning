/*

Compute the number of cubic inches in 1 cubic mile

 */

public class CubicInchesInCubicMile {
    public static void main(String[] args) {
        long ci;
        int im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in a cubic mile.");
    }
}