function getReport() {
  function getRows() {
    return document
      .getElementsByClassName("generaltable")[0]
      .getElementsByTagName("tbody")[0]
      .getElementsByTagName("tr")
  }

  function getGradeFromTd(Td) {
    const div = Td.getElementsByTagName("div")[0]
    if (!div) return { grade: 0, calificado: false }
    const txt = div.innerHTML
    const parts = txt.split("/")
    if (parts.length === 1) return 0
    const grade = +(parts[0].replace(',', '.'))
    return { grade, calificado: true };
  }

  function getStudentFromRow(HtmlRow) {
    const getFields = row => row.getElementsByTagName('td')
    const [a, b, nombreTd, fechaEntrega, entregaTd, calificacionTd, ...etc] = getFields(HtmlRow)
    const entregaLink = entregaTd.getElementsByTagName('a')[0]
    const entregaRowValue = entregaLink ? entregaLink.innerHTML : 0;

    const entregas = !Number.isNaN(entregaRowValue)
      ? +entregaRowValue
      : 0

    const nombre = nombreTd.innerHTML
    const gradeInfo = entregas
      ? getGradeFromTd(calificacionTd)
      : { grade: 0, calificado: true }
    const entrego = !!entregas
    const { grade, calificado } = gradeInfo;
    return { nombre, entregas, grade, calificado, entrego }
  }


  let HtmlCollectionOfRows = getRows();
  let dataset = []
  for (let i in HtmlCollectionOfRows) {
    const HtmlRow = HtmlCollectionOfRows[i]
    if (HtmlRow instanceof HTMLTableRowElement) {
      dataset.push(getStudentFromRow(HtmlRow))
    }
  }

  const name = document.querySelector("#page-navbar > div > nav > ul > li:nth-child(5) > span > a > span").innerText;
  const report = { name, dataset }

  const data = JSON.stringify(report)
  const tab = window.open("data:application/javascript", '_blank')
  tab.document.write(data);
  console.log(report)
}

getReport()