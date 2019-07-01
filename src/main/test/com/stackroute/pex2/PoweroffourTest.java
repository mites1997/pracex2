package com.stackroute.pex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoweroffourTest {
  Poweroffour ob;

  @Before
  public void setUp() throws Exception {
    ob=new Poweroffour();
  }

  @After
  public void tearDown() throws Exception {
  }
  @Test
  public void powerOfFourTest1()
  {
    String result=ob.powerOfFour(23);
    assertEquals("false",result);
  }
  @Test
  public void powerOfFourTest2()
  {
    String result=ob.powerOfFour(64);
    assertEquals("true",result);
  }
  @Test
  public void powerOfFourTest3()
  {
    String result=ob.powerOfFour(0);
    assertEquals("false",result);
  }
  @Test
  public void powerOfFourTest4()
  {
    String result=ob.powerOfFour(1);
    assertEquals("true",result);
  }

}
