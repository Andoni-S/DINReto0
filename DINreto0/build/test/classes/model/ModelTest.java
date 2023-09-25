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
public class ModelTest {
    
    public ModelTest() {
    }

    /**
     * Test of getGreeting method, of class Model.
     */
    @Test
    public void testGetGreeting() {
        Model instance = new ModelImpl();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }

    public class ModelImpl implements Model {

        public String getGreeting() {
            return "";
        }
    }
    
}
