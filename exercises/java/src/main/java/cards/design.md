
```mermaid
classDiagram
    class Suit{
        -string name
        -int NUM_OF_CARDS
    }
    class Card{
        -string name
        -Suit suit
        +toString()
    }
    class Deck {
        -List<Card> cards
        +List<Card> getCards()
    }
    class Cards {
        +main()
    }
    Cards --> Deck
    Cards --> Card
```