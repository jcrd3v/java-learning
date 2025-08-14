/*
*   Demonstrate the for loop.
*
*   Call this file ForDemo.java.
*/

class ForDemo {
    public static void main(String[] args) {
        int count;

        for (count = 0; count <= 10; count++)
            System.out.println("This is count: " + count); // the first count is zero

        // after the execution of the block the count variable increases
        System.out.println("Done!");
    }
}