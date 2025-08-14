class MyWeightOnTheMoon {
    public static void main(String[] args) {
        double earthGravity, moonGravity;
        double myMass, myWeight;
        double myEarthWeight, myMoonWeight;

        myMass = 72.0;
        earthGravity = 9.8;

        moonGravity = earthGravity * 0.17;

        myEarthWeight =  myMass * earthGravity;
        myMoonWeight = myMass * moonGravity;

        System.out.println("My weight on the earth is: " + myEarthWeight);
        System.out.println("My weight on the moon is: " + myMoonWeight);
    }
}