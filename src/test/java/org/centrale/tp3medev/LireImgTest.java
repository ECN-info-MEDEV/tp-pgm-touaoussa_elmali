/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class LireImgTest {
    
    public LireImgTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of lecture method, of class LireImg.
     */
    @Test
    public void testLecture() {
        System.out.println("lecture");
        LireImg instance = null;
        instance.lecture();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ecriture method, of class LireImg.
     */
    @Test
    public void testEcriture() throws Exception {
        System.out.println("ecriture");
        LireImg instance = null;
        instance.ecriture();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tokenizerLigne method, of class LireImg.
     */
    @Test
    public void testTokenizerLigne() {
        System.out.println("tokenizerLigne");
        String ligne = "";
        LireImg instance = null;
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.tokenizerLigne(ligne);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of histogramme method, of class LireImg.
     */
    @Test
    public void testHistogramme() {
        System.out.println("histogramme");
        LireImg instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.histogramme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
