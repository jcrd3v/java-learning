/*
*   Try This 1-2
*
*   This program displays a conversion
*   table of gallons to liters.
*
*   Call this program "GalToLitTable.java"
*
* use the for loop and the if statement
* print a table of conversions from 1 to 100
* see the img
* every 10 gallons a blank line will be output
* use a variable counter the counts the number of lines that have been output
* */

class GalToLitTable {
    public static void main (String[] args){
        double gallons, liters, litersPerGallon;
        int counter = 0;
        litersPerGallon = 3.7854;

        for(gallons = 1.0; gallons <= 100.0; gallons++) {
            liters = gallons * litersPerGallon;
            // gallons and counter are the same number each iteration.
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter = counter + 1; // counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}