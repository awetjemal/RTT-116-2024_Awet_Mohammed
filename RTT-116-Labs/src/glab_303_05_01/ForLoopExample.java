package glab_303_05_01;

public class ForLoopExample {
    public static void main(String[] args) {
        int n = 5;
        // for loop prints the provided text n-times
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        int sum = 0;
        n = 1000;
        // for loop that adds numbers from 1 to 1000.
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);

    }
}
