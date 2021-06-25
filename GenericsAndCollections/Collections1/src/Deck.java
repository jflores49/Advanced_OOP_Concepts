import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
/* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/

        this.deck = new ArrayList<Card>();
        String [] faceCards = {"Ace", "Jack", "Queen", "King"};
        for (String suit: suits) {
            for (int i = 0; i < faceCards.length; i++) {
                deck.add(new Card(faceCards[i], suit));
            }
            for (int i = 2; i <= 10; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }




    public Card dealCard(){
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
        Random rand = new Random();
        int r = 0;
        if(deck.size()>0){
            r = rand.nextInt(deck.size());}
        return deck.remove(r);

    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
        return new DeckIterator<>(this);
    }
}
