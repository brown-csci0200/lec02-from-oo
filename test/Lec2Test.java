import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lec2Test {
    /**
     * Test methods must have @Test before the method.
     * This tells JUnit to run the method as a test.
     */
    @Test
    public void simpleBoaTest() {
        Boa b1 = new Boa("B1", 2, "lettuce");
        Boa b2 = new Boa("B2", 3, "professors");
        Boa b3 = new Boa("B3", 900, "carrots");

        Assert.assertTrue(Lec02.isVegetarian(b1));
        Assert.assertTrue(Lec02.isVegetarian(b3));
        Assert.assertTrue(b1.length() > 0);
        Assert.assertTrue(b2.length() > 0);
        Assert.assertTrue(b3.length() > 0);

    }

    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }
}
