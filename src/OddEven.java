import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        try {
            int num = sc.nextInt();

            if(num % 2 == 0) {
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }catch (Exception e) {
            System.out.println("Please enter a valid number");
        }finally {
            sc.close();
        }
    }
}
