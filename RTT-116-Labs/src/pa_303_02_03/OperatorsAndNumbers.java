package pa_303_02_03;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        /*Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary
         string version of the number ( Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift by 1 and
         assign the result to x. Before printing the results, write a comment with the predicted decimal value and binary string.
          Now, print out x in decimal form and in binary notation. Perform the preceding exercise with the following values:
        9
        17
        88
        */
        int x = 2;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x << 1;//
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 9;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 17;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 88;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x << 1;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        /*Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number.
        Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate
        the decimal and binary values to be. Now print the value of x and the binary string.
        Perform the preceding exercise with the following values:
        225
        1555
        32456
        */
        x = 150;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 225;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 1555;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);
        x = 32456;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println("Integer.toBinaryString(x): " + Integer.toBinaryString(x));
        System.out.println("x: " + x);

    }
}
