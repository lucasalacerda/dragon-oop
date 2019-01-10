import model.Creature;
import model.Dragon;
import model.Fight;
import model.ICreature;

public class Main {

    public static void main(String[] args) {

        ICreature playerOne = new Dragon("Jorge","Gelo",
                10, 2, 200,"Fire");
        Creature playerTwo = new Dragon("Cleito","Fogo",
                10, 2,900,"Water");

        Fight fight = new Fight(playerOne, playerTwo);
        fight.combat();


    }
}
