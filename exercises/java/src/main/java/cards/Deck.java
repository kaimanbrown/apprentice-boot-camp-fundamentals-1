package cards;

public interface Deck {
    void shuffle();

    String[] getCards();

    SnappableCard deal();
}
