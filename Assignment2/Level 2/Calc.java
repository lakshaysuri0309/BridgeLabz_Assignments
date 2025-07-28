import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                a + " and " + b + " is " + c + ", " + d + ", " + e + ", and " + f);
    }
}
