public class CharMath {
    public static void main(String[] args) {
        char ch = 'A';
        int limite = ch + 25;
        System.out.println("limite: " + limite);
        System.out.println("The char is " + ch +  ", its numeric Unicode value is " + (int)ch + ".");

        for (int i = ch; i <= limite; i++) {
            if (ch == 'X'){
                System.out.println("The Caesar cipher for the character X is A ");
                System.out.println("The Caesar cipher for the character Y is B ");
                System.out.println("The Caesar cipher for the character Z is C ");
                break;
            }
            System.out.println("The Caesar cipher for the character " + ch + " is "  +  (char)(ch + 3));
            ch++;

        }

    }
}