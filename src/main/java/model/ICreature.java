package model;

public interface ICreature {

    public void attack(Creature creature, int rollPoints);

    public void receiveDamage(Creature dragonReceiveDamage, int rollPoints);

    public int calculateDamage(int randomNumber);

}
