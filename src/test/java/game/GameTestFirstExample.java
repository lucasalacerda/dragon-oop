package game;

import model.Dragon;
import model.Game;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTestFirstExample {

    @Test
    public void testAttackEnemy() {
        Game game = new Game();
        Dragon dragonOne = new Dragon("Jorge", "Gelo", 10, 2, 200);
        Dragon dragonTwo = new Dragon("Cleito", "Fogo", 10, 2, 200);

        int lifePointsBefore = dragonTwo.getLifePoints();
        game.attackEnemy(dragonOne, dragonTwo);
        int lifePointsAfter = dragonTwo.getLifePoints();

        Assert.assertTrue(lifePointsAfter < lifePointsBefore);

    }

    @Test
    public void testRandomPoints() {
        Game game = new Game();
        int [] arrayPoints = new int[10];

        for (int i = 0; i < arrayPoints.length; i++) {
            arrayPoints[i] = game.randomDamagePoints();
        }

        //TODO: Inserir um assert para o array. Verificar se não há `0` dentro do array.
    }
}
