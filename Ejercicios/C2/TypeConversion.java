package Ejercicios.C2;

public class TypeConversion {
    public static void main(String[] args){
        double value = 123.789;                
        byte byteValue = 1;
        short shortValue = 1;
        long longValue = 1L;
        int largeInt = 2000000000;
        
        System.out.println("Explicit conversion");
        System.out.println((int)value);
        System.out.println((byte)largeInt); 
        System.out.println((short)largeInt);

        System.out.println();
        
        System.out.println("Implicit conversion");
        System.out.println("byte + int: " + largeInt + byteValue);
        System.out.println("short + int: " + largeInt + shortValue);
        System.out.println("long + int: " + largeInt + longValue); 
    }
}
