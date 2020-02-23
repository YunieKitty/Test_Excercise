import java.util.Scanner;

class Grader {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int grade;

        System.out.println("Please enter your grade:");
        grade = myScanner.nextInt();

        // comparison operators: > < = <= >= 
        if(grade >= 70) {
            System.out.println("Distinction");
        } else if(grade >= 60) {
            System.out.println("Merit");
        } else if(grade >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
    }
}