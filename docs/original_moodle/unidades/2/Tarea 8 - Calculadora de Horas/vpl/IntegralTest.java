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
        HoraTest t = new HoraTest ();
        int grade = 0;

        try {
            t.testHoraConstructor1();
            System.out.println(formatOutput("testHoraConstructor1", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraConstructor1", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraConstructor1", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraConstructor2();
            System.out.println(formatOutput("testHoraConstructor2", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraConstructor2", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraConstructor2", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraConstructor3();
            System.out.println(formatOutput("testHoraConstructor3", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraConstructor3", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraConstructor3", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraConstructor4();
            System.out.println(formatOutput("testHoraConstructor4", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraConstructor4", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraConstructor4", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraConstructor5();
            System.out.println(formatOutput("testHoraConstructor5", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraConstructor5", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraConstructor5", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraSonIguales();
            System.out.println(formatOutput("testHoraSonIguales", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraSonIguales", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraSonIguales", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraEsMenor();
            System.out.println(formatOutput("testHoraEsMenor", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraEsMenor", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraEsMenor", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraEsMayor();
            System.out.println(formatOutput("testHoraEsMayor", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraEsMayor", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraEsMayor", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testGetHoraFormato();
            System.out.println(formatOutput("testGetHoraFormato", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testGetHoraFormato", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testGetHoraFormato", "10", new AssertionError(e.getMessage())));
        }
        
        try {
            t.testHoraRestar();
            System.out.println(formatOutput("testHoraRestar", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testHoraRestar", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testHoraRestar", "10", new AssertionError(e.getMessage())));
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
