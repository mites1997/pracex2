package com.stackroute.pex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.io.*;

public class ReadFileAndConvertToUpperCaseTest {
ReadFileAndConvertToUpperCase ob;
    @Before
    public void setUp() throws Exception {
        ob=new ReadFileAndConvertToUpperCase();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void ReadFileShouldReturnNumberOfBytesCorrectly()
    {
        try {
            long result = ReadFileAndConvertToUpperCase.fileRead("/home/mites/Desktop/practiceexercise2withtest/src/main/java/com/stackroute/pex2/file2.txt");
            assertEquals(5, result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void ReadFileShouldReturnNumberOfBytesCorrectly2()
    {
        try {
            long result = ReadFileAndConvertToUpperCase.fileRead("/home/mites/Desktop/practiceexercise2withtest/src/main/java/com/stackroute/pex2/testupper.txt");
            assertEquals(10, result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}