import java.util.Scanner;

public class Table6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] table = new int[4];

        for (int i = 0; i < 4; i++) {
            table[i] = num * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(num + " * " + (i + 6) + " = " + table[i]);
        }
    }
}
