/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class GreetingTest {
    
    public GreetingTest() {
    }

    @Test
    public void testGreetingDefaultConstructor(){
        Greeting greet = new Greeting();
        assertNotNull("error", greet);
    }
    
    @Test
    public void testGreetingConstructor(){
        Greeting greet = new Greeting("hello");
        assertNotNull("error", greet);
    }
    
    /**
     * Test of getValue method, of class Greeting.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Greeting instance = new Greeting("message");
        String expResult = "message";
        String result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Greeting.
     */
    @Test
    public void testSetValue() {
        String value = "message";
        Greeting instance = new Greeting();
        instance.setValue(value);      
        assertEquals("message", instance.getValue());
    }
    
}
