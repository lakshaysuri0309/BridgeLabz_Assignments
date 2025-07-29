import java.util.*;
public class MultiplesFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a <= 0 || a >= 100) {
            System.out.println("Enter number > 0 and < 100");
        } else {
            for (int i = 100; i >= 1; i--) {
                if (i % a == 0)
                    System.out.println(i);
            }
        }
    }
}
