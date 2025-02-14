package cards;

public class PlayingCard implements SnappableCard {

    private final Suit suit;
    private final String name;

    public PlayingCard(Suit suit, String name) {
        this.suit = suit;
        this.name = name;
    }

    @Override
    public boolean snap(SnappableCard otherCard){
        return otherCard != null && this.name.equals(((PlayingCard)otherCard).name);
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
