package TestFixtures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectIdentityTest {

    @Test
    public void equals() {
        ObjectIdentity oi = new ObjectIdentity();
        boolean result = oi.equals(new Object[]{"My car"},new Object[]{"My bike"});
        Assert.assertEquals(true,result);


    }
}