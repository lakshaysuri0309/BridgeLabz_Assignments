import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double a = sc.nextDouble();

        double b = a / 3;
        double c = b / 1760;

        System.out.println("The distance in yards is " + b + " while the distance in miles is " + c);
    }
}
