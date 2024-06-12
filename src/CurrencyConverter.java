import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double exchangeRate = 0.012;

        System.out.println("Enter the  amount in Indian Rupees : ");
        double amount = sc.nextDouble();

        double rate = exchangeRate*amount;
        System.out.println("The amount in US Dollars (USD) is: " + rate);

    }
}
