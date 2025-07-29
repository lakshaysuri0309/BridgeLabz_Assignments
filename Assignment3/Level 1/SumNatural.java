import java.util.*;
public class SumNatural {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0) {
            int sum = a * (a + 1) / 2;
            System.out.println("The sum of " + a + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + a + " is not a natural number");
        }
    }
}
