

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FraccionarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FraccionarioTest
{
    /**
     * Default constructor for test class FraccionarioTest
     */
    public FraccionarioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

      
    @Test
    public void testSimplificar()
    {
        int m1 = (int)(Math.random()*100);
        Fraccionario f = new Fraccionario(5*m1, 17*m1);
        f.simplificar();
        assertEquals(5, f.getNumerador());
        assertEquals(17, f.getDenominador());
    }
    
    @Test
    public void testSumar()
    {
        int n1 = (int)(Math.random()*100);
        int d1 = (int)(Math.random()*100);
        int n2 = (int)(Math.random()*100);
        int d2 = (int)(Math.random()*100);        
        Fraccionario f1 = new Fraccionario(n1, d1);
        Fraccionario f2 = new Fraccionario(n2, d2);
        Fraccionario f3 = f1.sumar(f2);
        assertEquals(n1*d2 + d1*n2, f3.getNumerador());
        assertEquals(d1*d2, f3.getDenominador());
    }

    @Test
    public void testRestar()
    {
        int n1 = (int)(Math.random()*100);
        int d1 = (int)(Math.random()*100);
        int n2 = (int)(Math.random()*100);
        int d2 = (int)(Math.random()*100);        
        Fraccionario f1 = new Fraccionario(n1, d1);
        Fraccionario f2 = new Fraccionario(n2, d2);
        Fraccionario f3 = f1.restar(f2);
        assertEquals(n1*d2 - d1*n2, f3.getNumerador());
        assertEquals(d1*d2, f3.getDenominador());
    }
    
    @Test
    public void testMultiplicar()
    {
        int n1 = (int)(Math.random()*100);
        int d1 = (int)(Math.random()*100);
        int n2 = (int)(Math.random()*100);
        int d2 = (int)(Math.random()*100);        
        Fraccionario f1 = new Fraccionario(n1, d1);
        Fraccionario f2 = new Fraccionario(n2, d2);
        Fraccionario f3 = f1.multiplicar(f2);
        assertEquals(n1*n2, f3.getNumerador());
        assertEquals(d1*d2, f3.getDenominador());
    } 
    
    @Test
    public void testDividir()
    {
        int n1 = (int)(Math.random()*100);
        int d1 = (int)(Math.random()*100);
        int n2 = (int)(Math.random()*100);
        int d2 = (int)(Math.random()*100);        
        Fraccionario f1 = new Fraccionario(n1, d1);
        Fraccionario f2 = new Fraccionario(n2, d2);
        Fraccionario f3 = f1.dividir(f2);
        assertEquals(n1*d2, f3.getNumerador());
        assertEquals(d1*n2, f3.getDenominador());
    }
    
}

