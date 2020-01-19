
/**
 *
 * @author (JUAN CELIS-1151876)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */

class MaquinaSandwich {
   
    public static final int CANTIDAD_BASE_QUESO = 15;
    public static final int CANTIDAD_BASE_MORTADELA_JAMON = 10;
    public static final int CANTIDAD_BASE_PAN = 1;

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
    
    /Recuerde que no necesita declarar propiedades adicionales/

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
       /COMPLETE/
       this.precioCompraQueso = precioCompraQueso;
       this.precioCompraMortadela = precioCompraMortadela;
       this.precioCompraJamon = precioCompraJamon;
       this.precioCompraPanBlanco = precioCompraPanBlanco;
       this.precioCompraPanIntegral = precioCompraPanIntegral;
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
       /COMPLETE/
       int precio=0;
       if(tipoSandwich == 1){
           if(tipoPan == 1){
                 precio = (CANTIDAD_BASE_QUESO*precioCompraQueso) + (CANTIDAD_BASE_MORTADELA_JAMON*precioCompraMortadela) + (CANTIDAD_BASE_PAN*precioCompraPanBlanco);
            }else{
                precio = (CANTIDAD_BASE_QUESO*precioCompraQueso) + (CANTIDAD_BASE_MORTADELA_JAMON*precioCompraMortadela) + (CANTIDAD_BASE_PAN*precioCompraPanIntegral);
            }
        }
        if(tipoSandwich == 2){
             if(tipoPan == 1){
                precio = (CANTIDAD_BASE_QUESO*precioCompraQueso)  + (10*precioCompraJamon) + (CANTIDAD_BASE_PAN*precioCompraPanBlanco);
            }else{
                precio = (CANTIDAD_BASE_QUESO*precioCompraQueso) + (10*precioCompraJamon) + (CANTIDAD_BASE_PAN*precioCompraPanIntegral);
            }
        }
        if(tipoSandwich == 3 ){
         if(tipoPan == 1){
             precio = (30*precioCompraQueso) + (20*precioCompraMortadela) + (2*precioCompraPanBlanco);
            }else{
                precio = (30*precioCompraQueso) + (20*precioCompraMortadela) + (2*precioCompraPanIntegral);
            }
        }
        if(tipoSandwich == 4){
         if(tipoPan == 1){
             precio = (30*precioCompraQueso) + (20*precioCompraJamon) + (2*precioCompraPanBlanco);
            }else{
             precio = (30*precioCompraQueso) + (20*precioCompraJamon) + (2*precioCompraPanIntegral);   
            }
        }
        if(tipoSandwich == 5){
            if(tipoPan == 1){
             precio = (45*precioCompraQueso) + (30*precioCompraMortadela) + (3*precioCompraPanBlanco);   
            }else{
             precio = (45*precioCompraQueso) + (30*precioCompraMortadela) + (3*precioCompraPanIntegral);   
            }
        }
        if(tipoSandwich == 6){
         if(tipoPan == 1){
             precio = (45*precioCompraQueso) +(30*precioCompraJamon) + (3*precioCompraPanBlanco);
            }else{
                precio = (45*precioCompraQueso) +(30*precioCompraJamon) + (3*precioCompraPanIntegral);
            }
        }
       return precio;
    }
    
    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
       /COMPLETE/
       return (int)(calcularCostoFabricacion(tipoSandwich,tipoPan)*1.35);
    }
    
    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan){
 
        if(tipoSandwich == 1){
            if(this.cantidadQueso>=15 && this.cantidadMortadela>=10 && (this.cantidadPanBlanco>=1 || this.cantidadPanIntegral>=1)){
            this.cantidadQueso-=15;
            this.cantidadMortadela-=10;
            if(tipoPan == 1){
             this.cantidadPanBlanco-=1;
            }else{
              this.cantidadPanIntegral-=1;
            }
            this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        }
        if(tipoSandwich == 2){
             this.cantidadQueso-=15;
             this.cantidadJamon-=10;
             if(tipoPan == 1){
             this.cantidadPanBlanco-=1;
             }else{
              this.cantidadPanIntegral-=1;
             }
             this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
 
        }
     
        if(tipoSandwich == 3 ){
            this.cantidadQueso-=30;
            this.cantidadMortadela-=20;
            if(tipoPan == 1){
             this.cantidadPanBlanco-=2;
            }else{
              this.cantidadPanIntegral-=2;
            }
            this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich == 4){
            this.cantidadQueso-=30;
            this.cantidadJamon-=20;
            if(tipoPan == 1){
             this.cantidadPanBlanco-=2;
            }else{
              this.cantidadPanIntegral-=2;
            }
            this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich == 5){
            this.cantidadQueso-=45;
            this.cantidadMortadela-=30;
          if(tipoPan == 1){
             this.cantidadPanBlanco-=3;
            }else{
              this.cantidadPanIntegral-=3;
            }
            this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
        }
        if(tipoSandwich == 6){
            this.cantidadQueso-=45;
            this.cantidadJamon-=30;
            if(tipoPan == 1){
             this.cantidadPanBlanco-=3;
            }else{
              this.cantidadPanIntegral-=3;
            }
            this.ingresosPorVentas+=calcularPrecioVenta(tipoSandwich,tipoPan);
        }
         try{
          if((this.cantidadQueso<=14 && this.cantidadMortadela <=9 && (this.cantidadPanBlanco<=0|| this.cantidadPanIntegral<=0))){
             throw new RuntimeException("Ingredientes insuficientes"); 
            }
            if(!(this.cantidadQueso<=14 && this.cantidadJamon <=9 && (this.cantidadPanBlanco<=0|| this.cantidadPanIntegral<=0))){
                throw new RuntimeException("Ingredientes insuficientes"); 
            }
        }catch(RuntimeException e){
           System.out.println(e.getMessage());
        }
    }
 
    

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
       
       return (this.ingresosPorVentas*19) /100;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
       /COMPLETE/
       return (this.ingresosPorVentas*5) /100;
    }

    
    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
       /COMPLETE/
       return (this.ingresosPorVentas*1)/100;
    }

    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
      /COMPLETE/
      return (this.ingresosPorVentas*10)/100;
    }
    
    /COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES/


    //Start GetterSetterExtension Code
    /*Getter method cantidadQueso/
    public int getCantidadQueso(){
        return this.cantidadQueso;
    }//end method getCantidadQueso

    /*Setter method cantidadQueso/
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    /*Getter method cantidadMortadela/
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    /*Setter method cantidadMortadela/
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    /*Getter method cantidadJamon/
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon

    /*Setter method cantidadJamon/
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    /*Getter method cantidadPanBlanco/
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    /*Setter method cantidadPanBlanco/
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco

    /*Getter method cantidadPanIntegral/
    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral

    /*Setter method cantidadPanIntegral/
    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    /*Getter method precioCompraQueso/
    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

    /*Setter method precioCompraQueso/
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    /*Getter method precioCompraMortadela/
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    /*Setter method precioCompraMortadela/
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    /*Getter method precioCompraJamon/
    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    /*Setter method precioCompraJamon/
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

    /*Getter method precioCompraPanBlanco/
    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

    /*Setter method precioCompraPanBlanco/
    public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

    /*Getter method precioCompraPanIntegral/
    public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

    /*Setter method precioCompraPanIntegral/
    public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    /*Getter method ingresosPorVentas/
    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

    /*Setter method ingresosPorVentas/
    public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    //End GetterSetterExtension Code
//!
}