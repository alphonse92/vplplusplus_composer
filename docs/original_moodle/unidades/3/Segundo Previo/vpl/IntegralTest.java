import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Formatter;
import java.util.Locale;

public class IntegralTest {
    public static void main(String[] arg)
    {
        TestLaunchMachine t = new TestLaunchMachine();
        int grade = 0;

        try {
            t.setUp();
            t.testIngredienteRegistrarVenta1();
            System.out.println(formatOutput("testIngredienteRegistrarVenta1()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredienteRegistrarVenta1()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredienteRegistrarVenta1()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testIngredienteRegistrarCompra1();
            System.out.println(formatOutput("testIngredienteRegistrarCompra1()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredienteRegistrarCompra1()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredienteRegistrarCompra1()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testIngredienteRegistrarVenta2();
            System.out.println(formatOutput("testIngredienteRegistrarVenta2()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredienteRegistrarVenta2()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredienteRegistrarVenta2()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testIngredienteRegistrarCompra2();
            System.out.println(formatOutput("testIngredienteRegistrarCompra2()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredienteRegistrarCompra2()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredienteRegistrarCompra2()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testIngredienteEquals();
            System.out.println(formatOutput("testIngredienteEquals()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredienteEquals()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredienteEquals()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testAlmuerzoConstructor();
            System.out.println(formatOutput("testAlmuerzoConstructor()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAlmuerzoConstructor()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAlmuerzoConstructor()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testAlmuerzoPrecioVenta();
            System.out.println(formatOutput("testAlmuerzoPrecioVenta()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAlmuerzoPrecioVenta()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAlmuerzoPrecioVenta()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testAlmuerzoSePuedePrepararYRegistrarVenta();
            System.out.println(formatOutput("testAlmuerzoSePuedePrepararYRegistrarVenta()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testAlmuerzoSePuedePrepararYRegistrarVenta()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testAlmuerzoSePuedePrepararYRegistrarVenta()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testRestauranteGetNombres();
            System.out.println(formatOutput("testRestauranteGetNombres()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRestauranteGetNombres()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRestauranteGetNombres()", "10", new AssertionError(e.getMessage())));
        }
        try {
            t.setUp();
            t.testRestauranteBuscar();
            System.out.println(formatOutput("testRestauranteBuscar()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRestauranteBuscar()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRestauranteBuscar()", "10", new AssertionError(e.getMessage())));
        }

        System.out.println("Grade :=>> "+grade);
    }

    private static String formatOutput(String testName, String value, AssertionError e) {
        StringBuilder sb = new StringBuilder();
        Formatter f = new Formatter(sb, Locale.getDefault());
        String grade = (e == null ? value : "0");
        f.format("Comment :=>> %s: %s. %s marks\n", testName, (e == null ? "success" : "failure"), grade);
        if (e != null) {
            f.format("********************\n%s\n", e.getMessage());
        }
        return sb.toString();
    }

    @Test
    public void testDummy(){IntegralTest.main(null);}

}
