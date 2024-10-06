package glab_303_03_01;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
        String[] vowelsArray = vowels.split("::");

        //converting array to string and print it
        System.out.println(Arrays.toString(vowelsArray));
    }
}
