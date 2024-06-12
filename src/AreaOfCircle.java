import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of a circle : ");
        int r = sc.nextInt();

         double area = 2.14*r*r;

        System.out.println("The area of the circle is "+area);
    }
}
