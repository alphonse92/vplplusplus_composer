
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Tarea 8 - Calculadora de horas')

const Test = require('./HoraTest')

project.tests.push(Test)

console.log("done, wrote at: ", exportJson(__dirname, project))

