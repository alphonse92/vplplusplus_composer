const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "CampeonatoTest"

const Test = createTest(TEST_NAME, `

Object [] datos1;
Object [][]datos2 = {
        {"Equipo 1", "Equipo 1", 1, 6, false},
        {"Equipo 1", "Equipo 1", 6, 2, false},
        {"Equipo 1", "Equipo 2", 6, 3, true},
        {"Equipo 2", "Equipo 1", 5, 3, true},
        {"Equipo 1", "Equipo 3", 1, 0, true},
        {"Equipo 3", "Equipo 1", 0, 6, true},
        {"Equipo 1", "Equipo 4", 6, 5, true},
        {"Equipo 4", "Equipo 1", 0, 5, true},
        {"Equipo 1", "Equipo 5", 1, 6, true},
        {"Equipo 5", "Equipo 1", 2, 3, true},
        {"Equipo 1", "Equipo 6", 4, 2, true},
        {"Equipo 6", "Equipo 1", 4, 2, true},
        {"Equipo 1", "Equipo 7", 1, 5, true},
        {"Equipo 7", "Equipo 1", 2, 3, true},
        {"Equipo 1", "Equipo 8", 2, 3, true},
        {"Equipo 8", "Equipo 1", 3, 4, true},
        {"Equipo 1", "Equipo 9", 1, 2, true},
        {"Equipo 9", "Equipo 1", 0, 0, true},
        {"Equipo 1", "Equipo 10", 1, 3, true},
        {"Equipo 10", "Equipo 1", 3, 6, true},
        {"Equipo 1", "Equipo 11", 4, 5, true},
        {"Equipo 11", "Equipo 1", 3, 4, true},
        {"Equipo 1", "Equipo 12", 5, 1, true},
        {"Equipo 12", "Equipo 1", 3, 4, true},
        {"Equipo 1", "Equipo 13", 0, 1, true},
        {"Equipo 13", "Equipo 1", 5, 4, true},
        {"Equipo 1", "Equipo 14", 5, 2, true},
        {"Equipo 14", "Equipo 1", 4, 3, true},
        {"Equipo 1", "Equipo 15", 5, 5, true},
        {"Equipo 15", "Equipo 1", 0, 5, true},
        {"Equipo 1", "Equipo 16", 2, 4, true},
        {"Equipo 16", "Equipo 1", 0, 1, true},
        {"Equipo 2", "Equipo 2", 1, 1, false},
        {"Equipo 2", "Equipo 2", 2, 2, false},
        {"Equipo 2", "Equipo 3", 4, 5, true},
        {"Equipo 3", "Equipo 2", 5, 5, true},
        {"Equipo 2", "Equipo 4", 6, 4, true},
        {"Equipo 4", "Equipo 2", 0, 4, true},
        {"Equipo 2", "Equipo 5", 4, 5, true},
        {"Equipo 5", "Equipo 2", 2, 5, true},
        {"Equipo 2", "Equipo 6", 1, 6, true},
        {"Equipo 6", "Equipo 2", 5, 5, true},
        {"Equipo 2", "Equipo 7", 3, 3, true},
        {"Equipo 7", "Equipo 2", 2, 5, true},
        {"Equipo 2", "Equipo 8", 4, 1, true},
        {"Equipo 8", "Equipo 2", 5, 2, true},
        {"Equipo 2", "Equipo 9", 3, 5, true},
        {"Equipo 9", "Equipo 2", 6, 1, true},
        {"Equipo 2", "Equipo 10", 0, 6, true},
        {"Equipo 10", "Equipo 2", 2, 0, true},
        {"Equipo 2", "Equipo 11", 5, 3, true},
        {"Equipo 11", "Equipo 2", 2, 6, true},
        {"Equipo 2", "Equipo 12", 5, 5, true},
        {"Equipo 12", "Equipo 2", 1, 0, true},
        {"Equipo 2", "Equipo 13", 0, 1, true},
        {"Equipo 13", "Equipo 2", 5, 4, true},
        {"Equipo 2", "Equipo 14", 2, 1, true},
        {"Equipo 14", "Equipo 2", 2, 1, true},
        {"Equipo 2", "Equipo 15", 6, 0, true},
        {"Equipo 15", "Equipo 2", 3, 5, true},
        {"Equipo 2", "Equipo 16", 1, 6, true},
        {"Equipo 16", "Equipo 2", 6, 2, true},
        {"Equipo 3", "Equipo 3", 3, 5, false},
        {"Equipo 3", "Equipo 3", 0, 4, false},
        {"Equipo 3", "Equipo 4", 5, 5, true},
        {"Equipo 4", "Equipo 3", 4, 2, true},
        {"Equipo 3", "Equipo 5", 4, 6, true},
        {"Equipo 5", "Equipo 3", 1, 3, true},
        {"Equipo 3", "Equipo 6", 5, 2, true},
        {"Equipo 6", "Equipo 3", 2, 1, true},
        {"Equipo 3", "Equipo 7", 3, 6, true},
        {"Equipo 7", "Equipo 3", 1, 1, true},
        {"Equipo 3", "Equipo 8", 6, 0, true},
        {"Equipo 8", "Equipo 3", 4, 3, true},
        {"Equipo 3", "Equipo 9", 5, 4, true},
        {"Equipo 9", "Equipo 3", 4, 5, true},
        {"Equipo 3", "Equipo 10", 4, 2, true},
        {"Equipo 10", "Equipo 3", 3, 5, true},
        {"Equipo 3", "Equipo 11", 4, 6, true},
        {"Equipo 11", "Equipo 3", 1, 6, true},
        {"Equipo 3", "Equipo 12", 5, 2, true},
        {"Equipo 12", "Equipo 3", 5, 5, true},
        {"Equipo 3", "Equipo 13", 2, 0, true},
        {"Equipo 13", "Equipo 3", 3, 3, true},
        {"Equipo 3", "Equipo 14", 2, 3, true},
        {"Equipo 14", "Equipo 3", 3, 4, true},
        {"Equipo 3", "Equipo 15", 0, 1, true},
        {"Equipo 15", "Equipo 3", 1, 1, true},
        {"Equipo 3", "Equipo 16", 4, 3, true},
        {"Equipo 16", "Equipo 3", 5, 1, true},
        {"Equipo 4", "Equipo 4", 2, 5, false},
        {"Equipo 4", "Equipo 4", 5, 5, false},
        {"Equipo 4", "Equipo 5", 0, 6, true},
        {"Equipo 5", "Equipo 4", 2, 3, true},
        {"Equipo 4", "Equipo 6", 1, 6, true},
        {"Equipo 6", "Equipo 4", 4, 3, true},
        {"Equipo 4", "Equipo 7", 4, 1, true},
        {"Equipo 7", "Equipo 4", 2, 5, true},
        {"Equipo 4", "Equipo 8", 1, 2, true},
        {"Equipo 8", "Equipo 4", 5, 6, true},
        {"Equipo 4", "Equipo 9", 0, 5, true},
        {"Equipo 9", "Equipo 4", 5, 6, true},
        {"Equipo 4", "Equipo 10", 2, 2, true},
        {"Equipo 10", "Equipo 4", 1, 6, true},
        {"Equipo 4", "Equipo 11", 2, 1, true},
        {"Equipo 11", "Equipo 4", 0, 6, true},
        {"Equipo 4", "Equipo 12", 5, 2, true},
        {"Equipo 12", "Equipo 4", 4, 3, true},
        {"Equipo 4", "Equipo 13", 6, 3, true},
        {"Equipo 13", "Equipo 4", 4, 6, true},
        {"Equipo 4", "Equipo 14", 4, 0, true},
        {"Equipo 14", "Equipo 4", 5, 2, true},
        {"Equipo 4", "Equipo 15", 2, 6, true},
        {"Equipo 15", "Equipo 4", 2, 1, true},
        {"Equipo 4", "Equipo 16", 4, 0, true},
        {"Equipo 16", "Equipo 4", 5, 0, true},
        {"Equipo 5", "Equipo 5", 2, 2, false},
        {"Equipo 5", "Equipo 5", 1, 3, false},
        {"Equipo 5", "Equipo 6", 3, 0, true},
        {"Equipo 6", "Equipo 5", 5, 0, true},
        {"Equipo 5", "Equipo 7", 0, 1, true},
        {"Equipo 7", "Equipo 5", 3, 0, true},
        {"Equipo 5", "Equipo 8", 2, 5, true},
        {"Equipo 8", "Equipo 5", 5, 3, true},
        {"Equipo 5", "Equipo 9", 3, 6, true},
        {"Equipo 9", "Equipo 5", 5, 5, true},
        {"Equipo 5", "Equipo 10", 0, 4, true},
        {"Equipo 10", "Equipo 5", 2, 3, true},
        {"Equipo 5", "Equipo 11", 0, 6, true},
        {"Equipo 11", "Equipo 5", 0, 2, true},
        {"Equipo 5", "Equipo 12", 6, 3, true},
        {"Equipo 12", "Equipo 5", 3, 2, true},
        {"Equipo 5", "Equipo 13", 5, 2, true},
        {"Equipo 13", "Equipo 5", 0, 0, true},
        {"Equipo 5", "Equipo 14", 3, 6, true},
        {"Equipo 14", "Equipo 5", 2, 0, true},
        {"Equipo 5", "Equipo 15", 0, 4, true},
        {"Equipo 15", "Equipo 5", 3, 3, true},
        {"Equipo 5", "Equipo 16", 0, 1, true},
        {"Equipo 16", "Equipo 5", 5, 3, true},
        {"Equipo 6", "Equipo 6", 0, 3, false},
        {"Equipo 6", "Equipo 6", 1, 3, false},
        {"Equipo 6", "Equipo 7", 2, 1, true},
        {"Equipo 7", "Equipo 6", 2, 5, true},
        {"Equipo 6", "Equipo 8", 5, 3, true},
        {"Equipo 8", "Equipo 6", 1, 0, true},
        {"Equipo 6", "Equipo 9", 0, 6, true},
        {"Equipo 9", "Equipo 6", 5, 3, true},
        {"Equipo 6", "Equipo 10", 4, 1, true},
        {"Equipo 10", "Equipo 6", 2, 1, true},
        {"Equipo 6", "Equipo 11", 0, 4, true},
        {"Equipo 11", "Equipo 6", 2, 4, true},
        {"Equipo 6", "Equipo 12", 0, 3, true},
        {"Equipo 12", "Equipo 6", 0, 1, true},
        {"Equipo 6", "Equipo 13", 2, 5, true},
        {"Equipo 13", "Equipo 6", 6, 4, true},
        {"Equipo 6", "Equipo 14", 4, 4, true},
        {"Equipo 14", "Equipo 6", 3, 4, true},
        {"Equipo 6", "Equipo 15", 2, 5, true},
        {"Equipo 15", "Equipo 6", 0, 5, true},
        {"Equipo 6", "Equipo 16", 1, 6, true},
        {"Equipo 16", "Equipo 6", 6, 2, true},
        {"Equipo 7", "Equipo 7", 6, 5, false},
        {"Equipo 7", "Equipo 7", 3, 0, false},
        {"Equipo 7", "Equipo 8", 4, 0, true},
        {"Equipo 8", "Equipo 7", 2, 4, true},
        {"Equipo 7", "Equipo 9", 2, 4, true},
        {"Equipo 9", "Equipo 7", 4, 4, true},
        {"Equipo 7", "Equipo 10", 5, 5, true},
        {"Equipo 10", "Equipo 7", 5, 5, true},
        {"Equipo 7", "Equipo 11", 5, 2, true},
        {"Equipo 11", "Equipo 7", 0, 5, true},
        {"Equipo 7", "Equipo 12", 4, 1, true},
        {"Equipo 12", "Equipo 7", 6, 1, true},
        {"Equipo 7", "Equipo 13", 3, 0, true},
        {"Equipo 13", "Equipo 7", 0, 4, true},
        {"Equipo 7", "Equipo 14", 5, 0, true},
        {"Equipo 14", "Equipo 7", 2, 3, true},
        {"Equipo 7", "Equipo 15", 2, 5, true},
        {"Equipo 15", "Equipo 7", 0, 0, true},
        {"Equipo 7", "Equipo 16", 3, 5, true},
        {"Equipo 16", "Equipo 7", 1, 6, true},
        {"Equipo 8", "Equipo 8", 4, 5, false},
        {"Equipo 8", "Equipo 8", 5, 3, false},
        {"Equipo 8", "Equipo 9", 5, 5, true},
        {"Equipo 9", "Equipo 8", 1, 1, true},
        {"Equipo 8", "Equipo 10", 3, 5, true},
        {"Equipo 10", "Equipo 8", 5, 6, true},
        {"Equipo 8", "Equipo 11", 0, 5, true},
        {"Equipo 11", "Equipo 8", 5, 5, true},
        {"Equipo 8", "Equipo 12", 3, 0, true},
        {"Equipo 12", "Equipo 8", 6, 6, true},
        {"Equipo 8", "Equipo 13", 0, 5, true},
        {"Equipo 13", "Equipo 8", 1, 1, true},
        {"Equipo 8", "Equipo 14", 4, 4, true},
        {"Equipo 14", "Equipo 8", 6, 0, true},
        {"Equipo 8", "Equipo 15", 1, 2, true},
        {"Equipo 15", "Equipo 8", 3, 5, true},
        {"Equipo 8", "Equipo 16", 2, 6, true},
        {"Equipo 16", "Equipo 8", 0, 5, true},
        {"Equipo 9", "Equipo 9", 1, 1, false},
        {"Equipo 9", "Equipo 9", 0, 5, false},
        {"Equipo 9", "Equipo 10", 2, 1, true},
        {"Equipo 10", "Equipo 9", 2, 2, true},
        {"Equipo 9", "Equipo 11", 1, 0, true},
        {"Equipo 11", "Equipo 9", 5, 3, true},
        {"Equipo 9", "Equipo 12", 1, 0, true},
        {"Equipo 12", "Equipo 9", 0, 6, true},
        {"Equipo 9", "Equipo 13", 4, 6, true},
        {"Equipo 13", "Equipo 9", 3, 5, true},
        {"Equipo 9", "Equipo 14", 6, 5, true},
        {"Equipo 14", "Equipo 9", 6, 5, true},
        {"Equipo 9", "Equipo 15", 2, 2, true},
        {"Equipo 15", "Equipo 9", 2, 5, true},
        {"Equipo 9", "Equipo 16", 2, 1, true},
        {"Equipo 16", "Equipo 9", 2, 6, true},
        {"Equipo 10", "Equipo 10", 5, 2, false},
        {"Equipo 10", "Equipo 10", 4, 3, false},
        {"Equipo 10", "Equipo 11", 3, 6, true},
        {"Equipo 11", "Equipo 10", 6, 1, true},
        {"Equipo 10", "Equipo 12", 3, 3, true},
        {"Equipo 12", "Equipo 10", 3, 3, true},
        {"Equipo 10", "Equipo 13", 6, 6, true},
        {"Equipo 13", "Equipo 10", 2, 4, true},
        {"Equipo 10", "Equipo 14", 1, 0, true},
        {"Equipo 14", "Equipo 10", 2, 4, true},
        {"Equipo 10", "Equipo 15", 1, 4, true},
        {"Equipo 15", "Equipo 10", 2, 5, true},
        {"Equipo 10", "Equipo 16", 3, 2, true},
        {"Equipo 16", "Equipo 10", 6, 0, true},
        {"Equipo 11", "Equipo 11", 5, 5, false},
        {"Equipo 11", "Equipo 11", 1, 5, false},
        {"Equipo 11", "Equipo 12", 1, 6, true},
        {"Equipo 12", "Equipo 11", 4, 3, true},
        {"Equipo 11", "Equipo 13", 0, 4, true},
        {"Equipo 13", "Equipo 11", 1, 3, true},
        {"Equipo 11", "Equipo 14", 2, 6, true},
        {"Equipo 14", "Equipo 11", 1, 0, true},
        {"Equipo 11", "Equipo 15", 5, 1, true},
        {"Equipo 15", "Equipo 11", 2, 4, true},
        {"Equipo 11", "Equipo 16", 5, 6, true},
        {"Equipo 16", "Equipo 11", 0, 5, true},
        {"Equipo 12", "Equipo 12", 4, 2, false},
        {"Equipo 12", "Equipo 12", 6, 6, false},
        {"Equipo 12", "Equipo 13", 0, 2, true},
        {"Equipo 13", "Equipo 12", 2, 3, true},
        {"Equipo 12", "Equipo 14", 0, 1, true},
        {"Equipo 14", "Equipo 12", 1, 3, true},
        {"Equipo 12", "Equipo 15", 3, 3, true},
        {"Equipo 15", "Equipo 12", 0, 1, true},
        {"Equipo 12", "Equipo 16", 2, 1, true},
        {"Equipo 16", "Equipo 12", 0, 6, true},
        {"Equipo 13", "Equipo 13", 4, 2, false},
        {"Equipo 13", "Equipo 13", 2, 4, false},
        {"Equipo 13", "Equipo 14", 5, 4, true},
        {"Equipo 14", "Equipo 13", 5, 2, true},
        {"Equipo 13", "Equipo 15", 3, 2, true},
        {"Equipo 15", "Equipo 13", 2, 5, true},
        {"Equipo 13", "Equipo 16", 2, 6, true},
        {"Equipo 16", "Equipo 13", 4, 5, true},
        {"Equipo 14", "Equipo 14", 6, 3, false},
        {"Equipo 14", "Equipo 14", 3, 6, false},
        {"Equipo 14", "Equipo 15", 5, 3, true},
        {"Equipo 15", "Equipo 14", 6, 3, true},
        {"Equipo 14", "Equipo 16", 2, 0, true},
        {"Equipo 16", "Equipo 14", 4, 0, true},
        {"Equipo 15", "Equipo 15", 2, 2, false},
        {"Equipo 15", "Equipo 15", 3, 4, false},
        {"Equipo 15", "Equipo 16", 6, 2, true},
        {"Equipo 16", "Equipo 15", 0, 1, true},
        {"Equipo 16", "Equipo 16", 2, 2, false},
        {"Equipo 16", "Equipo 16", 0, 1, false}
    };

Object [][] datos3 = {
        { 30, 6, 1, 8, 10, 1, 4, 44, 47, 53, 34, 50},
        { 30, 6, 2, 7, 5, 2, 8, 49, 54, 48, 52, 37},
        { 30, 7, 2, 6, 6, 4, 5, 54, 51, 45, 42, 45},
        { 30, 7, 1, 7, 7, 1, 7, 35, 45, 61, 56, 44},
        { 30, 3, 0, 12, 6, 3, 6, 29, 52, 44, 42, 30},
        { 30, 7, 2, 6, 7, 0, 8, 40, 49, 45, 41, 44},
        { 30, 6, 2, 7, 8, 4, 3, 45, 41, 49, 33, 48},
        { 30, 5, 2, 8, 6, 4, 5, 43, 54, 43, 51, 39},
        { 30, 7, 5, 3, 10, 2, 3, 48, 40, 69, 39, 58},
        { 30, 4, 4, 7, 7, 3, 5, 42, 55, 46, 42, 40},
        { 30, 3, 1, 11, 9, 0, 6, 37, 65, 53, 32, 37},
        { 30, 6, 4, 5, 6, 2, 7, 40, 41, 39, 41, 42},
        { 30, 5, 3, 7, 9, 1, 5, 42, 53, 47, 39, 46},
        { 30, 10, 0, 5, 4, 2, 9, 49, 34, 39, 53, 44},
        { 30, 3, 3, 9, 8, 3, 4, 32, 50, 44, 37, 39},
        { 30, 7, 0, 8, 8, 0, 7, 44, 43, 49, 39, 45}
    };

/**
 * Default constructor for test class CampeonatoTest
 */
public ${TEST_NAME}()
{
    int k = 0;
    datos1 = new Object[16];
    for(int i=0; i<16;i++){
        datos1[i]="Equipo " + (i+1);
    }
    /*for(int i=0; i<16;i++){
        for(int j = i; j<16;j++){
            datos2[k][0] = datos1[i];
            datos2[k][1] = datos1[j];
            datos2[k][2] = new Integer((int)(Math.random()*7));
            datos2[k][3] = new Integer((int)(Math.random()*7));
            datos2[k++][4] = new Boolean(i!=j);
            System.out.println("{\""+datos2[k-1][0]+"\", \""+datos2[k-1][1]+"\", "+
                datos2[k-1][2]+", "+datos2[k-1][3]+", "+
                datos2[k-1][4]+"},");

            datos2[k][0] = datos1[j];
            datos2[k][1] = datos1[i];
            datos2[k][2] = new Integer((int)(Math.random()*7));
            datos2[k][3] = new Integer((int)(Math.random()*7));
            datos2[k++][4] = new Boolean(i!=j);
            System.out.println("{\""+datos2[k-1][0]+"\", \""+datos2[k-1][1]+"\", "+
                datos2[k-1][2]+", "+datos2[k-1][3]+", "+
                datos2[k-1][4]+"},");
        }
    }
    System.out.println("****");*/
}
`)

