import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    private Deck deck;
    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.QUEEN);
        deck =  new Deck();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void checkDeckCanBeShuffled(){

        deck.shuffleDeck();
        deck.getCards().get(0).getRank()
       assertNotEquals();
    }
}
