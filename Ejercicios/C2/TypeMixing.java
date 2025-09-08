public class TypeMixing {
    public static void main (String[] args) {
        int age = 25;
        double height = 5.8;
        char grade = 'A';
        boolean check = height > age;

        int charConverted = grade; // here charConverted is automatically
        System.out.println(charConverted);

        System.out.println(age + height); // automatic cast, automatic type promotion
        System.out.println(charConverted + age);
        System.out.println(check);
    }
}
