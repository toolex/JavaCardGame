import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card aceHearts;
    private Card aceDiamond;
    private Card aceSpade;
    private Card aceClub;

    private Card twoHearts;
    private Card twoDiamond;
    private Card twoSpade;
    private Card twoClub;

    private Card queenHearts;
    private Card queenDiamond;
    private Card queenSpade;
    private Card queenClub;

    @Before
    public void before(){
        aceHearts = new Card(SuitType.HEARTS, RankType.ACE);
        aceDiamond = new Card(SuitType.DIAMONDS, RankType.ACE);
        aceSpade = new Card(SuitType.SPADES, RankType.ACE);
        aceClub = new Card(SuitType.CLUBS, RankType.ACE);

        twoHearts = new Card(SuitType.HEARTS, RankType.TWO);
        twoDiamond = new Card(SuitType.DIAMONDS, RankType.TWO);
        twoSpade = new Card(SuitType.SPADES, RankType.TWO);
        twoClub = new Card(SuitType.CLUBS, RankType.TWO);

        queenHearts = new Card(SuitType.HEARTS, RankType.QUEEN);
        queenDiamond = new Card(SuitType.DIAMONDS, RankType.QUEEN);
        queenSpade = new Card(SuitType.SPADES, RankType.QUEEN);
        queenClub = new Card(SuitType.CLUBS, RankType.QUEEN);

    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, aceHearts.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, aceDiamond.getRank());
    }



}
