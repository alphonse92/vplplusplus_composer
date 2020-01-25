const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "PartidoTest"

const Test = createTest(TEST_NAME, `

Object [][] datos3 = {
  {2,1,true,1,1,0,0,0,0,0,2,1,0,0,3},
  {1,1,true,1,0,1,0,0,0,0,1,1,0,0,1},
  {1,2,true,1,0,0,1,0,0,0,1,2,0,0,0},
  {2,1,false,1,0,0,0,1,0,0,0,0,2,1,3},
  {1,1,false,1,0,0,0,0,1,0,0,0,1,1,1},
  {1,2,false,1,0,0,0,0,0,1,0,0,1,2,0}
};
Object [][]  datos4 = {
  {2,1,true,1,1,0,0,0,0,0,2,1,0,0,3},
  {1,1,true,2,1,1,0,0,0,0,3,2,0,0,4},
  {1,2,true,3,1,1,1,0,0,0,4,4,0,0,4},
  {2,1,false,4,1,1,1,1,0,0,4,4,2,1,7},
  {1,1,false,5,1,1,1,1,1,0,4,4,3,2,8},
  {1,2,false,6,1,1,1,1,1,1,4,4,4,4,8}
};

Object [][] datos5 = {
  {2,1,true,1,0,0,0,0,0,1,0,0,1,2,0},
  {1,1,true,1,0,0,0,0,1,0,0,0,1,1,1},
  {1,2,true,1,0,0,0,1,0,0,0,0,2,1,3},
  {2,1,false,1,0,0,1,0,0,0,1,2,0,0,0},
  {1,1,false,1,0,1,0,0,0,0,1,1,0,0,1},
  {1,2,false,1,1,0,0,0,0,0,2,1,0,0,3}
};

Object [][] datos6 = {
  {2,1,true,1,0,0,0,0,0,1,0,0,1,2,0},
  {1,1,true,2,0,0,0,0,1,1,0,0,2,3,1},
  {1,2,true,3,0,0,0,1,1,1,0,0,4,4,4},
  {2,1,false,4,0,0,1,1,1,1,1,2,4,4,4},
  {1,1,false,5,0,1,1,1,1,1,2,3,4,4,5},
  {1,2,false,6,1,1,1,1,1,1,4,4,4,4,8}
};

public ${TEST_NAME}(){}

@Before
public void setUp(){}

@After
public void tearDown(){}
`)


const testPartidoConstructor = ()=>`
Equipo e1 = new Equipo("uno");
Equipo e2 = new Equipo("dos");
Partido p1 = new Partido(e1,  e2, 2, 1);
assertEquals(2, p1.getGolesEquipoLocal());
assertEquals(1, p1.getGolesEquipoVisitante());
p1 = new Partido(e1,  e2, 1, 1);
assertEquals(1, p1.getGolesEquipoLocal());
assertEquals(1, p1.getGolesEquipoVisitante());
p1 = new Partido(e1,  e2, 1, 2);
assertEquals(1, p1.getGolesEquipoLocal());
assertEquals(2, p1.getGolesEquipoVisitante());
`

