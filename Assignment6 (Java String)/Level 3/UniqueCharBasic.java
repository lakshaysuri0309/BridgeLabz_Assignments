import java.util.Scanner;

public class UniqueCharsBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 0;

        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}

        System.out.print("Unique characters: ");
        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
