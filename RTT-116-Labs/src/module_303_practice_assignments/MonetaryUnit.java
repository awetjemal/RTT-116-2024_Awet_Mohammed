package module_303_practice_assignments;

import java.util.Scanner;
public class MonetaryUnit {
    /*
    Input:  3.87
Output:	3 dollars
		3 quarters
		1 dime
		0 nickels
		2 pennies
*/
//Ask user to enter the monetary value eg. 3.87
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        double amount = input.nextDouble();
        int dollar = (int)(amount);
        int cents = (int)((amount - dollar) * 100);
        int quarters = cents / 25;
        int remainder = cents % 25;
        int dime = remainder / 10;
        remainder = remainder % 10;
        int nickel = remainder / 5;
        remainder = remainder % 5;
        int pennies = remainder ;
        System.out.println(dollar + " dollars");
        System.out.println(cents + " cents");
        System.out.println(quarters + " quarters");
        System.out.println(dime + " dimes");
        System.out.println(nickel + " nickels");
        System.out.println(pennies + " pennies");


    }
}
