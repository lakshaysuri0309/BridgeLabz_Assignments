import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double a = sc.nextDouble();
        System.out.print("Enter height: ");
        double b = sc.nextDouble();

        double c = 0.5 * a * b;
        double d = c / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + d + " and sq cm is " + c);
    }
}
