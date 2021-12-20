package com.lti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test1()
    {
        int res=new Calculator().findSum(10, 20);
       assertEquals(30, res);
    }
    @Test
    public void test2()
    {
        int res=new Calculator().findSum(5, 5);
       assertEquals(10, res);
    }
}
