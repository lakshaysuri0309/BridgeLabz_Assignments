import java.util.*;
public class SumUntilNegativeOrZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0;
        while (true) {
            double num = s.nextDouble();
            if (num <= 0)
                break;
            total += num;
        }
        System.out.println("Total: " + total);
    }
}