const testPartidoRegistrarPartido =() => `
  Equipo e1 = new Equipo("uno");
  Equipo e2 = new Equipo("dos");
  Equipo e11 = null, e21 = null;
  Partido p1 = null, p2 = null;

  for(int i=0; i<datos3.length;i++){
      e11 = new Equipo("uno1");
      e21 = new Equipo("dos1");
      if((boolean)datos3[i][2]){
          p1 = new Partido(e1, e2, (int)datos3[i][0], (int)datos3[i][1]);
          p2 = new Partido(e11, e21, (int)datos3[i][0], (int)datos3[i][1]);
      }
      else{
          p1 = new Partido(e2, e1, (int)datos3[i][1], (int)datos3[i][0]);
          p2 = new Partido(e21, e11, (int)datos3[i][1], (int)datos3[i][0]);
      }
      p1.registrarPartido();
      p2.registrarPartido();

      assertEquals((int)datos3[i][3],e11.getPartidosJugados());
      assertEquals((int)datos3[i][4],e11.getPartidosGanadosLocal());
      assertEquals((int)datos3[i][5],e11.getPartidosEmpatadosLocal());
      assertEquals((int)datos3[i][6],e11.getPartidosPerdidosLocal());
      assertEquals((int)datos3[i][7],e11.getPartidosGanadosVisitante());
      assertEquals((int)datos3[i][8],e11.getPartidosEmpatadosVisitante());
      assertEquals((int)datos3[i][9],e11.getPartidosPerdidosVisitante());
      assertEquals((int)datos3[i][10],e11.getGolesFavorLocal());
      assertEquals((int)datos3[i][11],e11.getGolesContraLocal());
      assertEquals((int)datos3[i][12],e11.getGolesFavorVisitante());
      assertEquals((int)datos3[i][13],e11.getGolesContraVisitante());
      assertEquals((int)datos3[i][14],e11.getPuntos());

      assertEquals((int)datos5[i][3],e21.getPartidosJugados());
      assertEquals((int)datos5[i][4],e21.getPartidosGanadosLocal());
      assertEquals((int)datos5[i][5],e21.getPartidosEmpatadosLocal());
      assertEquals((int)datos5[i][6],e21.getPartidosPerdidosLocal());
      assertEquals((int)datos5[i][7],e21.getPartidosGanadosVisitante());
      assertEquals((int)datos5[i][8],e21.getPartidosEmpatadosVisitante());
      assertEquals((int)datos5[i][9],e21.getPartidosPerdidosVisitante());
      assertEquals((int)datos5[i][10],e21.getGolesFavorLocal());
      assertEquals((int)datos5[i][11],e21.getGolesContraLocal());
      assertEquals((int)datos5[i][12],e21.getGolesFavorVisitante());
      assertEquals((int)datos5[i][13],e21.getGolesContraVisitante());
      assertEquals((int)datos5[i][14],e21.getPuntos());

      assertEquals((int)datos4[i][3],e1.getPartidosJugados());
      assertEquals((int)datos4[i][4],e1.getPartidosGanadosLocal());
      assertEquals((int)datos4[i][5],e1.getPartidosEmpatadosLocal());
      assertEquals((int)datos4[i][6],e1.getPartidosPerdidosLocal());
      assertEquals((int)datos4[i][7],e1.getPartidosGanadosVisitante());
      assertEquals((int)datos4[i][8],e1.getPartidosEmpatadosVisitante());
      assertEquals((int)datos4[i][9],e1.getPartidosPerdidosVisitante());
      assertEquals((int)datos4[i][10],e1.getGolesFavorLocal());
      assertEquals((int)datos4[i][11],e1.getGolesContraLocal());
      assertEquals((int)datos4[i][12],e1.getGolesFavorVisitante());
      assertEquals((int)datos4[i][13],e1.getGolesContraVisitante());
      assertEquals((int)datos4[i][14],e1.getPuntos());

      assertEquals((int)datos6[i][3],e2.getPartidosJugados());
      assertEquals((int)datos6[i][4],e2.getPartidosGanadosLocal());
      assertEquals((int)datos6[i][5],e2.getPartidosEmpatadosLocal());
      assertEquals((int)datos6[i][6],e2.getPartidosPerdidosLocal());
      assertEquals((int)datos6[i][7],e2.getPartidosGanadosVisitante());
      assertEquals((int)datos6[i][8],e2.getPartidosEmpatadosVisitante());
      assertEquals((int)datos6[i][9],e2.getPartidosPerdidosVisitante());
      assertEquals((int)datos6[i][10],e2.getGolesFavorLocal());
      assertEquals((int)datos6[i][11],e2.getGolesContraLocal());
      assertEquals((int)datos6[i][12],e2.getGolesFavorVisitante());
      assertEquals((int)datos6[i][13],e2.getGolesContraVisitante());
      assertEquals((int)datos6[i][14],e2.getPuntos());
  } 
`




Test.test_cases = [
  getDataFromFunction(testPartidoConstructor, 10),
  getDataFromFunction(testPartidoRegistrarPartido, 10),
]

module.exports = Test
