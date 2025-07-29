import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
        int day = s.nextInt();
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4 || month == 5))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
