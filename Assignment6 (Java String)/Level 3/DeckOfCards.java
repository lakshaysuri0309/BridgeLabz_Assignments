import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        int index = 0;

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[index] = ranks[i] + " of " + suits[j];
                index++;
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int)(Math.random() * 52);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        if (players * cards > 52) {
            System.out.println("Not enough cards!");
            return;
        }

        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < cards; j++) {
                System.out.println(deck[cardIndex]);
                cardIndex++;
            }
            System.out.println();
        }
    }
}
