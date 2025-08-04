import java.util.*;

public class LowercaseConvert {
    static String toLower(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
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
        String lower1 = toLower(text);
        String lower2 = text.toLowerCase();
        System.out.println("Are equal: " + compare(lower1, lower2));
    }
}
