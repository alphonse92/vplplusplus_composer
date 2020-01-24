
const createProject = require('../../common/create-project-schema')
const createTest = require('../../common/create-test-schema')
const createTestCase = require('../../common/create-test-case-schema')
const exportJson = require('../../common/create-schema')

const TEST_NAME = 'MaquinaCafeteraTest'

const getDataFromFunction = (fn, grade) => {
  const name = fn.name;
  const code = fn();
  return createTestCase(name, code, grade)
}

const project = createProject(TEST_NAME)
const MaquinaCafeteraTest = createTest(TEST_NAME, `
@Before
public void setUp() {}
@After
public void tearDown() {}
`)



const testCalcularPrecio0 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
maquina.calcularPrecio(1, 1);
Assert.assertEquals(0, maquina.getIngresos());
Assert.assertEquals(0, maquina.getImpuestos());
Assert.assertEquals(0, maquina.getEgresos());
Assert.assertEquals(0, maquina.getGananciasBrutas());
Assert.assertEquals(0, maquina.getGananciasNetas());
`


const testCalcularPrecio11 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(442, maquina.calcularPrecio(1, 1));
`


const testCalcularPrecio12 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(464, maquina.calcularPrecio(1, 2));
`


const testCalcularPrecio13 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(486, maquina.calcularPrecio(1, 3));
`


const testCalcularPrecio21 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(885, maquina.calcularPrecio(2, 1));
`


const testCalcularPrecio22 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(929, maquina.calcularPrecio(2, 2));
`


const testCalcularPrecio23 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(974, maquina.calcularPrecio(2, 3));
`


const testCalcularPrecio31 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(1328, maquina.calcularPrecio(3, 1));
`


const testCalcularPrecio32 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(1393, maquina.calcularPrecio(3, 2));
`


const testCalcularPrecio33 = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.setPrecioBaseCafe(7000);
Assert.assertEquals(1460, maquina.calcularPrecio(3, 3));
`


const testPrepararCafe0 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
Assert.assertEquals(true, maquina.prepararCafe(1, 1));
Assert.assertEquals(0, maquina.getIngresos());
Assert.assertEquals(0, maquina.getImpuestos());
Assert.assertEquals(0, maquina.getEgresos());
Assert.assertEquals(0, maquina.getGananciasBrutas());
Assert.assertEquals(0, maquina.getGananciasNetas());
Assert.assertEquals(0, maquina.getPrecioBaseCafe());
`


const testPrepararCafe01 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(56, 6, 1);
Assert.assertEquals(true, maquina.prepararCafe(1, 2));
Assert.assertEquals(false, maquina.prepararCafe(1, 2));
`


const testPrepararCafe11 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
Assert.assertEquals(true, maquina.prepararCafe(1, 1));
Assert.assertEquals(945, maquina.getCafe());
Assert.assertEquals(1000, maquina.getAzucar());
Assert.assertEquals(99, maquina.getVasos());
`


const testPrepararCafe22 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
Assert.assertEquals(true, maquina.prepararCafe(2, 2));
Assert.assertEquals(890, maquina.getCafe());
Assert.assertEquals(995, maquina.getAzucar());
Assert.assertEquals(99, maquina.getVasos());
`


const testPrepararCafe33 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(1000, 1000, 100);
Assert.assertEquals(true, maquina.prepararCafe(3, 3));
Assert.assertEquals(835, maquina.getCafe());
Assert.assertEquals(990, maquina.getAzucar());
Assert.assertEquals(99, maquina.getVasos());
`


const testRecargarCafe1 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
maquina.setGananciasNetas(1000);
Assert.assertEquals(true, maquina.recargarCafe(10, 100));
Assert.assertEquals(10, maquina.getCafe());
`


const testRecargarCafe2 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
Assert.assertEquals(false, maquina.recargarCafe(10, 100));
Assert.assertEquals(0, maquina.getCafe());
`


const testRecargarCafe3 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
maquina.setIngresos(1000);
maquina.setGananciasNetas(1000);
Assert.assertEquals(true, maquina.recargarCafe(10, 100));
Assert.assertEquals(100, maquina.getEgresos());
Assert.assertEquals(900, maquina.getGananciasBrutas());
Assert.assertEquals(160, maquina.getImpuestos());
Assert.assertEquals(740, maquina.getGananciasNetas());
`


const testRecargarCafe4 = () => `
MaquinaCafetera maquina = new MaquinaCafetera(0, 0, 0);
Assert.assertEquals(false, maquina.recargarCafe(10, 100));
Assert.assertEquals(0, maquina.getEgresos());
Assert.assertEquals(0, maquina.getGananciasBrutas());
Assert.assertEquals(0, maquina.getImpuestos());
Assert.assertEquals(0, maquina.getGananciasNetas());
`


const testRegistrarFactura = () => `
MaquinaCafetera maquina = new MaquinaCafetera();
maquina.registrarFactura(2000);
Assert.assertEquals(2000, maquina.getIngresos());
Assert.assertEquals(320, maquina.getImpuestos());
Assert.assertEquals(0, maquina.getEgresos());
Assert.assertEquals(2000, maquina.getGananciasBrutas());
Assert.assertEquals(1680, maquina.getGananciasNetas());
`

MaquinaCafeteraTest.test_cases = [
  getDataFromFunction(testCalcularPrecio0, 5),
  getDataFromFunction(testCalcularPrecio11, 5),
  getDataFromFunction(testCalcularPrecio12, 5),
  getDataFromFunction(testCalcularPrecio13, 5),
  getDataFromFunction(testCalcularPrecio21, 5),
  getDataFromFunction(testCalcularPrecio22, 5),
  getDataFromFunction(testCalcularPrecio23, 5),
  getDataFromFunction(testCalcularPrecio31, 5),
  getDataFromFunction(testCalcularPrecio32, 5),
  getDataFromFunction(testCalcularPrecio33, 5),
  getDataFromFunction(testPrepararCafe0, 5),
  getDataFromFunction(testPrepararCafe01, 5),
  getDataFromFunction(testPrepararCafe11, 5),
  getDataFromFunction(testPrepararCafe22, 5),
  getDataFromFunction(testPrepararCafe33, 5),
  getDataFromFunction(testRecargarCafe1, 5),
  getDataFromFunction(testRecargarCafe2, 5),
  getDataFromFunction(testRecargarCafe3, 5),
  getDataFromFunction(testRecargarCafe4, 5),
  getDataFromFunction(testRegistrarFactura, 5),
]


project.tests.push(MaquinaCafeteraTest)

console.log("done, wrote at: ", exportJson(__dirname, project))

