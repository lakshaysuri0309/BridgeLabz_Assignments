import java.util.*;

public class StringIndexOutDemo {
    static void throwException(String str) {
        System.out.println(str.charAt(str.length())); 
    }

    static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
     
        handleException(s);
    }
}
