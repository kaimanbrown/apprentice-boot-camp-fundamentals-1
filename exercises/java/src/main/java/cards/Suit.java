package cards;

public class Suit {


    private final String name;

    public Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
