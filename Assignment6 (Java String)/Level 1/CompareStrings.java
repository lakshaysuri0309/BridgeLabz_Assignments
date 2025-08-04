import java.util.*;

public class CompareStrings {
    static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        boolean result1 = compareUsingCharAt(str1, str2);
        boolean result2 = str1.equals(str2);
        System.out.println("CharAt comparison: " + result1);
        System.out.println("equals() comparison: " + result2);
    }
}
