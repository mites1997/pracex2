package com.stackroute.pex2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseinputTest {
  Reverseinput ob;

  @org.junit.Before
  public void setUp() throws Exception {
    ob=new Reverseinput();
  }

  @org.junit.After
  public void tearDown() throws Exception {
    ob=null;
  }

  @Test
  public void reverseTest1()
  {
    String result=ob.checkpalin("London");
    assertEquals("not palindrome",result);
  }
  @Test
  public void reverseTest2()
  {
    String result=ob.checkpalin("madam");
    assertEquals("palindrome",result);
  }
  @Test
  public void reverseTest3()
  {
    String result=ob.checkpalin(null);
    assertEquals("cannot be reversed",result);
  }


}
