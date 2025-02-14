package cards;

public class AnimalCard implements SnappableCard {

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    @Override
    public boolean snap(SnappableCard otherCard){
        return otherCard != null && this.animal.equals(((AnimalCard)otherCard).animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
