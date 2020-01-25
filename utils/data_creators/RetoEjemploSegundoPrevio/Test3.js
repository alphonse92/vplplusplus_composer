const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "Test3"

const Test = createTest(TEST_NAME, `

String [] horas = {
    "5:3:19","21:05:8","12:57:15","7:20:37","2:26:35","10:22:4","16:21:19","12:6:46",
    "9:7:35","13:38:39","12:22:15","11:30:8","10:23:33","6:44:29","7:59:16",
    "2:53:56","2:31:52","22:33:45","9:43:58",
};
double [][] restas = {
    {0, -57709, -28436, -8238,  9404,   -19125, -40680, -25407, -14656, -30920, -26336, -23209, -19214, -6070,  -10557, 7763,   9087,   -63026, -16839},
    {57709, 0,  29273,  49471,  67113,  38584,  17029,  32302,  43053,  26789,  31373,  34500,  38495,  51639,  47152,  65472,  66796,  -5317,  40870},
    {28436, -29273, 0,  20198,  37840,  9311,   -12244, 3029,   13780,  -2484,  2100,   5227,   9222,   22366,  17879,  36199,  37523,  -34590, 11597},
    {8238,  -49471, -20198, 0,  17642,  -10887, -32442, -17169, -6418,  -22682, -18098, -14971, -10976, 2168,   -2319,  16001,  17325,  -54788, -8601},
    {-9404, -67113, -37840, -17642, 0,  -28529, -50084, -34811, -24060, -40324, -35740, -32613, -28618, -15474, -19961, -1641,  -317,   -72430, -26243},
    {19125, -38584, -9311,  10887,  28529,  0,  -21555, -6282,  4469,   -11795, -7211,  -4084,  -89,    13055,  8568,   26888,  28212,  -43901, 2286},
    {40680, -17029, 12244,  32442,  50084,  21555,  0,  15273,  26024,  9760,   14344,  17471,  21466,  34610,  30123,  48443,  49767,  -22346, 23841},
    {25407, -32302, -3029,  17169,  34811,  6282,   -15273, 0,  10751,  -5513,  -929,   2198,   6193,   19337,  14850,  33170,  34494,  -37619, 8568},
    {14656, -43053, -13780, 6418,   24060,  -4469,  -26024, -10751, 0,  -16264, -11680, -8553,  -4558,  8586,   4099,   22419,  23743,  -48370, -2183},
    {30920, -26789, 2484,   22682,  40324,  11795,  -9760,  5513,   16264,  0,  4584,   7711,   11706,  24850,  20363,  38683,  40007,  -32106, 14081},
    {26336, -31373, -2100,  18098,  35740,  7211,   -14344, 929,    11680,  -4584,  0,  3127,   7122,   20266,  15779,  34099,  35423,  -36690, 9497},
    {23209, -34500, -5227,  14971,  32613,  4084,   -17471, -2198,  8553,   -7711,  -3127,  0,  3995,   17139,  12652,  30972,  32296,  -39817, 6370},
    {19214, -38495, -9222,  10976,  28618,  89, -21466, -6193,  4558,   -11706, -7122,  -3995,  0,  13144,  8657,   26977,  28301,  -43812, 2375},
    {6070,  -51639, -22366, -2168,  15474,  -13055, -34610, -19337, -8586,  -24850, -20266, -17139, -13144, 0,  -4487,  13833,  15157,  -56956, -10769},
    {10557, -47152, -17879, 2319,   19961,  -8568,  -30123, -14850, -4099,  -20363, -15779, -12652, -8657,  4487,   0,  18320,  19644,  -52469, -6282},
    {-7763, -65472, -36199, -16001, 1641,   -26888, -48443, -33170, -22419, -38683, -34099, -30972, -26977, -13833, -18320, 0,  1324,   -70789, -24602},
    {-9087, -66796, -37523, -17325, 317,    -28212, -49767, -34494, -23743, -40007, -35423, -32296, -28301, -15157, -19644, -1324,  0,  -72113, -25926},
    {63026, 5317,   34590,  54788,  72430,  43901,  22346,  37619,  48370,  32106,  36690,  39817,  43812,  56956,  52469,  70789,  72113,  0,  46187},
    {16839, -40870, -11597, 8601,   26243,  -2286,  -23841, -8568,  2183,   -14081, -9497,  -6370,  -2375,  10769,  6282,   24602,  25926,  -46187, 0}
};
Vehiculo [][] v = new Vehiculo[horas.length][4];

Vehiculo [ ] v1 = {new CarroGrande("URC789", "60458723", 8, 15, 20),
    new CarroPequeno("URC789", "60458723", 8, 15, 20),
    new Moto("URC789", "60458723", 8, 15, 20),
    new Bicicleta("URC789", "60458723", 8, 15, 20)};

/**
* Default constructor for test class ParqueaderoTest
*/
public ${TEST_NAME}(){
{
    for(int i=0; i< horas.length;i++){
        String [] d = horas[i].split(":");
        v[i][0] = new CarroGrande("URC781"+i, "60458723", Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]));
        v[i][1] = new CarroPequeno("URC782"+i, "60458723", Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]));
        v[i][2] = new Moto("URC783"+i, "60458723", Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]));
        v[i][3] = new Bicicleta("URC784"+i, "60458723", Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]));
    }
}

`)



    
const testConstructor1 = () => `
Parqueadero p = new Parqueadero();
        assertNotNull(p.getVehiculos());
        assertEquals(30, p.getVehiculos().length);
        assertNotNull(p.getHistorialVehiculos());
        assertEquals(0, p.getHistorialVehiculos().size());
    `

    
