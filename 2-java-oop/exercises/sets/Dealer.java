package sets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dealer {
    public Set<Card> deck;
    private Map<String, ArrayList<Card>> players;

    public Dealer(Set<Card> deck, Map<String, ArrayList<Card>> players) {
        this.deck = deck;
        this.players = players;


        String[] suits = {"Spade", "Club", "Heart", "Diamond"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void deal(String playerName) {
        if (deck.size() < 5) {
            System.out.println("Not enough cards left for " + playerName);
            return;
        }

        ArrayList<Card> hand = new ArrayList<>();
        Iterator<Card> iterator = deck.iterator();

        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                Card card = iterator.next();
                hand.add(card);
                iterator.remove();
            }
        }

        players.put(playerName, hand);
    }

    public void printHands() {
        for (Map.Entry<String, ArrayList<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + "'s hand: ");
            for (Card card : entry.getValue()) {
                System.out.println(" - " + card);
            }

            System.out.println();
        }
    }

}
