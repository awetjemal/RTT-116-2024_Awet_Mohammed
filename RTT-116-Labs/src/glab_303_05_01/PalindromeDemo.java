package glab_303_05_01;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        String original , reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original string: ");
        original = sc.nextLine();
        //reverse the original string using loop
        for(int i = original.length()-1; i >= 0; i--)
            reverse += original.charAt(i);
        //test if the two strings are equal
        if(original.equals(reverse))
            System.out.println("The original string is a palindrome");
        else
            System.out.println("The original string is not a palindrome");
    }
}
