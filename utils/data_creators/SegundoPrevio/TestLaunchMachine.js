const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "TestLaunchMachine"

const Test = createTest(TEST_NAME, `


    Ingrediente [] ingredientes = null; 

    Ingrediente [] ingredientes2 = null;     

    int [] precios = {
            4603,
            4671,
            4603,
            4603,
            4738,
            4806,
            4738,
            4738,
            4603,
            4671,
            4603,
            4603,
            4603,
            4671,
            4603,
            4603,
            4603,
            4671,
            4603,
            4603,
            2173,
            2241,
            2173,
            2173,
            2308,
            2376,
            2308,
            2308,
            2173,
            2241,
            2173,
            2173,
            2173,
            2241,
            2173,
            2173,
            2173,
            2241,
            2173,
            2173,
            2443,
            2511,
            2443,
            2443,
            2578,
            2646,
            2578,
            2578,
            2443,
            2511,
            2443,
            2443,
            2443,
            2511,
            2443,
            2443,
            2443,
            2511,
            2443,
            2443,
            5143,
            5211,
            5143,
            5143,
            5278,
            5346,
            5278,
            5278,
            5143,
            5211,
            5143,
            5143,
            5143,
            5211,
            5143,
            5143,
            5143,
            5211,
            5143,
            5143,
            5683,
            5751,
            5683,
            5683,
            5818,
            5886,
            5818,
            5818,
            5683,
            5751,
            5683,
            5683,
            5683,
            5751,
            5683,
            5683,
            5683,
            5751,
            5683,
            5683,
            4684,
            4752,
            4684,
            4684,
            4819,
            4887,
            4819,
            4819,
            4684,
            4752,
            4684,
            4684,
            4684,
            4752,
            4684,
            4684,
            4684,
            4752,
            4684,
            4684,
            2254,
            2322,
            2254,
            2254,
            2389,
            2457,
            2389,
            2389,
            2254,
            2322,
            2254,
            2254,
            2254,
            2322,
            2254,
            2254,
            2254,
            2322,
            2254,
            2254,
            2524,
            2592,
            2524,
            2524,
            2659,
            2727,
            2659,
            2659,
            2524,
            2592,
            2524,
            2524,
            2524,
            2592,
            2524,
            2524,
            2524,
            2592,
            2524,
            2524,
            5224,
            5292,
            5224,
            5224,
            5359,
            5427,
            5359,
            5359,
            5224,
            5292,
            5224,
            5224,
            5224,
            5292,
            5224,
            5224,
            5224,
            5292,
            5224,
            5224,
            5764,
            5832,
            5764,
            5764,
            5899,
            5967,
            5899,
            5899,
            5764,
            5832,
            5764,
            5764,
            5764,
            5832,
            5764,
            5764,
            5764,
            5832,
            5764,
            5764,
            4644,
            4711,
            4644,
            4644,
            4779,
            4846,
            4779,
            4779,
            4644,
            4711,
            4644,
            4644,
            4644,
            4711,
            4644,
            4644,
            4644,
            4711,
            4644,
            4644,
            2214,
            2281,
            2214,
            2214,
            2349,
            2416,
            2349,
            2349,
            2214,
            2281,
            2214,
            2214,
            2214,
            2281,
            2214,
            2214,
            2214,
            2281,
            2214,
            2214,
            2484,
            2551,
            2484,
            2484,
            2619,
            2686,
            2619,
            2619,
            2484,
            2551,
            2484,
            2484,
            2484,
            2551,
            2484,
            2484,
            2484,
            2551,
            2484,
            2484,
            5184,
            5251,
            5184,
            5184,
            5319,
            5386,
            5319,
            5319,
            5184,
            5251,
            5184,
            5184,
            5184,
            5251,
            5184,
            5184,
            5184,
            5251,
            5184,
            5184,
            5724,
            5791,
            5724,
            5724,
            5859,
            5926,
            5859,
            5859,
            5724,
            5791,
            5724,
            5724,
            5724,
            5791,
            5724,
            5724,
            5724,
            5791,
            5724,
            5724,
            4563,
            4630,
            4563,
            4563,
            4698,
            4765,
            4698,
            4698,
            4563,
            4630,
            4563,
            4563,
            4563,
            4630,
            4563,
            4563,
            4563,
            4630,
            4563,
            4563,
            2133,
            2200,
            2133,
            2133,
            2268,
            2335,
            2268,
            2268,
            2133,
            2200,
            2133,
            2133,
            2133,
            2200,
            2133,
            2133,
            2133,
            2200,
            2133,
            2133,
            2403,
            2470,
            2403,
            2403,
            2538,
            2605,
            2538,
            2538,
            2403,
            2470,
            2403,
            2403,
            2403,
            2470,
            2403,
            2403,
            2403,
            2470,
            2403,
            2403,
            5103,
            5170,
            5103,
            5103,
            5238,
            5305,
            5238,
            5238,
            5103,
            5170,
            5103,
            5103,
            5103,
            5170,
            5103,
            5103,
            5103,
            5170,
            5103,
            5103,
            5643,
            5710,
            5643,
            5643,
            5778,
            5845,
            5778,
            5778,
            5643,
            5710,
            5643,
            5643,
            5643,
            5710,
            5643,
            5643,
            5643,
            5710,
            5643,
            5643,
            4644,
            4711,
            4644,
            4644,
            4779,
            4846,
            4779,
            4779,
            4644,
            4711,
            4644,
            4644,
            4644,
            4711,
            4644,
            4644,
            4644,
            4711,
            4644,
            4644,
            2214,
            2281,
            2214,
            2214,
            2349,
            2416,
            2349,
            2349,
            2214,
            2281,
            2214,
            2214,
            2214,
            2281,
            2214,
            2214,
            2214,
            2281,
            2214,
            2214,
            2484,
            2551,
            2484,
            2484,
            2619,
            2686,
            2619,
            2619,
            2484,
            2551,
            2484,
            2484,
            2484,
            2551,
            2484,
            2484,
            2484,
            2551,
            2484,
            2484,
            5184,
            5251,
            5184,
            5184,
            5319,
            5386,
            5319,
            5319,
            5184,
            5251,
            5184,
            5184,
            5184,
            5251,
            5184,
            5184,
            5184,
            5251,
            5184,
            5184,
            5724,
            5791,
            5724,
            5724,
            5859,
            5926,
            5859,
            5859,
            5724,
            5791,
            5724,
            5724,
            5724,
            5791,
            5724,
            5724,
            5724,
            5791,
            5724,
            5724
        };
    boolean [] puede = {
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false
        };

public ${TEST_NAME}(){
}

@Before
public void setUp(){
    ingredientes = new Ingrediente [] {new Fruta("Papaya",5000,2),
        new Fruta("Mora",5000,4),new Fruta("Lulo",5000,3),
        new Fruta("Naranja",5000, 1),new Fruta("Banano",5000,3),
        new Proteina("Carne de Res",5000,16),new Proteina("Cerdo",5000,7),
        new Proteina("Pollo",5000,8),new Proteina("Bagre",5000,18),
        new Proteina("Mojarra",5000,20),new Grano("Lenteja",5000,1),
        new Grano("Garbanzo",5000,2),new Grano("Fijol",5000,1),
        new Grano("Alverja",5000,1),new Grano("Caraota",5000,1),
        new Almidon("Papa Negra",5000,1),new Almidon("Papa Amarilla",5000,2),
        new Almidon("Platano Verde",5000,1),new Almidon("Yuca",5000,1),
        new Almidon("Apio",5000,1)};
}

@After
public void tearDown(){}


`)




