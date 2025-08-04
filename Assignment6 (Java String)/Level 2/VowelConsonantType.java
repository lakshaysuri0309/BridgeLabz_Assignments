import java.util.*;

public class VowelConsonantType {
    static String getType(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            char lower = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
            if ("aeiou".indexOf(lower) != -1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] getCharTypes(String s) {
        int len = 0;
        try { while (true) s.charAt(len++); } catch (Exception e) {}
        String[][] res = new String[len][2];
        for (int i = 0; i < len; i++) {
            res[i][0] = s.charAt(i) + "";
            res[i][1] = getType(s.charAt(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = getCharTypes(text);
        System.out.println("Char\tType");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
