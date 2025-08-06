import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Strings are anagrams.");
        else
            System.out.println("Strings are not anagrams.");
    }
}
