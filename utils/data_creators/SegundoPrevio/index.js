
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Reto Ejemplo Segundo Previo')

const TestLaunchMachine = require('./TestLaunchMachine')
project.tests.push(TestLaunchMachine)
console.log("done, wrote at: ", exportJson(__dirname, project))

