/*
* Ejercicio 2: Múltiples Clases
*/

class Operaciones {
    public static void main(String[] args){
        int base = 100;
        Calculador c = new Calculador(); // c -> objeto Calculador

        System.out.println("Valor base: " + base);
        c.resultado = base + 25;
        System.out.println("Base + 25 = " + c.resultado);
        c.resultado = base - 30;
        System.out.println("Base - 30 = " + c.resultado);
        c.resultado = base * 2;
        System.out.println("Base * 2 = " + c.resultado);
        c.resultado = base / 4;
        System.out.println("Base / 4 = " + c.resultado);
    }
}

class Calculador {
    int resultado;
}