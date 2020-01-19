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
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();
        
        int grade = 14;

        try {
            t1.testHoraConstructor();
            System.out.println(formatOutput("t1.testHoraConstructor()", "8", null));
            grade += 8;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t1.testHoraConstructor()", "8", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t1.testHoraConstructor()", "8", new AssertionError(e.getMessage())));
        }
        
        try {
            t1.testHoraEsMenorMayor();
            System.out.println(formatOutput("t1.testHoraEsMenorMayor()", "8", null));
            grade += 8;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t1.testHoraEsMenorMayor()", "8", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t1.testHoraEsMenorMayor()", "8", new AssertionError(e.getMessage())));
        }
        
        try {
            t1.testHoraRestarEnSegundos();
            System.out.println(formatOutput("t1.testHoraRestarEnSegundos()", "8", null));
            grade += 8;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t1.testHoraRestarEnSegundos()", "8", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t1.testHoraRestarEnSegundos()", "8", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        try {
            t2.testConstructor1();
            System.out.println(formatOutput("t2.testConstructor1()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testConstructor1()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testConstructor1()", "2", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        try {
            t2.testConstructor2();
            System.out.println(formatOutput("t2.testConstructor2()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testConstructor2()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testConstructor2()", "2", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        t2.setUp();
        try {
            t2.testRegistrarSalida1();
            System.out.println(formatOutput("t2.testRegistrarSalida1()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testRegistrarSalida1()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testRegistrarSalida1()", "2", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        t2.setUp();
        try {
            t2.testRegistrarSalida2();
            System.out.println(formatOutput("t2.testRegistrarSalida2()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testRegistrarSalida2()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testRegistrarSalida2()", "2", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        t2.setUp();
        try {
            t2.testRegistrarSalida3();
            System.out.println(formatOutput("t2.testRegistrarSalida3()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testRegistrarSalida3()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testRegistrarSalida3()", "2", new AssertionError(e.getMessage())));
        }
        
        t2 = new Test2();
        t2.setUp();
        try {
            t2.testRegistrarSalida4();
            System.out.println(formatOutput("t2.testRegistrarSalida4()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t2.testRegistrarSalida4()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t2.testRegistrarSalida4()", "2", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testConstructor1();
            System.out.println(formatOutput("t3.testConstructor1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testConstructor1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testConstructor1()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testConstructor2();
            System.out.println(formatOutput("t3.testConstructor2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testConstructor2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testConstructor2()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testTegistrarIngreso1();
            System.out.println(formatOutput("t3.testTegistrarIngreso1()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso1()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso1()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testTegistrarIngreso2();
            System.out.println(formatOutput("t3.testTegistrarIngreso2()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso2()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso2()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testTegistrarIngreso3();
            System.out.println(formatOutput("t3.testTegistrarIngreso3()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso3()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testTegistrarIngreso3()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testRegistrarIngreso4();
            System.out.println(formatOutput("t3.testRegistrarIngreso4()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testRegistrarIngreso4()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testRegistrarIngreso4()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testBuscar();
            System.out.println(formatOutput("t3.testBuscar()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testBuscar()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testBuscar()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testRegistrarSalida1();
            System.out.println(formatOutput("t3.testRegistrarSalida1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testRegistrarSalida1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testRegistrarSalida1()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testRegistrarSalida2();
            System.out.println(formatOutput("t3.testRegistrarSalida2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testRegistrarSalida2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testRegistrarSalida2()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testRegistrarSalida3();
            System.out.println(formatOutput("t3.testRegistrarSalida3()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testRegistrarSalida3()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testRegistrarSalida3()", "3", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testResumen1();
            System.out.println(formatOutput("t3.testResumen1()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testResumen1()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testResumen1()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testResumen2();
            System.out.println(formatOutput("t3.testResumen2()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testResumen2()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testResumen2()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testResumen3();
            System.out.println(formatOutput("t3.testResumen3()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testResumen3()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testResumen3()", "4", new AssertionError(e.getMessage())));
        }
        
        t3 = new Test3();
        try {
            t3.testResumen4();
            System.out.println(formatOutput("t3.testResumen4()", "4", null));
            grade += 4;
        } catch (AssertionError e) {
            System.out.println(formatOutput("t3.testResumen4()", "4", e));
        } catch (Exception e) {
            System.out.println(formatOutput("t3.testResumen4()", "4", new AssertionError(e.getMessage())));
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
