
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase Test1 - Examen Final POO I 2017-I.
 *
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Test1
{
    /**
     * Default constructor for test class Test1
     */
    public Test1()
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
    public void testHoraConstructor()
    {
        Hora hora = null;
        Exception e = null;
        try{
            hora = new Hora(24, 11, 12);
        }
        catch(Exception ex){
            e = ex;
        }
        assertEquals(false, hora.esHoraValida());
        //assertNotNull("El constructor de Hora debe validar y lanzar una excepcion si hay error.", e);
        e = null;
        try{
            hora = new Hora(23, 60, 12);
        }
        catch(Exception ex){
            e = ex;
        }
        //assertNotNull("El constructor de Hora debe validar y lanzar una excepcion si hay error.", e);
        assertEquals(false, hora.esHoraValida());
        e = null;
        try{
            hora = new Hora(23, 11, 60);
        }
        catch(Exception ex){
            e = ex;
        }
        //assertNotNull("El constructor de Hora debe validar y lanzar una excepcion si hay error.", e);
        assertEquals(false, hora.esHoraValida());
    }    

    @Test
    public void testHoraEsMenorMayor()
    {
        int s1 = ((int)(Math.random()*1000))%60, s2=0;
        int m1 = ((int)(Math.random()*1000))%60, m2=0;
        int h1 = ((int)(Math.random()*1000))%23, h2=0;
        
        do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
        Hora hora1 = new Hora(h1, m1, s1);
        Hora hora2 = new Hora(h1, m1, s2);
        assertEquals(s1<s2, hora1.esMenor(hora2));
        assertEquals(s1>s2, hora1.esMayor(hora2));
        assertEquals(!(s1<s2), hora2.esMenor(hora1));
        assertEquals(!(s1>s2), hora2.esMayor(hora1));
        
        
        do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
        do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);        
        hora1 = new Hora(h1, m1, s1);
        hora2 = new Hora(h1, m2, s2);
        assertEquals(m1<m2, hora1.esMenor(hora2));
        assertEquals(m1>m2, hora1.esMayor(hora2));
        assertEquals(!(m1<m2), hora2.esMenor(hora1));
        assertEquals(!(m1>m2), hora2.esMayor(hora1));
        
        do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
        do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
        do{h2 = ((int)(h1 + Math.random()*1000))%23;}while(h2==h1);
        hora1 = new Hora(h1, m1, s1);
        hora2 = new Hora(h2, m2, s2);
        assertEquals(h1<h2, hora1.esMenor(hora2));
        assertEquals(h1>h2, hora1.esMayor(hora2));
        assertEquals(!(h1<h2), hora2.esMenor(hora1));
        assertEquals(!(h1>h2), hora2.esMayor(hora1));
    }

    @Test
    public void testHoraRestarEnSegundos(){
        String [] horas = {
                "5:3:19","21:05:8","12:57:15","7:20:37","2:26:35","10:22:4","16:21:19","12:6:46",
                "9:7:35","13:38:39","12:22:15","11:30:8","10:23:33","6:44:29","7:59:16",
                "2:53:56","2:31:52","22:33:45","9:43:58"};
        long [][] restas = {
                {0,	-57709,	-28436,	-8238,	9404,	-19125,	-40680,	-25407,	-14656,	-30920,	-26336,	-23209,	-19214,	-6070,	-10557,	7763,	9087,	-63026,	-16839},
                {57709,	0,	29273,	49471,	67113,	38584,	17029,	32302,	43053,	26789,	31373,	34500,	38495,	51639,	47152,	65472,	66796,	-5317,	40870},
                {28436,	-29273,	0,	20198,	37840,	9311,	-12244,	3029,	13780,	-2484,	2100,	5227,	9222,	22366,	17879,	36199,	37523,	-34590,	11597},
                {8238,	-49471,	-20198,	0,	17642,	-10887,	-32442,	-17169,	-6418,	-22682,	-18098,	-14971,	-10976,	2168,	-2319,	16001,	17325,	-54788,	-8601},
                {-9404,	-67113,	-37840,	-17642,	0,	-28529,	-50084,	-34811,	-24060,	-40324,	-35740,	-32613,	-28618,	-15474,	-19961,	-1641,	-317,	-72430,	-26243},
                {19125,	-38584,	-9311,	10887,	28529,	0,	-21555,	-6282,	4469,	-11795,	-7211,	-4084,	-89,	13055,	8568,	26888,	28212,	-43901,	2286},
                {40680,	-17029,	12244,	32442,	50084,	21555,	0,	15273,	26024,	9760,	14344,	17471,	21466,	34610,	30123,	48443,	49767,	-22346,	23841},
                {25407,	-32302,	-3029,	17169,	34811,	6282,	-15273,	0,	10751,	-5513,	-929,	2198,	6193,	19337,	14850,	33170,	34494,	-37619,	8568},
                {14656,	-43053,	-13780,	6418,	24060,	-4469,	-26024,	-10751,	0,	-16264,	-11680,	-8553,	-4558,	8586,	4099,	22419,	23743,	-48370,	-2183},
                {30920,	-26789,	2484,	22682,	40324,	11795,	-9760,	5513,	16264,	0,	4584,	7711,	11706,	24850,	20363,	38683,	40007,	-32106,	14081},
                {26336,	-31373,	-2100,	18098,	35740,	7211,	-14344,	929,	11680,	-4584,	0,	3127,	7122,	20266,	15779,	34099,	35423,	-36690,	9497},
                {23209,	-34500,	-5227,	14971,	32613,	4084,	-17471,	-2198,	8553,	-7711,	-3127,	0,	3995,	17139,	12652,	30972,	32296,	-39817,	6370},
                {19214,	-38495,	-9222,	10976,	28618,	89,	-21466,	-6193,	4558,	-11706,	-7122,	-3995,	0,	13144,	8657,	26977,	28301,	-43812,	2375},
                {6070,	-51639,	-22366,	-2168,	15474,	-13055,	-34610,	-19337,	-8586,	-24850,	-20266,	-17139,	-13144,	0,	-4487,	13833,	15157,	-56956,	-10769},
                {10557,	-47152,	-17879,	2319,	19961,	-8568,	-30123,	-14850,	-4099,	-20363,	-15779,	-12652,	-8657,	4487,	0,	18320,	19644,	-52469,	-6282},
                {-7763,	-65472,	-36199,	-16001,	1641,	-26888,	-48443,	-33170,	-22419,	-38683,	-34099,	-30972,	-26977,	-13833,	-18320,	0,	1324,	-70789,	-24602},
                {-9087,	-66796,	-37523,	-17325,	317,	-28212,	-49767,	-34494,	-23743,	-40007,	-35423,	-32296,	-28301,	-15157,	-19644,	-1324,	0,	-72113,	-25926},
                {63026,	5317,	34590,	54788,	72430,	43901,	22346,	37619,	48370,	32106,	36690,	39817,	43812,	56956,	52469,	70789,	72113,	0,	46187},
                {16839,	-40870,	-11597,	8601,	26243,	-2286,	-23841,	-8568,	2183,	-14081,	-9497,	-6370,	-2375,	10769,	6282,	24602,	25926,	-46187,	0}
            };
        Hora [] misHoras = new Hora[horas.length];
        for(int i=0; i< horas.length;i++){
            String [] d = horas[i].split(":");
            int h = Integer.parseInt(d[0]);
            misHoras[i] = new Hora(h, Integer.parseInt(d[1]), Integer.parseInt(d[2]));
        }

        for(int i=0; i<misHoras.length;i++){
            for(int j = 0; j<misHoras.length;j++){
                long r = misHoras[i].restarEnSegundos(misHoras[j]);
                assertEquals(restas[i][j], r);
            }
        }

    }
}

