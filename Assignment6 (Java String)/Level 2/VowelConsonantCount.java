import java.util.*;

public class VowelConsonantCount {
    static boolean isVowel(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    static int[] countVowelsConsonants(String s) {
        int vowel = 0, consonant = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = s.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    if (isVowel(ch)) vowel++;
                    else consonant++;
                }
            } catch (Exception e) { break; }
        }
        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
