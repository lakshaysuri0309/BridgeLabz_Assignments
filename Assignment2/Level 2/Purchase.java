import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double a = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int b = sc.nextInt();

        double c = a * b;
        System.out.println("The total purchase price is INR " + c + " if the quantity " + b + " and unit price is INR " + a);
    }
}
