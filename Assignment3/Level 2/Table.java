import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
