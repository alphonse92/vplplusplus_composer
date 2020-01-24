const createTest = require('../../common/create-test-schema')
const getDataFromFunction = require('../../common/get-data-from-fn')
const TEST_NAME = "HoraTest"

const Test = createTest(TEST_NAME, `

private Hora [ ] horasHH24A;
private Hora [ ] horasHH12A;
private Hora [ ] horasHH24B;
private Hora [ ] horasHH12B;

public ${TEST_NAME}(){}

@Before
public void setUp(){}

@After
public void tearDown(){}

private void testConstructor4ampm(String ampm){
  Hora hora = null;
  Exception e = null;
  int s = 0, m = 0;
  for(int h = 1; h<=12; h++){
      s = ((int)(Math.random()*1000))%60;
      m = ((int)(Math.random()*1000))%60;
      hora = new Hora(h, m, s, ampm);
      assertEquals(h, hora.getHoras());
      assertEquals(m, hora.getMinutos());
      assertEquals(s, hora.getSegundos());
      assertEquals(Hora.HH12, hora.getFormato());
      assertEquals(ampm, hora.getAmpm());
      assertEquals(true, hora.esHoraValida());
  }
  
  hora = new Hora(1, 1, 1, "ERR");
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(1, 1, 1, null);
  assertEquals(false, hora.esHoraValida());
}

private void testConstructor4Errampm(String ampm){
  Exception e = null;
  Hora hora = null;
  
  hora = new Hora(0, 0, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(13, 0, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(31, 0, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(-1, 0, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, 60, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, 71, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, -1, 0, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, 0, 60, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, 0, 71, ampm);
  assertEquals(false, hora.esHoraValida());

  hora = new Hora(0, 0, -1, ampm);
  assertEquals(false, hora.esHoraValida());
}

public void testHoraConstructor5HH24(String ampm)
    {
        Exception e = null;
        Hora hora = null;
        int s = 0, m = 0;
        for(int h = 0; h<=23; h++){
            s = ((int)(Math.random()*1000))%60;
            m = ((int)(Math.random()*1000))%60;
            hora = new Hora(h, m, s, Hora.HH24, ampm);
            assertEquals(h, hora.getHoras());
            assertEquals(m, hora.getMinutos());
            assertEquals(s, hora.getSegundos());
            assertEquals(Hora.HH24, hora.getFormato());
            assertNull(hora.getAmpm());
            assertEquals(true, hora.esHoraValida());
        }

        hora = new Hora(24, 0, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(31, 0, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(-1, 0, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 60, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 71, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, -1, 0, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, 60, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, 71, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, -1, Hora.HH24, ampm);
        assertEquals(false, hora.esHoraValida());

    }

    private void testConstructor5ampm(String ampm){
        Hora hora = null;
        int s = 0, m = 0;
        for(int h = 1; h<=12; h++){
            s = ((int)(Math.random()*1000))%60;
            m = ((int)(Math.random()*1000))%60;
            hora = new Hora(h, m, s, Hora.HH12, ampm);
            assertEquals(h, hora.getHoras());
            assertEquals(m, hora.getMinutos());
            assertEquals(s, hora.getSegundos());
            assertEquals(Hora.HH12, hora.getFormato());
            assertEquals(ampm, hora.getAmpm());
            assertEquals(true, hora.esHoraValida());
        }

    }

    private void testConstructor5Errampm(String ampm){
        Exception e = null;
        Hora hora = null;

        hora = new Hora(0, 0, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(13, 0, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(31, 0, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(-1, 0, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 60, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 71, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, -1, 0, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, 60, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, 71, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());

        hora = new Hora(0, 0, -1, Hora.HH12, ampm);
        assertEquals(false, hora.esHoraValida());
    }

    private void crearHorasTestSonIguales(){
        horasHH24A = new Hora[24];
        horasHH12A = new Hora[24];

        horasHH24B = new Hora[24];
        horasHH12B = new Hora[24];

        int s = ((int)(Math.random()*1000))%60;
        int m = ((int)(Math.random()*1000))%60;

        for(int h = 0; h<24; h++){
            horasHH24A[h] = new Hora(h,m,s);
            horasHH24B[h] = new Hora(h,m,s);
        }

        horasHH12A[0] = new Hora(12,m,s, Hora.AM);
        horasHH12B[0] = new Hora(12,m,s, Hora.AM);
        horasHH12A[12] = new Hora(12,m,s, Hora.PM);
        horasHH12B[12] = new Hora(12,m,s, Hora.PM);
        for(int h = 1; h<=11; h++){
            horasHH12A[h] = new Hora(h,m,s, Hora.AM);
            horasHH12B[h] = new Hora(h,m,s, Hora.AM);
            horasHH12A[h+12] = new Hora(h,m,s, Hora.PM);
            horasHH12B[h+12] = new Hora(h,m,s, Hora.PM);
        }
    }

    public void testHoraToString()
    {
        Hora hora1 = null;
        for(int i=1; i<=9;i++){
            hora1 = new Hora(i, i, i);
            assertEquals("0" + i + ":0" + i + ":0" + i, hora1.toString());
        }
        for(int i=10; i<=12;i++){
            hora1 = new Hora(i, i, i);
            assertEquals(i + ":" + i + ":" + i, hora1.toString());
        }
        
        for(int i=1; i<=9;i++){
            hora1 = new Hora(i, i, i, Hora.AM);
            assertEquals("0" + i + ":0" + i + ":0" + i + " a.m.", hora1.toString());
        }
        for(int i=10; i<=12;i++){
            hora1 = new Hora(i, i, i, Hora.AM);
            assertEquals(i + ":" + i + ":" + i + " a.m.", hora1.toString());
        }
        
        for(int i=1; i<=9;i++){
            hora1 = new Hora(i, i, i, Hora.PM);
            assertEquals("0" + i + ":0" + i + ":0" + i + " p.m.", hora1.toString());
        }
        for(int i=10; i<=12;i++){
            hora1 = new Hora(i, i, i, Hora.PM);
            assertEquals(i + ":" + i + ":" + i + " p.m.", hora1.toString());
        }
    }

`)




