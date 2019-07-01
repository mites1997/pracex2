package com.stackroute.pex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InitializeanddisplaywithotherclassTest {
    Initializeanddisplaywithotherclass ob;

    @Before
    public void setUp() throws Exception {
        ob=new Initializeanddisplaywithotherclass();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void displayDetails() {

        ob.initializeData("Mites Mrinoy", 21, 25000.3);
        String res = ob.displayData();
        assertEquals("Members Name: Mites Mrinoy Members age: 21 Members salary: 25000.3", res);

    }
    @Test
    public void displayDetails2() {

        ob.initializeData("Mites", 21, 10000.5);
        String res = ob.displayData();
        assertEquals("Members Name: Mites Members age: 21 Members salary: 10000.5", res);

    }

    @Test
    public void displayDetailsinvalidcase() {

        ob.initializeData(null, -20, 10000.5);
        String res = ob.displayData();
        assertEquals("invalid input", res);

    }

    @Test
    public void displayDatatest() {
    }
}