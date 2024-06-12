import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();

        int largerNumber = 0;
        if(num1 > num2){
            largerNumber = num1;
        }else {
            largerNumber = num2;
        }
        System.out.println("The Largest Number is : "+largerNumber);
    }
}
