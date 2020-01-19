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
        FraccionarioTest f = new FraccionarioTest ();
        int grade = 0;

        try {
            f.testSumar();
            System.out.println(formatOutput("testSumar", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testSumar", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testSumar", "20", new AssertionError(e.getMessage())));
        }
        
        try {
            f.testRestar();
            System.out.println(formatOutput("testRestar", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRestar", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRestar", "20", new AssertionError(e.getMessage())));
        }
        
        try {
            f.testMultiplicar();
            System.out.println(formatOutput("testMultiplicar", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testMultiplicar", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testMultiplicar", "20", new AssertionError(e.getMessage())));
        }
        
        try {
            f.testDividir();
            System.out.println(formatOutput("testDividir", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testDividir", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testDividir", "20", new AssertionError(e.getMessage())));
        }
        
        try {
            f.testSimplificar();
            System.out.println(formatOutput("testSimplificar", "20", null));
            grade += 20;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testSimplificar", "20", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testSimplificar", "20", new AssertionError(e.getMessage())));
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
