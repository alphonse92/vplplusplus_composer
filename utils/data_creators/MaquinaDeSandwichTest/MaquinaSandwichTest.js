const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "MaquinaSandwichTest"

const Test = createTest(TEST_NAME, `

/**
 * Pruebas de costos asumiendo new MaquinaSandwich(40, 25, 35, 150, 250);
 */
public static final int [][] testPrecios1 ={
        {1,1,1000,1350},
        {2,1,1100,1485},
        {3,1,2000,2700},
        {4,1,2200,2970},
        {5,1,3000,4050},
        {6,1,3300,4455},
        {1,2,1100,1485},
        {2,2,1200,1620},
        {3,2,2200,2970},
        {4,2,2400,3240},
        {5,2,3300,4455},
        {6,2,3600,4860}
    };

/**
 * Pruebas de costos asumiendo new MaquinaSandwich(17, 19, 21, 103, 203);
 */
public static final int [][] testPrecios2 ={
        {1,1,548,739},
        {2,1,568,766},
        {3,1,1096,1479},
        {4,1,1136,1533},
        {5,1,1644,2219},
        {6,1,1704,2300},
        {1,2,648,874},
        {2,2,668,901},
        {3,2,1296,1749},
        {4,2,1336,1803},
        {5,2,1944,2624},
        {6,2,2004,2705}
    };

/**
 * Pruebas de la cantidad que se reduce cada ingrediente
 */
public static final int [][] testCantidades = {
        {1,1,15,10,0,1,0},
        {2,1,15,0,10,1,0},
        {3,1,30,20,0,2,0},
        {4,1,30,0,20,2,0},
        {5,1,45,30,0,3,0},
        {6,1,45,0,30,3,0},
        {1,2,15,10,0,0,1},
        {2,2,15,0,10,0,1},
        {3,2,30,20,0,0,2},
        {4,2,30,0,20,0,2},
        {5,2,45,30,0,0,3},
        {6,2,45,0,30,0,3}
    };


public ${TEST_NAME}(){}

@Before
public void setUp(){}

@After
public void tearDown(){}

`)



const testStaticFinal = () => `  
assertEquals(15, MaquinaSandwich.CANTIDAD_BASE_QUESO);
assertEquals(10, MaquinaSandwich.CANTIDAD_BASE_MORTADELA_JAMON);
assertEquals(1, MaquinaSandwich.CANTIDAD_BASE_PAN);
`


const testConstructor1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich();

assertEquals(3000, maquina1.getCantidadQueso());
assertEquals(1000, maquina1.getCantidadMortadela());
assertEquals(1000, maquina1.getCantidadJamon());
assertEquals(100, maquina1.getCantidadPanBlanco());
assertEquals(100, maquina1.getCantidadPanIntegral());

assertEquals(0, maquina1.getPrecioCompraQueso());
assertEquals(0, maquina1.getPrecioCompraMortadela());
assertEquals(0, maquina1.getPrecioCompraJamon());
assertEquals(0, maquina1.getPrecioCompraPanBlanco());
assertEquals(0, maquina1.getPrecioCompraPanIntegral());

assertEquals(0, maquina1.getIngresosPorVentas());
`


const testConstructor2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);

assertEquals(40, maquina1.getPrecioCompraQueso());
assertEquals(25, maquina1.getPrecioCompraMortadela());
assertEquals(35, maquina1.getPrecioCompraJamon());
assertEquals(150, maquina1.getPrecioCompraPanBlanco());
assertEquals(250, maquina1.getPrecioCompraPanIntegral());

assertEquals(0, maquina1.getIngresosPorVentas());
`


const testConstructor3 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);

assertEquals(40, maquina1.getPrecioCompraQueso());
assertEquals(25, maquina1.getPrecioCompraMortadela());
assertEquals(35, maquina1.getPrecioCompraJamon());
assertEquals(150, maquina1.getPrecioCompraPanBlanco());
assertEquals(250, maquina1.getPrecioCompraPanIntegral());

