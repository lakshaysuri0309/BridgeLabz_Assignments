import java.util.*;
public class NumberType{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a > 0)
            System.out.println("Positive");
        else if (a < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
