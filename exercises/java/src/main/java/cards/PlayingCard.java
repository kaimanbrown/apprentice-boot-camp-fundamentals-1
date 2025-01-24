package cards;

public class PlayingCard {

    private final Suit suit;
    private final String name;

    public PlayingCard(Suit suit, String name) {
        this.suit = suit;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