assertEquals(3000, maquina1.getCantidadQueso());
assertEquals(1000, maquina1.getCantidadMortadela());
assertEquals(1000, maquina1.getCantidadJamon());
assertEquals(100, maquina1.getCantidadPanBlanco());
assertEquals(100, maquina1.getCantidadPanIntegral());

assertEquals(0, maquina1.getIngresosPorVentas());
`


const testCalcularPrecioFabricacion1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int costoFabricacion = 0;

for(int i=0; i<testPrecios1.length;i++){
    costoFabricacion = maquina1.calcularCostoFabricacion(testPrecios1[i][0], testPrecios1[i][1]);
    assertEquals(testPrecios1[i][2],costoFabricacion);
}
`


const testCalcularPrecioFabricacion2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(17, 19, 21, 103, 203);
int costoFabricacion = 0;

for(int i=0; i<testPrecios2.length;i++){
    costoFabricacion = maquina1.calcularCostoFabricacion(testPrecios2[i][0], testPrecios2[i][1]);
    assertEquals(testPrecios2[i][2],costoFabricacion);
}
`


const testCalcularPrecioVenta1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int precioVenta = 0;

for(int i=0; i<testPrecios1.length;i++){
    precioVenta = maquina1.calcularPrecioVenta(testPrecios1[i][0], testPrecios1[i][1]);
    assertEquals(testPrecios1[i][3],precioVenta);
}
`


const testCalcularPrecioVenta2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(17, 19, 21, 103, 203);
int precioVenta = 0;

for(int i=0; i<testPrecios2.length;i++){
    precioVenta = maquina1.calcularPrecioVenta(testPrecios2[i][0], testPrecios2[i][1]);
    assertEquals(testPrecios2[i][3],precioVenta);
}
`


const testRegistrarVentaFull = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosAnterior;

int anteriorQueso = 0;
int anteriorMortadela = 0;
int anteriorJamon = 0;
int anteriorPanBlanco = 0;
int anteriorPanIntegral = 0;

for(int i=0; i<testCantidades.length;i++){
    ingresosAnterior = maquina1.getIngresosPorVentas();

    anteriorQueso = maquina1.getCantidadQueso();
    anteriorMortadela = maquina1.getCantidadMortadela();
    anteriorJamon = maquina1.getCantidadJamon();
    anteriorPanBlanco = maquina1.getCantidadPanBlanco();
    anteriorPanIntegral = maquina1.getCantidadPanIntegral();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorQueso-testCantidades[i][2], maquina1.getCantidadQueso());
    assertEquals(anteriorMortadela-testCantidades[i][3], maquina1.getCantidadMortadela());
    assertEquals(anteriorJamon-testCantidades[i][4], maquina1.getCantidadJamon());
    assertEquals(anteriorPanBlanco-testCantidades[i][5], maquina1.getCantidadPanBlanco());
    assertEquals(anteriorPanIntegral-testCantidades[i][6], maquina1.getCantidadPanIntegral());

    assertEquals(ingresosAnterior+testPrecios1[i][3], maquina1.getIngresosPorVentas());
}
`


const testRegistrarVentaQueso = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int precioVenta = 0;
int anteriorQueso = 0;

for(int i=0; i<testCantidades.length;i++){
    anteriorQueso = maquina1.getCantidadQueso();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorQueso-testCantidades[i][2], maquina1.getCantidadQueso());
}
`


const testRegistrarVentaMortadela = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int anteriorMortadela = 0;

for(int i=0; i<testCantidades.length;i++){
    anteriorMortadela = maquina1.getCantidadMortadela();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorMortadela-testCantidades[i][3], maquina1.getCantidadMortadela());
}
`


const testRegistrarVentaJamon = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int anteriorJamon = 0;

for(int i=0; i<testCantidades.length;i++){
    anteriorJamon = maquina1.getCantidadJamon();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorJamon-testCantidades[i][4], maquina1.getCantidadJamon());
}
`


const testRegistrarVentaPanBlanco = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int anteriorPanBlanco = 0;

for(int i=0; i<testCantidades.length;i++){
    anteriorPanBlanco = maquina1.getCantidadPanBlanco();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorPanBlanco-testCantidades[i][5], maquina1.getCantidadPanBlanco());
}
`


