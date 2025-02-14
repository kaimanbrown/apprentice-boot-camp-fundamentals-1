package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalDeck implements Deck {

    private List<SnappableCard> cards;

    public AnimalDeck() {
        cards = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            cards.add(new AnimalCard(animal));
            cards.add(new AnimalCard(animal));
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            SnappableCard card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public SnappableCard deal() {
        return cards.remove(0);
    }
}