const testIngredienteRegistrarVenta1 = () => `
int a = ((int)(Math.random()*1000))%1000;
int b =  ((int)(Math.random()*1000))%100;
Fruta fruta1 = new Fruta("Mora", a, 1);
Proteina proteina1 = new Proteina("Carne", a, 1);
Grano grano1 = new Grano("Frijol", a, 1);
Almidon almidon1 = new Almidon("Yuca", a, 1);

fruta1.registrarVenta(b);
proteina1.registrarVenta(b);
grano1.registrarVenta(b);
almidon1.registrarVenta(b);

assertEquals(a-b, fruta1.getCantidadDisponible());
assertEquals(a-b, proteina1.getCantidadDisponible());
assertEquals(a-b, grano1.getCantidadDisponible());
assertEquals(a-b, almidon1.getCantidadDisponible());
`


const testIngredienteRegistrarCompra1 = () => `
int a = ((int)(Math.random()*1000))%1000 + 1;
int b =  ((int)(Math.random()*1000))%100 + 1;
Fruta fruta1 = new Fruta("Mora", a, b);
Proteina proteina1 = new Proteina("Carne", a, b);
Grano grano1 = new Grano("Frijol", a, b);
Almidon almidon1 = new Almidon("Yuca", a, b);

fruta1.registrarCompra(a, b + a/b);
proteina1.registrarCompra(a, b + a/b);
grano1.registrarCompra(a, b + a/b);
almidon1.registrarCompra(a, b + a/b);

assertEquals(b + a/b, fruta1.getPrecioCompra());
assertEquals(b + a/b, proteina1.getPrecioCompra());
assertEquals(b + a/b, grano1.getPrecioCompra());
assertEquals(b + a/b, almidon1.getPrecioCompra());

fruta1.registrarCompra(a, b + a/b);
proteina1.registrarCompra(a, b + a/b);
grano1.registrarCompra(a, b + a/b);
almidon1.registrarCompra(a, b + a/b);        

assertEquals(b + a/b, fruta1.getPrecioCompra());
assertEquals(b + a/b, proteina1.getPrecioCompra());
assertEquals(b + a/b, grano1.getPrecioCompra());
assertEquals(b + a/b, almidon1.getPrecioCompra());        

fruta1.registrarCompra(a, b - a/b);
proteina1.registrarCompra(a, b - a/b);
grano1.registrarCompra(a, b - a/b);
almidon1.registrarCompra(a, b - a/b);

assertEquals(b + a/b, fruta1.getPrecioCompra());
assertEquals(b + a/b, proteina1.getPrecioCompra());
assertEquals(b + a/b, grano1.getPrecioCompra());
assertEquals(b + a/b, almidon1.getPrecioCompra());

assertEquals(4*a, fruta1.getCantidadDisponible());
assertEquals(4*a, proteina1.getCantidadDisponible());
assertEquals(4*a, grano1.getCantidadDisponible());
assertEquals(4*a, almidon1.getCantidadDisponible());        
`


