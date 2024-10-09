package pa_303_04_01;

import java.util.Scanner;

public class TaxAmount {
    public static void main(String[] args) {
        /*7. Create a program that lets the users input their filing status and income. Display how much tax the user would
         have to pay according to status and income.
        The U.S. federal personal income tax is calculated based on the filing status and taxable income.
        There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
        The tax rates for 2009 are shown below.
        */
        double tax = 0;
        double income = 0;
        int status;
        Scanner input = new Scanner(System.in);
        System.out.println("[1-single, 2-married, 3-married filing separately, 4-head of house hold]");
        System.out.print("Enter tax status : ");
        status = input.nextInt();
        System.out.print("\nEnter income : ");
        income = input.nextDouble();

        if (status == 0) { // Compute tax for single filers
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                        (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                        (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                        (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 +
                        (income - 372950) * 0.35;
            }
        } else if (status == 1) {
            if (income <= 16700.0) {
                tax = income * 0.1;
            } else if (income <= 67900.0) {
                tax = 1670.0 + (income - 16700.0) * 0.15;
            } else if (income <= 137050.0) {
                tax = 9350.0 + (income - 67900.0) * 0.25;
            } else if (income <= 208850.0) {
                tax = 26637.5 + (income - 137050.0) * 0.28;
            } else if (income <= 372950.0) {
                tax = 46741.5 + (income - 208850.0) * 0.33;
            } else {
                tax = 90562.5 + (income - 372950.0) * 0.35;
            }

        } else if (status == 2) {
            if (income <= 8350.0) {
                tax = income * 0.1;
            } else if (income <= 33950.0) {
                tax = 835.0 + (income - 8350.0) * 0.15;
            } else if (income <= 68525.0) {
                tax = 4675.0 + (income - 33950.0) * 0.25;
            } else if (income <= 104425.0) {
                tax = 13318.75 + (income - 68525.0) * 0.28;
            } else if (income <= 186475.0) {
                tax = 23370.75 + (income - 104425.0) * 0.33;
            } else {
                tax = 50447.25 + (income - 186475.0) * 0.35;
            }

        } else if (status == 3) {
            if (income <= 11950.0) {
                tax = income * 0.1;
            } else if (income <= 45500.0) {
                tax = 1195.0 + (income - 11950.0) * 0.15;
            } else if (income <= 117450.0) {
                tax = 6227.5 + (income - 45500.0) * 0.25;
            } else if (income <= 190200.0) {
                tax = 24215.0 + (income - 117450.0) * 0.28;
            } else if (income <= 372950.0) {
                tax = 44585.0 + (income - 190200.0) * 0.33;
            } else {
                tax = 104892.5 + (income - 372950.0) * 0.35;
            }

        } else {
            System.out.println("Invalid status...");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
