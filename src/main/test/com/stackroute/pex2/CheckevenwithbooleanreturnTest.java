package com.stackroute.pex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckevenwithbooleanreturnTest {
  Checkevenwithbooleanreturn ob;

  @Before
  public void setUp() throws Exception {
    ob=new Checkevenwithbooleanreturn();
  }

  @After
  public void tearDown() throws Exception {
    ob=null;
  }
  @Test
  public void testEven1()
  {
    boolean result=ob.isEven(64);
    assertEquals(true,result);
  }
  @Test
  public void testEven2()
  {
    boolean result=ob.isEven(-24);
    assertEquals(false,result);
  }

  @Test
  public void testEven3()
  {
    boolean result=ob.isEven(23);
    assertEquals(false,result);
  }
  }

