import java.util.*;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
