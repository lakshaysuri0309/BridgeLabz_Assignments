import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        int num = getInput();
        System.out.println("Factorial: " + factorial(num));
    }

    static int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
