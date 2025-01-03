package cards;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        int[][] deck = new int[52][2];
        List<PlayingCard> playingCards = new ArrayList<>();

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                deck[suit*13+faceValue] = new int[]{suit, faceValue};
                playingCards.add(new PlayingCard(suit, nameFromValue(faceValue)));
            }
        }

        int cardNumber = 0;
        for (int[] card : deck) {
            String faceValueName = nameFromValue(card[1]);

            String suitName;
            switch (card[0]){
                case 0: suitName = "clubs"; break;
                case 1: suitName = "diamonds"; break;
                case 2: suitName = "hearts"; break;
                case 3: suitName = "spades"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card[0] + "is not a valid suitName!");
            }

            result[cardNumber] = faceValueName + " of " + suitName;
            cardNumber++;
        }

        return result;
//        return playingCards;
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
