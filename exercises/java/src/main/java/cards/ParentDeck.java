package cards;

import java.util.Collections;
import java.util.List;

public class ParentDeck implements Deck {
    protected final List<SnappableCard> cards;

    public ParentDeck(List<SnappableCard> cards){
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            SnappableCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public SnappableCard deal() {
        return cards.remove(0);
    }
}
