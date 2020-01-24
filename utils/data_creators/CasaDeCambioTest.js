
const createProject = require('../common/create-project-schema')
const createTest = require('../common/create-test-schema')
const createTestCase = require('../common/create-test-case-schema')
const exportJson = require('../common/create-schema')

const testGetGananciaEnUnBolivar = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1.0f, 2.0f);
        float result = instance.getGananciaEnUnBolivar();
        assertEquals(1.0, result, 0.01);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar1 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(0, 1);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar2 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-1, 1);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar3 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-1, 0);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar4 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(-2, -1);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar5 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(1, 1);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar6 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(2, 1);
        assertEquals(false, result);
`

/**
 * Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
 */

const testCambiarPrecioDelBolivar7 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        boolean result = instance.cambiarPrecioDelBolivar(1, 2);
        assertEquals(true, result);
`

/**
* Test of cambiarPrecioDelBolivar method, of class CasaDeCambio.
*/

const testCambiarPrecioDelBolivar8 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        assertEquals(1.0, instance.getPrecioDeCompra(), 0.01);
        assertEquals(2.0, instance.getPrecioDeVenta(), 0.01);
`

/**
 * Test of comprarBolivares method, of class CasaDeCambio.
 */

const testComprarBolivares1 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        boolean result = instance.comprarBolivares(1);
        assertEquals(true, result);
`

/**
 * Test of comprarBolivares method, of class CasaDeCambio.
 */

const testComprarBolivares2 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        instance.comprarBolivares(1);
        assertEquals(1.0, instance.getPesosEnCaja(), 0.01);
`

/*
 * Test of comprarBolivares method, of class CasaDeCambio.
 */

const testComprarBolivares3 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(2);
        instance.inyectarBolivares(1);
        instance.comprarBolivares(1);
        assertEquals(2.0, instance.getBolivaresEnCaja(), 0.01);
`

/*
 * Test of comprarBolivares method, of class CasaDeCambio.
 */

const testComprarBolivares4 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(3);
        instance.comprarBolivares(1);
        instance.comprarBolivares(1);
        assertEquals(2, instance.getBolivaresComprados());
`

/**
 * Test of comprarBolivares method, of class CasaDeCambio.
 */

const testComprarBolivares5 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(5);
        boolean result = instance.comprarBolivares(6);
        assertEquals(false, result);
`

/**
 * Test of venderBolivares method, of class CasaDeCambio.
 */

const testVenderBolivares1 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(2);
        boolean result = instance.venderBolivares(1);
        assertEquals(true, result);
`

/**
 * Test of venderBolivares method, of class CasaDeCambio.
 */

const testVenderBolivares2 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarPesos(1);
        instance.inyectarBolivares(2);
        instance.venderBolivares(1);
        assertEquals(3.0, instance.getPesosEnCaja(), 0.01);
`

/*
 * Test of venderBolivares method, of class CasaDeCambio.
 */

const testVenderBolivares3 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(2);
        instance.venderBolivares(1);
        assertEquals(1.0, instance.getBolivaresEnCaja(), 0.01);
`

/*
  * Test of venderBolivares method, of class CasaDeCambio.
 */

const testVenderBolivares4 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(3);
        instance.venderBolivares(1);
        instance.venderBolivares(1);
        assertEquals(2, instance.getBolivaresVendidos());
`

/**
 * Test of venderBolivares method, of class CasaDeCambio.
 */

const testVenderBolivares5 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(5);
        boolean result = instance.venderBolivares(6);
        assertEquals(false, result);
`

/**
 * Test of getImpuestos method, of class CasaDeCambio.
 */

const testGetImpuestos = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(50);
        instance.venderBolivares(10);
        assertEquals(3.2, instance.getImpuestos(), 0.01);
`

/**
 * Test of getGanancias method, of class CasaDeCambio.
 */

const testGetGanancias = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.cambiarPrecioDelBolivar(1, 2);
        instance.inyectarBolivares(50);
        instance.venderBolivares(10);
        assertEquals(16.8, instance.getGanancias(), 0.01);
`

/**
 * Test of inyectarPesos method, of class CasaDeCambio.
 */

const testInyectarPesos1 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarPesos(1);
        instance.inyectarPesos(1);
        assertEquals(2.0, instance.getPesosEnCaja(),0.01);
`

/**
 * Test of inyectarPesos method, of class CasaDeCambio.
 */

const testInyectarPesos2 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarPesos(1);
        instance.inyectarPesos(-1);
        assertEquals(1.0, instance.getPesosEnCaja(),0.01);
`


const testInyectarBolivares1 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarBolivares(1);
        instance.inyectarBolivares(1);
        assertEquals(2.0, instance.getBolivaresEnCaja(),0.01);
`


const testInyectarBolivares2 = () => `
        CasaDeCambio instance = new CasaDeCambio();
        instance.inyectarBolivares(1);
        instance.inyectarBolivares(-1);
        assertEquals(1.0, instance.getBolivaresEnCaja(), 0.01);
`


const getDataFromFunction = (fn, grade) => {
  const name = fn.name;
  const code = fn();
  return createTestCase(name, code, grade)
}

const project = createProject('CasaDeCambioTest')
const CasaDeCambioTest = createTest('CasaDeCambioTest', `
/**
 * Default constructor for test class CasaDeCambioTest
 */
public CasaDeCambioTest()
{
}

/**
 * Sets up the test fixture.
 *
 * Called before every test case method.
 */
@Before
const setUp()
{
}

/**
 * Tears down the test fixture.
 *
 * Called after every test case method.
 */
@After
const tearDown()
{
`)



CasaDeCambioTest.test_cases = [
  getDataFromFunction(testGetGananciaEnUnBolivar, 4),

  getDataFromFunction(testCambiarPrecioDelBolivar1, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar2, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar3, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar4, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar5, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar6, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar7, 4),
  getDataFromFunction(testCambiarPrecioDelBolivar8, 4),

  getDataFromFunction(testComprarBolivares1, 4),
  getDataFromFunction(testComprarBolivares2, 4),
  getDataFromFunction(testComprarBolivares3, 4),
  getDataFromFunction(testComprarBolivares4, 4),
  getDataFromFunction(testComprarBolivares5, 4),

  getDataFromFunction(testVenderBolivares1, 4),
  getDataFromFunction(testVenderBolivares2, 4),
  getDataFromFunction(testVenderBolivares3, 4),
  getDataFromFunction(testVenderBolivares4, 4),
  getDataFromFunction(testVenderBolivares5, 4),

  getDataFromFunction(testGetImpuestos, 4),
  getDataFromFunction(testGetGanancias, 4),
  getDataFromFunction(testInyectarPesos1, 4),
  getDataFromFunction(testInyectarPesos2, 4),

  getDataFromFunction(testInyectarBolivares1, 4),
  getDataFromFunction(testInyectarBolivares2, 4),
]


project.tests.push(CasaDeCambioTest)

console.log("done, wrote at: ", exportJson(__dirname, project))

