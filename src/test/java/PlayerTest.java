import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player;

    @Before
    public void before(){
        player = new Player("Raf");
    }

    @Test
    public void playerStartsWithNoCards(){
        assertEquals(0, player.cardsInHand());
    }

    @Test
    public void addCardToPlayer(){
        player.addCard();
        assertEquals(1, player.cardsInHand());
    }
}
