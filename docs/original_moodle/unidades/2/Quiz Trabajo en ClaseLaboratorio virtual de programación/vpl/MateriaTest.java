 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class MateriaTest.
 *
 * @author (Milton Jes�s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class MateriaTest
{
    /**
     * Default constructor for test class MateriaTest
     */
    public MateriaTest()
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
    public void testConstructorMateria()
    {
        int r = (int)(Math.random()*100);
        Materia materia1 = new Materia("POO II", r);
        assertEquals(r, materia1.getMaximoDeAlumnosPorGrupo());
        assertEquals("POO II", materia1.getNombre());
        assertNotNull(materia1.inscripciones);
        assertEquals(0, materia1.inscripciones.size());
        assertNull(materia1.grupos);
    }

    @Test
    public void testInscribirAlumnoOK()
    {
        Materia materia1 = new Materia("POO II", 40);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("2", "Segundo", "de la lista", 16, 4.2f);
        assertEquals(true, materia1.inscribir(alumno1));
        assertEquals(true, materia1.inscribir(alumno2));
        assertNotNull(materia1.inscripciones);
        assertEquals(2, materia1.inscripciones.size());
    }
    
    @Test
    public void testInscribirAlumnoErrorCondicional()
    {
        Materia materia1 = new Materia("POO II", 40);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("2", "Segundo", "de la lista", 16, 3.0f);
        Alumno alumno3 = new Alumno("3", "Tercero", "de la lista", 16, 3.5f);
        assertEquals(true, materia1.inscribir(alumno1));
        assertEquals(false, materia1.inscribir(alumno2));
        assertEquals(true, materia1.inscribir(alumno3));
        assertNotNull(materia1.inscripciones);
        assertEquals(2, materia1.inscripciones.size());
    }
    
    @Test
    public void testInscribirAlumnoErrorRepetido()
    {
        Materia materia1 = new Materia("POO II", 40);
        Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
        Alumno alumno2 = new Alumno("2", "Segundo", "de la lista", 16, 3.6f);
        Alumno alumno3 = new Alumno("3", "Tercero", "de la lista", 16, 3.5f);
        materia1.inscribir(alumno1);
        materia1.inscribir(alumno2);
        materia1.inscribir(alumno3);
        assertEquals(false, materia1.inscribir(alumno1));
        assertEquals(false, materia1.inscribir(alumno2));
        assertEquals(false, materia1.inscribir(alumno3));
        assertNotNull(materia1.inscripciones);
        assertEquals(3, materia1.inscripciones.size());
    }
    
    
    @Test
    public void testGenerarGrupos()
    {
        Materia materia1 = new Materia("POO II", 8);
        Alumno alumno = null;
        Alumno [ ] alumnos = new Alumno[100];
        for(int i=1;i<=100;i++){
         alumno = new Alumno(""+i, "Alumno " + i, "de la lista", 16, 4.2f);
         materia1.inscribir(alumno);
         alumnos[i-1]=alumno;
        }
        assertEquals(12, materia1.generarGrupos());
        ArrayList<Grupo> grupos = materia1.grupos;
        int k=0;
        for(int j=0;j<12;j++){    
          for(int i=0;i<8;i++){    
            assertEquals(alumnos[k++],grupos.get(j).alumnos[i]);
          }
        }
    }

}


