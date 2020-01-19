 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class UniversidadTest.
 *
 * @author (Milton Jes�s Vera Contreras - miltonjesusvc@ufps.edu.co) 
 * @version Math.sin(Math.PI-Double.MIN_VALUE) :) 
 */
public class UniversidadTest
{
    /**
     * Default constructor for test class UniversidadTest
     */
    public UniversidadTest()
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
    public void testConstructorUniversidad()
    {
        Universidad universidad1 = new Universidad();
        assertNotNull(universidad1.alumnos);
        assertEquals(100, universidad1.alumnos.length);
        assertEquals(0, universidad1.contadorAlumnos);
        assertNotNull(universidad1.materias);
        assertEquals(10, universidad1.materias.length);
        assertEquals(0, universidad1.contadorMaterias);
    }

    @Test
    public void testAgregarAlumnoOK()
    {
        Universidad universidad1 = new Universidad();
        assertEquals(true, universidad1.agregarAlumno("1", "Primero", "de la lista", 16, 4.2f));
        assertEquals(true, universidad1.agregarAlumno("2", "Segundo", "de la lista", 17, 3.0f));
        assertEquals(true, universidad1.agregarAlumno("3", "Tercero", "de la lista", 20, 3.5f));
        assertNotNull(universidad1.alumnos);
        assertEquals(100, universidad1.alumnos.length);
        assertEquals(3, universidad1.contadorAlumnos);
    }

    @Test
    public void testAgregarAlumnoErrorCodigoRepetido()
    {
        Universidad universidad1 = new Universidad();
        assertEquals(true, universidad1.agregarAlumno("1", "Primero", "de la lista", 16, 4.2f));
        assertEquals(false, universidad1.agregarAlumno("1", "Segundo", "de la lista", 17, 3.0f));
        assertEquals(true, universidad1.agregarAlumno("3", "Tercero", "de la lista", 20, 3.5f));
        assertNotNull(universidad1.alumnos);
        assertEquals(100, universidad1.alumnos.length);
        assertEquals(2, universidad1.contadorAlumnos);
    }

    @Test
    public void testAgregarAlumnoErrorNombresYApellidosRepetidos()
    {
        Universidad universidad1 = new Universidad();
        assertEquals(true, universidad1.agregarAlumno("1", "Primero", "de la lista", 16, 4.2f));
        assertEquals(false, universidad1.agregarAlumno("2", "Primero", "de la lista", 17, 3.0f));
        assertEquals(true, universidad1.agregarAlumno("2", "Segundo", "de la lista", 20, 3.5f));
        assertNotNull(universidad1.alumnos);
        assertEquals(100, universidad1.alumnos.length);
        assertEquals(2, universidad1.contadorAlumnos);
    }

    @Test
    public void testAgregarMateriaOK()
    {
        Universidad universidad1 = new Universidad();
        assertEquals(true, universidad1.agregarMateria("Fundamentos", 40));
        assertEquals(true, universidad1.agregarMateria("POO I", 40));
        assertEquals(true, universidad1.agregarMateria("POO II", 40));
        assertNotNull(universidad1.materias);
        assertEquals(10, universidad1.materias.length);
        assertEquals(3, universidad1.contadorMaterias);
    }

    @Test
    public void testAgregarMateriaError()
    {
        Universidad universidad1 = new Universidad();
        assertEquals(true, universidad1.agregarMateria("Fundamentos", 40));
        assertEquals(false, universidad1.agregarMateria("Fundamentos", 40));
        assertEquals(true, universidad1.agregarMateria("POO I", 40));
        assertNotNull(universidad1.materias);
        assertEquals(10, universidad1.materias.length);
        assertEquals(2, universidad1.contadorMaterias);
    }

    @Test
    public void testGetAlumnoPorPosicionOK()
    {
        Universidad universidad1 = new Universidad(); 
        universidad1.agregarAlumno("1", "Primero", "de la lista", 16, 4.2f);
        universidad1.agregarAlumno("2", "Segundo", "de la lista", 17, 3.0f);
        universidad1.agregarAlumno("3", "Tercero", "de la lista", 20, 3.5f);
        assertNotNull(universidad1.getAlumno(1));
        assertNotNull(universidad1.getAlumno(2));
        assertNotNull(universidad1.getAlumno(3));
    }

    @Test
    public void testGetAlumnoPorPosicionError()
    {
        Universidad universidad1 = new Universidad(); 
        universidad1.agregarAlumno("1", "Primero", "de la lista", 16, 4.2f);
        universidad1.agregarAlumno("2", "Segundo", "de la lista", 17, 3.0f);
        universidad1.agregarAlumno("3", "Tercero", "de la lista", 20, 3.5f);
        assertNull(universidad1.getAlumno(-1));
        assertNull(universidad1.getAlumno(0));
        assertNull(universidad1.getAlumno(4));
    }    

    @Test
    public void testGetMateriaPorPosicionOK()
    {
        Universidad universidad1 = new Universidad();
        universidad1.agregarMateria("Fundamentos", 40);
        universidad1.agregarMateria("POO I", 40);
        universidad1.agregarMateria("POO II", 40);
        assertNotNull(universidad1.getMateria(1));
        assertNotNull(universidad1.getMateria(2));
        assertNotNull(universidad1.getMateria(3));        
    }

