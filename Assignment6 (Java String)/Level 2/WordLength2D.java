import java.util.*;

public class WordLength2D {
    static int findLength(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {}
        return i;
    }

    static String[] splitWords(String s) {
        ArrayList<String> words = new ArrayList<>();
        String w = "";
        int len = findLength(s);
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!w.equals("")) words.add(w);
                w = "";
            } else {
                w += ch;
            }
        }
        if (!w.equals("")) words.add(w);
        return words.toArray(new String[0]);
    }

    static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordData = wordsWithLengths(words);
        System.out.println("Word\tLength");
        for (String[] row : wordData) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}
