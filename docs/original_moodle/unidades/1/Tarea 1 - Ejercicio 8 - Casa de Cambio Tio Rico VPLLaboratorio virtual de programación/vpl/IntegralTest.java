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
        CasaDeCambioTest c = new CasaDeCambioTest ();
        int grade = 0;

        try {
            c.testGetGananciaEnUnBolivar();
            System.out.println(formatOutput("testGetGananciaEnUnBolivar", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testGetGananciaEnUnBolivar", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testGetGananciaEnUnBolivar", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar1();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar1", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar1", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar1", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar2();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar2", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar2", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar2", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar3();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar3", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar3", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar3", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar4();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar4", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar4", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar4", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar5();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar5", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar5", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar5", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar6();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar6", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar6", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar6", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar7();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar7", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar7", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar7", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testCambiarPrecioDelBolivar8();
            System.out.println(formatOutput("testCambiarPrecioDelBolivar8", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar8", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCambiarPrecioDelBolivar8", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testComprarBolivares1();
            System.out.println(formatOutput("testComprarBolivares1", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testComprarBolivares1", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testComprarBolivares1", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testComprarBolivares2();
            System.out.println(formatOutput("testComprarBolivares2", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testComprarBolivares2", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testComprarBolivares2", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testComprarBolivares3();
            System.out.println(formatOutput("testComprarBolivares3", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testComprarBolivares3", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testComprarBolivares3", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testComprarBolivares4();
            System.out.println(formatOutput("testComprarBolivares4", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testComprarBolivares4", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testComprarBolivares4", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testComprarBolivares5();
            System.out.println(formatOutput("testComprarBolivares5", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testComprarBolivares5", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testComprarBolivares5", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testVenderBolivares1();
            System.out.println(formatOutput("testVenderBolivares1", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testVenderBolivares1", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testVenderBolivares1", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testVenderBolivares2();
            System.out.println(formatOutput("testVenderBolivares2", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testVenderBolivares2", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testVenderBolivares2", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testVenderBolivares3();
            System.out.println(formatOutput("testVenderBolivares3", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testVenderBolivares3", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testVenderBolivares3", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testVenderBolivares4();
            System.out.println(formatOutput("testVenderBolivares4", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testVenderBolivares4", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testVenderBolivares4", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testVenderBolivares5();
            System.out.println(formatOutput("testVenderBolivares5", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testVenderBolivares5", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testVenderBolivares5", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testGetImpuestos();
            System.out.println(formatOutput("testGetImpuestos", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testGetImpuestos", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testGetImpuestos", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testGetGanancias();
            System.out.println(formatOutput("testGetGanancias", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testGetGanancias", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testGetGanancias", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testInyectarPesos1();
            System.out.println(formatOutput("testInyectarPesos1", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testInyectarPesos1", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testInyectarPesos1", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testInyectarPesos2();
            System.out.println(formatOutput("testInyectarPesos2", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testInyectarPesos2", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testInyectarPesos2", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testInyectarBolivares1();
            System.out.println(formatOutput("testInyectarBolivares1", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testInyectarBolivares1", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testInyectarBolivares1", "4", new AssertionError(e.getMessage())));
        }
        try {
            c.testInyectarBolivares2();
            System.out.println(formatOutput("testInyectarBolivares2", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testInyectarBolivares2", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testInyectarBolivares2", "4", new AssertionError(e.getMessage())));
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
