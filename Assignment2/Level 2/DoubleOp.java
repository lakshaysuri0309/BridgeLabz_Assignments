import java.util.Scanner;

public class DoubleOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double d = a + b * c;
        double e = a * b + c;
        double f = c + a / b;
        double g = a % b + c;

        System.out.println("The results of Double Operations are " + d + ", " + e + ", " + f + ", and " + g);
    }
}
