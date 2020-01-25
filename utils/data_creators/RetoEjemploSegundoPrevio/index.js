
const createProject = require('../../common/create-project-schema')
const exportJson = require('../../common/create-schema')
const project = createProject('Segundo Previo')

const Test1 = require('./Test1')
project.tests.push(Test1)
project.tests.push(Test2)
project.tests.push(Test3)

console.log("done, wrote at: ", exportJson(__dirname, project))

