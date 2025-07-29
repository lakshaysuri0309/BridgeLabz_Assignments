import java.util.*;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = 1, c = a - 1;
        while (c >= 1) {
            if (a % c == 0) {
                b = c;
                break;
            }
            c--;
        }
        System.out.println("Greatest factor is: " + b);
    }
}
