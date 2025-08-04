import java.util.*;

public class StringLengthManual {
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
  
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Manual length: " + findLength(s));
        System.out.println("Built-in length: " + s.length());
    }
}
