import java.util.*;
public class PowerFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), r = 1;
        for (int i = 1; i <= b; i++) {
            r *= a;
        }
        System.out.println("Power: " + r);
    }
}
