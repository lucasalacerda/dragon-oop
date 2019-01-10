package dragon;

import model.Dragon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DragonTestFinalExample {

    Dragon dragon;

    @Before
    public void prepareTest(){
        dragon = new Dragon("Dougras", "Ice", 10, 2, 450, "");
    }

    @Test
    public void testDragonName(){
        Assert.assertEquals("Dougras", dragon.getName());
    }
}
