public class Palindrome {
    static boolean check1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    static boolean check2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return check2(s, i + 1, j - 1);
    }

    static boolean check3(String s) {
        char[] c = s.toCharArray();
        char[] r = new char[c.length];
        for (int i = 0; i < c.length; i++) r[i] = s.charAt(c.length - 1 - i);
        for (int i = 0; i < c.length; i++)
            if (c[i] != r[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).next();
        System.out.println(check1(s));
        System.out.println(check2(s, 0, s.length() - 1));
        System.out.println(check3(s));
    }
}