const testRegistrarVentaPanIntegral = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int anteriorPanIntegral = 0;

for(int i=0; i<testCantidades.length;i++){
    anteriorPanIntegral = maquina1.getCantidadPanIntegral();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(anteriorPanIntegral-testCantidades[i][6], maquina1.getCantidadPanIntegral());
}
`


const testRegistrarVentaIngresos1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosAnterior = 0;

for(int i=0; i<testCantidades.length;i++){
    ingresosAnterior = maquina1.getIngresosPorVentas();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(ingresosAnterior+testPrecios1[i][3], maquina1.getIngresosPorVentas());
}
`


const testRegistrarVentaIngresos2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(17, 19, 21, 103, 203);
int ingresosAnterior = 0;

for(int i=0; i<testCantidades.length;i++){
    ingresosAnterior = maquina1.getIngresosPorVentas();

    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);

    assertEquals(ingresosAnterior+testPrecios2[i][3], maquina1.getIngresosPorVentas());
}
`


const testPorcentajes1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosPorVentas = 0;

for(int i=0; i<testCantidades.length;i++){
    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);
    ingresosPorVentas = maquina1.getIngresosPorVentas();
    assertEquals(ingresosPorVentas*19/100, maquina1.getIVA());
    assertEquals(ingresosPorVentas*5/100, maquina1.getCostosFijos());
    assertEquals(ingresosPorVentas*1/100, maquina1.getRiesgos());
    assertEquals(ingresosPorVentas*10/100, maquina1.getGananciaNeta());
}
`


const testPorcentajes2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(17, 19, 21, 103, 203);
int ingresosPorVentas = 0;

for(int i=0; i<testCantidades.length;i++){
    maquina1.registrarVenta(testCantidades[i][0], testCantidades[i][1]);
    ingresosPorVentas = maquina1.getIngresosPorVentas();
    assertEquals(ingresosPorVentas*19/100, maquina1.getIVA());
    assertEquals(ingresosPorVentas*5/100, maquina1.getCostosFijos());
    assertEquals(ingresosPorVentas*1/100, maquina1.getRiesgos());
    assertEquals(ingresosPorVentas*10/100, maquina1.getGananciaNeta());
}
`


const testIngredientesSuficientesSimpleBlanco = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosPorVentas = 0;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(3, 1);
}

assertEquals(50*2*15, maquina1.getCantidadQueso());
assertEquals(0, maquina1.getCantidadMortadela());
assertEquals(50*2*10, maquina1.getCantidadJamon());
assertEquals(0, maquina1.getCantidadPanBlanco());
assertEquals(50*2, maquina1.getCantidadPanIntegral());
`


const testIngredientesSuficientesSimpleIntegral = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosPorVentas = 0;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(3, 2);
}

assertEquals(50*2*15, maquina1.getCantidadQueso());
assertEquals(0, maquina1.getCantidadMortadela());
assertEquals(50*2*10, maquina1.getCantidadJamon());
assertEquals(50*2, maquina1.getCantidadPanBlanco());
assertEquals(0, maquina1.getCantidadPanIntegral());
`


const testIngredientesSuficientesExquisitoBlanco = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosPorVentas = 0;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(4, 1);
}

assertEquals(50*2*15, maquina1.getCantidadQueso());
assertEquals(50*2*10, maquina1.getCantidadMortadela());
assertEquals(0, maquina1.getCantidadJamon());
assertEquals(0, maquina1.getCantidadPanBlanco());
assertEquals(50*2, maquina1.getCantidadPanIntegral());
`


const testIngredientesSuficientesExquisitoIntegral = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ingresosPorVentas = 0;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(4, 2);
}

assertEquals(50*2*15, maquina1.getCantidadQueso());
assertEquals(50*2*10, maquina1.getCantidadMortadela());
assertEquals(0, maquina1.getCantidadJamon());
assertEquals(50*2, maquina1.getCantidadPanBlanco());
assertEquals(0, maquina1.getCantidadPanIntegral());
`


const testIngredientesInsuficientesSimpleBlanco = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
Exception ex = null;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(3, 1);
}

try{
    maquina1.registrarVenta(3, 1);
}
catch(Exception e){ex = e;}

assertNotNull(ex);
`


