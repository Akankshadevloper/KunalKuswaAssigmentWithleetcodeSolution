import java.util.Scanner;

public class LargestNumberUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number ;
        int largestNumber = Integer.MIN_VALUE;

        while(true){
            System.out.print("Enter an integer (0 to stop): ");
            number = sc.nextInt();

            if(number == 0){
                break;
            }
            if(number > largestNumber){
                largestNumber = number;
            }
        }

        if(largestNumber == Integer.MIN_VALUE){
            System.out.println("No numbers were entered.");
        }else{
            System.out.println("The largest number is " + largestNumber);
        }

        sc.close();
    }
}
