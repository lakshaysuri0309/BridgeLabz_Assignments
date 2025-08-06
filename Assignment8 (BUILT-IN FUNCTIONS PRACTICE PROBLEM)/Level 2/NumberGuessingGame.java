import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "? (respond with high/low/correct): ");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("high"))
                high = guess - 1;
            else if (feedback.equalsIgnoreCase("low"))
                low = guess + 1;
            else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! The computer guessed it!");
                break;
            } else
                System.out.println("Invalid input. Please respond with high, low, or correct.");
        }
    }
}
