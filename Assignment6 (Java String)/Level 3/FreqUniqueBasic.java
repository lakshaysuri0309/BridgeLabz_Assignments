import java.util.Scanner;

public class FreqUniqueBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(c + " = " + freq[c]);
            }
        }
    }
}
