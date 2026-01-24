package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.Boa;
import src.Lec02;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lec2Test {
    /**
     * Example test method.
     * Test methods must have @Test before the method
     */

    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testBoaIsVeg() {
        Boa testBoa = new Boa("Fred", 20, "Lettuce");
        Assert.assertTrue(Lec02.isVeg(testBoa));
    }
}
