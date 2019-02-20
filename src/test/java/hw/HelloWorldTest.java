 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

  private HelloWorld helloWorld;

  @Before
  public void setUp() throws Exception {
    helloWorld = new HelloWorld();
  }

  @After
  public void tearDown() throws Exception {
    helloWorld = null;
  }

  @Test
  public void getMessage() {
    assertNotNull(helloWorld);
    assertEquals("hello world", helloWorld.getMessage());
  }

  @Test
  public void getMessage2() { // this test is broken - fix it!
    assertNotNull(helloWorld);
    assertEquals("hello world", helloWorld.getMessage());
  }

  @Test
  public void getYear() { // this test is OK, fix HelloWorld.java to make it pass!
    assertNotNull(helloWorld);
    assertEquals(2019, helloWorld.getYear());
  }
}
