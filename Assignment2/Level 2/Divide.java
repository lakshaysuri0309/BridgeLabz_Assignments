import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int c = a / b;
        int d = a % b;

        System.out.println("The Quotient is " + c + " and Remainder is " + d + " of two numbers " + a + " and " + b);
    }
}
