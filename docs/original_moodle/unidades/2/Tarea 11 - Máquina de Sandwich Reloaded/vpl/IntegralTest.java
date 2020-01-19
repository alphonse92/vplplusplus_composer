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
        MaquinaSandwichTest s = new MaquinaSandwichTest();
        int grade = 0;

        try {
            s.testStaticFinal();
            System.out.println(formatOutput("testStaticFinal()", "1", null));
            grade += 1;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testStaticFinal()", "1", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testStaticFinal()", "1", new AssertionError(e.getMessage())));
        }
        try {
            s.testConstructor1();
            System.out.println(formatOutput("testConstructor1()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor1()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor1()", "2", new AssertionError(e.getMessage())));
        }
        try {
            s.testConstructor2();
            System.out.println(formatOutput("testConstructor2()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor2()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor2()", "2", new AssertionError(e.getMessage())));
        }
        try {
            s.testConstructor3();
            System.out.println(formatOutput("testConstructor3()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testConstructor3()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testConstructor3()", "2", new AssertionError(e.getMessage())));
        }
        try {
            s.testCalcularPrecioFabricacion1();
            System.out.println(formatOutput("testCalcularPrecioFabricacion1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion1()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testCalcularPrecioFabricacion2();
            System.out.println(formatOutput("testCalcularPrecioFabricacion2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioFabricacion2()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testCalcularPrecioVenta1();
            System.out.println(formatOutput("testCalcularPrecioVenta1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioVenta1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioVenta1()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testCalcularPrecioVenta2();
            System.out.println(formatOutput("testCalcularPrecioVenta2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testCalcularPrecioVenta2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testCalcularPrecioVenta2()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaFull();
            System.out.println(formatOutput("testRegistrarVentaFull()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaFull()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaFull()", "10", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaQueso();
            System.out.println(formatOutput("testRegistrarVentaQueso()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaQueso()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaQueso()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaMortadela();
            System.out.println(formatOutput("testRegistrarVentaMortadela()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaMortadela()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaMortadela()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaJamon();
            System.out.println(formatOutput("testRegistrarVentaJamon()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaJamon()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaJamon()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaPanBlanco();
            System.out.println(formatOutput("testRegistrarVentaPanBlanco()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaPanBlanco()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaPanBlanco()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaPanIntegral();
            System.out.println(formatOutput("testRegistrarVentaPanIntegral()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaPanIntegral()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaPanIntegral()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaIngresos1();
            System.out.println(formatOutput("testRegistrarVentaIngresos1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos1()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testRegistrarVentaIngresos2();
            System.out.println(formatOutput("testRegistrarVentaIngresos2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testRegistrarVentaIngresos2()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testPorcentajes1();
            System.out.println(formatOutput("testPorcentajes1()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPorcentajes1()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPorcentajes1()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testPorcentajes2();
            System.out.println(formatOutput("testPorcentajes2()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testPorcentajes2()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testPorcentajes2()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesSuficientesSimpleBlanco();
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleBlanco()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesSuficientesSimpleIntegral();
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesSimpleIntegral()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesSuficientesExquisitoBlanco();
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoBlanco()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesSuficientesExquisitoIntegral();
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesSuficientesExquisitoIntegral()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesInsuficientesSimpleBlanco();
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleBlanco()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesInsuficientesSimpleIntegral();
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesSimpleIntegral()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesInsuficientesExquisitoBlanco();
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoBlanco()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testIngredientesInsuficientesExquisitoIntegral();
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testIngredientesInsuficientesExquisitoIntegral()", "3", new AssertionError(e.getMessage())));
        }
        try {
            s.testEspecial1();
            System.out.println(formatOutput("testEspecial1()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEspecial1()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testEspecial1()", "10", new AssertionError(e.getMessage())));
        }
        try {
            s.testEspecial2();
            System.out.println(formatOutput("testEspecial2()", "10", null));
            grade += 10;
        } catch (AssertionError e) {
            System.out.println(formatOutput("testEspecial2()", "10", e));
        } catch (Exception e) {
            System.out.println(formatOutput("testEspecial2()", "10", new AssertionError(e.getMessage())));
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
