// Ejercicio 2 (Básico-Intermedio): Suma todos los números del 1 al 100
// que sean divisibles por 3 o 5, combinando bucle for con condiciones.

class DivisiblesPorTresOCinco {
    public static void main(String[] args){
        int count;
        int suma = 0;
        for(count = 1; count <= 100; count++) {
            if (count % 3 == 0 || count % 5 == 0){
                suma = suma + count;
            }
        }
        System.out.println("La suma de los números divisibles por 3 o 5 es: " + suma);
    }
}