
const { ss } = window

const REPORTE_CONTAINER_ID = 'reporte-container'
const container = document.getElementById(REPORTE_CONTAINER_ID)
const extractData = ({ name, dataset }, id) => {
  const metadata = dataset
    .reduce((acc, studentData) => {
      const {
        grade: studentGrade = 0,
        entregas = 0,
      } = studentData
      acc.gradeTotal += studentGrade
      acc.entregas += entregas
      acc.id = id
      acc.numeroDeNoParticipantes += entregas ? 0 : 1
      acc.totalParticipantes += entregas ? 1 : 0
      acc.totalEstudiantes++
      return acc
    }, { gradeTotal: 0, entregas: 0, numeroDeNoParticipantes: 0, totalParticipantes: 0, totalEstudiantes: 0 })

  metadata.gradeAVG = metadata.gradeTotal / metadata.totalParticipantes
  metadata.intentosAVG = metadata.entregas / metadata.totalParticipantes

  return {
    id,
    name,
    label: name,
    metadata,
    data: dataset
  }
}
const getHtmlReportForActivity = (data, idx) => getHtmlForActivity(data)
const getHtmlForActivity = (activityReport) => {
  const { label, name, data, metadata, id } = activityReport
  const graphId = `graph-${id}`
  return `
<div id="${id}" class="row">
    <h2>${name}</h2>
    <div class="col-md-6">
      <canvas id="${graphId}"></canvas>
    </div>
</div>
`
}

