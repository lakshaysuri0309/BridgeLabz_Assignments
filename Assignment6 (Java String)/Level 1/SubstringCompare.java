import java.util.*;

public class SubstringCompare {
    static String subUsingCharAt(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String sub1 = subUsingCharAt(str, start, end);
        String sub2 = str.substring(start, end);
        System.out.println("CharAt substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are equal: " + compareStrings(sub1, sub2));
    }
}
