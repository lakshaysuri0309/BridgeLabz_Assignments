import java.util.*;
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = s.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
    }
}
