import java.util.*;
public class Friends {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(); 
        int x = s.nextInt(), y = s.nextInt(), z = s.nextInt(); 

        if (a < b && a < c)
            System.out.println("Amar is youngest");
        else if (b < a && b < c)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        if (x > y && x > z)
            System.out.println("Amar is tallest");
        else if (y > x && y > z)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");
    }
}
