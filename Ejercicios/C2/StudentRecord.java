public class StudentRecord {
    public static void main (String[] args){
        byte courses = 8;
        short id = 11798;
        int points = 43798091;
        long libraryCardNumber = 9129858179182318l;
        float gpa = 3.7f;
        double accountBalance = 2500.78;
        char letterGrade = 'A';
        boolean isEnrolled  = false;
        
        if (isEnrolled) {      
            System.out.println("The student Josué with id " + id + " is enrolled in " + courses + " has " + points + " points with library card number " + libraryCardNumber + " and GPA " + gpa + " and her letter grade is: " + letterGrade);
        } else {
            System.out.println("The student with id " + id  + " isn't enrolled this semester.");
        }
    }
}
