package pa_303_05_01;

public class FutureTuition {
    public static void main(String[] args) {
        /*3: Predict Future Tuition
Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
In how many years will the tuition be doubled?

Year
Tuition
0
$10,000
1
tuition = 1.07 * tuition
…
tuition = 1.07 * tuition
…
tuition = 1.07 * tuition
…
…
?
$20,000 or more

*/
        double tuition = 10000;
        int year = 0;
        while (tuition <= 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("The tuition will double in " + year + " years");
    }
}
