/*

Use the Pythagorean theorem to find the length of the hypotenuse given the lengths of the two opposing sides.

 */

public class Hypot {
    public static void main (String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
        // System.out.println("Hypotenuse is " + Math.hypot(x, y));
//        System.out.println(Math.pow(2, 3));
//        System.out.println(Math.rint(2.51));
    }
}