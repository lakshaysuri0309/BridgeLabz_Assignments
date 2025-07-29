import java.util.*;
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = 1;
        for (int i = a - 1; i >= 1; i--) {
            if (a % i == 0) {
                b = i;
                break;
            }
        }
        System.out.println("Greatest factor is: " + b);
    }
}
