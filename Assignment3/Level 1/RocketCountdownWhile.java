import java.util.*;
public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = s.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch!");
    }
}
