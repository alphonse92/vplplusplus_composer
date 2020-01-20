const fs = require('fs');

module.exports = (folder2build,project) => {
  const path2build = folder2build + "/" + project.name + ".json"
  fs.writeFileSync(path2build, JSON.stringify(project, null, 2));
  return path2build
}
