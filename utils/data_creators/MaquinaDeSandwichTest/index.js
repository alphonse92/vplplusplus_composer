
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Tarea 11 - Máquina de Sandwich Reloaded')

const Test = require('./MaquinaSandwichTest')

project.tests.push(Test)

console.log("done, wrote at: ", exportJson(__dirname, project))

