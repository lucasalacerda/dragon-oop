package dragon;

import model.Dragon;
import org.junit.Assert;
import org.junit.Test;


public class DragonTestFirstExample {

    @Test
    public void testDragonConstructor(){
        Dragon dragon = new Dragon("Dougras", "Ice", 10, 2, 450);
        Assert.assertEquals("Dougras", dragon.getName());
        Assert.assertEquals("Ice", dragon.getType());
        Assert.assertEquals(10, dragon.getLifePoints());
        Assert.assertEquals(2, dragon.getAttackStrength());
        Assert.assertEquals(450, dragon.getAge());
    }

    @Test
    public void testDragonName(){
        Dragon dragon = new Dragon();
        dragon.setName("Cleito");
        Assert.assertEquals("Cleito", dragon.getName());
    }

    @Test
    public void testDragonType(){
        Dragon dragon = new Dragon();
        dragon.setType("Fire");
        Assert.assertEquals("Fire", dragon.getType());
    }

    @Test
    public void testDragonLifePoints(){
        Dragon dragon = new Dragon();
        dragon.setLifePoints(2);
        Assert.assertEquals(2, dragon.getLifePoints());
    }

    @Test
    public void testDragonAttackStrenght(){
        Dragon dragon = new Dragon();
        dragon.setAttackStrenght(5);
        Assert.assertEquals(5, dragon.getAttackStrength());
    }

    @Test
    public void testDragonAge(){
        Dragon dragon = new Dragon();
        dragon.setAge(450);
        Assert.assertEquals(450, dragon.getAge());
    }
}
