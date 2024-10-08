package module_303_05;

import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //numbers = insert(numbers, 3, 3.5);
        numbers = delete(numbers, 8 );
        System.out.println(Arrays.toString(numbers));
    }

    public static double[] insert(double[] array, int index, double value) {
        double[] newArray = new double[array.length + 1];

        for(int i = 0; i < index; i++)
            newArray[i] = array[i];

        newArray[index] = value;

        for(int i = index; i < array.length; i++)
            newArray[i + 1] = array[i];
        return newArray;
    }
    public static double[] delete(double[] array, int index) {
        double[] newArray = new double[array.length - 1];
        for(int i = 0; i < index; i++)
            newArray[i] = array[i];
        for(int i = index; i < array.length; i++)
            newArray[i - 1] = array[i];
        return newArray;
    }
}
