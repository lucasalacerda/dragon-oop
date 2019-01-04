import model.Dragon;
import model.Game;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Dragon dragonOne = new Dragon("Jorge", "Gelo", 10, 2, 200);
        Dragon dragonTwo = new Dragon("Cleito", "Fogo", 10, 2, 200);

        System.out.println(dragonTwo.getLifePoints());
        game.attackEnemy(dragonOne, dragonTwo);
        System.out.println(dragonTwo.getLifePoints());

    }
}
