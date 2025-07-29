import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int size = num / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int eIndex = 0, oIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                evens[eIndex++] = i;
            else
                odds[oIndex++] = i;
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < eIndex; i++)
            System.out.print(evens[i] + " ");
        
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oIndex; i++)
            System.out.print(odds[i] + " ");
    }
}
