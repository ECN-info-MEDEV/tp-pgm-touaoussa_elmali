/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.tp3medev;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ecrireLigne method, of class Utils.
     */
    @Test
    public void testEcrireLigne() {
        System.out.println("ecrireLigne");
        String ligne = "";
        Utils instance = null;
        instance.ecrireLigne(ligne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seuillage method, of class Utils.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        int seuil = 0;
        Utils instance = null;
        instance.seuillage(seuil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
