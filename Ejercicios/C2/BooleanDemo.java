public class BooleanDemo {
    public static void main(String[] args) {

        char first = 'Z';
        char second = 'A';

        boolean comparison1 = 15 > 10;
        boolean comparison2 = 8 == (4*2);
        boolean comparison3 = first < second;

        if (comparison1) {
            System.out.println("15 is greater than 10.");
        }

        if (comparison2) {
            System.out.println("8 is equal to 4*2.");
        }

        if (comparison3) {
            System.out.println("The first character " + first + " is less than the second one " + second + ".");
        } else {
            System.out.println("The second character " + second + " is less than the first one " + first + ".");
        }

    }
}