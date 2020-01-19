public class MaquinaCafetera
{
  protected int cafe;
  protected int azucar;
  protected int vasos;
  private int precioBaseCafe;
  protected int egresos;
  protected int ingresos;
  protected int gananciasBrutas;
  protected int impuestos;
  protected int gananciasNetas;
  private int precio;
  
  public MaquinaCafetera() {}
  
  public MaquinaCafetera(int cafe, int azucar, int vasos) {
    this.cafe = cafe;
    this.azucar = azucar;
    this.vasos = vasos;
  }
  
  public int getCafe() { 
  return this.cafe; }
  
  public void setCafe(int cafe) { 
  this.cafe = cafe; }

  public int getAzucar() { 
  return this.azucar; }
  
  public void setAzucar(int azucar) { 
  this.azucar = azucar; }
  
  public int getVasos() { 
  return this.vasos; }
 
  public void setVasos(int vasos) { 
  this.vasos = vasos; }

  public int getEgresos() { 
  return this.egresos; }
 
  public void setEgresos(int egresos) { 
  this.egresos = egresos; }
  
  public int getIngresos() { 
  return this.ingresos; }

  public void setIngresos(int ingresos) { 
  this.ingresos = ingresos; }
 
  public int getGananciasBrutas() { 
  return this.gananciasBrutas; }
 
  public void setGananciasBrutas(int gananciasBrutas) { 
  this.gananciasBrutas = gananciasBrutas; }

  public int getImpuestos() { 
  return this.impuestos; }
 
  public void setImpuestos(int impuestos) { 
  this.impuestos = impuestos; }
  
  public int getGananciasNetas() { 
  return this.gananciasNetas; }

  public void setGananciasNetas(int gananciasNetas) { 
  this.gananciasNetas = gananciasNetas; }
 
  public int getPrecioBaseCafe() { 
  return this.precioBaseCafe; }
 
  public void setPrecioBaseCafe(int precioBaseCafe) { 
  this.precioBaseCafe = precioBaseCafe; }
 
  public int calcularPrecio(int cafe, int azucar) {
    precio = precioBaseCafe / 1000 * 55 * cafe;
    precio += precio * (azucar - 1) * 5 / 100;
    return precio * 15 / 100;
  }
  
  public boolean recargarCafe(int cafe, int costo) {
    boolean rta = false;
    if (gananciasNetas - costo >= 0) {
      cafe += cafe;
      egresos += costo;
      registrarFactura(0);
      rta = true;
    } 
    return rta;
  }
  
  public boolean recargarAzucar(int azucar, int costo) {
    boolean rta = false;
    if (gananciasNetas - costo >= 0) {
      azucar += azucar;
      egresos += costo;
      registrarFactura(0);
      rta = true;
    } 
    return rta;
  }
  
  public boolean recargarVasos(int vasos, int costo) {
    boolean rta = false;
    if (gananciasNetas - costo >= 0) {
      vasos += vasos;
      egresos += costo;
      registrarFactura(0);
      rta = true;
    } 
    return rta;
  }
  
  public boolean prepararCafe(int cafe, int azucar) {
    boolean rta = false;
    if (cafe >= cafe * 55 && azucar >= (azucar - 1) * 5 && vasos >= 1) {
      rta = true;
      cafe -= cafe * 55;
      azucar -= (azucar - 1) * 5;
      vasos--;
    } 
    return rta;
  }
  
  public void registrarFactura(int precio) {
    ingresos += precio;
    gananciasBrutas = ingresos - egresos;
    impuestos = ingresos * 16 / 100;
    gananciasNetas = gananciasBrutas - impuestos;
  }
}
