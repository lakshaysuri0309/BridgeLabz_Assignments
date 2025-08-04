import java.util.*;

public class UppercaseConvert {
    static String toUpper(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            res += ch;
        }
        return res;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String upper1 = toUpper(text);
        String upper2 = text.toUpperCase();
        System.out.println("Are equal: " + compare(upper1, upper2));
    }
}
