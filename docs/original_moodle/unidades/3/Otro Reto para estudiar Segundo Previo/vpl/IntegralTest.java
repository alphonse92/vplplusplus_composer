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
        CampeonatoTest c = new CampeonatoTest();
        EquipoTest eq = new EquipoTest();
        PartidoTest p = new PartidoTest();
        int grade = 0;

        try {
            c.testCampeonatoConstructor();
            System.out.println(formatOutput("testCampeonatoConstructor", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            c.testCampeonatoInscribirEquipo();
            System.out.println(formatOutput("testCampeonatoInscribirEquipo", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCampeonatoInscribirEquipo", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            c.testCampeonatoBuscarEquipo();
            System.out.println(formatOutput("testCampeonatoBuscarEquipo", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCampeonatoBuscarEquipo", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            c.testCampeonatoRegistrarPartido();
            System.out.println(formatOutput("testCampeonatoRegistrarPartido", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCampeonatoRegistrarPartido", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            eq.testEquipoAgregarFutbolista();
            System.out.println(formatOutput("testEquipoAgregarFutbolista", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEquipoAgregarFutbolista", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            eq.testEquipoBuscarFutbolista();
            System.out.println(formatOutput("testEquipoBuscarFutbolista", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEquipoBuscarFutbolista", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            eq.testEquipoRegistrarPartido();
            System.out.println(formatOutput("testEquipoRegistrarPartido", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEquipoRegistrarPartido", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            eq.testEquipoAgregarPortero();
            System.out.println(formatOutput("testEquipoAgregarPortero", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEquipoAgregarPortero", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            p.testPartidoConstructor();
            System.out.println(formatOutput("testPartidoConstructor", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPartidoConstructor", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
        }

        try {
            p.testPartidoRegistrarPartido();
            System.out.println(formatOutput("testPartidoRegistrarPartido", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPartidoRegistrarPartido", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCampeonatoConstructor", "10", new AssertionError(e.getMessage())));
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
