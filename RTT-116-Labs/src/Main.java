import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] sArr = {"aab", "acc", "bcc", "bdd"};
        List<String> list = new ArrayList<>(Arrays.asList(sArr));
        System.out.println(list);
        List<String> list2 = list.stream().filter(e -> e.startsWith("b")).toList();
        System.out.println(list2);

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
