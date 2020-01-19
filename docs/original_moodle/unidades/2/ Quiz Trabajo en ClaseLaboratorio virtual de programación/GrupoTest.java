 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GrupoTest.
 *
 * @author (Milton Jes&uacute;s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class GrupoTest
{
    /**
     * Default constructor for test class GrupoTest
     */
    public GrupoTest()
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
    public void testConstructorGrupo()
    {
        int r = (int)(Math.random()*100);
        Materia materia1 = new Materia("POO II", r);
        Grupo grupo1 = new Grupo(materia1);
        assertNotNull(grupo1.alumnos);
        assertEquals(r, grupo1.alumnos.length);
        assertEquals(0, grupo1.getContadorDeAlumnos());
        assertEquals(materia1, grupo1.materia);
    }
    
    @Test
    public void testAgregarAlumnoOK()
    {
        Materia materia1 = new Materia("POO II", 4);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("2", "Segundo", "de la lista", 16, 3.6f);
        Alumno alumno3 = new Alumno("3", "Tercero", "de la lista", 16, 3.5f);
        Alumno alumno4 = new Alumno("4", "Cuarto", "de la lista", 16, 3.5f);        
        Grupo grupo1 = new Grupo(materia1);
        assertEquals(true, grupo1.agregarAlumno(alumno1));
        assertEquals(true, grupo1.agregarAlumno(alumno2));
        assertEquals(true, grupo1.agregarAlumno(alumno3));
        assertEquals(true, grupo1.agregarAlumno(alumno4));
    }
    
    @Test
    public void testAgregarAlumnoErrorTamanio()
    {
        Materia materia1 = new Materia("POO II", 3);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("2", "Segundo", "de la lista", 16, 3.6f);
        Alumno alumno3 = new Alumno("3", "Tercero", "de la lista", 16, 3.5f);
        Alumno alumno4 = new Alumno("4", "Cuarto", "de la lista", 16, 3.5f);        
        Grupo grupo1 = new Grupo(materia1);
        grupo1.agregarAlumno(alumno1);
        grupo1.agregarAlumno(alumno2);
        grupo1.agregarAlumno(alumno3);
        assertEquals(false, grupo1.agregarAlumno(alumno4));
    }
    
    @Test
    public void testAgregarAlumnoErrorRepetido()
    {
        Materia materia1 = new Materia("POO II", 4);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("1", "Segundo", "de la lista", 16, 3.6f);
        Alumno alumno3 = new Alumno("3", "Primero", "de la lista", 16, 3.5f);
        Alumno alumno4 = new Alumno("4", "Cuarto", "de la lista", 16, 3.5f);        
        Grupo grupo1 = new Grupo(materia1);
        grupo1.agregarAlumno(alumno1);
        assertEquals(false, grupo1.agregarAlumno(alumno2));
        assertEquals(false, grupo1.agregarAlumno(alumno3));
        assertEquals(true, grupo1.agregarAlumno(alumno4));
    }
}