const testHoraConstructor1 = () => `
Hora hora = new Hora();
assertEquals("getHoras", 12, hora.getHoras());
assertEquals("getMinutos", 0, hora.getMinutos());
assertEquals("getSegundos", 0, hora.getSegundos());
assertEquals("getAmpm", Hora.AM, hora.getAmpm());
assertEquals("esHoraValida", true, hora.esHoraValida());
`


const testHoraConstructor2 = () => `
Hora hora = new Hora(Hora.HH12);
assertEquals(12, hora.getHoras());
assertEquals(0, hora.getMinutos());
assertEquals(0, hora.getSegundos());
assertEquals(Hora.AM, hora.getAmpm());
assertEquals(Hora.HH12, hora.getFormato());
assertEquals(true, hora.esHoraValida());

hora = new Hora(Hora.HH24);
assertEquals(0, hora.getHoras());
assertEquals(0, hora.getMinutos());
assertEquals(0, hora.getSegundos());
assertEquals(Hora.HH24, hora.getFormato());
assertNull(hora.getAmpm());
assertEquals(true, hora.esHoraValida());

hora = new Hora("ERR");
assertEquals(false, hora.esHoraValida());

hora = new Hora(null);
assertEquals(false, hora.esHoraValida());
`


const testHoraConstructor3 = () => `
Exception e = null;
Hora hora = null;
int s = 0, m = 0;
for(int h = 0; h<=23; h++){
    s = ((int)(Math.random()*1000))%60;
    m = ((int)(Math.random()*1000))%60;
    hora = new Hora(h, m, s);
    assertEquals(h, hora.getHoras());
    assertEquals(m, hora.getMinutos());
    assertEquals(s, hora.getSegundos());
    assertEquals(Hora.HH24, hora.getFormato());
    assertNull(hora.getAmpm());
    assertEquals(true, hora.esHoraValida());
}

hora = new Hora(24, 0, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(31, 0, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(-1, 0, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, 60, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, 71, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, -1, 0);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, 0, 60);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, 0, 71);
assertEquals(false, hora.esHoraValida());

hora = new Hora(0, 0, -1);
assertEquals(false, hora.esHoraValida());

`


