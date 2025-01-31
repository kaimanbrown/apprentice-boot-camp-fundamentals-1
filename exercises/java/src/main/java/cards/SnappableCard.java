package cards;

public interface SnappableCard {
    boolean snap(SnappableCard otherCard);

    @Override
    String toString();
}
