package my.buffalocow.mechanics;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class GameSessionTest {
    private static GameSession gameSession;

    @BeforeClass
    public static void setUp() {
        gameSession = new GameSession();
    }

    @Test
    public void init() throws Exception {
        gameSession.init();
        Set<Integer> digits = new LinkedHashSet<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Assert.assertEquals(gameSession.getTask().size(), GameSession.DIFFICULTY);
        digits.removeAll(gameSession.getTask());
        Assert.assertEquals(digits.size(), 10 - GameSession.DIFFICULTY);
    }

}