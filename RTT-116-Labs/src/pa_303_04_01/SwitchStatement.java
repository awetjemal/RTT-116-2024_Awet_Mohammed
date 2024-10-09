package pa_303_04_01;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        /*6. Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out
        the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to
        include “break” statements in each of your cases.
         */
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        day = sc.nextInt();

        if(day < 1 || day > 7){
            System.out.println("Invalid day");
            System.exit(0);
        }
        switch(day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
        }
    }
}
