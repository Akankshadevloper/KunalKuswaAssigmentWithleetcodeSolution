import java.util.Scanner;

public class Operator2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Variable to store the result
        double result = 0;

        // Perform the calculation based on the operator using if conditions
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            // Check if the divisor is zero
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid operator! Please enter one of +, -, *, /.");
            scanner.close();
            return;
        }

        // Print the result
        System.out.println("The result is: " + result);

        // Close the scanner
        scanner.close();
    }
}


