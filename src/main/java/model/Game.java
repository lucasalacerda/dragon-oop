package model;

import java.util.Random;

public class Game {

    private Random points = new Random();

    public int randomDamagePoints(){
        return points.nextInt((10 - 1) + 1) + 1;
    }

    public void attackEnemy (Dragon dragon, Dragon enemy) {
        int totalDamage = dragon.getAttackStrength() + randomDamagePoints();
        System.out.println(totalDamage);
        int actualLifePoint = enemy.getLifePoints() - totalDamage;
        enemy.setLifePoints(actualLifePoint);
    }
}
