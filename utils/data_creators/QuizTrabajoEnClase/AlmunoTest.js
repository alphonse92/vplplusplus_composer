const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "AlumnoTest"

const Test = createTest(TEST_NAME, `
public FraccionarioTest(){}

@Before
public void setUp(){}

@After
public void tearDown(){}
`)

const testAlumno = ()=>`
Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
assertEquals("1", alumno1.getCodigo());
assertEquals("Primero", alumno1.getNombres());
assertEquals("de la lista", alumno1.getApellidos());
assertEquals(16, alumno1.getEdad());
assertEquals(4.2, alumno1.getPromedio(), 0.001);

alumno1 = new Alumno("1", "Primero", "de la lista", 16, 3.0f);
assertEquals(true, alumno1.tienePromedioCondicional());
`
Test.test_cases = [
  getDataFromFunction(testAlumno, 2),
]

module.exports = Test
