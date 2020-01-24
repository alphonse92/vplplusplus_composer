const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "GrupoTest"

const Test = createTest(TEST_NAME, `
public ${TEST_NAME}(){}

@Before
public void setUp(){}

@After
public void tearDown(){}
`)



const testConstructorGrupo = () => `
int r = (int)(Math.random()*100);
Materia materia1 = new Materia("POO II", r);
Grupo grupo1 = new Grupo(materia1);
assertNotNull(grupo1.alumnos);
assertEquals(r, grupo1.alumnos.length);
assertEquals(0, grupo1.getContadorDeAlumnos());
assertEquals(materia1, grupo1.materia);
`


const testAgregarAlumnoOK = () => `
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
`


const testAgregarAlumnoErrorTamanio = () => `
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
`


const testAgregarAlumnoErrorRepetido = () => `
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
`



Test.test_cases = [
  getDataFromFunction(testConstructorGrupo, 2),
  getDataFromFunction(testAgregarAlumnoOK, 2),
  getDataFromFunction(testAgregarAlumnoErrorTamanio, 2),
  getDataFromFunction(testAgregarAlumnoErrorRepetido, 3),
]

module.exports = Test