    @Test
    public void testGetMateriaPorPosicionError()
    {
        Universidad universidad1 = new Universidad();
        universidad1.agregarMateria("Fundamentos", 40);
        universidad1.agregarMateria("POO I", 40);
        universidad1.agregarMateria("POO II", 40);
        assertNull(universidad1.getMateria(-1));
        assertNull(universidad1.getMateria(0));
        assertNull(universidad1.getMateria(4));        
    }

    @Test
    public void testContieneAlumno(){
        Universidad u = new Universidad();
        Alumno a = null;
        for(int i=1;i<=100;i++){
            u.agregarAlumno("151100"+i,"a"+i,"a"+i,(17+i)%23,(3f+i/100f));
        }

        for(int i=1;i<=100;i++){
            assertEquals(true, u.contieneAlumno(new Alumno("151100"+i,"a"+i,"a"+i,(17+i)%23,(3f+i/100f))));
        }
    }

    @Test
    public void testContieneMaterua(){
        Universidad u = new Universidad();
        Materia m = null;
        for(int i=1;i<=10;i++){
            u.agregarMateria("151100"+i,1);
        }

        for(int i=1;i<=10;i++){
            assertEquals(true, u.contieneMateria(new Materia("151100"+i,i)));
        }
    }

    @Test
    public void testEliminarAlumno(){
        Universidad u = new Universidad();
        Alumno a = null;
        for(int i=1;i<=100;i++){
            u.agregarAlumno("151100"+i,"a"+i,"a"+i,(17+i)%23,(3f+i/100f));
        }

        a = u.eliminarAlumno(1);
        assertNotNull(a);
        assertEquals(new Alumno("151100"+1,"a"+1,"a"+1,(17+1)%23,(3f+1/100f)), a);
        assertNotNull(u.alumnos);
        assertEquals(100, u.alumnos.length);
        assertEquals(99, u.contadorAlumnos);
        a = u.eliminarAlumno(100);
        assertNull(a);

        a = u.eliminarAlumno(99);
        assertNotNull(a);
        assertEquals(new Alumno("151100"+100,"a"+100,"a"+100,(17+100)%23,(3f+100/100f)), a);
        assertNotNull(u.alumnos);
        assertEquals(100, u.alumnos.length);
        assertEquals(98, u.contadorAlumnos);
        a = u.eliminarAlumno(100);
        assertNull(a);
        a = u.eliminarAlumno(99);
        assertNull(a);

        a = u.eliminarAlumno(50);
        assertNotNull(a);
        assertEquals(new Alumno("151100"+51,"a"+51,"a"+51,(17+51)%23,(3f+51/100f)), a);
        assertNotNull(u.alumnos);
        assertEquals(100, u.alumnos.length);
        assertEquals(97, u.contadorAlumnos);
        a = u.eliminarAlumno(100);
        assertNull(a);
        a = u.eliminarAlumno(99);
        assertNull(a);
        a = u.eliminarAlumno(98);
        assertNull(a);
        int k=2;
        for(int i=1;i<=97;i++,k++){
            if(k==51)k++;
            a = u.eliminarAlumno(1);
            assertNotNull(a);
            assertEquals(new Alumno("151100"+k,"a"+k,"a"+k,(17+k)%23,(3f+k/100f)), a);
        }
        assertNotNull(u.alumnos);
        assertEquals(100, u.alumnos.length);
        assertEquals(0, u.contadorAlumnos);

    }

    @Test
    public void testEliminarMateria(){
        Universidad u = new Universidad();
        Materia m = null;
        for(int i=1;i<=100;i++){
            u.agregarMateria("151100"+i,i);
        }

        m = u.eliminarMateria(1);
        assertNotNull(m);
        assertEquals(new Materia("151100"+1,1), m);
        assertNotNull(u.materias);
        assertEquals(10, u.materias.length);
        assertEquals(9, u.contadorMaterias);
        m = u.eliminarMateria(10);
        assertNull(m);

        m = u.eliminarMateria(9);
        assertNotNull(m);
        assertEquals(new Materia("151100"+10,10), m);
        assertNotNull(u.materias);
        assertEquals(10, u.materias.length);
        assertEquals(8, u.contadorMaterias);
        m = u.eliminarMateria(10);
        assertNull(m);
        m = u.eliminarMateria(9);
        assertNull(m);

        m = u.eliminarMateria(5);
        assertNotNull(m);
        assertEquals(new Materia("151100"+6,6), m);
        assertNotNull(u.materias);
        assertEquals(10, u.materias.length);
        assertEquals(7, u.contadorMaterias);
        m = u.eliminarMateria(10);
        assertNull(m);
        m = u.eliminarMateria(9);
        assertNull(m);
        m = u.eliminarMateria(8);
        assertNull(m);

        int k=2;
        for(int i=1;i<=7;i++,k++){
            if(k==6)k=7;
            m = u.eliminarMateria(1);
            assertNotNull(m);
            assertEquals(new Materia("151100"+k,k), m);
        }
        assertNotNull(u.materias);
        assertEquals(10, u.materias.length);
        assertEquals(0, u.contadorMaterias);

    }
}

