import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter total runs scored: ");
        int totalRuns = sc.nextInt();

        System.out.print("Enter number of times out: ");
        int timesOut = sc.nextInt();

        // Check to avoid division by zero
        if (timesOut == 0) {
            System.out.println("Times out cannot be zero. Batting average is undefined.");
        } else {
            // Calculate batting average
            double battingAverage = (double) totalRuns / timesOut;
            System.out.println("Batting Average = " + battingAverage);
        }

        sc.close();
    }
}
