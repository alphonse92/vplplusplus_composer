 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InscripcionTest.
 *
 * @author (Milton Jes�s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class InscripcionTest
{
    /**
     * Default constructor for test class InscripcionTest
     */
    public InscripcionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testConstructorInscripcion()
    {
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Materia materia1 = new Materia("POO II", 40);
        Inscripcion inscripc1 = new Inscripcion(alumno1, materia1);
        assertEquals(alumno1, inscripc1.getAlumno());
        assertEquals(materia1, inscripc1.getMateria());
    }
}

