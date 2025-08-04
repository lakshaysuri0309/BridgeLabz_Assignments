import java.util.*;

public class ManualSplitWords {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count++);
            }
        } catch (Exception e) {}
        return count;
    }

    static String[] splitWords(String str) {
        int len = findLength(str);
        ArrayList<String> words = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                temp += ch;
            else {
                if (!temp.equals("")) {
                    words.add(temp);
                    temp = "";
                }
            }
        }
        if (!temp.equals("")) words.add(temp);

        return words.toArray(new String[0]);
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.trim().split("\\s+");

        System.out.println("Are equal: " + compareArrays(userSplit, builtInSplit));
    }
}
