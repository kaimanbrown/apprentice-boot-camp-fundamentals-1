package cards;

public class PlayingCard {

    private final String suit;
    private final String name;

    public PlayingCard(String suit, String name) {
        this.suit = suit;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
