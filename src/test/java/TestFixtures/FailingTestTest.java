package TestFixtures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FailingTestTest {

    @Test()
    public void fail() {
        FailingTest ft = new FailingTest();
        String result = ft.fail("Hellow World");
        Assert.fail("Test failed");
    }
}