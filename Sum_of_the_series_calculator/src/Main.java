import java.util.*;
public class Main {
    public static void calculateSumOfSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }


        System.out.println("Sum of the series: " + sum);
    }

    public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in);
        calculateSumOfSeries(scan.nextInt());
        scan.close();
    }
}