const testHoraConstructor4 = () => `
testConstructor4ampm(Hora.AM);
testConstructor4ampm(Hora.PM);
testConstructor4Errampm(Hora.AM);
testConstructor4Errampm(Hora.PM);
`


const testHoraConstructor5 = () => `
Exception e = null;
Hora hora = null;
testHoraConstructor5HH24(Hora.AM);
testHoraConstructor5HH24(Hora.PM);
testHoraConstructor5HH24(null);

testConstructor5ampm(Hora.AM);
testConstructor5ampm(Hora.PM);
testConstructor5Errampm(Hora.AM);
testConstructor5Errampm(Hora.PM);      

hora = new Hora(1, 1, 1, "ERR", null);
assertEquals(false, hora.esHoraValida());

hora = new Hora(1, 1, 1, null, null);
assertEquals(false, hora.esHoraValida());

hora = new Hora(1, 1, 1, Hora.HH12, "ERR");
assertEquals(false, hora.esHoraValida());

hora = new Hora(1, 1, 1, Hora.HH12, null);
assertEquals(false, hora.esHoraValida());
`


const testHoraSonIguales = () => `
Hora tmpHH24 = null, tmpHH12 = null;
crearHorasTestSonIguales();

for(int i=0; i<24;i++){ 
    assertEquals(true, horasHH24A[i].esIgual(horasHH24B[i]));
    assertEquals(true, horasHH24B[i].esIgual(horasHH24A[i]));

    assertEquals(true, horasHH12A[i].esIgual(horasHH12B[i]));
    assertEquals(true, horasHH12B[i].esIgual(horasHH12A[i]));

    assertEquals(true, horasHH12A[i].esIgual(horasHH24A[i]));
    assertEquals(true, horasHH24A[i].esIgual(horasHH12A[i]));

    assertEquals(false, horasHH24A[23-i].esIgual(horasHH24A[i]));

    assertEquals(false, horasHH12A[23-i].esIgual(horasHH12A[i]));

    assertEquals(false, horasHH12A[23-i].esIgual(horasHH24A[i]));

    assertEquals(false, horasHH24A[23-i].esIgual(horasHH12A[i]));

    tmpHH24 = new Hora(horasHH24A[i].horas, (horasHH24A[i].minutos + 1)%60, (horasHH24A[i].segundos + 1)%60);
    tmpHH12 = new Hora(horasHH12A[i].horas, (horasHH12A[i].minutos + 1)%60, (horasHH12A[i].segundos + 1)%60);

    assertEquals(false,horasHH24A[i].esIgual(tmpHH24));
    assertEquals(false,horasHH12A[i].esIgual(tmpHH12));
    assertEquals(false,horasHH12A[i].esIgual(tmpHH24));
    assertEquals(false,horasHH24A[i].esIgual(tmpHH12));
}
`


