/*
*  Ejercicio 1: Calculadora Simple
*/

class Calculadora {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = 50;
        numero2 = 12;

        int suma, resta, multiplicacion, division;
        suma = 50 + 12;
        resta = 50 - 12;
        multiplicacion = 50 * 12;
        division = 50 / 12; // Se asignó solo la parte entera.

        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
    }
}