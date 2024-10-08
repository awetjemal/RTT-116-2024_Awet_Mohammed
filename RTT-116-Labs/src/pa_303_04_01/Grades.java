package pa_303_04_01;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        /*5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: <60
        Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range”
        if the score is less than 0 or greater than 100.
*/
        double score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score of the student: ");
        score = input.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        }else{
            if (score >= 90 ) {
                System.out.println("Grade: A");
            }else if(score >= 80)
                System.out.println("Grade: B");
            else if (score >= 70)
                System.out.println("Grade: C");
            else if(score >= 60)
                System.out.println("Grade: D");
            else
                System.out.println("Grade: F");
        }
    }
}
