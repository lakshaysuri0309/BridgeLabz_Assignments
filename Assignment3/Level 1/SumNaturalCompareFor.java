import java.util.*;
public class SumNaturalCompareFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumFormula = n * (n + 1) / 2;
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }

        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using loop: " + sumLoop);
    }
}
