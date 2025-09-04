public class IntegerLimits {
    public static void main(String[] args) {
        byte b_largest = 127;
        short s_largest = 32767;
        int i_largest = 2147483647;
        long l_largest = 9223372036854775807l; // Here l or L is necessary otherwise you'll get a compilation error. Just when assigning.

        System.out.println("127 is the largest value for this byte variable -> " + b_largest);
        System.out.println("32767 is the largest value for this short variable -> " + s_largest);
        System.out.println("2147483647 is the largest value for this int variable -> " + i_largest);
        System.out.println("9223372036854775807 is the largest value for this long variable -> " + l_largest);

        System.out.println("\n=============================");

        byte b_shortest = -128;
        short s_shortest = -32768;
        int i_shortest = -2147483648;
        long l_shortest = -9223372036854775808l;

        System.out.println("\n-128 is the shortest value for this byte variable -> " + b_shortest);
        System.out.println("-32768 is the shortest value for this short variable -> " + s_shortest);
        System.out.println("-2147483648 is the shortest value for this int variable -> " + i_shortest);
        System.out.println("-9223372036854775808l is the shortest value for this long variable -> " + l_shortest);
    }
}
