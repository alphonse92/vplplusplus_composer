const fs = require('fs');
const pathMuestra = "./entregas/muestras"

const folders = [
  "./entregas/todas/1/Tarea  5 - Calculadora de Fraccionarios en VPL",
  "./entregas/todas/1/Tarea 1 - Ejercicio 8  - Casa de Cambio Tio Rico VPL",
  "./entregas/todas/1/Tarea 1 - Ejercicio 10  - Máquina Cafetera VPL",
  "./entregas/todas/2/Quiz Trabajo en Clase",
  "./entregas/todas/2/Tarea 8 - Calculadora de Horas",
  "./entregas/todas/2/Tarea 11 - Máquina de Sandwich Reloaded",
  "./entregas/todas/3/Otro Reto para estudiar Segundo Previo",
  "./entregas/todas/3/Reto Ejemplo Segundo Previo",
  "./entregas/todas/3/Segundo Previo",
]

const availableStudents = [
  "Quintero Reyes Johnny Alexander 1893",
  "VARGAS JAUREGUI GENESIS DANIELA 2538",
  "SANCHEZ BAYONA DANIELA JULIANA 2626",
]

const isNotAvailableStudent = (accu, filename) => availableStudents.includes(filename)
  ? { keep: accu.keep.concat(filename), remove: accu.remove }
  : { keep: accu.keep, remove: accu.remove.concat(filename) }

const printTheNameOfStudentThatDoesNotSendTheAnswer = student => !availableStudents.includes(student)
  ? console.log(student + " not send answer")
  : false

for (let idx in folders) {
  const folder = folders[idx];
  const files = fs.readdirSync(folder);
  const folderTokens = folder.split("/")
  const folderParts = folderTokens.slice(3, folderTokens.length)
  const [unidad, tarea] = folderParts


  const pathMuestraUnidad = `${pathMuestra}/${unidad}`
  const pathMuestraUnidadTarea = `${pathMuestraUnidad}/${tarea}`

  console.log("UNIDAD: " + unidad + " tarea: " + tarea)
  const { keep, remove } = files.reduce(isNotAvailableStudent, { keep: [], remove: [] })
  console.log(keep)
  for (let idx in keep) {

    const folderPath = pathMuestraUnidadTarea + "/" + keep[idx]

  }

  console.log("\n")


}
