public class FloatPrecision {
    public static void main(String[] args) {
        float f, f_area;
        double d, d_area, d_area1;
        float f_pi = 3.141592653589793238f;
        double d_pi = 3.141592653589793238;

        System.out.println(f_pi);
        System.out.println(d_pi);

        f = 10.0f / 3.0f;
        d = 10.0 / 3.0;

//        f_area = f_pi * Math.pow(f, 2); Not possible beacuse the arguments must be double according to documentation.
        f_area = f_pi * (f * f);
        d_area = d_pi * Math.pow(d, 2);
        d_area1 = d_pi * (d * d);

        System.out.println("Area calculated with float: " + f_area);
        System.out.println("Area calculated with double: " + d_area);
        System.out.println("Area calculated with double: " + d_area1);


    }
}