const testConstructor2 = () => `
int n = (int)(Math.random()*80 + 20);
        Parqueadero p = new Parqueadero(n);
        assertNotNull(p.getVehiculos());
        assertEquals(n, p.getVehiculos().length);
        assertNotNull(p.getHistorialVehiculos());
        assertEquals(0, p.getHistorialVehiculos().size());
    `

    
const testTegistrarIngreso1 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        Vehiculo[] ap = p.getVehiculos();

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);

            for(int j=0; j<(i+1)*4; j++){
                assertNotNull(ap[j]);
            }

            for(int j=(i+1)*4; j<ap.length; j++)
                assertNull(ap[j]);
        }

        for(int i=0; i<v.length;i++){
            for(int k =0; k<4; k++){
                assertEquals(v[i][k], ap[4*i+k]);
            }
        }

        ArrayList<Vehiculo> ah = p.getHistorialVehiculos();
        assertNotNull(ah);
        assertEquals(0, ah.size());
    `

    
const testTegistrarIngreso2 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        Vehiculo[] ap = p.getVehiculos();
        Vehiculo[] ap2 = new Vehiculo[v.length*2]; 

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        int m = 0;
        for(int i=0; i<v.length;i++){
            for(int k =0; k<4; k++){
                if((4*i+k + 1)%2==0){
                    ap2[m++] =ap[4*i+k];
                    ap[4*i+k]=null;
                }
            }
        }

        Exception e = null;
        boolean rta = false;
        m = 0;
        for(int i=0; i< v.length; i++){
            for(int k =0; k<4; k++){
                e = null;
                rta = false;
                try{
                    rta = p.ingresarVehiculo(v[i][k]);
                }
                catch(Exception ex){
                    e = ex;
                }
                if((4*i+k + 1)%2!=0){
                    //assertNotNull(e);
                    assertEquals(false, rta);
                }
                else{
                    //assertNull(e);
                    assertEquals(true, rta);
                }
            }
        }

    `

    
const testTegistrarIngreso3 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        Vehiculo[] ap = p.getVehiculos();
        Vehiculo[] ap2 = new Vehiculo[v.length*2]; 

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        int m = 0;
        for(int i=0; i<v.length;i++){
            for(int k =0; k<4; k++){
                if((4*i+k + 1)%2==0){
                    ap2[m++] =ap[4*i+k];
                    ap[4*i+k]=null;
                }
            }
        }

        m = 0;
        for(int i=0; i< v.length; i++){
            for(int k =0; k<4; k++){
                if((4*i+k + 1)%2==0){
                    p.ingresarVehiculo(v[i][k]);
                    assertEquals(ap2[m++], ap[4*i+k]);
                }
            }
        }

    `

    
const testRegistrarIngreso4 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        Vehiculo[] ap = p.getVehiculos();

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        Exception e = null;
        boolean rta = false;
        try{
            rta = p.ingresarVehiculo(v1[0]);
        }
        catch(Exception ex){
            e = ex;
        }
        //assertNotNull(e);
        assertEquals(false,  rta);

    `   

    
const testBuscar = () => `
Parqueadero p = new Parqueadero(v.length*4);
        int posicion = 0;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        for(int i=0; i< v.length; i++){
            for(int k =0; k<4; k++){
                posicion = p.buscarVehiculo(v[i][k].getPlaca());
                assertEquals(4*i+k, posicion);
            }
        }

        posicion = p.buscarVehiculo(v1[0].getPlaca());
        assertEquals(-1, posicion);
    `

    