const raw_data = [
  { "name": "Tarea 1 - Ejercicio 8 - Casa de Cambio Tio Rico VPL", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 1, "entrego": true }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 4, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 23, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 96, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 28, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 13, "grade": 92, "calificado": true, "entrego": true }] }
  , { "name": "Tarea 1 - Ejercicio 10 - Máquina Cafetera VPL", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 4, "grade": 85, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 2, "grade": 55, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 1, "entrego": true }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 15, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 41, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 1, "grade": 85, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 1, "grade": 55, "calificado": true, "entrego": true }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 55, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 14, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 38, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 17, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }] }
  , { "name": "Tarea 5 - Calculadora de Fraccionarios en VPL", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 4, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 9, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 5, "grade": 0, "calificado": true, "entrego": true }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }] }

  , { "name": "Tarea 8 - Calculadora de Horas", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 6, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 1, "grade": 0, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 2, "grade": 50, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 1, "grade": 60, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 52, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 8, "grade": 40, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 4, "grade": 50, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 3, "grade": 60, "calificado": true, "entrego": true }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 2, "grade": 20, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 9, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 6, "entrego": true }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }] }
  , { "name": "Tarea 11 - Máquina de Sandwich Reloaded", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 4, "grade": 88, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 2, "grade": 88, "calificado": true, "entrego": true }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 67, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 6, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 4, "grade": 88, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 10, "grade": 30, "calificado": true, "entrego": true }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }] }
  , { "name": "Quiz Trabajo en Clase", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Juan Celis", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Alejandro Contreras", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Brayan García", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 4, "grade": 95, "calificado": true, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 33, "grade": 37, "calificado": true, "entrego": true }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }] }

  , { "name": "Reto Ejemplo Segundo Previo", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 4, "grade": 92, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 81, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 2, "grade": 53, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 6, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 4, "grade": 97, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 7, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 2, "grade": 57, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 2, "grade": 89, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 2, "grade": 76, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "HAROLD RUEDA", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 2, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }] }
  , { "name": "Otro Reto para estudiar Segundo Previo", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 12, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 6, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 1, "grade": 60, "calificado": true, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 1, "grade": 60, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 1, "grade": 70, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 2, "grade": 70, "calificado": true, "entrego": true }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 1, "grade": 50, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 1, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "HAROLD RUEDA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 3, "grade": 30, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }] }
  , { "name": "Segundo Previo", "dataset": [{ "nombre": "MARLON PRADO 1151914", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN SANCHEZ 1151917", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "FELIPE ALFEREZ 1151902", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "OSCAR BAYONA - 1151906", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "JULIAN ANDRES BECERRA VEGA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JESUS SEBASTIAN BERMON BERMUDEZ-1151900", "entregas": 4, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Angelica Maria Barrientos Vera", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Fernando Bayona 1151948", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "BRAYAN ALEXANDER CAMARGO ALEAN", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "KEVIN ANDRES CARRERO CASTRO - 1151935", "entregas": 2, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "JESUS DAVID - 1151911 CASTRO QUINTERO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CARLOS CONTRERAS MENDOZA-1151903", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "Juan Celis", "entregas": 1, "entrego": true }, { "nombre": "Alejandro Contreras", "entregas": 1, "entrego": true }, { "nombre": "ANGELY VANESSA GELVEZ MENDOZA -1151899", "entregas": 4, "entrego": true }, { "nombre": "GINO AMAURY GONGORA CAPACHO", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "CRISTHIAN LEONARDO GONZALEZ REYES", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "JHONNY GUARIN- 1151893", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "GEDERSON GUSTAVO GUZMAN BOTELLO - 1151905", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "Brayan García", "entregas": 1, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "Yorman Godoy", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDNA GLADYS JOYA DURAN ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ANAMARIA ALEJANDRA LOPEZ GARCIA", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "EDINSSON ALEXIS MONTOYA CUADROS - 1151901", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "BRYAN ALEXANDER NIÑO LOPEZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "SAMIR ENRIQUE ORTEGA FLOREZ", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "ADRIAN YESID - 1151897 ORTIZ MOLINA", "entregas": 2, "entrego": true }, { "nombre": "JAVIER ALONSO PARADA CABALLERO - 1151907", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JHOAN CAMILO PEREZ PALACIOS", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 3, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "Johnny Alexander Quintero Reyes", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MONICA REYES 1151684", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "MARIA FERNANDA RIVERA ESPINEL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "OSCAR DIEGO RODRIGUEZ ORDUZ", "entregas": 1, "entrego": true }, { "nombre": "HAROLD RUEDA", "entregas": 1, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "fabian Reyes Gonzalez", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Paula Valentina Rico Lindarte", "entregas": 2, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "DANIELA JULIANA SANCHEZ BAYONA", "entregas": 1, "grade": 100, "calificado": true, "entrego": true }, { "nombre": "JEFFERSON MAURICIO SANCHEZ PICON-1151895", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "YONER ARBEY SILVA LEAL", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "NEIDER JOAN SIMARRA-1151896", "entregas": 2, "grade": 90, "calificado": true, "entrego": true }, { "nombre": "Sebastian Sánchez - 1151771", "entregas": 0, "grade": 0, "calificado": true, "entrego": false }, { "nombre": "Cristian Torrez - 1151941", "entregas": 3, "grade": 20, "calificado": true, "entrego": true }, { "nombre": "ALEJANDRO URBINA SUAREZ - 1151894", "entregas": 2, "grade": 80, "calificado": true, "entrego": true }, { "nombre": "GENESIS DANIELA VARGAS JAUREGUI", "entregas": 5, "grade": 100, "calificado": true, "entrego": true }] }
]



const datasets = raw_data.map(extractData)
const appendToContainer = html => container.innerHTML += html


const showActivityReportGraphs = activityReport => {
  const { id } = activityReport
  const ctx = document.getElementById('graph-' + id);
  const myChart = new Chart(ctx, {
    type: 'bar',
    data: {
      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
      datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        backgroundColor: [
          'rgba(255, 99, 132, 0.2)',
          'rgba(54, 162, 235, 0.2)',
          'rgba(255, 206, 86, 0.2)',
          'rgba(75, 192, 192, 0.2)',
          'rgba(153, 102, 255, 0.2)',
          'rgba(255, 159, 64, 0.2)'
        ],
        borderColor: [
          'rgba(255, 99, 132, 1)',
          'rgba(54, 162, 235, 1)',
          'rgba(255, 206, 86, 1)',
          'rgba(75, 192, 192, 1)',
          'rgba(153, 102, 255, 1)',
          'rgba(255, 159, 64, 1)'
        ],
        borderWidth: 1
      }]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: true
          }
        }]
      }
    }
  });

}



const getLinedataset = (size, value) => Array.from(new Array(size)).map(() => value)
const getDesviacionEstandar = (data) => {
  const promedio = ss.mean(data)
  const desviacion = ss.standardDeviation(data)
  const max = promedio + desviacion
  const min = promedio - desviacion

  const size = data.length
  const max_linepoints = getLinedataset(size, max)
  const min_linepoints = getLinedataset(size, min)
  const promedio_linepoints = getLinedataset(size, promedio)

  return {
    promedio, desviacion, max, min,
    max_linepoints, min_linepoints, promedio_linepoints
  }
}

