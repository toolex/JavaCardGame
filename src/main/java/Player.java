import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    public Player (String name){
        this.name = "Bob";
        this.cards = new ArrayList<Card>();
    }

    public int cardsInHand() {
        return this.cards.size();
    }

    public void addCard() {
        
    }
}
