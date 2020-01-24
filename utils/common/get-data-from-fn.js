const createTestCase = require('./create-test-case-schema')
module.exports = (fn, grade) => {
  const name = fn.name;
  const code = fn();
  return createTestCase(name, code, grade)
}