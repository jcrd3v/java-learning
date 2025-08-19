// Ejercicio 1 (Simple): Determina si un número es par o impar usando el operador módulo.

class ParImpar {
    public static void main(String[] args) {
        int numero = 29;
        if(numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}