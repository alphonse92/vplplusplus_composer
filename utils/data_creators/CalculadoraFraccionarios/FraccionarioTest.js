
const createProject = require('../../common/create-project-schema')
const createTest = require('../../common/create-test-schema')
const createTestCase = require('../../common/create-test-case-schema')
const exportJson = require('../../common/create-schema')

const TEST_NAME = 'FraccionarioTest'

const getDataFromFunction = (fn, grade) => {
  const name = fn.name;
  const code = fn();
  return createTestCase(name, code, grade)
}

const project = createProject(TEST_NAME)
const FraccionarioTest = createTest(TEST_NAME, `
    public FraccionarioTest(){}

    @Before
    public void setUp(){}
    
    @After
    public void tearDown(){}
`)

const testSimplificar = () => `
int m1 = (int)(Math.random()*100);
Fraccionario f = new Fraccionario(5*m1, 17*m1);
f.simplificar();
assertEquals(5, f.getNumerador());
assertEquals(17, f.getDenominador());
`


const testSumar = () => `
int n1 = (int)(Math.random()*100);
int d1 = (int)(Math.random()*100);
int n2 = (int)(Math.random()*100);
int d2 = (int)(Math.random()*100);        
Fraccionario f1 = new Fraccionario(n1, d1);
Fraccionario f2 = new Fraccionario(n2, d2);
Fraccionario f3 = f1.sumar(f2);
assertEquals(n1*d2 + d1*n2, f3.getNumerador());
assertEquals(d1*d2, f3.getDenominador());
`


const testRestar = () => `
int n1 = (int)(Math.random()*100);
int d1 = (int)(Math.random()*100);
int n2 = (int)(Math.random()*100);
int d2 = (int)(Math.random()*100);        
Fraccionario f1 = new Fraccionario(n1, d1);
Fraccionario f2 = new Fraccionario(n2, d2);
Fraccionario f3 = f1.restar(f2);
assertEquals(n1*d2 - d1*n2, f3.getNumerador());
assertEquals(d1*d2, f3.getDenominador());
`


const testMultiplicar = () => `
int n1 = (int)(Math.random()*100);
int d1 = (int)(Math.random()*100);
int n2 = (int)(Math.random()*100);
int d2 = (int)(Math.random()*100);        
Fraccionario f1 = new Fraccionario(n1, d1);
Fraccionario f2 = new Fraccionario(n2, d2);
Fraccionario f3 = f1.multiplicar(f2);
assertEquals(n1*n2, f3.getNumerador());
assertEquals(d1*d2, f3.getDenominador());
`


const testDividir = () => `
int n1 = (int)(Math.random()*100);
int d1 = (int)(Math.random()*100);
int n2 = (int)(Math.random()*100);
int d2 = (int)(Math.random()*100);        
Fraccionario f1 = new Fraccionario(n1, d1);
Fraccionario f2 = new Fraccionario(n2, d2);
Fraccionario f3 = f1.dividir(f2);
assertEquals(n1*d2, f3.getNumerador());
assertEquals(d1*n2, f3.getDenominador());
`

FraccionarioTest.test_cases = [
  getDataFromFunction(testSimplificar, 20),
  getDataFromFunction(testSumar, 20),
  getDataFromFunction(testRestar, 20),
  getDataFromFunction(testMultiplicar, 20),
  getDataFromFunction(testDividir, 20)
]


project.tests.push(FraccionarioTest)

console.log("done, wrote at: ", exportJson(__dirname, project))

