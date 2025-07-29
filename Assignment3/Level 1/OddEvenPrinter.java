import java.util.*;
public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }
}
