import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<Card>();
        buildDeck();
        shuffleDeck();

    }
    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public void buildDeck() {

        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                this.cards.add(new Card(suit, rank));
            }
        }
    }


    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public void dealACard() {
        Card topCard = this.cards.get(0);
        cards.remove(topCard);
    }
}
