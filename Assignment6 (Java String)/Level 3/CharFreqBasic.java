import java.util.Scanner;

public class CharFreqBasic {
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
            if (freq[c] != 0) {
                System.out.println(c + " = " + freq[c]);
                freq[c] = 0;
            }
        }
    }
}
