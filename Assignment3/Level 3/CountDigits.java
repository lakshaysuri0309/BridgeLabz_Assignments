import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Digits: " + count);
    }
}
