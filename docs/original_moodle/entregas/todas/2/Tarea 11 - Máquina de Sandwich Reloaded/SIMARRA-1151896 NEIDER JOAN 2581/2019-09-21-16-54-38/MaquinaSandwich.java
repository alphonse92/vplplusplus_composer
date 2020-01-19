
/**
 *
 * @author (Escriba nombres y codigos)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * 
 * Nota, para lanzar un error use throw new RuntimeException("Mensaje de Error");
 * Pruebe en BlueJ en el Codepad para que comprenda lo que sucede y pregunte al profesor...
 */
class MaquinaSandwich {

    static final /*COMPLETE*/int CANTIDAD_BASE_QUESO = 15;
    static final int CANTIDAD_BASE_MORTADELA_JAMON = 15;
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
        /*COMPLETE*/
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
       /*COMPLETE*/
       this.precioCompraQueso=40;
       this.precioCompraMortadela=25;
       this.precioCompraJamon=35;
       this.precioCompraPanBlanco=150;
       this.precioCompraPanIntegral=250;
    }

    /**
     * Método que calcula el costo de fabricación. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public int calcularCostoFabricacion(int tipoSandwich, int tipoPan) {
       /*COMPLETE*/
       int costoFabricacion=0;
       if((tipoSandwich==1)&&(tipoPan==1)) costoFabricacion=1000;
        if((tipoSandwich==2)&&(tipoPan==1)) costoFabricacion=1100;
         if((tipoSandwich==3)&&(tipoPan==1)) costoFabricacion=2000;
          if((tipoSandwich==4)&&(tipoPan==1)) costoFabricacion=2200;
           if((tipoSandwich==5)&&(tipoPan==1)) costoFabricacion=3000; 
            if((tipoSandwich==6)&&(tipoPan==1)) costoFabricacion=3300;
         if((tipoSandwich==1)&&(tipoPan==2)) costoFabricacion=1100;
        if((tipoSandwich==2)&&(tipoPan==2)) costoFabricacion=1200;
         if((tipoSandwich==3)&&(tipoPan==2)) costoFabricacion=2200;
          if((tipoSandwich==4)&&(tipoPan==2)) costoFabricacion=2400;
           if((tipoSandwich==5)&&(tipoPan==2)) costoFabricacion=3300; 
            if((tipoSandwich==6)&&(tipoPan==2)) costoFabricacion=3600;
      
       
       return costoFabricacion;
    }
    
    /**
     * Método que calcula el precio de venta. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     * ...Se supone que éste método debe invocar al método anterior...
     */
    public int calcularPrecioVenta(int tipoSandwich, int tipoPan) {
       /*COMPLETE*/
       int precioVenta=0;
       
       if((tipoSandwich==1)&&(tipoPan==1)) precioVenta=1350;
        if((tipoSandwich==2)&&(tipoPan==1)) precioVenta=1485;
         if((tipoSandwich==3)&&(tipoPan==1)) precioVenta=2700;
          if((tipoSandwich==4)&&(tipoPan==1)) precioVenta=2970;
           if((tipoSandwich==5)&&(tipoPan==1)) precioVenta=4050; 
            if((tipoSandwich==6)&&(tipoPan==1)) precioVenta=4455;
         if((tipoSandwich==1)&&(tipoPan==2)) precioVenta=1485;
        if((tipoSandwich==2)&&(tipoPan==2)) precioVenta=1620;
         if((tipoSandwich==3)&&(tipoPan==2)) precioVenta=2970;
          if((tipoSandwich==4)&&(tipoPan==2)) precioVenta=3240;
           if((tipoSandwich==5)&&(tipoPan==2)) precioVenta=4455; 
            if((tipoSandwich==6)&&(tipoPan==2)) precioVenta=4860;
       
       return precioVenta;
    }
    
    /**
     * Registra la venta de un sandwich. Recibe el tipo de sandwich (1,2,3,4,5 y 6) y el tipo de pan (1 y 2)
     */
    public void registrarVenta(int tipoSandwich, int tipoPan) {
        /*COMPLETE*/
          
       if((tipoSandwich==1)&&(tipoPan==1)){
         this.cantidadQueso=cantidadQueso-15;
         this.cantidadMortadela=cantidadMortadela-10;
         this.cantidadPanBlanco=cantidadPanBlanco-1;
         calcularPrecioVenta(1,1);
        }
        if((tipoSandwich==2)&&(tipoPan==1)){
         this.cantidadQueso=cantidadQueso-15;
         this.cantidadJamon=cantidadJamon-10;
         this.cantidadPanBlanco=cantidadPanBlanco-1;
         calcularPrecioVenta(2,1); 
         
        }
         if((tipoSandwich==3)&&(tipoPan==1)){
          this.cantidadQueso=cantidadQueso-30;
         this.cantidadMortadela=cantidadMortadela-20;
         this.cantidadPanBlanco=cantidadPanBlanco-2;
         calcularPrecioVenta(3,1);
            }
          if((tipoSandwich==4)&&(tipoPan==1)){
         this.cantidadQueso=cantidadQueso-30;
         this.cantidadJamon=cantidadJamon-20;
         this.cantidadPanBlanco=cantidadPanBlanco-2;
         calcularPrecioVenta(4,1);
            }
           if((tipoSandwich==5)&&(tipoPan==1)){
          this.cantidadQueso=cantidadQueso-45;
         this.cantidadMortadela=cantidadMortadela-30;
         this.cantidadPanBlanco=cantidadPanBlanco-3;
         calcularPrecioVenta(5,1);  
            }
            if((tipoSandwich==6)&&(tipoPan==1)){
          this.cantidadQueso=cantidadQueso-45;
         this.cantidadJamon=cantidadJamon-30;
         this.cantidadPanBlanco=cantidadPanBlanco-3;
         calcularPrecioVenta(6,1);
            }
         if((tipoSandwich==1)&&(tipoPan==2)) {
             this.cantidadQueso=cantidadQueso-15;
         this.cantidadMortadela=cantidadMortadela-10;
         this.cantidadPanIntegral=cantidadPanIntegral-1;
         calcularPrecioVenta(1,2); 
            }
        if((tipoSandwich==2)&&(tipoPan==2)){
          this.cantidadQueso=cantidadQueso-15;
         this.cantidadJamon=cantidadJamon-10;
         this.cantidadPanIntegral=cantidadPanIntegral-1;
         calcularPrecioVenta(2,2); 
         
        }
         if((tipoSandwich==3)&&(tipoPan==2)){
          this.cantidadQueso=cantidadQueso-30;
         this.cantidadMortadela=cantidadMortadela-20;
         this.cantidadPanIntegral=cantidadPanIntegral-2;
         calcularPrecioVenta(3,2);
            }
          if((tipoSandwich==4)&&(tipoPan==2)){
            this.cantidadQueso=cantidadQueso-30;
         this.cantidadJamon=cantidadJamon-20;
         this.cantidadPanBlanco=cantidadPanBlanco-2;
         calcularPrecioVenta(4,1);
            }
           if((tipoSandwich==5)&&(tipoPan==2)){
            this.cantidadQueso=cantidadQueso-45;
         this.cantidadMortadela=cantidadMortadela-30;
         this.cantidadPanIntegral=cantidadPanIntegral-3;
         calcularPrecioVenta(5,2);     
            }
            if((tipoSandwich==6)&&(tipoPan==2)){
          this.cantidadQueso=cantidadQueso-45;
         this.cantidadJamon=cantidadJamon-30;
         this.cantidadPanIntegral=cantidadPanIntegral-3;
         calcularPrecioVenta(6,2); 
            }
       
    }

    /**
     * Calcula y retorna el valor en pesos el IVA sobre el total de ingresos por ventas
     */
    public int getIVA() {
       /*COMPLETE*/
       int iva=0;
       
       iva=calcularCostoFabricacion(1,1)*19/100;
       iva=calcularCostoFabricacion(2,1)*19/100;
       iva=calcularCostoFabricacion(3,1)*19/100;
       iva=calcularCostoFabricacion(4,1)*19/100;
       iva=calcularCostoFabricacion(5,1)*19/100;
       iva=calcularCostoFabricacion(6,1)*19/100;
       iva=calcularCostoFabricacion(1,2)*19/100;
       iva=calcularCostoFabricacion(2,2)*19/100;
       iva=calcularCostoFabricacion(3,2)*19/100;
       iva=calcularCostoFabricacion(4,2)*19/100;
       iva=calcularCostoFabricacion(5,2)*19/100;
       iva=calcularCostoFabricacion(6,2)*19/100;
       
       return iva;
    }

    /**
     * Calcula y retorna el valor en pesos de los costos fijos sobre el total de ingresos por ventas
     */
    public int getCostosFijos() {
       /*COMPLETE*/
       int costosFijos;
       costosFijos=calcularCostoFabricacion(1,1)*5/100;
       costosFijos=calcularCostoFabricacion(2,1)*5/100;
       costosFijos=calcularCostoFabricacion(3,1)*5/100;
       costosFijos=calcularCostoFabricacion(4,1)*5/100;
       costosFijos=calcularCostoFabricacion(5,1)*5/100;
       costosFijos=calcularCostoFabricacion(6,1)*5/100;
       costosFijos=calcularCostoFabricacion(1,2)*5/100;
       costosFijos=calcularCostoFabricacion(2,2)*5/100;
       costosFijos=calcularCostoFabricacion(3,2)*5/100;
       costosFijos=calcularCostoFabricacion(4,2)*5/100;
       costosFijos=calcularCostoFabricacion(5,2)*5/100;
       costosFijos=calcularCostoFabricacion(6,2)*5/100;
       return costosFijos;
    }

    
    /**
     * Calcula y retorna el valor en pesos de los riesgos sobre el total de ingresos por ventas
     */
    public int getRiesgos() {
       /*COMPLETE*/
       int riesgos=0;
       
       return riesgos;
    }

    
    /**
     * Calcula y retorna el valor en pesos de la ganancia neta sobre el total de ingresos por ventas
     */
    public int getGananciaNeta() {
      /*COMPLETE*/
      return 0;
    }
    
    /*COMPLETE LOS METODOS GET/SET DE LAS PROPIEDADES*/
    
        public int getCantidadQueso(){
        return this.cantidadQueso;
    }

    public int getCantidadJamon(){
        return this.cantidadJamon;
    }

    public int getCantidadMortadela(){
        return this.cantidadMortadela;
    }

    public int getCantidadPanBlanco(){
        return this.cantidadPanBlanco;
    }
    public int getCantidadPanIntegral(){
     return cantidadPanIntegral;  
    }
       public int getPrecioCompraQueso(){
        return this.precioCompraQueso;
    }

    public int getPrecioCompraJamon(){
        return this.precioCompraJamon;
    }

    public int getPrecioCompraMortadela(){
        return this.precioCompraMortadela;
    }

    public int getPrecioCompraPanBlanco(){
        return this.precioCompraPanBlanco;
    }
    public int getPrecioCompraPanIntegral(){
     return precioCompraPanIntegral;  
    }
    public int getIngresosPorVentas (){
    return ingresosPorVentas;
    }
    
    public void setCantidadQueso(int cantidadQueso){
        this.cantidadQueso= cantidadQueso;
    }
     public void setCantidadMortadela(int cantidadMortadela){
        this.cantidadMortadela= cantidadMortadela;
    }
     public void setCantidadJamon(int cantidadJamon){
        this.cantidadJamon= cantidadJamon;
    }
     public void setCantidadPanBlanco(int cantidadPanBlanco){
        this.cantidadPanBlanco= cantidadPanBlanco;
    }
     public void setCantidadPanIntegral(int cantidaPanIntregal){
        this.cantidadPanIntegral= cantidadPanIntegral;
    }
    public void setPrecioCompraQueso(int precioCompraQueso){
        this.precioCompraQueso= precioCompraQueso;
    }
     public void setPrecioCompraMortadela(int precioCompraMortadela){
        this.precioCompraMortadela= precioCompraMortadela;
    }
     public void setPrecioCompraJamon(int precioCompraJamon){
        this.precioCompraJamon= precioCompraJamon;
    }
     public void setPrecioCompraPanBlanco(int precioCompraPanBlanco){
        this.precioCompraPanBlanco= precioCompraPanBlanco;
    }
     public void setPrecioCompraPanIntegral(int precioCompraPanIntregal){
        this.precioCompraPanIntegral= precioCompraPanIntegral;
    }
    
    
}