const testIngredienteRegistrarVenta2 = () => `
int b = ((int)(Math.random()*1000))%1000;
int a = 0;
Ingrediente ingrediente = null;

for(int i=0; i< ingredientes.length; i++){
    ingrediente = ingredientes[i];
    a = ingrediente.getCantidadDisponible();
    ingrediente.registrarVenta(b);
    assertEquals(a-b, ingrediente.getCantidadDisponible());
}

`

const testIngredienteRegistrarCompra2 = () => `
int a = ((int)(Math.random()*1000))%1000 + 1;
int b =  ((int)(Math.random()*1000))%100 + 1;
int x = 0, y = 0;
Ingrediente ingrediente = null;

for(int i=0; i< ingredientes.length; i++){
    ingrediente = ingredientes[i];
    x = ingrediente.getPrecioCompra();
    y = ingrediente.getCantidadDisponible();

    ingrediente.registrarCompra(a, x + a/b);
    assertEquals(x + a/b, ingrediente.getPrecioCompra());

    ingrediente.registrarCompra(a, x + a/b);
    assertEquals(x + a/b, ingrediente.getPrecioCompra());

    ingrediente.registrarCompra(a, x - a/b);
    assertEquals(x + a/b, ingrediente.getPrecioCompra());

    assertEquals(y + 3*a, ingrediente.getCantidadDisponible());                 
}

`


const testIngredienteEquals = () => `
Fruta fruta1 = new Fruta("mora", 1, 1);
Fruta fruta2 = new Fruta("mora", 1, 1);
assertEquals(true, fruta1.equals(fruta2));
Proteina proteina1 = new Proteina("mora", 1, 1);
assertEquals(false, fruta1.equals(proteina1));
Grano grano1 = new Grano("mora", 1, 1);
assertEquals(false, fruta1.equals(grano1));
Almidon almidon1 = new Almidon("mora", 1, 1);
assertEquals(false, fruta1.equals(almidon1));
`

const testAlmuerzoConstructor = () => `
Restaurante r = new Restaurante();
ArrayList <Ingrediente> ing = new ArrayList<Ingrediente>();
for(int i=0;i<ingredientes.length;i++) ing.add(ingredientes[i]);
r.setIngredientes(ing);
Almuerzo a = new Almuerzo(r, "Papaya", "Carne de Res", "Lenteja", "Papa Negra");
assertEquals(precios[0], a.getPrecioVenta());
`


