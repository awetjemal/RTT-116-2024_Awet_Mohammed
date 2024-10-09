package pa_303_02_03;

public class OperatorsAndNumbers2 {
    public static void main(String[] args) {
        /*Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y. Write a comment
        that indicates what you predict will be the result of the bitwise and operation on x and y. Now use the bitwise AND
        (&) operator to derive the decimal and binary values, and assign the result to z.
         */
        int x = 7;
        int y = 17;
        int z = x & y;
        System.out.println("Integer.toBinaryString(7) = " + Integer.toBinaryString(x));
        System.out.println("Integer.toBinaryString(17) = " + Integer.toBinaryString(y));
        System.out.println("Integer.toBinaryString(7 & 17) = " + Integer.toBinaryString(z));
        System.out.println("Decimal value of 7 & 17 = " + z);

        /*Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y. As before,
         write a comment that indicates what you predict the values to be before printing them out.
         */
        z = x | y;
        System.out.println("Integer.toBinaryString(7 | 17) = " + Integer.toBinaryString(z));

        /*Write a program that declares an integer variable, assigns a number, and uses a postfix increment
        operator to increase the value. Print the value before and after the increment operator.*/
        System.out.println("Before increment = " + z);
        System.out.println("z++ = " + z++);
        System.out.println("After increment = " + z);

        /*Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
         */
        z = z + 1;
        System.out.println("z = z + 1 -> " + z);
        ++z;
        System.out.println("++z -> " + z);
        z++;
        System.out.println("z++ " + z);

        /*Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y. Create another
         variable sum and assign the value of ++x added to y, and print the result. Notice the value of the sum (should be 14).
         Now change the increment operator to postfix (x++) and re-run the program. Notice what the value of the sum is.
         The first configuration incremented x, and then calculated the sum, while the second configuration calculated the sum,
         and then incremented x.
         */
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println("sum = ++x + y " + sum);
        x = 5;
        y = 8;
         sum = x++ + y;
         System.out.println("sum = x++ + y " + sum);



    }
}
