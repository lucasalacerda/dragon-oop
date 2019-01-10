package model;

public class Dragon extends Creature implements ICreature{

    String element;

    public Dragon() {}

    public Dragon(String name, String type, int healthPoints, int attackStrenght, int age, String element) {
        super(name, type, healthPoints, attackStrenght, age);
        this.element = element;
    }

    @Override
    public void attack(Creature dragonReceiveDamage, int rollPoints) {
        receiveDamage(dragonReceiveDamage, rollPoints);
    }

    @Override
    public void receiveDamage(Creature dragonReceiveDamage, int rollPoints) {
        int damage = calculateDamage(rollPoints);
        int healthPoints = dragonReceiveDamage.getHealthPoints();
        dragonReceiveDamage.setHealthPoints(healthPoints - damage);
    }

    @Override
    public int calculateDamage(int rollPoints) {

        return getAttackStrength() + rollPoints;
    }

}
