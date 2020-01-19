
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MaquinaCafeteraTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularPrecio0() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        maquina.calcularPrecio(1, 1);
        Assert.assertEquals(0, maquina.getIngresos());
        Assert.assertEquals(0, maquina.getImpuestos());
        Assert.assertEquals(0, maquina.getEgresos());
        Assert.assertEquals(0, maquina.getGananciasBrutas());
        Assert.assertEquals(0, maquina.getGananciasNetas());
    }

    @Test
    public void testCalcularPrecio11() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(442, maquina.calcularPrecio(1, 1));
    }

    @Test
    public void testCalcularPrecio12() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(464, maquina.calcularPrecio(1, 2));
    }

    @Test
    public void testCalcularPrecio13() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(486, maquina.calcularPrecio(1, 3));
    }

    @Test
    public void testCalcularPrecio21() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(885, maquina.calcularPrecio(2, 1));
    }

    @Test
    public void testCalcularPrecio22() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(929, maquina.calcularPrecio(2, 2));
    }

    @Test
    public void testCalcularPrecio23() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(974, maquina.calcularPrecio(2, 3));
    }

    @Test
    public void testCalcularPrecio31() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(1328, maquina.calcularPrecio(3, 1));
    }

    @Test
    public void testCalcularPrecio32() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(1393, maquina.calcularPrecio(3, 2));
    }

    @Test
    public void testCalcularPrecio33() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.setPrecioBaseCafe(7000);
        Assert.assertEquals(1460, maquina.calcularPrecio(3, 3));
    }

    @Test
    public void testPrepararCafe0() {
        MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
        Assert.assertEquals(true, maquina.prepararCafe(1, 1));
        Assert.assertEquals(0, maquina.getIngresos());
        Assert.assertEquals(0, maquina.getImpuestos());
        Assert.assertEquals(0, maquina.getEgresos());
        Assert.assertEquals(0, maquina.getGananciasBrutas());
        Assert.assertEquals(0, maquina.getGananciasNetas());
        Assert.assertEquals(0, maquina.getPrecioBaseCafe());
    }

    @Test
    public void testPrepararCafe01() {
        MaquinaCafetera maquina = new MaquinaCafetera(56, 6, 1);
        Assert.assertEquals(true, maquina.prepararCafe(1, 2));
        Assert.assertEquals(false, maquina.prepararCafe(1, 2));
    }

    @Test
    public void testPrepararCafe11() {
        MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
        Assert.assertEquals(true, maquina.prepararCafe(1, 1));
        Assert.assertEquals(945, maquina.getCafe());
        Assert.assertEquals(1000, maquina.getAzucar());
        Assert.assertEquals(99, maquina.getVasos());
    }

    @Test
    public void testPrepararCafe22() {
        MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
        Assert.assertEquals(true, maquina.prepararCafe(2, 2));
        Assert.assertEquals(890, maquina.getCafe());
        Assert.assertEquals(995, maquina.getAzucar());
        Assert.assertEquals(99, maquina.getVasos());
    }

    @Test
    public void testPrepararCafe33() {
        MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
        Assert.assertEquals(true, maquina.prepararCafe(3, 3));
        Assert.assertEquals(835, maquina.getCafe());
        Assert.assertEquals(990, maquina.getAzucar());
        Assert.assertEquals(99, maquina.getVasos());
    }

    @Test
    public void testRecargarCafe1() {
        MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
        maquina.setGananciasNetas(1000);
        Assert.assertEquals(true, maquina.recargarCafe(10, 100));
        Assert.assertEquals(10, maquina.getCafe());
    }

    @Test
    public void testRecargarCafe2() {
        MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
        Assert.assertEquals(false, maquina.recargarCafe(10, 100));
        Assert.assertEquals(0, maquina.getCafe());
    }

    @Test
    public void testRecargarCafe3() {
        MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
        maquina.setIngresos(1000);
        maquina.setGananciasNetas(1000);
        Assert.assertEquals(true, maquina.recargarCafe(10, 100));
        Assert.assertEquals(100, maquina.getEgresos());
        Assert.assertEquals(900, maquina.getGananciasBrutas());
        Assert.assertEquals(160, maquina.getImpuestos());
        Assert.assertEquals(740, maquina.getGananciasNetas());
    }

    @Test
    public void testRecargarCafe4() {
        MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
        Assert.assertEquals(false, maquina.recargarCafe(10, 100));
        Assert.assertEquals(0, maquina.getEgresos());
        Assert.assertEquals(0, maquina.getGananciasBrutas());
        Assert.assertEquals(0, maquina.getImpuestos());
        Assert.assertEquals(0, maquina.getGananciasNetas());
    }

    @Test
    public void testRegistrarFactura() {
        MaquinaCafetera maquina = new MaquinaCafetera();
        maquina.registrarFactura(2000);
        Assert.assertEquals(2000, maquina.getIngresos());
        Assert.assertEquals(320, maquina.getImpuestos());
        Assert.assertEquals(0, maquina.getEgresos());
        Assert.assertEquals(2000, maquina.getGananciasBrutas());
        Assert.assertEquals(1680, maquina.getGananciasNetas());
    }
}
