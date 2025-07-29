import java.util.*;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), i = 1;
        if (a <= 0) {
            System.out.println("Enter a positive number");
        } else {
            while (i <= a) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
                i++;
            }
        }
    }
}
