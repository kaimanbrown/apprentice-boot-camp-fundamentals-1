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
        List<PlayingCard> playingCards = new ArrayList<>();

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                playingCards.add(new PlayingCard(getSuitFromNumber(suit), nameFromValue(faceValue)));
            }
        }

        for (PlayingCard card : playingCards) {
            result.add(card.toString());
        }

        return result;

    }

    private static Suit getSuitFromNumber(int suitNumber) {
        Suit suit;

        switch (suitNumber){
            case 0: {
                suit = new Suit("clubs");
                break;
            }
            case 1: {
                suit = new Suit("diamonds");
                break;
            }
            case 2: {
                suit = new Suit("hearts");
                break;
            }
            case 3: {
                suit = new Suit("spades");
                break;
            }
            default: throw new IllegalArgumentException("Something went wrong " + suitNumber + "is not a valid suitName!");
        }
        //return suitName;
        return suit;
    }

    private static String nameFromValue(int value) {
        String faceValueName;
        switch (value){
            case 0: faceValueName = "ace"; break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: faceValueName = Integer.toString(value +1); break;
            case 10: faceValueName = "jack"; break;
            case 11: faceValueName = "queen"; break;
            case 12: faceValueName = "king"; break;
            default: throw new IllegalArgumentException("Something went wrong " + value + "is not a valid faceValue!");
        }
        return faceValueName;
    }
}
