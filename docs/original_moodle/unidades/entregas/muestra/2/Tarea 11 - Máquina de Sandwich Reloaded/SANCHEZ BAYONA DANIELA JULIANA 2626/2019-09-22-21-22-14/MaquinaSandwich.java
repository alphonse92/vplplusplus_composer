
/**
 *
 * @author (Escriba nombres y codigos)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich {

    static final int CANTIDAD_BASE_QUESO = 15;
    static final int CANTIDAD_BASE_MORTADELA_JAMON=10;
    static final int CANTIDAD_BASE_PAN = 1;

    int cantidadQueso;
    int cantidadMortadela;
    int cantidadJamon;
    int cantidadPanBlanco;
    int cantidadPanIntegral;

    int precioCompraQueso;
    int precioCompraMortadela;
    int precioCompraJamon;
    int precioCompraPanBlanco;
    int precioCompraPanIntegral;

    int ingresosPorVentas;
    
    /*Recuerde que no necesita declarar propiedades adicionales*/

    /**
     * Constructor que se encarga de inicializar la máquina con la cantidad de cada ingrediente
     */
    MaquinaSandwich() {
      this.cantidadQueso=3000;
      this.cantidadMortadela=1000;
      this.cantidadJamon=1000;
      this.cantidadPanBlanco=100;
      this.cantidadPanIntegral=100;
    }

    /**
     * Constructor que se encarga de inicializar la máquina con los precios de compra de los ingredientes
     */
    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
      this();//No quite esta línea, llama al constructor anterior para reutilizar
      this.precioCompraQueso=precioCompraQueso;
      this.precioCompraMortadela=precioCompraMortadela;
      this.precioCompraJamon=precioCompraJamon;
      this.precioCompraPanBlanco=precioCompraPanBlanco;
      this.precioCompraPanIntegral=precioCompraPanIntegral;
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
        int costo=0;
        if (tipoSandwich==1 && tipoPan==1)
        costo=(CANTIDAD_BASE_QUESO*getPrecioCompraQueso()) + (CANTIDAD_BASE_MORTADELA_JAMON*getPrecioCompraMortadela()) + 
        (CANTIDAD_BASE_PAN*getPrecioCompraPanBlanco()) ;
        if (tipoSandwich==1 && tipoPan==2)
        costo=(CANTIDAD_BASE_QUESO*getPrecioCompraQueso()) + (CANTIDAD_BASE_MORTADELA_JAMON*getPrecioCompraMortadela()) +
        (CANTIDAD_BASE_PAN*getPrecioCompraPanIntegral()) ;
        if (tipoSandwich==2 && tipoPan==1)
        costo=(CANTIDAD_BASE_QUESO*getPrecioCompraQueso()) + (CANTIDAD_BASE_MORTADELA_JAMON*getPrecioCompraJamon()) + 
        (CANTIDAD_BASE_PAN*getPrecioCompraPanBlanco()) ;
        if (tipoSandwich==2 && tipoPan==2)
        costo=(CANTIDAD_BASE_QUESO*getPrecioCompraQueso()) + (CANTIDAD_BASE_MORTADELA_JAMON*getPrecioCompraJamon()) + 
        (CANTIDAD_BASE_PAN*getPrecioCompraPanIntegral());
        if (tipoSandwich==3 && tipoPan==1)
        costo=(30*getPrecioCompraQueso()) + (20*getPrecioCompraMortadela()) + (2*getPrecioCompraPanBlanco());
        if (tipoSandwich==3 && tipoPan==2)
        costo=(30*getPrecioCompraQueso()) + (20*getPrecioCompraMortadela()) + (2*getPrecioCompraPanIntegral());
        if (tipoSandwich==4 && tipoPan==1)
        costo=(30*getPrecioCompraQueso()) + (20*getPrecioCompraJamon()) + (2*getPrecioCompraPanBlanco());
        if (tipoSandwich==4 && tipoPan==2)
        costo=(30*getPrecioCompraQueso()) + (20*getPrecioCompraJamon()) + (2*getPrecioCompraPanIntegral());
        if (tipoSandwich==5 && tipoPan==1)
        costo=(45*getPrecioCompraQueso()) + (30*getPrecioCompraMortadela()) + (3*getPrecioCompraPanBlanco());
        if (tipoSandwich==5 && tipoPan==2)
        costo=(45*getPrecioCompraQueso()) + (30*getPrecioCompraMortadela()) + (3*getPrecioCompraPanIntegral());
        if (tipoSandwich==6 && tipoPan==1)
        costo=(45*getPrecioCompraQueso()) + (30*getPrecioCompraJamon()) + (3*getPrecioCompraPanBlanco());
        if (tipoSandwich==6 && tipoPan==2)
        costo=(45*getPrecioCompraQueso()) + (30*getPrecioCompraJamon()) + (3*getPrecioCompraPanIntegral());
        return costo;
    }
    
    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
       int precio;
       int costoFabricacion=calcularCostoFabricacion(tipoSandwich, tipoPan);
       precio=costoFabricacion+costoFabricacion*35/100;
       this.ingresosPorVentas+=precio;
       getIVA();
       getCostosFijos();
       getRiesgos();
       getGananciaNeta();
      
       return precio;
    }
    
    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        switch(tipoSandwich){
          case 1:
              if (cantidadQueso>=15 && cantidadMortadela>10 && cantidadPanBlanco>=1 && cantidadPanIntegral>=1){
              if(tipoPan==1){
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanBlanco--;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=15;
                cantidadMortadela-=10;
                cantidadPanIntegral--;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
          break;
          case 2:
             if (cantidadQueso>=15 && cantidadJamon>10 && cantidadPanBlanco>=1 && cantidadPanIntegral>=1){
              if(tipoPan==1){
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanBlanco--;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=15;
                cantidadJamon-=10;
                cantidadPanIntegral--;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
          break;
          case 3:
            if (cantidadQueso>=30 && cantidadMortadela>=20 && cantidadPanBlanco>=2 && cantidadPanIntegral>=2){
              if(tipoPan==1){
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanBlanco-=2;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=30;
                cantidadMortadela-=20;
                cantidadPanIntegral-=2;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
          break;
          case 4:
            if (cantidadQueso>=30 && cantidadJamon>=20 && cantidadPanBlanco>=2 && cantidadPanIntegral>=2){
              if(tipoPan==1){
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanBlanco-=2;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=30;
                cantidadJamon-=20;
                cantidadPanIntegral-=2;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
           break;
           case 5:
            if (cantidadQueso>=45 && cantidadMortadela>=30 && cantidadPanBlanco>=3 && cantidadPanIntegral>=3){
              if(tipoPan==1){
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanBlanco-=3;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=45;
                cantidadMortadela-=30;
                cantidadPanIntegral-=3;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
           break;
           case 6:
         if (cantidadQueso>=45 && cantidadJamon>=30 && cantidadPanBlanco>=3 && cantidadPanIntegral>=3){
              if(tipoPan==1){
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanBlanco-=3;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
              else {
                cantidadQueso-=45;
                cantidadJamon-=30;
                cantidadPanIntegral-=3;
                calcularCostoFabricacion(tipoSandwich, tipoPan);
                }
          }   else{
              throw new RuntimeException("No hay Ingredientes Suficientes");
            }
            break;
        }
    }
    
    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
        return ingresosPorVentas*19/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
        return ingresosPorVentas*5/100;
    }

    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
        return ingresosPorVentas*1/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
      return ingresosPorVentas*10/100;
    }
    
    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/


    //Start GetterSetterExtension Code
    /**Getter method CANTIDAD_BASE_QUESO*/
    public int getCANTIDAD_BASE_QUESO(){
        return this.CANTIDAD_BASE_QUESO;
    }//end method getCANTIDAD_BASE_QUESO

    /**Getter method CANTIDAD_BASE_MORTADELA_JAMON*/
    public int getCANTIDAD_BASE_MORTADELA_JAMON(){
        return this.CANTIDAD_BASE_MORTADELA_JAMON;
    }//end method getCANTIDAD_BASE_MORTADELA_JAMON

    /**Getter method CANTIDAD_BASE_PAN*/
    public int getCANTIDAD_BASE_PAN(){
        return this.CANTIDAD_BASE_PAN;
    }//end method getCANTIDAD_BASE_PAN

    /**Getter method cantidadQueso*/
    public int getCantidadQueso(){
        return this.cantidadQueso;
    }//end method getCantidadQueso

    /**Setter method cantidadQueso*/
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    /**Getter method cantidadMortadela*/
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    /**Setter method cantidadMortadela*/
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    /**Getter method cantidadJamon*/
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon

    /**Setter method cantidadJamon*/
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    /**Getter method cantidadPanBlanco*/
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    /**Setter method cantidadPanBlanco*/
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco

    /**Getter method cantidadPanIntegral*/
    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral

    /**Setter method cantidadPanIntegral*/
    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    /**Getter method precioCompraQueso*/
    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

    /**Setter method precioCompraQueso*/
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    /**Getter method precioCompraMortadela*/
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    /**Setter method precioCompraMortadela*/
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    /**Getter method precioCompraJamon*/
    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    /**Setter method precioCompraJamon*/
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

    /**Getter method precioCompraPanBlanco*/
    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

    /**Setter method precioCompraPanBlanco*/
    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

    /**Getter method precioCompraPanIntegral*/
    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

    /**Setter method precioCompraPanIntegral*/
    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    /**Getter method ingresosPorVentas*/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /**Setter method ingresosPorVentas*/
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    //End GetterSetterExtension Code
//!
}
