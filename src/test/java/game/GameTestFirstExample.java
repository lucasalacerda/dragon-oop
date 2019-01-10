package game;

import model.Dragon;
import model.Fight;
import org.junit.Assert;
import org.junit.Test;

public class GameTestFirstExample {

    @Test
    public void testAttackEnemy() {
        Dragon dragonOne = new Dragon("Jorge", "Gelo", 10, 2, 200, "Fire");
        Dragon dragonTwo = new Dragon("Cleito", "Fogo", 10, 2, 200, "Water");

        Fight game = new Fight(dragonOne, dragonTwo);

        int lifePointsBefore = dragonTwo.getHealthPoints();
        game.combat();
        int lifePointsAfter = dragonTwo.getHealthPoints();

        Assert.assertTrue(lifePointsAfter < lifePointsBefore);

    }

    @Test
    public void testRandomPoints() {
        Dragon dragonOne = new Dragon("Jorge", "Gelo", 10, 2, 200, "Fire");
        Dragon dragonTwo = new Dragon("Cleito", "Fogo", 10, 2, 200, "Water");

        Fight game = new Fight(dragonOne, dragonTwo);
        int [] arrayPoints = new int[10];

        for (int i = 0; i < arrayPoints.length; i++) {
            arrayPoints[i] = game.rollPoints();
        }

        //TODO: Inserir um assert para o array. Verificar se não há `0` dentro do array.
    }
}
