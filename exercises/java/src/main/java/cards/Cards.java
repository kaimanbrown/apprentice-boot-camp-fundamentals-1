package cards;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        for(String card: cards.getCards()){
            System.out.println(card);
        }
    }

    public List<String> getCards() {
        List<String> result = new ArrayList<>();
        PlayingCardDeck deck = new PlayingCardDeck();

        while(deck.hasCards()){
            result.add(deck.deal().toString());
        }
        return result;
    }

}
