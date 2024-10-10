package pa_303_07_01;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /*Task 1: Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes.
         Print out each array element.
         */
        int[] intArray = {1, 2, 3};
        for(int i : intArray)
            System.out.println(i);
        /*Task 2: Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2}
         and produce the following output: 7
         */
        intArray = new int[]{13, 5, 7, 68, 2};
        System.out.println("The middle element of the array is: " + intArray[intArray.length/2]);
        /*Task 3: Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
        Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that
        the original array was copied.
         */
        String[] stringArray = {"Red", "Green", "Blue", "Yellow"};
        System.out.println("The length of the array is: " + stringArray.length);
        String[] copiedArray = stringArray.clone();
        System.out.println("Contents of the copied array are: " + Arrays.toString(copiedArray));

        /*Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.
        Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length (e.g., myArray[myArray.length] ).
        Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
        */
        intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println("The first element of the array is: " + intArray[0]);
        System.out.println("The last element of the array is: " + intArray[intArray.length-1]);
        //System.out.println("The index out of bound of the array is: " + intArray[intArray.length]);

        /*Task 5: Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control
         variable (e.g., i) to the corresponding index in the array.
         */
        int[] intArray1 = new int[5];
        for(int i = 0; i < intArray1.length; i++){
            intArray1[i] = i;
        }
        /*Task 6: Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable
         multiplied by 2 to the corresponding index in the array.
         */
        int[] intArray2 = new int[5];
        for(int i = 0; i < intArray1.length; i++){
            intArray2[i] = i*2;
        }
        /*Task 7: Write a program where you create an array of 5 elements. Loop through the array and print the value of each element,
         except for the middle (index 2) element.
         */

        for(int i = 0; i < intArray2.length; i++){
            if(i != 2)
                System.out.print(intArray2[i] + " ");
            //intArray2[i] = i*2;
        }
        /*Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without
        creating a new array.
         */
        String[] stringArray1 = {"Red", "Green", "Blue", "Yellow", "Black"};
        String temp = stringArray1[0];
        stringArray1[0] = stringArray1[stringArray1.length/2];
        stringArray1[stringArray1.length/2] = temp;
        System.out.println("\nThe content of the array after swap is: " +Arrays.toString(stringArray1));

        /*Task 9:
        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
        and print the smallest and the largest element of the array. The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13
        */
        intArray = new int[]{4, 2, 9, 13, 1, 0};
        for(int i = 0; i < intArray.length-1; i++){
            int currentMin = intArray[i];
            int currentMinIndex = i;
            for(int j = i+1; j < intArray.length; j++){
                if(currentMin > intArray[j]){
                    currentMin = intArray[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                intArray[currentMinIndex] = intArray[i];
                intArray[i] = currentMin;
            }

        }
        System.out.println("Array in ascending order: " + Arrays.toString(intArray));
        System.out.println("The smallest number is: " + intArray[0]);
        System.out.println("The biggest number is: " + intArray[intArray.length - 1]);

        /*Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
         */
        Object[] array = {4, "Atlanta", "Phoenix", "Tampa", 6.5};
        System.out.println("The array of objects is: " + Arrays.toString(array));


    }
}
