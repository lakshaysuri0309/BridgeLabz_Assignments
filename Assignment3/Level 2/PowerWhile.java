import java.util.*;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), r = 1, i = 0;
        while (i < b) {
            r *= a;
            i++;
        }
        System.out.println("Power: " + r);
    }
}
