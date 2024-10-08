package pa_303_02_01;

import java.text.DecimalFormat;

public class JavaBasics {
    public static void main(String[] args) {
        /*Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        Assign the sum to a variable. Print out the result.
         */
        int a = 8;
        int b = 14;
        int c = a + b;
        System.out.println("c = a + b " +c);
        /*Write a program that declares two double variables, assigns a number to each, and adds them together.
         Assign the sum to a variable. Print out the result.
         */
        double d = 4.5;
        double e = 7.0;
        double sum = e + d;
        System.out.println("sum = e + d " +sum);
        /*Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
         Assign the sum to a variable. Print out the result. What variable type must the sum be?
         */
        sum = c + d;
        System.out.println("sum = c + d " + sum);

        /*Write a program that declares two integer variables, assigns an integer to each, and divides the larger number
         by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
         What happens? What corrections are needed?
         */
        c = b / a;
        System.out.println("c = b / a " +c);
        d = 14.0 / a;
        System.out.println("d = 14.0 / a " +d);
        /*Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
         Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
         */
        double d1 = 8.5;
        double d2 = 14.0;
        System.out.println("d2 / d1 = " + d2/d1);
        System.out.println("(int)(d2 / d1) = " + (int)(d2/d1));
        /*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
         Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
         */
        int x = 5;
        int y = 6;
        double q = y/x;
        System.out.println("q = " + q);
        q = (double)y / x;
        System.out.println("q = " + q);
        /*Write a program that declares a named constant and uses it in a calculation. Print the result.*/
        final int CONST1 = 10;
        final int CONST2 = 20;
        System.out.println("CONST1 + CONST2 = " + (CONST1 + CONST2));

        /*Write a program where you create three variables that represent products at a cafe. The products could be beverages like coffee,
         cappuccino, espresso, green tea, etc. Assign prices to each product. Create two more variables called subtotal and totalSale and
         complete an “order” for three items of the first product, four items of the second product, and two items of the third product.
         Add them all together to calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the
         totalSale amount. Be sure to format the results to two decimal places.
         */
        double coffee = 2.99;
        double espresso = 3.29;
        double cappuccino = 4.59;
        final double SALES_TAX = 0.10;
        double subTotal = 0;
        double total = 0;
        subTotal = coffee*3 + espresso*4 + cappuccino*2;
        total = subTotal + (SALES_TAX * subTotal);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nsubTotal before tax = " +df.format(subTotal));
        System.out.println("Order total = " + df.format(total));
    }
}
