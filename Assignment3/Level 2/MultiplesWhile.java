import java.util.*;
public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), i = 100;
        if (a <= 0 || a >= 100) {
            System.out.println("Enter number > 0 and < 100");
        } else {
            while (i >= 1) {
                if (i % a == 0)
                    System.out.println(i);
                i--;
            }
        }
    }
}
