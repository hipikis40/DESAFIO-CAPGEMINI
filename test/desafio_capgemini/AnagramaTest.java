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
public class AnagramaTest {
    
    public AnagramaTest() {
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
     * Test of contagem_palavra method, of class Anagrama.
     */
    @Test
    public void testContagem_palavra() {
        System.out.println("contagem_palavra");
        String string = "ifailuhkqq";
        int valor = Anagrama.contagem_palavra(string);
        assertNotNull(valor);
        assertEquals(valor, 3);
    }
    
}
