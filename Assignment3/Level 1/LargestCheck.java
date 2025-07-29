import java.util.*;
public class LargestCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();

        System.out.println("Is the first number the largest?");
        if (a > b && a > c)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("Is the second number the largest?");
        if (b > a && b > c)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println("Is the third number the largest?");
        if (c > a && c > b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
