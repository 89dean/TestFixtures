package Question2;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class SpringTest {

    @Test
    public void getService() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
        Lion lion = (Lion) applicationContext.getBean("prototype");

        String result = lion.roar("Loud");
        Assert.assertEquals("Loud",result);

        String result2 = lion.bite("Strong");
        Assert.assertEquals("Strong",result2);

        String result3 = lion.run("Fast");
        Assert.assertEquals("Fast",result3);

        String result4 = lion.sleep("Peaceful");
        Assert.assertEquals("Peaceful",result4);
    }
}