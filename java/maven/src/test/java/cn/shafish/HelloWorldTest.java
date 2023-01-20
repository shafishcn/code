package cn.shafish;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

    private HelloWorld helloWorld;

    @Before
    public void init() {
        helloWorld = new HelloWorld();
    }

    @Test
    public void testHelloWorld() {
        Assert.assertEquals("Hello,World", helloWorld.sayHello());
    }
}
