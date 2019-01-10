package model;

import java.util.Random;

public class Fight {

    ICreature creatureAttacks;
    Creature creatureReceiveDamage;
    Random r = new Random();


    public Fight(ICreature creatureAttacks, Creature creatureReceiveDamage) {
        this.creatureAttacks = creatureAttacks;
        this.creatureReceiveDamage = creatureReceiveDamage;
    }

    public int rollPoints() {
        return r.ints(1, (10 + 1)).findFirst().getAsInt();
    }


    public void combat() {
        this.creatureAttacks.attack(this.creatureReceiveDamage, rollPoints());
    }

}
