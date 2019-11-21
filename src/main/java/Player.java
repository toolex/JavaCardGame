import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player (String name){
        this.name = "Raf";
        this.cards = new ArrayList<Card>();
    }

    public int cardsInHand() {
        return this.cards.size();
    }

    public void addCard(Card topCard) {
        cards.add(topCard);
    }

    public void determineWinner(){
        Card highestValue =
    }
}
