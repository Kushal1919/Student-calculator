import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Project title
        System.out.println("=================================");
        System.out.println("       STUDENT CALCULATOR");
        System.out.println("=================================");

        // Get student name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Get number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Array to store marks
        int[] marks = new int[subjects];

        int total = 0;

        // Get marks
        for (int i = 0; i < subjects; i++) {

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Calculate total
            total = total + marks[i];
        }

        // Calculate average
        double average = (double) total / subjects;

        // Calculate percentage
        double percentage = average;

        // Calculate grade
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } 
        else if (percentage >= 80) {
            grade = "A";
        } 
        else if (percentage >= 70) {
            grade = "B";
        } 
        else if (percentage >= 60) {
            grade = "C";
        } 
        else if (percentage >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        // Calculate pass or fail
        String result;

        if (percentage >= 40) {
            result = "PASS";
        } 
        else {
            result = "FAIL";
        }

        // Find highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        for (int i = 1; i < subjects; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        // Display final result
        System.out.println();
        System.out.println("=================================");
        System.out.println("          STUDENT RESULT");
        System.out.println("=================================");

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.printf("Average      : %.2f%n", average);
        System.out.printf("Percentage   : %.2f%%%n", percentage);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("Highest Mark : " + highest);
        System.out.println("Lowest Mark  : " + lowest);

        System.out.println("=================================");

        sc.close();
    }
}