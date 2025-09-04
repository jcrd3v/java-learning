// Character variables can be handled like integers.

public class CharArithDemo {
    public static void main (String[] args) {
        char ch;
        ch = 'X';

        System.out.println("ch contains " + ch);

        ch++; // increment ch
        System.out.println("ch is now " + ch + " " + (int)ch);

        ch = 90; // give ch the value Z (capitalized, z has other integer value)
        System.out.println("ch is now " + ch + " " + (int)ch);
    }
}