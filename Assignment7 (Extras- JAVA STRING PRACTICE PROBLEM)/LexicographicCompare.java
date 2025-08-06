import java.util.Scanner;

public class LexicographicCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int minLen = Math.min(str1.length(), str2.length());
        boolean decided = false;

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i))
                    System.out.println(str1 + " comes before " + str2);
                else
                    System.out.println(str2 + " comes before " + str1);
                decided = true;
                break;
            }
        }

        if (!decided) {
            if (str1.length() < str2.length())
                System.out.println(str1 + " comes before " + str2);
            else if (str1.length() > str2.length())
                System.out.println(str2 + " comes before " + str1);
            else
                System.out.println("Both strings are equal");
        }
    }
}
