package TestFixtures;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.*;


public class DisablingTestTest {


    @Ignore("Delete disabled to run method")
    @Test
    public void greaterThan() {
        DisablingTest d = new DisablingTest();
        int result = d.greaterThan(6,7);
        Assert.assertEquals(6,result);
    }
}