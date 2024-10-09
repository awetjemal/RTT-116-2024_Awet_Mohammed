package glab_303_05_02;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //generate random number between 0 & 100
        int number = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        int guess = -1;

        while (guess != number) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            if (guess == number)
                System.out.println("Congratulations! You guessed it!");
            else if (guess > number)
                System.out.println("Too high!, try again");
            else if (guess < number)
                System.out.println("Too low!, try again");
        }
        // guess = sc.nextInt();

    }
}
