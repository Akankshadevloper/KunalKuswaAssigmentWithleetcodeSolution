import java.util.Scanner;

public class Operators {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
        }else if (operator == '/') {
            result = num1 / num2;
        }
        System.out.println("The result is: " + result);
    }
}
