/**
 * Complete
 * @author (Milton Jesús Vera Contreras - miltonjeussvc@ufps.edu.co) 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class MaquinaCafetera { 

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    int calcularPrecio;
    /*No requiere propiedades adicionales, pero es libre de usarlas*/

    
    MaquinaCafetera(){
     //complete
    }
    
    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
     this.cafe = cantidadInicialCafe;
     this.azucar = cantidadInicialAzucar;
     this.vasos = cantidadInicialVasos;
    }
    
    //complete metodos GET / SET
     
    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
      if(tipoCafe==1 && cantidadAzucar==1)
         calcularPrecio = (int)precioBaseCafe/1000*55*(int)1.15;
      if(tipoCafe==1 && cantidadAzucar==2)
         calcularPrecio = (int)precioBaseCafe/1000*55*(int)1.05*(int)1.15;
      if(tipoCafe==1 && cantidadAzucar==3)
         calcularPrecio = (int)precioBaseCafe/1000*55*(int)1.1*(int)1.15;
      if(tipoCafe==2 && cantidadAzucar==1)
         calcularPrecio = (int)precioBaseCafe/1000*55*2*(int)1.15;
      if(tipoCafe==2 && cantidadAzucar==2)
         calcularPrecio = (int)precioBaseCafe/1000*55*2*(int)1.05*(int)1.15;
      if(tipoCafe==2 && cantidadAzucar==3)
         calcularPrecio = (int)precioBaseCafe/1000*55*2*(int)1.1*(int)1.15;
      return calcularPrecio;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
      if(costoCompraCafe<=gananciasNetas)
         this.cafe += cantidadCafe*costoCompraCafe; 
      return true;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
      if(costoCompraAzucar<=gananciasNetas)
         this.cafe += cantidadAzucar*costoCompraAzucar; 
      return true;
    }

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
      if(costoCompraVasos<=gananciasNetas)
         this.cafe += cantidadVasos*costoCompraVasos; 
      return true;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
      return true;
    }

    public void registrarFactura(int valorFactura) {
     //complete
    }


    //Start GetterSetterExtension Code
    /**Getter method cafe*/
    public int getCafe(){
        return this.cafe;
    }//end method getCafe

    /**Setter method cafe*/
    public void setCafe(int cafe){
        this.cafe = cafe;
    }//end method setCafe

    /**Getter method azucar*/
    public int getAzucar(){
        return this.azucar;
    }//end method getAzucar

    /**Setter method azucar*/
    public void setAzucar(int azucar){
        this.azucar = azucar;
    }//end method setAzucar

    /**Getter method vasos*/
    public int getVasos(){
        return this.vasos;
    }//end method getVasos

    /**Setter method vasos*/
    public void setVasos(int vasos){
        this.vasos = vasos;
    }//end method setVasos

    /**Getter method precioBaseCafe*/
    public int getPrecioBaseCafe(){
        return this.precioBaseCafe;
    }//end method getPrecioBaseCafe

    /**Setter method precioBaseCafe*/
    public void setPrecioBaseCafe(int precioBaseCafe){
        this.precioBaseCafe = precioBaseCafe;
    }//end method setPrecioBaseCafe

    /**Getter method egresos*/
    public int getEgresos(){
        return this.egresos;
    }//end method getEgresos

    /**Setter method egresos*/
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }//end method setEgresos

    /**Getter method ingresos*/
    public int getIngresos(){
        return this.ingresos;
    }//end method getIngresos

    /**Setter method ingresos*/
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }//end method setIngresos

    /**Getter method gananciasBrutas*/
    public int getGananciasBrutas(){
        return this.gananciasBrutas;
    }//end method getGananciasBrutas

    /**Setter method gananciasBrutas*/
    public void setGananciasBrutas(int gananciasBrutas){
        this.gananciasBrutas = gananciasBrutas;
    }//end method setGananciasBrutas

    /**Getter method impuestos*/
    public int getImpuestos(){
        return this.impuestos;
    }//end method getImpuestos

    /**Setter method impuestos*/
    public void setImpuestos(int impuestos){
        this.impuestos = impuestos;
    }//end method setImpuestos

    /**Getter method gananciasNetas*/
    public int getGananciasNetas(){
        return this.gananciasNetas;
    }//end method getGananciasNetas

    /**Setter method gananciasNetas*/
    public void setGananciasNetas(int gananciasNetas){
        this.gananciasNetas = gananciasNetas;
    }//end method setGananciasNetas

    /**Getter method calcularPrecio*/
    public int getCalcularPrecio(){
        return this.calcularPrecio;
    }//end method getCalcularPrecio

    /**Setter method calcularPrecio*/
    public void setCalcularPrecio(int calcularPrecio){
        this.calcularPrecio = calcularPrecio;
    }//end method setCalcularPrecio

    //End GetterSetterExtension Code
//!
}
