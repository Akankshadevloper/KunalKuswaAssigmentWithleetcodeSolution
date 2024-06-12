import java.util.Scanner;

public class AreaOfPrallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of a parallelogram : ");
        int base = sc.nextInt();

        System.out.println("Enter the height of a parallelogram : ");
        int height = sc.nextInt();

        double area = base*height;
        System.out.println("The area of a parallelogram is "+area);


    }
}
