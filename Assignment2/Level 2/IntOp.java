import java.util.Scanner;

public class IntOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int d = a + b * c;
        int e = a * b + c;
        int f = c + a / b;
        int g = a % b + c;

        System.out.println("The results of Int Operations are " + d + ", " + e + ", " + f + ", and " + g);
    }
}
