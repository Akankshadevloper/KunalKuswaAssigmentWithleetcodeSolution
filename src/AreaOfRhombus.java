import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st diagonal of a rhombus : ");
        int d1 = in.nextInt();

        System.out.println("Enter the 2nd diagonal of a rhombus : ");
        int d2 = in.nextInt();

        double area = (d1*d2)/2;
        System.out.println("The area of the rhombus is : "+area);
    }
}
