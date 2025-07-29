import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a <= 0) {
            System.out.println("Enter a natural number");
        } else {
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else
                    System.out.println(i + " is odd");
            }
        }
    }
}
