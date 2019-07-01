package com.stackroute.pex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesComputingTest {
    GradesComputing ob;
    @Before
    public void setUp() throws Exception
    {
        ob=new GradesComputing();

    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test


    public void showStudentDetails() {

        int marks[] = {86, 65, 98, 77};
        String res = ob.studentDetails(4, marks);

        assertEquals("The average is 81.5 The minimum is 65 The maximum is 98", res);

    }
    @Test
    public void showStudentDetailsInvalidcase() {

        int marks[] = {86, 65, 101, 77};
        String res = ob.studentDetails(4, marks);

        assertEquals("Wrong Input", res);

    }


    @Test
    public void showStudentDetailsInvalidcase2() {

        int marks[] = {86, 65, -1, 77};
        String res = ob.studentDetails(4, marks);

        assertEquals("Wrong Input", res);

    }


}