const testAlmuerzoPrecioVenta = () => `
Restaurante r = new Restaurante();
ArrayList <Ingrediente> ing = new ArrayList<Ingrediente>();
for(int i=0;i<ingredientes.length;i++) ing.add(ingredientes[i]);
r.setIngredientes(ing);

Almuerzo a = null;
int m = 0;
for(int i=0; i<=4; i++){
    for(int j=5; j<=9; j++){
        for(int k=10; k<=14; k++){
            for(int l=15;l<19;l++){
                a = new Almuerzo(r, ingredientes[i].getNombre(), 
                    ingredientes[j].getNombre(), 
                    ingredientes[k].getNombre(),
                    ingredientes[l].getNombre());
                assertEquals(precios[m++], a.getPrecioVenta());
            }
        }
    }
}
`


const testAlmuerzoSePuedePrepararYRegistrarVenta = () => `
Restaurante r = new Restaurante();
ArrayList <Ingrediente> ing = new ArrayList<Ingrediente>();
for(int i=0;i<ingredientes.length;i++) ing.add(ingredientes[i]);
r.setIngredientes(ing);

Almuerzo a = null;
int m = 0;
for(int i=0; i<=4; i++){
    for(int j=5; j<=9; j++){
        for(int k=10; k<=14; k++){
            for(int l=15;l<19;l++){
                a = new Almuerzo(r, ingredientes[i].getNombre(), 
                    ingredientes[j].getNombre(), 
                    ingredientes[k].getNombre(),
                    ingredientes[l].getNombre());
                assertEquals(puede[m++], a.sePuedePreparar());
                a.registrarVenta();
            }
        }
    }
}
`


const testRestauranteGetNombres = () => `
Restaurante r = new Restaurante();
String [] s = null;
ArrayList <Ingrediente> ing = new ArrayList<Ingrediente>();
for(int i=0;i<ingredientes.length;i++) ing.add(ingredientes[i]);
r.setIngredientes(ing);

s = r.getNombresFrutas();
assertNotNull(s);
for(int i=0; i<=4; i++){
  assertEquals(ingredientes[i].getNombre(), s[i]);
}
s = null;

s = r.getNombresProteinas();
assertNotNull(s);        
for(int j=5, i=0; j<=9; j++, i++){
   assertEquals(ingredientes[j].getNombre(), s[i]);
}
s = null;

s = r.getNombresGranos();
assertNotNull(s);        
for(int k=10, i=0; k<=14; k++,i++){
    assertEquals(ingredientes[k].getNombre(), s[i]);            
}
s = null;

s = r.getNombresAlmidones();
assertNotNull(s);                
for(int l=15, i=0;l<19;l++, i++){
    assertEquals(ingredientes[l].getNombre(), s[i]);
}
s = null;
`


const testRestauranteBuscar = () => `
Restaurante r = new Restaurante();
String [] s = null;
ArrayList <Ingrediente> ing = new ArrayList<Ingrediente>();
for(int i=0;i<ingredientes.length;i++) ing.add(ingredientes[i]);
r.setIngredientes(ing);

Ingrediente ingrediente = null;

for(int i=0; i<=4; i++){
  ingrediente = r.buscarIngrediente(ingredientes[i].getNombre());
  assertNotNull(ingrediente);
}


for(int j=5, i=0; j<=9; j++, i++){
  ingrediente = r.buscarIngrediente(ingredientes[j].getNombre());
  assertNotNull(ingrediente);
}

for(int k=10, i=0; k<=14; k++,i++){
  ingrediente = r.buscarIngrediente(ingredientes[k].getNombre());
  assertNotNull(ingrediente);
}

for(int l=15, i=0;l<19;l++, i++){
  ingrediente = r.buscarIngrediente(ingredientes[l].getNombre());
  assertNotNull(ingrediente);
}

`


Test.test_cases = [
    getDataFromFunction(testIngredienteRegistrarVenta1,     10),
    getDataFromFunction(testIngredienteRegistrarCompra1,    10),
    getDataFromFunction(testIngredienteRegistrarVenta2,     10),
    getDataFromFunction(testIngredienteRegistrarCompra2,    10),
    getDataFromFunction(testIngredienteEquals,              10),
    getDataFromFunction(testAlmuerzoConstructor,            10),
    getDataFromFunction(testAlmuerzoPrecioVenta,            10),
    getDataFromFunction(testAlmuerzoSePuedePrepararYRegistrarVenta, 10),
    getDataFromFunction(testRestauranteGetNombres, 10),
    getDataFromFunction(testRestauranteBuscar, 10),
]

module.exports = Test
