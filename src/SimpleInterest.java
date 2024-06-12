import java.util.Scanner;

public class SimpleInterest {
   public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the principal amount
            System.out.print("Enter the principal amount (P): ");
            double principal = scanner.nextDouble();

            // Prompt the user to enter the time period in years
            System.out.print("Enter the time period in years (T): ");
            double time = scanner.nextDouble();

            // Prompt the user to enter the rate of interest
            System.out.print("Enter the rate of interest (R): ");
            double rate = scanner.nextDouble();

            // Calculate the simple interest
            double simpleInterest = (principal * time * rate) / 100;

            // Print the simple interest
            System.out.println("The Simple Interest is: " + simpleInterest);

            // Close the scanner
            scanner.close();
        }
    }

