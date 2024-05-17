/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automatedunittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kelle
 */
public class Unit_testingTest {
    
    public Unit_testingTest() {
    }

    @Test
    public void testAdiitionMehtod() {
        // create an instance of the class
        Unit_testing ut = new Unit_testing();
        
        int expected = 8;
        int actual = ut.addition(4, 4);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtractionMethod(){
        // create an instance of the class
        Unit_testing ut = new Unit_testing();
        
        int expected = 8;
        int actual = ut.subtraction(10, 2);
        
        assertEquals(expected, actual);
    }
}
