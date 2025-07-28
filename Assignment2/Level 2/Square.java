import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double a = sc.nextDouble();

        double b = a / 4;
        System.out.println("The length of the side is " + b + " whose perimeter is " + a);
    }
}
