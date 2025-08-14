class InchesToMetersTable {
    public static void main(String[] args) {
        int inches;
        double inchesPerMeter, metersPerInch;
        int counter = 0;

        inchesPerMeter = 39.37;

        // I know a foot has 12 inches so 12 feet have 144 inches
        for(inches = 1; inches <= 144; inches++) {
            metersPerInch = inches / inchesPerMeter;
            System.out.println(inches + " inches is " + metersPerInch + " meters");
            counter++;

            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}