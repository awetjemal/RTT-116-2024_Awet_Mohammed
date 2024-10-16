import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer arr[] = {10, 2, 3, 99, 12, 0};
        String s = "Bread$$##12.5$$##10";
        String[] sArr = s.split("\\$\\$\\#\\#");
        System.out.println(Arrays.asList(sArr));
        int sum = 0;
        System.out.println("The subarrays & their sum are-");

        // For loop for start index
        for (int i = 0; i < arr.length; i++)

            // For loop for end index
            for (int j = i; j < arr.length; j++) {

                // For loop to print subarray elements
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print(" => " + sum);
                sum = 0;
                System.out.println("");
            }
        System.out.println("number of sub arrays their sum equats to 111:  " + countNumberOfSubarrays(Arrays.asList(arr), 111));
    }//end of main method
        public static long countNumberOfSubarrays (List < Integer > arr,int k){
            // Write your code here
            long currentSum = 0;
            long sumCount = 0;
            for (int i = 0; i < arr.size(); i++) {

                for (int j = i; j < arr.size(); j++) {

                    for (int l = i; l <= j; l++) {
                        currentSum += arr.get(l);
                    }
                    if (currentSum == k)
                        sumCount++;
                    currentSum = 0;

                }//end of inner loop
            }//end of outer loop
            return sumCount;

        }

    }
