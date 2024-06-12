import java.util.Scanner;

public class AddTwoNumbers {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the first integer
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            // Prompt the user to enter the second integer
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            // Calculate the sum of the two integers
            int sum = firstNumber + secondNumber;

            // Print the result
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

            // Close the scanner
            scanner.close();
        }
    }