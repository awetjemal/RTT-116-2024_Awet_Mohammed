package pa_303_05_01;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //find greatest common divisor and display the result

        int gcd = 1;
        for(int k = 1; k < Math.min(a, b); k++) {
            if(a%k == 0 && b%k == 0)
                gcd = k;
        }
        System.out.println("GCD: " + gcd);

    }
}
