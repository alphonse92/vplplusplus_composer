
/**
 *
 * @author (samir ortega-1151873)
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
    
        MaquinaSandwich() {
        this.cantidadQueso=3000;
        this.cantidadMortadela=1000;
        this.cantidadJamon=1000;
        this.cantidadPanBlanco=100;
        this.cantidadPanIntegral=100;
    }    MaquinaSandwich(int precioCompraQueso, int precioCompraMortadela, int precioCompraJamon, int precioCompraPanBlanco, int precioCompraPanIntegral) {
        this();//No quite esta línea, llama al constructor anterior para reutilizar
              this.precioCompraQueso = precioCompraQueso;
       this.precioCompraMortadela = precioCompraMortadela;
       this.precioCompraJamon = precioCompraJamon;
       this.precioCompraPanBlanco = precioCompraPanBlanco;
       this.precioCompraPanIntegral = precioCompraPanIntegral;
    }

        public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
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
    
        public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {       return (int)(calcularCostoFabricacion(tipoSandwich,tipoPan)*1.35);
    }
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
 
    
    public int getIVA() {
       
       return (this.ingresosPorVentas*19) /100;
    }
    public int getCostosFijos() {
       return (this.ingresosPorVentas*5) /100;
    }

        public int getRiesgos() {
       return (this.ingresosPorVentas*1)/100;
    }
    public int getGananciaNeta() {
      
      return (this.ingresosPorVentas*10)/100;
    }
        public int getCantidadQueso(){
        return this.cantidadQueso;
    }

        public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso = cantidadQueso;
    }//end method setCantidadQueso

    
    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }//end method getCantidadMortadela

    
    public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela = cantidadMortadela;
    }//end method setCantidadMortadela

    
    public int getCantidadJamon(){
        return this.cantidadJamon;
    }//end method getCantidadJamon
    public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon = cantidadJamon;
    }//end method setCantidadJamon

    
    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }//end method getCantidadPanBlanco

    
    public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco = cantidadPanBlanco;
    }//end method setCantidadPanBlanco


    public int getCantidadPanIntegral(){
        return this.cantidadPanIntegral;
    }//end method getCantidadPanIntegral


    public void setCantidadPanIntegral(int cantidadPanIntegral){
        this.cantidadPanIntegral = cantidadPanIntegral;
    }//end method setCantidadPanIntegral

    public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }//end method getPrecioCompraQueso

        public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso = precioCompraQueso;
    }//end method setPrecioCompraQueso

    
    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }//end method getPrecioCompraMortadela

    
    public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela = precioCompraMortadela;
    }//end method setPrecioCompraMortadela

    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }//end method getPrecioCompraJamon

    
    public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon = precioCompraJamon;
    }//end method setPrecioCompraJamon

        public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }//end method getPrecioCompraPanBlanco

        public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco = precioCompraPanBlanco;
    }//end method setPrecioCompraPanBlanco

        public int getPrecioCompraPanIntegral(){
        return this.precioCompraPanIntegral;
    }//end method getPrecioCompraPanIntegral

        public void setPrecioCompraPanIntegral(int precioCompraPanIntegral){
        this.precioCompraPanIntegral = precioCompraPanIntegral;
    }//end method setPrecioCompraPanIntegral

    public int getIngresosPorVentas(){
        return this.ingresosPorVentas;
    }//end method getIngresosPorVentas

        public void setIngresosPorVentas(int ingresosPorVentas){
        this.ingresosPorVentas = ingresosPorVentas;
    }//end method setIngresosPorVentas

    }