const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "EquipoTest"

const Test = createTest(TEST_NAME, `

Object [] datos1;
Object [] datos2;
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



public ${TEST_NAME}(){

  boolean e = false;
  datos1 = new Object[11];
  datos2 = new Object[11];
  for(int i=0; i<11;i++){
      datos1[i]="Jugador " + (i+1);
  }
  for(int i=0; i<11;i++){
      do{
          datos2[i]=new Integer((int)(1+Math.random()*20));
          e = false;
          for(int j = 0; j<i;j++){
              if((int)datos2[i]==(int)datos2[j]) e = true;
          }
      }
      while(e);
  }

}

@Before
public void setUp(){}

@After
public void tearDown(){}
`)





const testEquipoAgregarFutbolista = ()=>`
    Equipo e = new Equipo("uno");
    for(int i=0; i<datos1.length; i++){
        assertEquals(true, e.agregarFutbolista((String)datos1[i], (int)datos2[i], false));
    }
    assertEquals(false, e.agregarFutbolista("otro", 5, false));
    for(int i=0; i<datos1.length; i++){
        assertEquals(false, e.agregarFutbolista((String)datos1[i], (int)datos2[i], false));
    }
`


const testEquipoAgregarPortero= ()=>`
{
    Equipo e = new Equipo("uno");
    Futbolista f = null;
    boolean esPortero=false;
    for(int i=0; i<datos1.length; i++){
        assertEquals(true, e.agregarFutbolista((String)datos1[i], (int)datos2[i], true));
        f = e.buscarFutbolista((int)datos2[i]);
        esPortero = f != null && f instanceof Portero;
        assertEquals(true, esPortero);
    }
`


const testEquipoBuscarFutbolista= ()=>`
    Equipo e = new Equipo("uno");
    for(int i=0; i<datos1.length; i++){
        e.agregarFutbolista((String)datos1[i], (int)datos2[i], false);
    }
    for(int i=0; i<datos1.length; i++){
        assertNotNull(e.buscarFutbolista((int)datos2[i]));
    }
    for(int i=0; i<datos1.length; i++){
        assertNull(e.buscarFutbolista(77*((int)datos2[i])));
    }
`


const testEquipoRegistrarPartido= ()=>`
    Equipo e1 = new Equipo("uno"), e2 = null;
    for(int i=0; i<datos3.length;i++){
        e2 = new Equipo("uno");
        e1.registrarPartido((int)datos3[i][0], (int)datos3[i][1], (boolean)datos3[i][2]);
        e2.registrarPartido((int)datos3[i][0], (int)datos3[i][1], (boolean)datos3[i][2]);
        assertEquals((int)datos3[i][3],e2.getPartidosJugados());
        assertEquals((int)datos3[i][4],e2.getPartidosGanadosLocal());
        assertEquals((int)datos3[i][5],e2.getPartidosEmpatadosLocal());
        assertEquals((int)datos3[i][6],e2.getPartidosPerdidosLocal());
        assertEquals((int)datos3[i][7],e2.getPartidosGanadosVisitante());
        assertEquals((int)datos3[i][8],e2.getPartidosEmpatadosVisitante());
        assertEquals((int)datos3[i][9],e2.getPartidosPerdidosVisitante());
        assertEquals((int)datos3[i][10],e2.getGolesFavorLocal());
        assertEquals((int)datos3[i][11],e2.getGolesContraLocal());
        assertEquals((int)datos3[i][12],e2.getGolesFavorVisitante());
        assertEquals((int)datos3[i][13],e2.getGolesContraVisitante());
        assertEquals((int)datos3[i][14],e2.getPuntos());
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
    }
`


Test.test_cases = [
  getDataFromFunction(testEquipoAgregarFutbolista, 10),
  getDataFromFunction(testEquipoAgregarPortero, 10),
  getDataFromFunction(testEquipoBuscarFutbolista, 10),
  getDataFromFunction(testEquipoRegistrarPartido, 10),
]

module.exports = Test
