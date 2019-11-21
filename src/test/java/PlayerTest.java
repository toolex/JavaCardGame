import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PlayerTest {
    private Player player1;
    private Player player2;
    private Deck cards;

    @Before
    public void before(){
        player1 = new Player("Raf");
        player2 = new Player("Ross");
        cards = new Deck();
    }

    @Test
    public void playerStartsWithNoCards(){
        assertEquals(0, player1.size());
    }

    @Test
    public void addCardToPlayer(){
        Card topCard = cards.dealACard();
        player1.addCard(topCard);
        assertEquals(1, player1.cardsInHand());
    }

    @Test
    public void bothPlayersHaveCards(){
        Card topCard1 = cards.dealACard();
        player1.addCard(topCard1);
        Card topCard2 = cards.dealACard();
        player2.addCard(topCard2);
        assertEquals(1, player1.cardsInHand());
        assertEquals(1, player2.cardsInHand());
        assertNotEquals(topCard1, topCard2);
    }

    @Test
    public void getValueOfCard(){

    }
}
