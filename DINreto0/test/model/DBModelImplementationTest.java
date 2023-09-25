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
public class DBModelImplementationTest {

    public DBModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        DBModelImplementation instance = new DBModelImplementation();
        String expResult = "greeting";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }

}