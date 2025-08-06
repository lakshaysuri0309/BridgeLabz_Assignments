import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j)
            if (str.charAt(i++) != str.charAt(j--)) return false;
        return true;
    }
}
