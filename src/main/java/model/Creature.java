package model;

public class Creature {

    private String name;
    private String type;
    private int healthPoints;
    private int attackStrenght;
    private int age;

    public Creature(String name, String type, int healthPoints, int attackStrenght, int age) {
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.attackStrenght = attackStrenght;
        this.age = age;
    }

    public Creature() { }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackStrength() {
        return attackStrenght;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackStrenght(int attackStrenght) {
        this.attackStrenght = attackStrenght;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "model.Dragon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", healthPoints=" + healthPoints +
                ", attackStrenght=" + attackStrenght +
                ", age=" + age +
                '}';
    }



}