const drawHtmlTableForGraph = (id, data, desviacionData) => {
  const { promedio, desviacion, max, min } = desviacionData
  const desviacionTable = `
  <table>
    <tbody>
      <tr>
        <td>Promedio</td>
        <td>${promedio.toFixed(2)}</td>
      </tr>
      <tr>
        <td>Punto máximo</td>
        <td>${ss.max(data).toFixed(2)}</td>
      </tr>
      <tr>
        <td>Punto Mínimo</td>
        <td>${ss.min(data).toFixed(2)}</td>
      </tr>
      <tr>
        <td>Desviacion estandar</td>
        <td>${desviacion.toFixed(2)}</td>
        </tr>
      <tr>
        <td>Límite máximo</td>
        <td>${max.toFixed(2)}</td>
      </tr>
      <tr>
        <td>Límite mínimo</td>
        <td>${min.toFixed(2)}</td>
      </tr>
    </tbody>
  </table>
`
  document.getElementById(id).innerHTML = desviacionTable


}

const getChartJsDatasetForDesviacion = (label, data) => {
  return {
    label,
    data,
    borderColor: 'rgb(0,0,0,0.5)',
    backgroundColor: 'rgb(201, 203, 207,0)',
    borderWidth: 1,
    lineTension: 0
  }
}

const loadGradeGraph = datasets => {
  const idGraph = 'g-along-time'
  const ctx = document.getElementById(idGraph);
  const labels = datasets.map(({ label }) => label.slice(0, 25) + "...")
  const data = datasets.map(({ metadata }) => metadata.gradeAVG)
  const desviacion = getDesviacionEstandar(data)
  const { max_linepoints, min_linepoints, promedio_linepoints } = desviacion

  drawHtmlTableForGraph('t-along-time', data, desviacion)

  const myChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels,
      datasets: [
        {
          label: "Variación de la calificación promedio",
          data,
          borderColor: window.chartColors.red,
          backgroundColor: window.chartColors.red,
          borderWidth: 1,
          lineTension: 0
        },
        { ...getChartJsDatasetForDesviacion('Limite máximo', max_linepoints) },
        { ...getChartJsDatasetForDesviacion('Limite minimo', min_linepoints) },
        { ...getChartJsDatasetForDesviacion('Promedio', promedio_linepoints) },
      ]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: true
          }
        }]
      }
    }
  });
}

const loadAttempsGraph = datasets => {
  const id = 'g-intentos-along-time'
  const ctx = document.getElementById(id);
  const labels = datasets.map(({ label }) => label.slice(0, 25) + "...")
  const data = datasets.map(({ metadata }) => metadata.intentosAVG)
  const desviacion = getDesviacionEstandar(data)
  const { max_linepoints, min_linepoints, promedio_linepoints } = desviacion

  drawHtmlTableForGraph('t-intentos-along-time', data, desviacion)

  const myChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels,
      datasets: [{
        label: "Variación de los intentos promedio",
        data,
        borderColor: window.chartColors.blue,
        backgroundColor: window.chartColors.blue,
        borderWidth: 1,
        lineTension: 0
      },
      { ...getChartJsDatasetForDesviacion('Limite máximo', max_linepoints) },
      { ...getChartJsDatasetForDesviacion('Limite minimo', min_linepoints) },
      { ...getChartJsDatasetForDesviacion('Promedio', promedio_linepoints) },
      ]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: true
          }
        }]
      }
    }
  });
}
const loadParticipantesGraph = datasets => {
  const id = 'g-participantes-along-time'
  const ctx = document.getElementById(id);
  const labels = datasets.map(({ label }) => label.slice(0, 25) + "...")
  const data = datasets.map(({ metadata }) => metadata.totalParticipantes)
  const desviacion = getDesviacionEstandar(data)
  const { max_linepoints, min_linepoints, promedio_linepoints } = desviacion

  drawHtmlTableForGraph('t-participantes-along-time', data, desviacion)

  const myChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels,
      datasets: [{
        label: "Cantidad de participantes",
        data,
        borderColor: window.chartColors.green,
        backgroundColor: window.chartColors.green,
        borderWidth: 1,
        lineTension: 0
      },
      { ...getChartJsDatasetForDesviacion('Limite máximo', max_linepoints) },
      { ...getChartJsDatasetForDesviacion('Limite minimo', min_linepoints) },
      { ...getChartJsDatasetForDesviacion('Promedio', promedio_linepoints) },
      ]
    },
    options: {
      scales: {
        yAxes: [{
          ticks: {
            beginAtZero: true
          }
        }]
      }
    }
  });
}
// datasets.map(getHtmlReportForActivity).forEach(appendToContainer)
// datasets.forEach(showActivityReportGraphs)
const totalEntregas = datasets.reduce((acc, { metadata }) => acc += metadata.entregas, 0)
console.log({ datasets, totalEntregas })
loadGradeGraph(datasets)
loadAttempsGraph(datasets)
loadParticipantesGraph(datasets)