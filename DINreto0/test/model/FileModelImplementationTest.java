/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author 2dam
 */
public class FileModelImplementationTest {
    
    public FileModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class FileModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        try {
            FileModelImplementation instance = new FileModelImplementation();
            String expResult = "Hello World";
            String result = instance.getGreeting();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
}
