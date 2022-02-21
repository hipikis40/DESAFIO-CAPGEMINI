/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_capgemini;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omega
 */
public class SenhaForteTest {
    
    public SenhaForteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of senhaForte method, of class SenhaForte.
     */
    @Test
    public void testSenhaForte() {
        System.out.println("senhaForte");
        String palavra = "A$123a";
        int expResult = 6;
        int result = SenhaForte.senhaForte(palavra);
        assertEquals(expResult, result);
    }

    /**
     * Test of charEspecial method, of class SenhaForte.
     */
    @Test
    public void testCharEspecial() {
        System.out.println("charEspecial");
        String charr = "123A86";
        boolean expResult = false;
        boolean result = SenhaForte.charEspecial(charr);
        assertEquals(expResult, result);
    }

    /**
     * Test of letraMin method, of class SenhaForte.
     */
    @Test
    public void testLetraMin() {
        System.out.println("letraMin");
        String charr = "";
        boolean expResult = false;
        boolean result = SenhaForte.letraMin(charr);
        assertEquals(expResult, result);
    }

    /**
     * Test of letraMai method, of class SenhaForte.
     */
    @Test
    public void testLetraMai() {
        System.out.println("letraMai");
        String charr = "";
        boolean expResult = false;
        boolean result = SenhaForte.letraMai(charr);
        assertEquals(expResult, result);
    }

    /**
     * Test of numero method, of class SenhaForte.
     */
    @Test
    public void testNumero() {
        System.out.println("numero");
        String charr = "Aa$bg";
        boolean expResult = false;
        boolean result = SenhaForte.numero(charr);
        assertEquals(expResult, result);
        assertFalse(expResult);
    }
    
}
