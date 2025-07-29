import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(); // salary
        int b = s.nextInt(); // years of service
        if (b > 5) {
            double c = 0.05 * a;
            System.out.println("Bonus: " + c);
        } else {
            System.out.println("No bonus");
        }
    }
}
