import java.util.*;

public class IllegalArgDemo {
    static void throwException(String str) {
        System.out.println(str.substring(5, 2)); 
    }

    static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        handleException(s);
    }
}
