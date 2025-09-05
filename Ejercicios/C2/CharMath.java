public class CharMath {
    public static void main(String[] args) {
        char ch = 'A' + 25;
        int limite = 'A' + 25;

        System.out.println(limite);
        System.out.println(ch + " " + (int)ch);
        System.out.println((ch + 1) + " " + (int)ch);

        for (char cc = 'A'; cc < limite; cc++) {
            cc = cc + 3;
            System.out.println(cc);
        }
    }
}