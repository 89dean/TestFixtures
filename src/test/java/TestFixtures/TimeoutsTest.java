package TestFixtures;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeoutsTest {

    @Test(timeout = 1000)
    public void testWhile() {
        Timeouts t = new Timeouts();
        t.testWhile();
    }
}