const testHoraEsMenor = () => `
Hora hora1 = null, hora2 = null;
int h1=0, h2=0, m1=0, m2=0, s1=0, s2=0;

//Casos HH24 HH24        
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%24;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%24;}while(h2==h1);

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m1,s2);
assertEquals(s1<s2, hora1.esMenor(hora2));
assertEquals(!(s1<s2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m2,s1);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m2,s2);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h2,m2,s2);
assertEquals(h1<h2, hora1.esMenor(hora2));
assertEquals(!(h1<h2), hora2.esMenor(hora1));

//Casos HH12 HH12 AM y PM
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%13; h1=h1==0?12:h1;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%13; h2=h2==0?12:h2;}while(h2==h1);

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m1,s2, Hora.AM);
assertEquals(s1<s2, hora1.esMenor(hora2));
assertEquals(!(s1<s2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m1,s2, Hora.PM);
assertEquals(s1<s2, hora1.esMenor(hora2));
assertEquals(!(s1<s2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m2,s1, Hora.AM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m2,s1, Hora.PM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m2,s2, Hora.AM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m2,s2, Hora.PM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h2,m2,s2, Hora.AM);
assertEquals(h1==12 || h2!=12 && h1<h2, hora1.esMenor(hora2));
assertEquals(!(h1==12 || h2!=12 && h1<h2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h2,m2,s2, Hora.PM);
assertEquals(h1==12 || h2!=12 && h1<h2, hora1.esMenor(hora2));
assertEquals(!(h1==12 || h2!=12 && h1<h2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m1,s1, Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h2,m2,s2, Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(12,0,0, Hora.AM);
hora2 = new Hora(12,0,0, Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

//Casos HH24 y HH12
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%24;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%24;}while(h2==h1);

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m1,s2, h1<12 ? Hora.AM : Hora.PM);
assertEquals(s1<s2, hora1.esMenor(hora2));
assertEquals(!(s1<s2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m2,s1, h1<12 ? Hora.AM : Hora.PM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m2,s2, h1<12 ? Hora.AM : Hora.PM);
assertEquals(m1<m2, hora1.esMenor(hora2));
assertEquals(!(m1<m2), hora2.esMenor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h2==0?12:h2>12?h2-12:h2,m2,s2, h2<12 ? Hora.AM : Hora.PM);
assertEquals(h1<h2, hora1.esMenor(hora2));
assertEquals(!(h1<h2), hora2.esMenor(hora1));

hora1 = new Hora(0,0,0);
hora2 = new Hora(5,5,5,Hora.AM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(0,0,0);
hora2 = new Hora(5,5,5,Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(5,5,5);
hora2 = new Hora(5,5,5,Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(12,0,0);
hora2 = new Hora(5,5,5,Hora.AM);
assertEquals(false, hora1.esMenor(hora2));
assertEquals(true, hora2.esMenor(hora1));

hora1 = new Hora(12,0,0);
hora2 = new Hora(0,0,0);
assertEquals(false, hora1.esMenor(hora2));
assertEquals(true, hora2.esMenor(hora1));

hora1 = new Hora(0,0,0);
hora2 = new Hora(12,0,0, Hora.PM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));

hora1 = new Hora(12,0,0, Hora.AM);
hora2 = new Hora(5,0,0, Hora.AM);
assertEquals(true, hora1.esMenor(hora2));
assertEquals(false, hora2.esMenor(hora1));
`


