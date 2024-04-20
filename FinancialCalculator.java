import java.util.InputMismatchException;
import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        float total = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        final int MAX_COUNT = 5;
        
        while (count < MAX_COUNT) {
            try {
                System.out.print("Enter a number (" + (count + 1) + " of " + MAX_COUNT + "): ");
                float value = scanner.nextFloat();
                
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                
                count++; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // To consume the invalid input
            }
        }
        
        float average = total / MAX_COUNT;
        float interest = total * 0.20f; // 20% interest
        
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);
        
        scanner.close();
    }
}
