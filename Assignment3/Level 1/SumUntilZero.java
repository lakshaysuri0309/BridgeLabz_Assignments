import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0, num;
        while (true) {
            num = s.nextDouble();
            if (num == 0)
                break;
            total += num;
        }
        System.out.println("Total: " + total);
    }
}
