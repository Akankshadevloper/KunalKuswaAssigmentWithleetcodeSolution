import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        while(true){
            System.out.print("Enter an integer (0 to  stop) : ");
            number = sc.nextInt();

            if(number == 0){
                break;
            }

            sum += number;
        }
        System.out.println("The sum of all entered number is :  " + sum);

        sc.close();
    }
}