const testCampeonatoInscribirEquipo = () => `
Campeonato c = new Campeonato();

for(int i=0; i<datos1.length; i++){
    assertEquals(true, c.inscribirEquipo((String)datos1[i]));
    assertEquals(false, c.inscribirEquipo((String)datos1[i]));
}
for(int i=0; i<datos1.length; i++){
    assertEquals(false, c.inscribirEquipo((String)datos1[i]));
}
`


const testCampeonatoRegistrarPartido = () => `
Campeonato c = new Campeonato();

for(int i=0; i<datos1.length; i++){
    c.inscribirEquipo((String)datos1[i]);
}
for(int i=0; i<datos2.length;i++){
    assertEquals(i+"-->"+(String)datos2[i][0]+" vs " +(String)datos2[i][1],(boolean)datos2[i][4], c.registrarPartido((String)datos2[i][0],(String)datos2[i][1], (int)datos2[i][2], (int)datos2[i][3]));
    assertEquals(false, c.registrarPartido((String)datos2[i][0],(String)datos2[i][1], (int)datos2[i][2], (int)datos2[i][3]));           
}
for(int i=0; i<datos2.length;i++){
    assertEquals(false, c.registrarPartido((String)datos2[i][0],(String)datos2[i][1], (int)datos2[i][2], (int)datos2[i][3]));           
}

/*for(int i=0; i<datos1.length; i++){
    Equipo e = c.buscarEquipo((String)datos1[i]);
    System.out.print("{ "+e.getPartidosJugados()+", ");
    System.out.print(e.getPartidosGanadosLocal()+", ");
    System.out.print(e.getPartidosEmpatadosLocal()+", ");
    System.out.print(e.getPartidosPerdidosLocal()+", ");
    System.out.print(e.getPartidosGanadosVisitante()+", ");
    System.out.print(e.getPartidosEmpatadosVisitante()+", ");
    System.out.print(e.getPartidosPerdidosVisitante()+", ");
    System.out.print(e.getGolesFavorLocal()+", ");
    System.out.print(e.getGolesContraLocal()+", ");
    System.out.print(e.getGolesFavorVisitante()+", ");
    System.out.print(e.getGolesContraVisitante()+", ");
    System.out.println(e.getPuntos()+"},");
} */

for(int i=0; i<datos1.length; i++){
    Equipo e = c.buscarEquipo((String)datos1[i]);
    assertEquals(datos3[i][0],e.getPartidosJugados());
    assertEquals(datos3[i][1],e.getPartidosGanadosLocal());
    assertEquals(datos3[i][2],e.getPartidosEmpatadosLocal());
    assertEquals(datos3[i][3],e.getPartidosPerdidosLocal());
    assertEquals(datos3[i][4],e.getPartidosGanadosVisitante());
    assertEquals(datos3[i][5],e.getPartidosEmpatadosVisitante());
    assertEquals(datos3[i][6],e.getPartidosPerdidosVisitante());
    assertEquals(datos3[i][7],e.getGolesFavorLocal());
    assertEquals(datos3[i][8],e.getGolesContraLocal());
    assertEquals(datos3[i][9],e.getGolesFavorVisitante());
    assertEquals(datos3[i][10],e.getGolesContraVisitante());
    assertEquals(datos3[i][11],e.getPuntos());
}
`


const testCampeonatoBuscarEquipo = () => `
Campeonato c = new Campeonato();

for(int i=0; i<datos1.length; i++){
    c.inscribirEquipo((String)datos1[i]);
}

for(int i=0; i<datos1.length; i++){
    assertNotNull(c.buscarEquipo((String)datos1[i]));
    assertNull(c.buscarEquipo(((String)datos1[i])+"-1"));
}
`


const testCampeonatoConstructor = () => `
Campeonato c = new Campeonato();
ArrayList<Equipo> ae = c.getEquipos();
ArrayList<Partido> ap = c.getPartidos();
assertNotNull(ae);
assertNotNull(ap);
assertEquals(0, ae.size());
assertEquals(0, ap.size());
`

Test.test_cases = [
  getDataFromFunction(testCampeonatoInscribirEquipo, 10),
  getDataFromFunction(testCampeonatoRegistrarPartido, 10),
  getDataFromFunction(testCampeonatoBuscarEquipo, 10),
  getDataFromFunction(testCampeonatoConstructor, 10)
]

module.exports = Test
