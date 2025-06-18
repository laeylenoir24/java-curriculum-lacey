package sets;

import java.util.*;

public class SetAndMapsExercise {
    public static void main(String[] args) {
        Set<Card> deck = new LinkedHashSet<>();
        Map<String, ArrayList<Card>> players = new HashMap<>();

        Dealer dealer = new Dealer(deck, players);

        dealer.deal("Ted");
        dealer.deal("Tina");
        dealer.deal("Tim");
        dealer.deal("Tammy");

        dealer.printHands();


    }
}

