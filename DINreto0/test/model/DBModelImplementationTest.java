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
 * @author Andoni Sanz, Ander Goirigolzarri Iturburu
 */
public class DBModelImplementationTest {

    public DBModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class DBModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        try {
            DBModelImplementation instance = new DBModelImplementation();
            String result = instance.getGreeting();
            assertEquals("greeting", result);
        } catch (Exception e) {
            fail("Se lanzó una excepción: " + e.getMessage());
        }
    }

}
