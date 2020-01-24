
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Quiz Trabajo en Clase')

const AlumnoTest = require('./AlmunoTest')
const GrupoTest = require('./GrupoTest')
const InscripcionTest = require('./InscripcionTest')
const MateriaTest = require('./MateriaTest')
const UniversidadTest = require('./UniversidadTest')

project.tests.push(AlumnoTest)
project.tests.push(GrupoTest)
project.tests.push(InscripcionTest)
project.tests.push(MateriaTest)
project.tests.push(UniversidadTest)

console.log("done, wrote at: ", exportJson(__dirname, project))

