

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Pruebas Unitarias de Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Milton Jesús Vera Contreras)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class CasaDeCambioTest
{
    /**
     * Default constructor for test class CasaDeCambioTest
     */
    public CasaDeCambioTest()
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
    
    /**
     * Test of getGananciaEnUnBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testGetGananciaEnUnBolivar() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1.0f, 2.0f);
        float result = instance.getGananciaEnUnBolivar();
        assertEquals(1.0, result, 0.01);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar1() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(0, 1);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar2() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-1, 1);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar3() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-1, 0);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar4() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-2, -1);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar5() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(1, 1);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar6() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(2, 1);
        assertEquals(false, result);
    }

    /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar7() {
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(1, 2);
        assertEquals(true, result);
    }
    
     /**
     * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
     */
    @Test
    public void testCambiarPrecioDelBolivar8() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        assertEquals(1.0, instance.getPrecioDeCompra(), 0.01);
        assertEquals(2.0, instance.getPrecioDeVenta(), 0.01);
    }

    /**
     * Test of comprarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testComprarBolivares1() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        boolean result = instance.comprarBolivares(1);
        assertEquals(true, result);
    }

    /**
     * Test of comprarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testComprarBolivares2() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        instance.comprarBolivares(1);
        assertEquals(1.0, instance.getPesosEnCaja(), 0.01);
    }

    /*
     * Test of comprarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testComprarBolivares3() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        instance.inyectarBolivares(1);
        instance.comprarBolivares(1);
        assertEquals(2.0, instance.getBolivaresEnCaja(), 0.01);
    }
    
    /*
     * Test of comprarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testComprarBolivares4() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(3);
        instance.comprarBolivares(1);
        instance.comprarBolivares(1);
        assertEquals(2, instance.getBolivaresComprados());
    }    
    
    /**
     * Test of comprarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testComprarBolivares5() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(5);
        boolean result = instance.comprarBolivares(6);
        assertEquals(false, result);
    }    
    
    /**
     * Test of venderBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testVenderBolivares1() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(2);
        boolean result = instance.venderBolivares(1);
        assertEquals(true, result);
    }
    
    /**
     * Test of venderBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testVenderBolivares2() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(1);
        instance.inyectarBolivares(2);
        instance.venderBolivares(1);
        assertEquals(3.0, instance.getPesosEnCaja(), 0.01);
    }    

    /*
     * Test of venderBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testVenderBolivares3() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(2);
        instance.venderBolivares(1);
        assertEquals(1.0, instance.getBolivaresEnCaja(), 0.01);
    }

    /*
      * Test of venderBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testVenderBolivares4() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(3);
        instance.venderBolivares(1);
        instance.venderBolivares(1);
        assertEquals(2, instance.getBolivaresVendidos());
    }    
    
    /**
     * Test of venderBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testVenderBolivares5() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(5);
        boolean result = instance.venderBolivares(6);
        assertEquals(false, result);
    }    
    
    /**
     * Test of getImpuestos method, of class CasaDeCambio.
     */
    @Test
    public void testGetImpuestos() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(50);
        instance.venderBolivares(10);
        assertEquals(3.2, instance.getImpuestos(), 0.01);
    }

    /**
     * Test of getGanancias method, of class CasaDeCambio.
     */
    @Test
    public void testGetGanancias() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(50);
        instance.venderBolivares(10);
        assertEquals(16.8, instance.getGanancias(), 0.01);
    }

    /**
     * Test of inyectarPesos method, of class CasaDeCambio.
     */
    @Test
    public void testInyectarPesos1() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarPesos(1);
        instance.inyectarPesos(1);
        assertEquals(2.0, instance.getPesosEnCaja(),0.01);
    }

    /**
     * Test of inyectarPesos method, of class CasaDeCambio.
     */
    @Test
    public void testInyectarPesos2() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarPesos(1);
        instance.inyectarPesos(-1);
        assertEquals(1.0, instance.getPesosEnCaja(),0.01);
    }

    /**
     * Test of inyectarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testInyectarBolivares1() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarBolivares(1);
        instance.inyectarBolivares(1);
        assertEquals(2.0, instance.getBolivaresEnCaja(),0.01);
    }

    /**
     * Test of inyectarBolivares method, of class CasaDeCambio.
     */
    @Test
    public void testInyectarBolivares2() {
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarBolivares(1);
        instance.inyectarBolivares(-1);
        assertEquals(1.0, instance.getBolivaresEnCaja(), 0.01);
    }
}
