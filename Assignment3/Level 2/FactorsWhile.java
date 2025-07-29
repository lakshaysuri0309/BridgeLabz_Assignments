import java.util.*;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), i = 1;
        if (a <= 0) {
            System.out.println("Enter a positive number");
        } else {
            while (i < a) {
                if (a % i == 0)
                    System.out.println(i);
                i++;
            }
        }
    }
}
