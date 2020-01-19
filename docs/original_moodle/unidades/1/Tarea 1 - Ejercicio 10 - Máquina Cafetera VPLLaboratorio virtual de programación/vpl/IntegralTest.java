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
        MaquinaCafeteraTest m = new MaquinaCafeteraTest ();
        int grade = 0;

        try {
            m.testCalcularPrecio0();
            System.out.println(formatOutput("testCalcularPrecio0", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio0", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio0", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio11();
            System.out.println(formatOutput("testCalcularPrecio11", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio11", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio11", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio12();
            System.out.println(formatOutput("testCalcularPrecio12", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio12", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio12", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio13();
            System.out.println(formatOutput("testCalcularPrecio13", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio13", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio13", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio21();
            System.out.println(formatOutput("testCalcularPrecio21", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio21", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio21", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio22();
            System.out.println(formatOutput("testCalcularPrecio22", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio22", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio22", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio23();
            System.out.println(formatOutput("testCalcularPrecio23", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio23", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio23", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio31();
            System.out.println(formatOutput("testCalcularPrecio31", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio31", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio31", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio32();
            System.out.println(formatOutput("testCalcularPrecio32", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio32", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio32", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testCalcularPrecio33();
            System.out.println(formatOutput("testCalcularPrecio33", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecio33", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecio33", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testPrepararCafe0();
            System.out.println(formatOutput("testPrepararCafe0", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPrepararCafe0", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPrepararCafe0", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testPrepararCafe01();
            System.out.println(formatOutput("testPrepararCafe01", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPrepararCafe01", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPrepararCafe01", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testPrepararCafe11();
            System.out.println(formatOutput("testPrepararCafe11", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPrepararCafe11", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPrepararCafe11", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testPrepararCafe22();
            System.out.println(formatOutput("testPrepararCafe22", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPrepararCafe22", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPrepararCafe22", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testPrepararCafe33();
            System.out.println(formatOutput("testPrepararCafe33", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPrepararCafe33", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPrepararCafe33", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testRecargarCafe1();
            System.out.println(formatOutput("testRecargarCafe1", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRecargarCafe1", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRecargarCafe1", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testRecargarCafe2();
            System.out.println(formatOutput("testRecargarCafe2", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRecargarCafe2", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRecargarCafe2", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testRecargarCafe3();
            System.out.println(formatOutput("testRecargarCafe3", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRecargarCafe3", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRecargarCafe3", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testRecargarCafe4();
            System.out.println(formatOutput("testRecargarCafe4", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRecargarCafe4", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRecargarCafe4", "5", new AssertionError(e.getMessage())));
        }
        try {
            m.testRegistrarFactura();
            System.out.println(formatOutput("testRegistrarFactura", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarFactura", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarFactura", "5", new AssertionError(e.getMessage())));
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
