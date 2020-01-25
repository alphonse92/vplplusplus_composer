
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Otro Reto para estudiar Segundo Previo')

const CampeonatoTest = require('./CampeonatoTest')
const EquipoTest = require('./EquipoTest')
const PartidoTest = require('./PartidoTest')

project.tests.push(CampeonatoTest)
project.tests.push(EquipoTest)
project.tests.push(PartidoTest)


console.log("done, wrote at: ", exportJson(__dirname, project))

