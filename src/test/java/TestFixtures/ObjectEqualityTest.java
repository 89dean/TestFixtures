package TestFixtures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectEqualityTest {

    @Test
    public void equals() {
        ObjectEquality oe = new ObjectEquality();
        boolean result = oe.equals(new Object[]{5,10,20},new Object[]{10,12,13});
        Assert.assertEquals(true,result);


    }
}