import java.util.*;
public class SmallestCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        if (a < b && a < c)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}
