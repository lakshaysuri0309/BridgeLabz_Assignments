import java.util.*;
public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int sumFormula = n * (n + 1) / 2;
        int sumLoop = 0, i = 1;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using loop: " + sumLoop);
    }
}
