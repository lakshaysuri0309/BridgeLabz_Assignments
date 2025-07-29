import java.util.*;
public class FactorsFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a <= 0) {
            System.out.println("Enter a positive number");
        } else {
            for (int i = 1; i < a; i++) {
                if (a % i == 0)
                    System.out.println(i);
            }
        }
    }
}
