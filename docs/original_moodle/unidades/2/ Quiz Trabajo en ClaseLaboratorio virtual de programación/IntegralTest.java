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
        AlumnoTest a = new AlumnoTest();
        InscripcionTest i = new InscripcionTest();
        GrupoTest g = new GrupoTest();
        MateriaTest m = new MateriaTest();
        UniversidadTest u = new UniversidadTest();

        int grade = 0;

        try {
            a.testAlumno();
            System.out.println(formatOutput("Alumno.testAlumno()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Alumno.testAlumno()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Alumno.testAlumno()", "2", new AssertionError(e.getMessage())));
        }
        try {
            i.testConstructorInscripcion();
            System.out.println(formatOutput("Inscripcion.testConstructorInscripcion()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Inscripcion.testConstructorInscripcion()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Inscripcion.testConstructorInscripcion()", "2", new AssertionError(e.getMessage())));
        }
        try {
            g.testConstructorGrupo();
            System.out.println(formatOutput("Grupo.testConstructorGrupo()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Grupo.testConstructorGrupo()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Grupo.testConstructorGrupo()", "2", new AssertionError(e.getMessage())));
        }
        try {
            g.testAgregarAlumnoOK();
            System.out.println(formatOutput("Grupo.testAgregarAlumnoOK()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoOK()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoOK()", "2", new AssertionError(e.getMessage())));
        }
        try {
            g.testAgregarAlumnoErrorTamanio();
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorTamanio()", "2", null));
            grade += 2;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorTamanio()", "2", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorTamanio()", "2", new AssertionError(e.getMessage())));
        }
        try {
            g.testAgregarAlumnoErrorRepetido();
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorRepetido()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorRepetido()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Grupo.testAgregarAlumnoErrorRepetido()", "3", new AssertionError(e.getMessage())));
        }
        try {
            m.testConstructorMateria();
            System.out.println(formatOutput("Materia.testConstructorMateria()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Materia.testConstructorMateria()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Materia.testConstructorMateria()", "3", new AssertionError(e.getMessage())));
        }
        try {
            m.testInscribirAlumnoOK();
            System.out.println(formatOutput("Materia.testInscribirAlumnoOK()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoOK()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoOK()", "3", new AssertionError(e.getMessage())));
        }
        try {
            m.testInscribirAlumnoErrorCondicional();
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorCondicional()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorCondicional()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorCondicional()", "3", new AssertionError(e.getMessage())));
        }
        try {
            m.testInscribirAlumnoErrorRepetido();
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorRepetido()", "3", null));
            grade += 3;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorRepetido()", "3", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Materia.testInscribirAlumnoErrorRepetido()", "3", new AssertionError(e.getMessage())));
        }
        try {
            m.testGenerarGrupos();
            System.out.println(formatOutput("Materia.testGenerarGrupos()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Materia.testGenerarGrupos()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Materia.testGenerarGrupos()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testConstructorUniversidad();
            System.out.println(formatOutput("Universidad.testConstructorUniversidad()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testConstructorUniversidad()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testConstructorUniversidad()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testAgregarAlumnoOK();
            System.out.println(formatOutput("Universidad.testAgregarAlumnoOK()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoOK()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoOK()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testAgregarAlumnoErrorCodigoRepetido();
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorCodigoRepetido()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorCodigoRepetido()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorCodigoRepetido()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testAgregarAlumnoErrorNombresYApellidosRepetidos();
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorNombresYApellidosRepetidos()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorNombresYApellidosRepetidos()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testAgregarAlumnoErrorNombresYApellidosRepetidos()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testAgregarMateriaOK();
            System.out.println(formatOutput("Universidad.testAgregarMateriaOK()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testAgregarMateriaOK()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testAgregarMateriaOK()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testAgregarMateriaError();
            System.out.println(formatOutput("Universidad.testAgregarMateriaError()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testAgregarMateriaError()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testAgregarMateriaError()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testGetAlumnoPorPosicionOK();
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionOK()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionOK()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionOK()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testGetAlumnoPorPosicionError();
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionError()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionError()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testGetAlumnoPorPosicionError()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testGetMateriaPorPosicionOK();
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionOK()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionOK()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionOK()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testGetMateriaPorPosicionError();
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionError()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionError()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testGetMateriaPorPosicionError()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testContieneAlumno();
            System.out.println(formatOutput("Universidad.testContieneAlumno()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testContieneAlumno()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testContieneAlumno()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testContieneMaterua();
            System.out.println(formatOutput("Universidad.testContieneMaterua()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testContieneMaterua()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testContieneMaterua()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testEliminarAlumno();
            System.out.println(formatOutput("Universidad.testEliminarAlumno()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testEliminarAlumno()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testEliminarAlumno()", "5", new AssertionError(e.getMessage())));
        }
        try {
            u.testEliminarMateria();
            System.out.println(formatOutput("Universidad.testEliminarMateria()", "5", null));
            grade += 5;
        } catch (AssertionError e) {
            System.out.println(formatOutput("Universidad.testEliminarMateria()", "5", e));
        } catch (Exception e) {
            System.out.println(formatOutput("Universidad.testEliminarMateria()", "5", new AssertionError(e.getMessage())));
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
