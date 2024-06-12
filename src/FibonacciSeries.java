import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Please enter a positive  number ");
        }else{
            System.out.println("Fibonacci series up to " + n + " terms:");

            int firstTerm = 0;
            int secondTerm = 1;

            for(int i=1; i<=n; i++){
                System.out.println(firstTerm+ " ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        sc.close();

    }
}
