package model;

public class Dragon {

    private String name;
    private String type;
    private int lifePoints;
    private int attackStrenght;
    private int age;

    public Dragon(String name, String type, int lifePoints, int attackStrenght, int age) {
        this.name = name;
        this.type = type;
        this.lifePoints = lifePoints;
        this.attackStrenght = attackStrenght;
        this.age = age;
    }

    public Dragon() { }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLifePoints() {
        return lifePoints;
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

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
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
                ", lifePoints=" + lifePoints +
                ", attackStrenght=" + attackStrenght +
                ", age=" + age +
                '}';
    }

}