const testRegistrarSalida1 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        ArrayList<Vehiculo> ah = p.getHistorialVehiculos();
        Exception e = null;

        Vehiculo vehiculo = null;
        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        int m = 1;
        for(int i=0; i<v.length;i++){
            for(int k=0;k<4;k++){
                e = null;
                try{
                    vehiculo = p.retirarVehiculo(v[i][k].getPlaca(), 23,0,0);
                }
                catch(Exception ex){
                    e = ex;
                }
                //assertNull(e);
                assertNotNull(vehiculo);
                assertEquals(m++, ah.size());
            }
        }
    `

    
const testRegistrarSalida2 = () => `
Parqueadero p = new Parqueadero(v.length);
        Exception e = null;
        ArrayList<Vehiculo> ah = p.getHistorialVehiculos();
        Vehiculo vehiculo = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][1]);
        }

        int n = 0;
        for(int i=0; i<v.length;i++){
            for(int k=0;k<4;k++){
                e = null;
                vehiculo = null;
                try{
                    vehiculo = p.retirarVehiculo(v[i][k].getPlaca(), 0,35,45);
                }
                catch(Exception ex){
                    e = ex;
                }
                //assertNotNull(e);
                if(k==1){
                 assertNotNull(vehiculo);
                 n++;
                 assertEquals(n, ah.size());
                }
                else
                 assertNull(vehiculo);
                
            }
        }
    `

    
const testRegistrarSalida3 = () => `
Parqueadero p = new Parqueadero(v.length*4);
        ArrayList<Vehiculo> ah = p.getHistorialVehiculos();
        Exception e = null;
        Vehiculo vehiculo = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
            p.ingresarVehiculo(v[i][1]);
            p.ingresarVehiculo(v[i][2]);
            p.ingresarVehiculo(v[i][3]);
        }

        try{
            vehiculo = p.retirarVehiculo(v1[0].getPlaca(), 23,0,0);
        }
        catch(Exception ex){
            e = ex;
        }
        //assertNotNull(e);
        assertNull(vehiculo);
        assertEquals(0, ah.size());
    `  

    
const testResumen1 = () => `
Parqueadero p = new Parqueadero(v.length);
        Exception e = null;
        Vehiculo vehiculo = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][0]);
        }

        for(int i=0; i<v.length;i++){
            e = null;
            try{
                vehiculo = p.retirarVehiculo(v[i][0].getPlaca(), 23,0,0);
            }
            catch(Exception ex){
                e = ex;
            }
        }
        assertEquals(2397919.44, p.getValorBrutoServicio(1), 0.01);
    ` 
    
    
const testResumen2 = () => `
Parqueadero p = new Parqueadero(v.length);
        Exception e = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][1]);
        }

        for(int i=0; i<v.length;i++){
            e = null;
            try{
                p.retirarVehiculo(v[i][1].getPlaca(), 23,0,0);
            }
            catch(Exception ex){
                e = ex;
            }
        }
        assertEquals(1198959.72, p.getValorBrutoServicio(2), 0.01);
    `

    
const testResumen3 = () => `
Parqueadero p = new Parqueadero(v.length);
        Exception e = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][2]);
        }

        for(int i=0; i<v.length;i++){
            e = null;
            try{
                p.retirarVehiculo(v[i][2].getPlaca(), 23,0,0);
            }
            catch(Exception ex){
                e = ex;
            }
        }
        assertEquals(479583.89, p.getValorBrutoServicio(3), 0.01);
    `    

    
const testResumen4 = () => `
Parqueadero p = new Parqueadero(v.length);
        Exception e = null;

        for(int i=0; i< v.length; i++){
            p.ingresarVehiculo(v[i][3]);
        }

        for(int i=0; i<v.length;i++){
            e = null;
            try{
                p.retirarVehiculo(v[i][3].getPlaca(), 23,0,0);
            }
            catch(Exception ex){
                e = ex;
            }
        }
        assertEquals(239791.94, p.getValorBrutoServicio(4), 0.01);
    `  






Test.test_cases = [

  getDataFromFunction(testConstructor1, 3),
  getDataFromFunction(testConstructor2, 3),
  
  getDataFromFunction(testTegistrarIngreso1, 3),
  getDataFromFunction(testTegistrarIngreso2, 3),
  getDataFromFunction(testTegistrarIngreso3, 3),
  getDataFromFunction(testRegistrarIngreso4, 3),
  
  getDataFromFunction(testBuscar, 3),
  
  getDataFromFunction(testRegistrarSalida1, 3),
  getDataFromFunction(testRegistrarSalida2, 3),
  getDataFromFunction(testRegistrarSalida3, 3),
  
  getDataFromFunction(testResumen1, 4),
  getDataFromFunction(testResumen2, 4),
  getDataFromFunction(testResumen3, 4),
  getDataFromFunction(testResumen4, 4),

]

module.exports = Test
