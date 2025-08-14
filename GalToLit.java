/*
*   Try This 1-1
*   This program converts gallons to liters.
*   Call this program GalToLit.java.
*/

class GalToLit {
    public static void main(String[] args) {
        double gallons, liters, litersPerGallon; // holds the number of gallons, convertionToLiters, litersPerGallon
        gallons = 100.0; // start with 10 gallons
        litersPerGallon = 3.7854; // liters per gallon
        liters = gallons * litersPerGallon; // convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}