const testIngredientesInsuficientesSimpleIntegral = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
Exception ex = null;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(3, 2);
}

try{
    maquina1.registrarVenta(3, 2);
}
catch(Exception e){ex = e;}

assertNotNull(ex);
`


const testIngredientesInsuficientesExquisitoBlanco = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
Exception ex = null;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(4, 1);
}

try{
    maquina1.registrarVenta(4, 1);
}
catch(Exception e){ex = e;}

assertNotNull(ex);
`


const testIngredientesInsuficientesExquisitoIntegral = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
Exception ex = null;

for(int i=1; i<=50;i++){
    maquina1.registrarVenta(4, 2);
}

try{
    maquina1.registrarVenta(4, 2);
}
catch(Exception e){ex = e;}

assertNotNull(ex);
`


const testEspecial1 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);

for(int j=1; j<=8; j++){
    for(int i=0; i<testPrecios1.length;i++){
        maquina1.registrarVenta(testPrecios1[i][0], testPrecios1[i][1]);
    }
}
assertEquals(120, maquina1.getCantidadQueso());
assertEquals(40, maquina1.getCantidadMortadela());
assertEquals(40, maquina1.getCantidadJamon());
assertEquals(4, maquina1.getCantidadPanBlanco());
assertEquals(4, maquina1.getCantidadPanIntegral());
`


const testEspecial2 = () => `
MaquinaSandwich maquina1 = new MaquinaSandwich(40, 25, 35, 150, 250);
int ventas = 0;

for(int j=1; j<=8; j++){
    for(int i=0; i<testPrecios1.length;i++){
        ventas += maquina1.calcularPrecioVenta(testPrecios1[i][0], testPrecios1[i][1]);
        maquina1.registrarVenta(testPrecios1[i][0], testPrecios1[i][1]);
    }
}

assertEquals(285120, ventas);
assertEquals(285120, maquina1.getIngresosPorVentas());
`

Test.test_cases = [
    getDataFromFunction(testStaticFinal, 1),
    getDataFromFunction(testConstructor1, 3),
    getDataFromFunction(testConstructor2, 3),
    getDataFromFunction(testConstructor3, 3),
    getDataFromFunction(testCalcularPrecioFabricacion1, 3),
    getDataFromFunction(testCalcularPrecioFabricacion2, 3),
    getDataFromFunction(testCalcularPrecioVenta1, 3),
    getDataFromFunction(testCalcularPrecioVenta2, 3),
    getDataFromFunction(testRegistrarVentaFull, 10),
    getDataFromFunction(testRegistrarVentaQueso, 3),
    getDataFromFunction(testRegistrarVentaMortadela, 3),
    getDataFromFunction(testRegistrarVentaJamon, 3),
    getDataFromFunction(testRegistrarVentaPanBlanco, 3),
    getDataFromFunction(testRegistrarVentaPanIntegral, 3),
    getDataFromFunction(testRegistrarVentaIngresos1, 3),
    getDataFromFunction(testRegistrarVentaIngresos2, 3),
    getDataFromFunction(testPorcentajes1, 3),
    getDataFromFunction(testPorcentajes2, 3),
    getDataFromFunction(testIngredientesSuficientesSimpleBlanco, 3),
    getDataFromFunction(testIngredientesSuficientesSimpleIntegral, 3),
    getDataFromFunction(testIngredientesSuficientesExquisitoBlanco, 3),
    getDataFromFunction(testIngredientesSuficientesExquisitoIntegral, 3),
    getDataFromFunction(testIngredientesInsuficientesSimpleBlanco, 3),
    getDataFromFunction(testIngredientesInsuficientesSimpleIntegral, 3),
    getDataFromFunction(testIngredientesInsuficientesExquisitoBlanco, 3),
    getDataFromFunction(testIngredientesInsuficientesExquisitoIntegral, 3),
    getDataFromFunction(testEspecial1, 10),
    getDataFromFunction(testEspecial2, 10),
]

module.exports = Test











