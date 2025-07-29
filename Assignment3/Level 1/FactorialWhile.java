import java.util.*;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial: " + fact);
    }
}
