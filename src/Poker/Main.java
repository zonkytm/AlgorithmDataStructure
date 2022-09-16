package Poker;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int cardsPerPlayer = 5;
        int players;

        String[] suits = {
                "Peak", "Tambourine", "Heart", "Clubs"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int n = suits.length * rank.length;


        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of players: ");

            if (sc.hasNextInt()) {

                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("Game over.");
                        break;

                    } else if (players < 0) {

                        System.out.println("Number of player cant be less then  0");

                    } else {

                        System.out.println("Too many players");
                    }
                }

            } else {
                System.out.println("Its not number or its too big");

            }
        }


        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }


        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        System.out.println(deck.length);

        for (int i = 0; i < cardsPerPlayer*players; i++) {
            if(i%cardsPerPlayer==0){
                System.out.println(("Player " +((i / cardsPerPlayer) + 1)));
            }
            System.out.println(deck[i]);

        }
    }
}