const testHoraEsMayor = () => `
Hora hora1 = null, hora2 = null;
int h1=0, h2=0, m1=0, m2=0, s1=0, s2=0;

//Casos HH24 HH24        
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%24;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%24;}while(h2==h1);

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m1,s2);
assertEquals(s1>s2, hora1.esMayor(hora2));
assertEquals(!(s1>s2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m2,s1);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1,m2,s2);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h2,m2,s2);
assertEquals(h1>h2, hora1.esMayor(hora2));
assertEquals(!(h1>h2), hora2.esMayor(hora1));

//Casos HH12 HH12 AM y PM
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%13; h1=h1==0?12:h1;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%13; h2=h2==0?12:h2;}while(h2==h1);

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m1,s2, Hora.AM);
assertEquals(s1>s2, hora1.esMayor(hora2));
assertEquals(!(s1>s2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m1,s2, Hora.PM);
assertEquals(s1>s2, hora1.esMayor(hora2));
assertEquals(!(s1>s2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m2,s1, Hora.AM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m2,s1, Hora.PM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m2,s2, Hora.AM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h1,m2,s2, Hora.PM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h2,m2,s2, Hora.AM);
assertEquals(!(h1==12 || h2!=12 && h1<h2), hora1.esMayor(hora2));
assertEquals(h1==12 || h2!=12 && h1<h2, hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.PM);
hora2 = new Hora(h2,m2,s2, Hora.PM);
assertEquals(!(h1==12 || h2!=12 && h1<h2), hora1.esMayor(hora2));
assertEquals(h1==12 || h2!=12 && h1<h2, hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h1,m1,s1, Hora.PM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1, Hora.AM);
hora2 = new Hora(h2,m2,s2, Hora.PM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

hora1 = new Hora(12,0,0, Hora.AM);
hora2 = new Hora(12,0,0, Hora.PM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

//Casos HH24 y HH12
s1 = ((int)(Math.random()*1000))%60;
m1 = ((int)(Math.random()*1000))%60;
h1 = ((int)(Math.random()*1000))%24;
do{s2 = ((int)(s1 + Math.random()*1000))%60;}while(s2==s1);
do{m2 = ((int)(m1 + Math.random()*1000))%60;}while(m2==m1);
do{h2 = ((int)(h1 + Math.random()*1000))%24;}while(h2==h1);

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m1,s2, h1<12 ? Hora.AM : Hora.PM);
assertEquals(s1>s2, hora1.esMayor(hora2));
assertEquals(!(s1>s2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m2,s1, h1<12 ? Hora.AM : Hora.PM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h1==0?12:h1>12?h1-12:h1,m2,s2, h1<12 ? Hora.AM : Hora.PM);
assertEquals(m1>m2, hora1.esMayor(hora2));
assertEquals(!(m1>m2), hora2.esMayor(hora1));

hora1 = new Hora(h1,m1,s1);
hora2 = new Hora(h2==0?12:h2>12?h2-12:h2,m2,s2, h2<12 ? Hora.AM : Hora.PM);
assertEquals(h1>h2, hora1.esMayor(hora2));
assertEquals(!(h1>h2), hora2.esMayor(hora1));

hora1 = new Hora(0,0,0);
hora2 = new Hora(5,5,5,Hora.AM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

hora1 = new Hora(0,0,0);
hora2 = new Hora(5,5,5,Hora.PM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

hora1 = new Hora(5,5,5);
hora2 = new Hora(5,5,5,Hora.PM);
assertEquals(false, hora1.esMayor(hora2));
assertEquals(true, hora2.esMayor(hora1));

hora1 = new Hora(12,0,0);
hora2 = new Hora(5,5,5,Hora.AM);
assertEquals(true, hora1.esMayor(hora2));
assertEquals(false, hora2.esMayor(hora1));

hora1 = new Hora(12,0,0);
hora2 = new Hora(0,0,0);
assertEquals(true, hora1.esMayor(hora2));
assertEquals(false, hora2.esMayor(hora1));

hora1 = new Hora(12,0,0);
hora2 = new Hora(12,0,0, Hora.AM);
assertEquals(true, hora1.esMayor(hora2));
assertEquals(false, hora2.esMayor(hora1));

hora1 = new Hora(12,0,0, Hora.PM);
hora2 = new Hora(5,0,0, Hora.AM);
assertEquals(true, hora1.esMayor(hora2));
assertEquals(false, hora2.esMayor(hora1));
`


const testGetHoraFormato = () => `
Hora hh241=null,hh121=null, tmp=null;

for(int h = 0; h<24; h++){
for(int m = 0; m<60; m++){
  for(int s = 0; s<60; s++){
    hh241 = new Hora(h,m,s);
    hh121 = new Hora(h==0?12:h>12?h-12:h, m,s, h<12?Hora.AM:Hora.PM);
    
    tmp = hh241.getHoraHH24();
    assertEquals(Hora.HH24, tmp.getFormato());
    assertEquals(h, tmp.getHoras());
    assertEquals(m, tmp.getMinutos());
    assertEquals(s, tmp.getSegundos());
    
    tmp = hh121.getHoraHH12();
    assertEquals(Hora.HH12, tmp.getFormato());
    assertEquals(h==0?12:h>12?h-12:h, tmp.getHoras());
    assertEquals(m, tmp.getMinutos());
    assertEquals(s, tmp.getSegundos());
    assertEquals(h<12?Hora.AM:Hora.PM, tmp.getAmpm());
    
    tmp = hh241.getHoraHH12();
    assertEquals(Hora.HH12, tmp.getFormato());
    assertEquals(h==0?12:h>12?h-12:h, tmp.getHoras());
    assertEquals(m, tmp.getMinutos());
    assertEquals(s, tmp.getSegundos());
    assertEquals(h<12?Hora.AM:Hora.PM, tmp.getAmpm());
    
    tmp = hh121.getHoraHH24();
    assertEquals(Hora.HH24, tmp.getFormato());
    assertEquals(h, tmp.getHoras());
    assertEquals(m, tmp.getMinutos());
    assertEquals(s, tmp.getSegundos());
  }
}
}
`


