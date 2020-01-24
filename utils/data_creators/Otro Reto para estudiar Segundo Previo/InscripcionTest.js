const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "InscripcionTest"

const Test = createTest(TEST_NAME, `
public ${TEST_NAME}(){}

@Before
public void setUp(){}

@After
public void tearDown(){}
`)

const testConstructorInscripcion = () =>`    
Alumno alumno1 = new Alumno("1", "Primero", "de la lista", 16, 4.2f);
Materia materia1 = new Materia("POO II", 40);
Inscripcion inscripc1 = new Inscripcion(alumno1, materia1);
assertEquals(alumno1, inscripc1.getAlumno());
assertEquals(materia1, inscripc1.getMateria());
`

Test.test_cases = [
  getDataFromFunction(testConstructorInscripcion, 2),
  
]

module.exports = Test
