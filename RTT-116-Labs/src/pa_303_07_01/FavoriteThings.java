package pa_303_07_01;

import java.util.Arrays;
import java.util.Scanner;

public class FavoriteThings {
    public static void main(String[] args) {

        /*Task 11: Write some Java code that asks the user how many favorite things they have.
         Based on their answer, you should create a String array of the correct size.
         Then ask the user to enter the things and store them in the array you created.
         Finally, print out the contents of the array.
        Example
        How many favorite things do you have?
        7

        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite  things are:
        phone tv xbox wine beer sofa book
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite thing do you want to add?");
        int num = sc.nextInt();
        String[] favoriteThings = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter your thing: ");
            favoriteThings[i] = sc.next();
        }
        System.out.println("Your favorite things are:\n"  + Arrays.toString(favoriteThings));
    }
}