const testHoraRestar = () => `
Hora hora1=null, hora2=null, hora3=null;
int resta = 86399, resta2 = -25627, resta3=-68827;

Hora hora4 = new Hora(7,7,7);
Hora hora5 = new Hora(19,7,7);
Hora hora6 = new Hora(7,7,7, Hora.AM);
Hora hora7 = new Hora(7,7,7, Hora.PM);

horasHH24A = new Hora[86400];
horasHH12A = new Hora[86400];

for(int h = 0; h<24; h++){
for(int m = 0; m<60; m++){
  for(int s = 0; s<60; s++){
    horasHH24A[h*60*60+m*60+s] = new Hora(h,m,s);
    horasHH12A[h*60*60+m*60+s] = new Hora(h==0?12:h>12?h-12:h, m,s, h<12?Hora.AM:Hora.PM);
  }
}
}

for(int i=0; i<86400;i++){
//Caso HH24 - HH24
hora1 = horasHH24A[86399-i];
hora2 = horasHH24A[0];
assertEquals(resta, hora1.restar(hora2));
assertEquals(resta*(-1), hora2.restar(hora1));
assertEquals(0, hora1.restar(hora1));
assertEquals(resta2, horasHH24A[i].restar(hora4));
assertEquals(resta3, horasHH24A[i].restar(hora5));

//Caso HH12 - HH12
hora1 = horasHH12A[86399-i];
hora2 = horasHH12A[0];
assertEquals(resta, hora1.restar(hora2));
assertEquals(resta*(-1), hora2.restar(hora1));
assertEquals(0, hora1.restar(hora1));
assertEquals(resta2, horasHH12A[i].restar(hora6));
assertEquals(resta3, horasHH12A[i].restar(hora7));

//Caso HH24 - HH12
hora1 = horasHH24A[86399-i];
hora2 = horasHH12A[0];
hora3 = horasHH12A[86399-i];
assertEquals(resta, hora1.restar(hora2));
assertEquals(resta*(-1), hora2.restar(hora1));
assertEquals(0, hora1.restar(hora3));
assertEquals(resta2, horasHH24A[i].restar(hora6));
assertEquals(resta3, horasHH24A[i].restar(hora7));

//Caso HH12 - HH24
hora1 = horasHH12A[86399-i];
hora2 = horasHH24A[0];
hora3 = horasHH24A[86399-i];
assertEquals(resta, hora1.restar(hora2));
assertEquals(resta*(-1), hora2.restar(hora1));
assertEquals(0, hora1.restar(hora3));
assertEquals(resta2, horasHH12A[i].restar(hora4));
assertEquals(resta3, horasHH12A[i].restar(hora5));

resta--;
resta2++;
resta3++;
}
`



Test.test_cases = [
  getDataFromFunction(testHoraConstructor1, 2),
  getDataFromFunction(testHoraConstructor2, 2),
  getDataFromFunction(testHoraConstructor3, 2),
  getDataFromFunction(testHoraConstructor4, 2),
  getDataFromFunction(testHoraConstructor5, 2),

  getDataFromFunction(testHoraSonIguales, 2),
  getDataFromFunction(testHoraEsMenor, 2),
  getDataFromFunction(testHoraEsMayor, 2),
  getDataFromFunction(testGetHoraFormato, 2),
  getDataFromFunction(testHoraRestar, 2),
]

module.exports = Test











